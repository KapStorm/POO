/*---------------------------------------
Propósito:   Examen U3

Autor: Arellanes Beltrán Sebastián
Fecha: 29/10/2021
----------------------------------------*/
package Unidad3.Examen;

public class SocioPreferente extends Socio {
    public SocioPreferente(String clave, String nombre, String apellido, String telefono) {
        super(clave, nombre, apellido, telefono);
    }

    @Override
    public double costoAfilacion() {
        double costoMembresia = 999;
        double monederoElectronico = 2000;
        System.out.printf("Costo de la membresia " + this.getClass().getSimpleName() + " $%.2f\n", costoMembresia);
        costoMembresia *= 0.70;
        System.out.printf("Aplicandole el 30%% de descuento $%.2f\n", costoMembresia);
        System.out.printf("Monedero electronico generado $%.2f\n", monederoElectronico);
        return costoMembresia; // Por si se necesita
    }
}
