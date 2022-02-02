package Unidad5.T7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean bandera = false;
        int opcion = 0;
        while (!bandera) {
            System.out.println("\n== MENU == ");
            System.out.println("1. ArrayIndexOutOfBoundsException");//
            System.out.println("2. StringIndexOutOfBoundsException");//
            System.out.println("3. Exception");
            System.out.println("4. NumberFormatException");
            System.out.println("5. NullPointerException");//
            System.out.println("6. FileNotFoundException");//
            System.out.println("7. ArithmeticException");
            System.out.println("8. NegativeArraySizeException");//
            System.out.println("9. ClassCastException");
            System.out.println("10. InputMismatchException");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    arrayIndexOutOfBoundsException();
                    break;
                case 2:
                    stringIndexOutOfBoundsException();
                    break;
                case 3:
                    exception();
                    break;
                case 4:
                    numberFormatException();
                    break;
                case 5:
                    nullPoinerException();
                    break;
                case 6:
                    fileNotFoundException();
                    break;
                case 7:
                    arithmeticException();
                    break;
                case 8:
                    negativeArraySizeException();
                    break;
                case 9:
                    classCastException();
                    break;
                case 10:
                    inputMismatchException();
                    break;
                case 0:
                    bandera = true;
                    break;
                default:
                    System.out.println("Numero invalido");
            }
        }
    }

    public static void arrayIndexOutOfBoundsException() {
        int[] numeros = {1, 2, 3, 4, 5};
        int n = 0;
        try {
            System.out.print("Ingrese una posicion: ");
            int pos = input.nextInt();
            n = numeros[pos];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
            n = numeros[numeros.length - 1];
        } finally {
            System.out.println(n);
        }
    }

    public static void stringIndexOutOfBoundsException() {
        String s = "Programacion";
        char c = ' ';
        try {
            System.out.print("Ingrese una posicion: ");
            int pos = input.nextInt();
            c = s.charAt(pos);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
            c = s.charAt(s.length() - 1);
        } finally {
            System.out.println(c);
        }
    }

    public static void exception() {
        String[] s = {"Sebastian", "Juan", "Karla"};
        Object o = null;
        Object t = new Object();
        try {
            // Los 3 mandan una excepcion, por lo tanto los 3 se pueden catchear con Exception
            System.out.println(s[-1]);
            System.out.println(o);
            t = (Alumnos) t;
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void numberFormatException() {
        int n = 0;
        String s = "";
        try {
            System.out.print("Ingrese algo que NO sea un numero");
            s = input.next();
            n = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
            n = 0;
        } finally {
            System.out.println(n);
        }
    }

    public static void nullPoinerException() {
        Alumnos al = null;
        try {
            System.out.println(al.getEdad());
        } catch (NullPointerException e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void fileNotFoundException() {
        String s = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
            s = br.readLine();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error externo al FileNotFoundException");
        }
    }

    public static void arithmeticException() {
        int n = 0, m = 0;
        double res = 0;
        try {
            System.out.print("Ingrese el numerador: ");
            n = input.nextInt();
            System.out.print("Ingrese el denominador: ");
            m = input.nextInt();
            res = n / m;
        } catch (ArithmeticException e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
            res = 0;
        } finally {
            System.out.println(res);
        }
    }

    public static void negativeArraySizeException() {
        int size = 0;
        int[] arr;
        System.out.print("Ingrese el tamanio del arreglo: ");
        size = input.nextInt();
        try {
            arr = new int[size];
        } catch (NegativeArraySizeException e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void classCastException() {
        Object o = new Object();
        Alumnos al;
        try {
            al = (Alumnos) o;
        } catch (ClassCastException e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void inputMismatchException() {
        int n = 0;
        try {
            System.out.print("Ingrese algo NO entero: ");
            n = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Alumnos {
    private String matricula, nombre;
    private int edad;

    public Alumnos(String matricula, String nombre, int edad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
