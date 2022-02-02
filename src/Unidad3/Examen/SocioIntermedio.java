/*---------------------------------------
Propósito:   Examen U3

Autor: Arellanes Beltrán Sebastián
Fecha: 29/10/2021
----------------------------------------*/
package Unidad3.Examen;

public class SocioIntermedio extends Socio {
    public SocioIntermedio(String clave, String nombre, String apellido, String telefono) {
        super(clave, nombre, apellido, telefono);
    }

    @Override
    public double costoAfilacion() {
        double costoMembresia = 600;
        double monederoElectronico = 1500;
        System.out.printf("Costo de la membresia " + this.getClass().getSimpleName() + " $%.2f\n", costoMembresia);
        System.out.printf("Monedero electronico generado $%.2f\n", monederoElectronico);
        return costoMembresia; // Por si se necesita
    }
}
