/*---------------------------------------
Prop�sito:   Proyecto 2 U4

Autor: Arellanes Beltr�n Sebasti�n
Fecha: 09/11/2021
----------------------------------------*/
package Unidad4.T5;

public class ConsultarSaldo implements Operacion {
    @Override
    public double realizarOperacion(Cuenta c, double imp) {
        return c.saldo;
    }
}
