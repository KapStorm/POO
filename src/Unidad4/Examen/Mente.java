/*---------------------------------------
Propósito:   Examen U4

Autor: Arellanes Beltrán Sebastián
Fecha: 19/11/2021
----------------------------------------*/
package Unidad4.Examen;

public class Mente extends Guante {
    public Mente(double poderTotal) {
        super(poderTotal);
    }

    @Override
    public void turbo() {
        System.out.println("Aumento mi poder en un 23%");
        poderTotal *= 1.23;
        System.out.printf("Mi poder es %.2f\n", poderTotal);
    }

    @Override
    public void habilidad() {
        System.out.println("Danio la mente del oponente");
        poderTotal();
    }

    @Override
    public String mensaje() {
        return "Paz mental";
    }
}
