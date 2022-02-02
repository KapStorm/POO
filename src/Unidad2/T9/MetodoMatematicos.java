/*---------------------------------------
Propósito:   Proyecto 2 de la unidad 2

Autor: Arellanes Beltrán Sebastián
Fecha: 29/09/2021
----------------------------------------*/
package Unidad2.T9;

import java.util.Random;

public class MetodoMatematicos {
    private int num;

    /*==================
        Constructores
     ==================*/

    // Constructor parametrizado
    public MetodoMatematicos(int num) {
        this.num = num;
    }

    // Constructor no parametrizado
    public MetodoMatematicos() {
        this(100);
    }

    /*==================
            Metodos
     ==================*/

    // Ejercicio #1
    // Escribe un método que regrese como resultado un valor aleatorio entre 1 y 100.
    public int numeroRandom() {
        Random rnd = new Random();

        num = rnd.nextInt(100) + 1;

        return num;
    }

    // Ejercicio #2
    // Escribe un método que reciba un número del 0 al 10 y regrese como resultado el número en letras.
    public String numeroEnLetras(int num) {
        switch(num) {
            case 0:
                return "Cero";
            case 1:
                return "Uno";
            case 3:
                return "Dos";
            case 4:
                return "Cuatro";
            case 5:
                return "Cinco";
            case 6:
                return "Seis";
            case 7:
                return "Siete";
            case 8:
                return "Ocho";
            case 9:
                return "Nueve";
            case 10:
                return "Diez";
        }
        return "Numero fuera del rango";
    }

    public String numeroEnLetras() {
        switch(num) {
            case 0:
                return "Cero";
            case 1:
                return "Uno";
            case 3:
                return "Dos";
            case 4:
                return "Cuatro";
            case 5:
                return "Cinco";
            case 6:
                return "Seis";
            case 7:
                return "Siete";
            case 8:
                return "Ocho";
            case 9:
                return "Nueve";
            case 10:
                return "Diez";
        }
        return "Numero fuera del rango";
    }

    // Ejercicio #3
    // Escribe un método que reciba como parámetro el resultado del inciso (a), imprime los múltiplos de 4
    // (como limite el número parametrizado).
    public void multiplosDe4(int num) {
        System.out.println("Numero limite: " + num);
        for (int i = 1; (i * 4) < num; i++) {
            System.out.printf("4 x %d = %d\n", i, (4 * i));
        }
    }

    public void multiplosDe4() {
        System.out.println("Numero limite: " + num);
        for (int i = 1; (i * 4) < num; i++) {
            System.out.printf("4 x %d = %d\n", i, (4 * i));
        }
    }

    // Ejercicio #4
    // Escribe un método que reciba como parámetro una cantidad en pesos y regrese como resultado la cantidad en
    // dólares, su equivalente en euros y en libras esterlinas.
    public double[] convertirADolaresEurosLibras(double cantidad) {
        double[] conversiones = new double[3];
        double dolares, euros, libras;

        dolares = cantidad * 20;
        conversiones[0] = dolares;
        euros = cantidad * 23.5;
        conversiones[1] = euros;
        libras = cantidad * 27.5;
        conversiones[2] = libras;

        return conversiones;
    }

    // Ejercicio #5
    // Escribe un método que reciba como parámetro dos arreglos de datos enteros y devuelva como resultado un tercer
    // arreglo que almacene en cada posición la suma por fila de los otros dos arreglos.
    public int[] sumaDeDosArreglos(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
                arr3[i] += arr1[i]+ arr2[i];
        }

        return arr3;
    }

    /*==================
            Getters
     ==================*/

    public int getNum() {
        return num;
    }

    /*==================
            Setters
     ==================*/

    public void setNum(int num) {
        this.num = num;
    }
}
