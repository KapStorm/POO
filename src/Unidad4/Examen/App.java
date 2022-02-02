/*---------------------------------------
Propósito:   Examen U4

Autor: Arellanes Beltrán Sebastián
Fecha: 19/11/2021
----------------------------------------*/
package Unidad4.Examen;

public class App {
    /*
    En el infinito existen seis gemas: Tiempo, Mente, Alma, Espacio, Poder y Realidad. Cada gema tiene los métodos
    Habilidad () y Mensaje (). Se tiene la clase abstracta Guante con el método poderTotal() y el método abstracto Turbo();

    Elabora un programa que haga uso del polimorfismo en el cual deberás darle funcionalidad a un guante (hacer uso de
    por lo menos tres gemas), el cual debe ser capaz de utilizar cada gema por separado, y cada vez que use una en el
    método poderTotal() se debe incrementar en 10% el poder actual.
     */
    public static void main(String[] args) {
        Guante guante;

        guante = new Mente(100);
        System.out.println(guante.mensaje());
        guante.habilidad();
        System.out.println();

        guante = new Tiempo(guante.poderTotal);
        System.out.println(guante.mensaje());
        guante.habilidad();
        guante.turbo();
        System.out.println();

        guante = new Poder(guante.poderTotal);
        System.out.println(guante.mensaje());
        guante.habilidad();
    }
}
