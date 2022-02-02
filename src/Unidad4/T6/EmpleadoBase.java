/*---------------------------------------
Propósito:   Tarea 6

Autor: Arellanes Beltrán Sebastián
Fecha: 16/11/2021
----------------------------------------*/
package Unidad4.T6;

public class EmpleadoBase implements Ocupacion {
    private String ocupacion;
    private String nomina;

    public EmpleadoBase(String nomina) {
        this.nomina = nomina;
    }

    @Override
    public void asignarOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
        System.out.println("Se le ha asigando al empleado base la ocupacion de " + ocupacion);
    }

    @Override
    public String tipoNomina() {
        return nomina;
    }
}
