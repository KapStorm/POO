/*---------------------------------------
Propósito:   Proyecto 2 de la unidad 2

Autor: Arellanes Beltrán Sebastián
Fecha: 29/09/2021
----------------------------------------*/
package Unidad2.T9;

import java.util.ArrayList;

public class Alumno {
    // Elabora la clase Alumno, la cual debe contener los siguientes atributos privados: nControl, nombre, apellido,
    // sexo, carrera, promedio. Generar sus métodos getter and setter.
    private String nControl, nombre, apellido, carrera;
    private boolean sexo; // true hombre; false mujer
    private double promedio;

    /*==================
        Constructores
     ==================*/

    // Constructor parametrizado
    public Alumno(String nControl, String nombre, String apellido, String carrera, boolean sexo, double promedio) {
        this.nControl = nControl;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.sexo = sexo;
        this.promedio = promedio;
    }

    // Constructor no parametrizado
    public Alumno() {

    }

    /*==================
            Getters
     ==================*/

    public String getnControl() {
        return nControl;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public boolean getSexo() {
        return sexo;
    }

    public double getPromedio() {
        return promedio;
    }

    /*==================
            Setters
     ==================*/

    public void setnControl(String nControl) {
        this.nControl = nControl;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
