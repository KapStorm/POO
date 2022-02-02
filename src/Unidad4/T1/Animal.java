/*---------------------------------------
Propósito:   Tarea 2

Autor: Arellanes Beltrán Sebastián
Fecha: 26/10/2021
----------------------------------------*/
package Unidad4.T1;

public class Animal implements IAnimal{
    @Override
    public void comer() {
        System.out.println("Estoy comiendo croquetas");
    }

    @Override
    public void dormir() {
        System.out.println("Duermo en el sofa");
    }

    @Override
    public void comunicarse() {
        System.out.println("Guau");
    }

    @Override
    public String toString() {
        return "Soy un " + this.getClass().getSimpleName();
    }
}
