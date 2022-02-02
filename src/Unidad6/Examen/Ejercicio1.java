package Unidad6.Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean bandera = false;
        int opcion = 0;
        while (!bandera) {
            System.out.println("\n== MENU ==");
            System.out.println("1. InputMistmatchException");
            System.out.println("2. ArrayIndexOutOfBounds");
            System.out.println("3. NullPointerException");
            System.out.println("0. Salir");
            System.out.print(">>> ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    inputMistmatch();
                    break;
                case 2:
                    arrayIndexOutOfBounds();
                    break;
                case 3:
                    nullPointer();
                    break;
                case 0:
                    bandera = !bandera;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }       
            
    } 

    public static void inputMistmatch() {
        Scanner input = new Scanner(System.in);
        int auxiliar = 0;
        System.out.println("Ingrese algo, si NO es entero arroja a excepcion");
        System.out.print(">>> ");
        try {
            auxiliar = input.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Tipo: " + e.getClass());
            auxiliar = 100;
        } finally {
            System.out.println("El numero es " + auxiliar);
        }
    }

    public static void arrayIndexOutOfBounds() {
        Scanner input = new Scanner(System.in);
        int auxiliar = 0;
        final char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        int pos = 0;
        System.out.println("Vocales: a e i o u");
        System.out.println("Ingrese la vocal que quiera imprimir, si se sale del tamanio del arreglo manda la excepcion");
        System.out.print(">>> ");
        try {
            pos = input.nextInt();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Tipo: " + e.getClass());
            pos = vocales.length - 1;
        } finally {
            System.out.println(vocales[pos]);
        }
    }
    
    public static void nullPointer() {
        Perro mascota1 = null;
        System.out.println("Se ingresa un objeto de tipo perro nulo, por lo que arrojara la excepcion al querer manipularlo");
        try {
            System.out.println("Nombre de la mascota: " + mascota1.getNombre());
        } catch(NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Tipo: " + e.getClass());
        } 
    }
}

class Perro {
    private String nombre;
    private int edad;
    private String raza;
    private String color;
    private boolean sexo; // T: Hombre; F: Mujer

    public Perro(String nombre, int edad, String raza, String color, boolean sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    
}
