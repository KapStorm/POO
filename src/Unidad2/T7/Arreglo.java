/*---------------------------------------
Propósito:   Tarea 2.7 Sobre carga de constructores y metodos

Autor: Arellanes Beltrán Sebastián
Fecha: 23/09/2021
----------------------------------------*/
package Unidad2.T7;

public class Arreglo {
    private int[] arr;
//  A ver, abre algo
    // Contructor parametrico
    public Arreglo(int[] arr) {
        this.arr = arr;
    }

    // Contructor no parametrico
    public Arreglo() {
        this(new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
    }

    /*------------
        Metodos
     ------------*/
    public double calcular() {
        double suma = 0;

        for (int i : arr) {
            suma += i;
        }

        return suma;
    }

    public double calcular(int limite) {
        double suma = 0;

        for (int i = 0; i < limite; i++) {
            suma += arr[i];
        }

        return suma;
    }

    /*------------
        Getters
     ------------*/
    public int[] getArr() {
        return arr;
    }

    /*------------
        Setters
     ------------*/
    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
