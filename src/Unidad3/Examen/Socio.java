/*---------------------------------------
Propósito:   Examen U3

Autor: Arellanes Beltrán Sebastián
Fecha: 29/10/2021
----------------------------------------*/
package Unidad3.Examen;

public abstract class Socio {
    protected String clave, nombre, apellido, telefono, tipoDeSocio;

    public Socio(String clave, String nombre, String apellido, String telefono) {
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.tipoDeSocio = this.getClass().getSimpleName();
    }

    public void bienvenida() {
        System.out.println("Bienvenido nuestro " + this.tipoDeSocio + " " + this.nombre);
    }

    public abstract double costoAfilacion();

    public void baja() {
        System.out.println("El cliente " + this.nombre + " se ha dado de baja :(");
    }
}
