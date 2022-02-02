package Unidad5.T3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // EJEMPLO 1
        int n = 0;
        double resultado = 0;
        try {
            System.out.print("Ingrese un numero entero: ");
            n = input.nextInt();
            resultado = 999 / n;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            resultado = 999 / 1;
        } catch (InputMismatchException e) {
            e.printStackTrace();
            resultado = 999 / 1;
        } finally {
            System.out.println(resultado);
        }

        // EJEMPLO 2
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        int index = 0;
        try {
            System.out.print("Ingrese el indice: ");
            index = input.nextInt();
            if (index < 0 || index >= vocales.length) {
                fueraDelRango();
            }
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
            index = vocales.length - 1;
        } finally {
            System.out.println("Vocal: " + vocales[index]);
        }
    }

    public static void fueraDelRango() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("El indice esta fuera del rango del arreglo");
    }
}
