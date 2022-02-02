/*---------------------------------------
Propósito:   Realizar la tarea 5 de la unidad 2

Autor: Arellanes Beltrán Sebastián
Fecha: 20/09/2021
----------------------------------------*/
package Unidad2.T5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<CargaMaterias> grupos = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();

        m.crearGrupo();
        // Hice el metodo cargar en la clase CargaMaterias
        System.out.println("Calificacion promedio: " + m.grupos.get(1).cargar(34, 52, 90));
        System.out.println("El grupo esta lleno: " + m.grupoLleno(m.grupos.get(1)));
    }

    public void crearGrupo() {
        System.out.println("Ingrese el ID de la materia");
        int id = input.nextInt();

        System.out.println("Ingrese la descripcion");
        String desc = input.next();

        System.out.println("Ingrese los creditos");
        int creditos = input.nextInt();

        System.out.println("Ingrese la carrera");
        String carrera = input.next();

        System.out.println("Ingrese el grupo");
        String grupo = input.next();

        System.out.println("Ingrese cantidad de alumnos registrados");
        int cantidadAlumnos = input.nextInt();

        System.out.println("Ingrese los maximos alumnos");
        int maxAlumnos = input.nextInt();

        grupos.add(new CargaMaterias(id, desc, creditos, carrera, grupo, cantidadAlumnos, maxAlumnos));
    }


    public boolean grupoLleno(CargaMaterias grupo) {
        return (grupo.getAlumnosActual() >= grupo.getAlumnosMax());
    }
}
