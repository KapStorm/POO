/*---------------------------------------
Propósito:   Examen U4

Autor: Arellanes Beltrán Sebastián
Fecha: 19/11/2021
----------------------------------------*/
package Unidad4.Examen;

public abstract class Guante {
    protected double poderTotal;

    public Guante(double poderTotal) {
        this.poderTotal = poderTotal;
    }

    public void poderTotal() {
        System.out.printf("Poder antes de utilizar la habilidad %.2f\n", poderTotal);
        double aumento = poderTotal * 0.10;
        System.out.printf("Su poder aumento %.2f\n", aumento);
        poderTotal += aumento;
        System.out.printf("El poder total es %.2f\n", poderTotal);
    }

    public abstract void turbo();

    public abstract void habilidad();

    public abstract String mensaje();
}
