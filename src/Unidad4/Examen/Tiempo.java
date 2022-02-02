/*---------------------------------------
Propósito:   Examen U4

Autor: Arellanes Beltrán Sebastián
Fecha: 19/11/2021
----------------------------------------*/
package Unidad4.Examen;

public class Tiempo extends Guante {
    public Tiempo(double poderTotal) {
        super(poderTotal);
    }

    @Override
    public void turbo() {
        System.out.println("Aumento mi poder en un 20%");
        poderTotal *= 1.2;
        System.out.printf("Mi poder es %.2f\n", poderTotal);
    }

    @Override
    public void habilidad() {
        System.out.println("Rompo el tiempo");
        poderTotal();
    }

    @Override
    public String mensaje() {
        return "El tiempo es realtivo";
    }
}
