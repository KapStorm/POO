/*---------------------------------------
Propósito:   Clase persona para tarea 2

Autor: Arellanes Beltrán Sebastián
Fecha: 10/09/2021
----------------------------------------*/
package Unidad2.T2;

public class Persona {
    private String nombre, apellidos;
    private int edad;
    private float peso, estatura;

    // Constructor con todos los parametros
    public Persona(String nombre, String apellidos, int edad, float peso, float estatura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    // Constructor con nombre, apellidos y edad
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.peso = 0;
        this.estatura = 0;
    }

    // Constructor vacio
    public Persona() {
        this("Persona", "Perez", 10, 45.4f, 1.48f);
    }

    /*
    Getters
     */
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public float getPeso() {
        return peso;
    }

    public float getEstatura() {
        return estatura;
    }

    /*
    Setters
     */
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setApellidos (String apellidos){
        this.apellidos = apellidos;
    }

    public void setEdad ( int edad){
        this.edad = edad;
    }

    public void setPeso ( float peso){
        this.peso = peso;
    }

    public void setEstatura ( float estatura){
        this.estatura = estatura;
    }
}
