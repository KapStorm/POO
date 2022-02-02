/*---------------------------------------
Propósito:   Tarea 2.7 Sobre carga de constructores y metodos

Autor: Arellanes Beltrán Sebastián
Fecha: 23/09/2021
----------------------------------------*/
package Unidad2.T7;

import java.util.Random;
import java.util.Scanner;

public class DemoArreglo {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        DemoArreglo m = new DemoArreglo();
        int[] arr1 = new int[20];

        System.out.println("Ingrese 20 numeros");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(">> ");
            arr1[i] = m.input.nextInt();
        }

        // Usando constructor parametrico
        Arreglo arreglo1 = new Arreglo(arr1);
        System.out.println("\nArreglo 1");
        System.out.printf("Suma total: %.2f\n", arreglo1.calcular());
        System.out.printf("Suma de la posicion 1 a la 10: %.2f\n", arreglo1.calcular(10));

        // Usando metodo arrInt y constructor parametrico
        Arreglo arreglo2 = new Arreglo(m.arrInt(20));
        System.out.println("\nArreglo 2");
        System.out.printf("Suma total: %.2f\n", arreglo2.calcular());
        System.out.printf("Suma de la posicion 1 a la 10: %.2f\n", arreglo2.calcular(10));

        // Usando constructor no parametrico
        Arreglo arreglo3 = new Arreglo();
        System.out.println("\nArreglo 3");
        System.out.printf("Suma total: %.2f\n", arreglo3.calcular());
        System.out.printf("Suma de la posicion 1 a la 10: %.2f\n", arreglo3.calcular(10));
    }

    public int[] arrInt(int N) {
        Random rnd = new Random();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(101);
        }

        return arr;
    }
}
