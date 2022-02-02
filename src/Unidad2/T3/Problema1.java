/*---------------------------------------
Propósito:   1. Elabora una clase en Java donde tengas el metodo Calcular, en el cual se pueda realizar un calculo matemático (tu lo inventas)


Autor: Arellanes Beltrán Sebastián
Fecha: 12/09/2021
----------------------------------------*/

package Unidad2.T3;

public class Problema1 {
    private double num1, num2;

    public Problema1(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Calcula la suma de dos numeros y despues elevar la suma a la 4ta potencia
    public double calcular() {
        double res;

        res = num1 + num2;
        res = Math.pow(res, 4);

        return res;
    }

    /*
    Getters
     */
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    /*
    Setters
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
