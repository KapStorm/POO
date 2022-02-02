/*---------------------------------------
Propósito:   Tarea 5

Autor: Arellanes Beltrán Sebastián
Fecha: 27/11/2021
----------------------------------------*/
package Unidad5.T5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        boolean salida = false;
        int opcion = 0;
        while (!salida) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. ArrayIndexOutOfBoundsException ");
            System.out.println("2. StringIndexOutOfBoundsException ");
            System.out.println("3. Exception ");
            System.out.println("4. RunTimeException ");
            System.out.println("5. NumberFormatException ");
            System.out.println("6. NullPointerException ");
            System.out.println("7. IOException ");
            System.out.println("0. Salida");
            System.out.print(">>> ");
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
                    runTimeException();
                    break;
                case 5:
                    numberFormatException();
                    break;
                case 6:
                    nullPointerException();
                    break;
                case 7:
                    ioException();
                    break;
                case 0:
                    salida = !salida;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }                                                               
    }

    public static void arrayIndexOutOfBoundsException() {
         // ArrayIndexOutOfBounds
        String[] personas = {"Sebastian", "Diego", "Diana", "Elizabeth"};
        try {
            System.out.println(personas[-1]); 
            System.out.println(personas[4]); // Ambos mandan la excepcion
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
            System.out.println(personas[personas.length - 1]);
        }
    }

    public static void stringIndexOutOfBoundsException() {
        // StringIndexOutOfBoundsException
        String s = "Unidad 5";
        try {
            System.out.println(s.charAt(8));
            System.out.println(s.charAt(-1)); // Ambos mandan la excepcion
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
            System.out.println(s.charAt(s.length() - 1));
        }
    }

    public static void exception() {
        // Exception
        // 3 ejemplos de las excepciones que puede atrapar
        // puede atrapar todas la excepciones 
        String s = "Hola";
        Object o = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
            s.charAt(4);
            System.out.println(o);
            s = br.readLine();
            br.close();
        } catch(Exception e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void runTimeException() {
        // RunTimeException
        // 3 ejemplos de excepciones que derivan de la excepcion RunTimeException
        Object o = null;
        String s = "41243e";
        int n;
        try {
            n = Integer.parseInt(s);
            System.out.println(s.charAt(-1));
            System.out.println(o);
        } catch(RuntimeException e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void numberFormatException() {
        // NumberFormatException
        String s = "123abc";
        int n;
        try {
            n = Integer.parseInt(s);
            System.out.println(n);
        } catch(NumberFormatException e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
            n = 0;
            System.out.println(n);
        } 
    }

    public static void nullPointerException() {
        // NullPointerException
        Object o = null;
        try {
            System.out.println(o.toString());
        } catch (NullPointerException e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void ioException() {
        // IOException
        try {
            // Aqui se puede generalizar todas las excepciones que son hijas de la 
            // excepcion IOException, por ejemplo en este metodo nos devuelve la excepcion
            // FileNotFoundException si el archivo no existe
            BufferedReader bw = new BufferedReader(new FileReader("archivo.txt"));
            bw.read();
            bw.close();
        } catch (IOException e) {
            System.out.println("Excepcion: " + e.getClass());
            System.out.println("Error: " + e.getMessage());
        }
    }
}
