/*---------------------------------------
Propósito:   Examen U3

Autor: Arellanes Beltrán Sebastián
Fecha: 29/10/2021
----------------------------------------*/
package Unidad3.Examen;

public class AppNICE {
    public static void main(String[] args) {
        SocioBasico sb1 = new SocioBasico("1", "Sebastian", "Arellanes", "6673569491");
        sb1.bienvenida();
        sb1.costoAfilacion();
        System.out.println();
        SocioIntermedio si1 = new SocioIntermedio("2", "Aldo", "Uriarte", "6671231234");
        si1.bienvenida();
        si1.costoAfilacion();
        System.out.println();
        SocioPreferente sp1 = new SocioPreferente("3", "Julissa", "Perez", "6674445042");
        sp1.bienvenida();
        sp1.costoAfilacion();
        System.out.println();
        sb1.baja();
        si1.baja();
        sp1.baja();
    }
}
