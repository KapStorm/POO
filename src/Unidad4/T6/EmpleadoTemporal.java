/*---------------------------------------
Propósito:   Tarea 6

Autor: Arellanes Beltrán Sebastián
Fecha: 16/11/2021
----------------------------------------*/
package Unidad4.T6;

public class EmpleadoTemporal implements Ocupacion {
    private String ocupacion;
    private String nomina;

    public EmpleadoTemporal(String nomina) {
        this.nomina = nomina;
    }

    @Override
    public void asignarOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
        System.out.println("El empleado va a durar 30 dias en la ocupacion " + ocupacion);
    }

    @Override
    public String tipoNomina() {
        return nomina;
    }
}
