/*---------------------------------------
Propósito:   Examen U4

Autor: Arellanes Beltrán Sebastián
Fecha: 19/11/2021
----------------------------------------*/
package Unidad4.Examen;

public class Alma extends Guante {
    public Alma(double poderTotal) {
        super(poderTotal);
    }

    @Override
    public void turbo() {
        System.out.println("Aumento mi poder en un 30%");
        poderTotal *= 1.3;
        System.out.printf("Mi poder es %.2f\n", poderTotal);
    }

    @Override
    public void habilidad() {
        System.out.println("El oponente pierde la fe");
        poderTotal();
    }

    @Override
    public String mensaje() {
        return "Viva cristo rey";
    }
}
