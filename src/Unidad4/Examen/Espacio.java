/*---------------------------------------
Propósito:   Examen U4

Autor: Arellanes Beltrán Sebastián
Fecha: 19/11/2021
----------------------------------------*/
package Unidad4.Examen;

public class Espacio extends Guante {
    public Espacio(double poderTotal) {
        super(poderTotal);
    }

    @Override
    public void turbo() {
        System.out.println("Aumento mi poder en un 13%");
        poderTotal *= 1.13;
        System.out.printf("Mi poder es %.2f\n", poderTotal);
    }

    @Override
    public void habilidad() {
        System.out.println("El espacio al rededor mio es manipulable");
        poderTotal();
    }

    @Override
    public String mensaje() {
        return "El espacio es todo lo que nos rodea";
    }
}
