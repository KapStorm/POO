/*---------------------------------------
Propósito:   Examen U3

Autor: Arellanes Beltrán Sebastián
Fecha: 29/10/2021
----------------------------------------*/
package Unidad3.Examen;

public class SocioBasico extends Socio {
    public SocioBasico(String clave, String nombre, String apellido, String telefono) {
        super(clave, nombre, apellido, telefono);
    }

    @Override
    public double costoAfilacion() {
        double costoMembresia = 400;
        double monederoElectronico = 1000;
        System.out.printf("Costo de la membresia de " + this.getClass().getSimpleName() + " $%.2f\n", costoMembresia);
        System.out.printf("Monedero electronico generado $%.2f\n", monederoElectronico);
        return costoMembresia; // Por si se necesita
    }
}
