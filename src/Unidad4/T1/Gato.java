/*---------------------------------------
Propósito:   Tarea 1

Autor: Arellanes Beltrán Sebastián
Fecha: 26/10/2021
----------------------------------------*/
package Unidad4.T1;

public class Gato extends Animal{
    @Override
    public void comer() {
        System.out.println("Esto comiendo wiskas");
    }

    @Override
    public void dormir() {
        System.out.println("Esto durmiendo en la ventana");
    }

    @Override
    public void comunicarse() {
        System.out.println("Miau");
    }
}
