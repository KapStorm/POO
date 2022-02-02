/*---------------------------------------
Propósito:   Tarea 1

Autor: Arellanes Beltrán Sebastián
Fecha: 26/10/2021
----------------------------------------*/
package Unidad4.T1;

public class Lobo extends Animal{
    @Override
    public void comer() {
        System.out.println("Comiendo carne fresca");
    }

    @Override
    public void dormir() {
        System.out.println("Duermo en el bosque");
    }

    @Override
    public void comunicarse() {
        System.out.println("Auuu");
    }
}
