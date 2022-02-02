package Unidad5.T6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        boolean bandera = false;
        int opcion = 0;
        Scanner input = new Scanner(System.in);
        while (!bandera) {
            System.out.println("\n== MENU ==");
            System.out.println("1. FileNotFoundException");
            System.out.println("2. NegativeArraySizeException");
            System.out.println("3. NoSuchMethodException");
            System.out.println("4. ClassNotFoundException");
            System.out.println("5. ArithemticException");
            System.out.println("6. ClassCastException");
            System.out.println("7. InputMismatchException");
            System.out.println("0. Salir");
            System.out.print(">>> ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    fileNotFoundException();
                    break;
                case 2:
                    negativeArraySizeException();
                    break;
                case 3:
                    noSuchMethodException();
                    break;
                case 4:
                    classNotFoundException();
                    break;
                case 5:
                    arithmeticExeption();
                    break;
                case 6:
                    classCastException();
                    break;
                case 7:
                    inputMismatchException();
                    break;
                case 0:
                    bandera = !bandera;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }


    private static void fileNotFoundException() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
            br.read();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getClass());
            System.out.println("Excepcion: " + e.getMessage());
        } catch (IOException e) {

        }
    }

    private static void negativeArraySizeException() {
        int size = -1;
        try {
            int[] arr = new int[size];
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: " + e.getClass());
            System.out.println("Excepcion: " + e.getMessage());
        }
    }

    private static void noSuchMethodException() {
        try {
            Alumno.class.getMethod("imprimir", Alumno.class);
        } catch(NoSuchMethodException e) {
            System.out.println("Error: " + e.getClass());
            System.out.println("Excepcion: " + e.getMessage());
        }
    }

    private static void classNotFoundException() {
        String s = "Test";
        try {
            Class.forName(s);
        } catch(ClassNotFoundException e) {
            System.out.println("Error: " + e.getClass());
            System.out.println("Excepcion: " + e.getMessage());
        }
    }

    private static void arithmeticExeption() {
        int[] a = new int[5];
        try {
            //int n = 10 / 0;
            int m = a[10];
        } catch(ArithmeticException e) {
            System.out.println("Error: " + e.getClass());
            System.out.println("Excepcion: " + e.getMessage());
        }
    }

    private static void classCastException() {
        Object o = new Object();
        Alumno al;
        try {
            al = (Alumno) o;
        } catch(ClassCastException e) {
            System.out.println("Error: " + e.getClass());
            System.out.println("Excepcion: " + e.getMessage());
        }
    }

    private static void inputMismatchException() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa algo que NO sea un entero");
        try {
            int n = input.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Error: " + e.getClass());
            System.out.println("Excepcion: " + e.getMessage());
        }
    }

}

class Alumno {
    private String matricula, nombre;
    private int edad;

    public Alumno(String matricula, String nombre, int edad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
    }
}
