/*---------------------------------------
Prop�sito:   Realizar la tarea 5 de la unidad 2

Autor: Arellanes Beltr�n Sebasti�n
Fecha: 20/09/2021
----------------------------------------*/
package Unidad2.T5;

import java.util.Scanner;

public class CargaMaterias {
    private int idMateria, creditos, alumnosMax, alumnosActual;
    private String descripcion, carrera, grupo;

    public CargaMaterias() {
        this(0, "Sin descripcion", 0, "Sistemas Computacionales", "A", 20, 0);
    }

    public CargaMaterias(int idMateria, String descripcion, int creditos, String carrera, String grupo, int alumnosMax, int alumnosActual) {
        this.idMateria = idMateria;
        this.descripcion = descripcion;
        this.creditos = creditos;
        this.carrera = carrera;
        this.grupo = grupo;
        this.alumnosMax = alumnosMax;
        this.alumnosActual = alumnosActual;
    }

    public double cargar() {
        Scanner input = new Scanner(System.in);
        double promedio = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Ingrese la calificacion #%d: ", (i + 1));
            promedio = input.nextDouble();
        }
        promedio /= 3;

        return promedio;
    }

    public double cargar(double cal1, double cal2, double cal3) {
        return (cal1 + cal2 + cal3) / 3;
    }

    /*
        Getters
     */
    public int getIdMateria() {
        return idMateria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getGrupo() {
        return grupo;
    }

    public int getAlumnosMax() {
        return alumnosMax;
    }

    public int getAlumnosActual() {
        return alumnosActual;
    }

    /*
        Setters
     */
    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setAlumnosMax(int alumnosMax) {
        this.alumnosMax = alumnosMax;
    }

    public void setAlumnosActual(int alumnosActual) {
        this.alumnosActual = alumnosActual;
    }
}
