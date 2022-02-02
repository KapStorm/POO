/*---------------------------------------
Propósito:   Examen U4

Autor: Arellanes Beltrán Sebastián
Fecha: 19/11/2021
----------------------------------------*/
package Unidad4.Examen;

public class Poder extends Guante {
    public Poder(double poderTotal) {
        super(poderTotal);
    }

    @Override
    public void turbo() {
        System.out.println("Aumento mi poder en un 27%");
        poderTotal *= 1.27;
        System.out.printf("Mi poder es %.2f\n", poderTotal);
    }

    @Override
    public void habilidad() {
        System.out.println("Tengo el poder de destruir todo");
        poderTotal();
    }

    @Override
    public String mensaje() {
        return "La fuerza es poder";
    }
}
