/*---------------------------------------
Propósito:   Tarea 6

Autor: Arellanes Beltrán Sebastián
Fecha: 16/11/2021
----------------------------------------*/
package Unidad4.T6;

public class App {
    public static void main(String[] args) {
        // CREO QUE ES ASI LA TAREA, NO SE COMO QUIERE QUE IMPLEMENTEMOS LA NOMINA ASI QUE LO PUSE
        // COMO CONSTRUCTOR
        Ocupacion e;

        e = new EmpleadoBase("Semanal");
        e.asignarOcupacion("Intendente");
        System.out.println("Nomina del empleado: " + e.tipoNomina());

        e = new EmpleadoTemporal("Mensual");
        e.asignarOcupacion("Oficinista");
        System.out.println("Nomina del empleado: " + e.tipoNomina());
    }
}
