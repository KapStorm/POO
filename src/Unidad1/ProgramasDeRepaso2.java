package Unidad1;

import java.util.*;

/*---------------------------------------
Propósito:   En este bloque se pretende que el estudiante haga un buen uso de arreglos y de metodos. que accedan a
            diversos programas a traves de un menu de opciones.

Autor: Arellanes Beltrán Sebastián
Fecha: 03/09/2021
----------------------------------------*/
public class ProgramasDeRepaso2 {
    static Scanner input = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) {
        while(menu());
    }

    public static boolean menu() {
        int opcion;

        System.out.println("\n== Menu ==");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                ejercicio1();
                break;
            case 2:
                System.out.println(ejercicio2());
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            case 0:
                System.out.println("Saliendo del programa...");
                return false;
        }
        return true;
    }

    public static void ejercicio1() {
        /*
        1.	Almacenar 25 números en un arreglo, elevar al cuadrado cada valor almacenado y almacenarlo en otro arreglo.
        Imprimir el arreglo original y el arreglo con los valores elevados al cuadrado.
         */
        int[] arrNormal = new int[25];
        int[] arrCubo = new int[25];

        for (int i = 0; i < arrNormal.length; i++) {
            arrNormal[i] = rnd.nextInt(30) + 1; // No menciona que rango, + 1 para exceptuar 0
            arrCubo[i] = (int) Math.pow(arrNormal[i], 2);
        }

        for (int i = 0; i < arrNormal.length; i++) {
            System.out.printf("%d² = %d\n", arrNormal[i], arrCubo[i]);
        }
    }

    public static int ejercicio2() {
        /*
        2.	Crear un arreglo de 10 elementos. Calcular y devolver como resultado de sumar de todos los elementos del
        arreglo y dividirlo entre 3.
         */
        int suma = 0;
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(30); // No menciona que rango
            suma += arr[i];
        }
        suma /= 3;

        return (suma);
    }

    public static void ejercicio3() {
        /*
        3.	Crear un arreglo de 3 x 3. Llenarlo e imprimir solo el resultado de la suma de toda la fila.
         */
        int[][] arr = new int[3][3];
        int suma = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(30); // No menciona que rango
                suma += arr[i][j];
            }
            System.out.println(suma);
            suma = 0;
        }
    }

    public static void ejercicio4() {
        /*
        4.	Crear un arreglo de 10 elementos, imprimir solo las posiciones que contengan un valor par. Ejemplo
        {2,5,3,1,2,4,5,6,8,0} Imprimir {0,4,5,7,8,9}.
         */
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++)
            arr[i] = rnd.nextInt(30);

        for (int i : arr)
            if (i % 2 == 0 && i != 0)
                System.out.println(i);
    }

    public static void ejercicio5() {
        /*
        5.	Crear un arreglo de 4 x 4. Imprimir la transpuesta de la matriz (pasar las filas a columnas y las columnas
         a filas). Imprimir el resultado de la suma de los elementos de la diagonal principal.
        */
        int[][] arr = new int[4][4];
        int[][] arrTraspuesto = new int[4][4];
        int suma = 0;

        for (int i = 0; i < arr.length; i++) { // Arreglo inicial
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(30);
            }
        }

        for (int i = 0; i < arrTraspuesto.length; i++) { // Arreglo traspuesto
            for (int j = 0; j < arrTraspuesto[i].length; j++) {
                arrTraspuesto[i][j] = arr[j][i];
            }
        }

        for (int i = 0; i < arrTraspuesto.length; i++)
            suma += arrTraspuesto[i][i];

        System.out.println(suma);
    }
}
