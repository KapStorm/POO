/*---------------------------------------
Propósito:   Proyecto 2 U4

Autor: Arellanes Beltrán Sebastián
Fecha: 09/11/2021
----------------------------------------*/
package Unidad4.T5;

public class Retiro implements Operacion {
    @Override
    public double realizarOperacion(Cuenta c, double imp) {
        System.out.printf("Saldo $%.2f\n", c.saldo);
        if (c.saldo >= imp) {
            System.out.printf("Se ha retirado $%.2f con exito\n", imp);
            c.saldo -= imp;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return 0;
    }
}
