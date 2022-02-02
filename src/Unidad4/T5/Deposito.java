/*---------------------------------------
Propósito:   Proyecto 2 U4

Autor: Arellanes Beltrán Sebastián
Fecha: 09/11/2021
----------------------------------------*/
package Unidad4.T5;

public class Deposito implements Operacion {
    @Override
    public double realizarOperacion(Cuenta c, double imp) {
        System.out.printf("Saldo $%.2f\n", c.saldo);
        c.saldo += imp;
        return 0;
    }
}
