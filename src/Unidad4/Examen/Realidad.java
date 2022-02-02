/*---------------------------------------
Propósito:   Examen U4

Autor: Arellanes Beltrán Sebastián
Fecha: 19/11/2021
----------------------------------------*/
package Unidad4.Examen;

public class Realidad extends Guante {
    public Realidad(double poderTotal) {
        super(poderTotal);
    }

    @Override
    public void turbo() {
        System.out.println("Aumento mi poder en un 40%");
        poderTotal *= 1.4;
        System.out.printf("Mi poder es %.2f\n", poderTotal);
    }

    @Override
    public void habilidad() {
        System.out.println("Manipulo tu realidad");
        poderTotal();
    }

    @Override
    public String mensaje() {
        return "Estoy utilizando la gema de la Realidad";
    }
}
