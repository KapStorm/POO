/*---------------------------------------
Propósito:   Proyecto 2 de la unidad 2

Autor: Arellanes Beltrán Sebastián
Fecha: 29/09/2021
----------------------------------------*/
package Unidad2.T9;

public class MetodoAlumnos {
    private Alumno[] alumnos;

    /*==================
        Constructores
     ==================*/

    public MetodoAlumnos() {
        alumnos = new Alumno[4];
        alumnos[0] = new Alumno("00007", "Alexia", "Armenta", "Sistemas Computacionales", false, 44);
        alumnos[1] = new Alumno("00008", "Carlos", "Rodriguez", "Gestion Empresarial", true, 80);
        alumnos[2] = new Alumno("00009", "Bryan", "Camacho", "Sistemas Computacionales", true, 93);
        alumnos[3] = new Alumno("00010", "Fernanda", "Samano", "Mecanica", false, 99);
    }

    public MetodoAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    /*==================
            Metodos
     ==================*/

    // Ejercicio #11
    // Escribe un método que reciba como parámetro un arreglo de objetos tipo Alumno y devuelva como resultado el
    // número de mujeres que hay en el grupo.
    public int cuantasMujeresHay(Alumno[] alumnos) {
        int contador = 0;

        for (Alumno alum : alumnos) {
            if (!alum.getSexo()) {
                contador++;
            }
        }

        return contador;
    }

    public int cuantasMujeresHay() {
        int contador = 0;

        for (Alumno alum : alumnos) {
            if (!alum.getSexo()) {
                contador++;
            }
        }

        return contador;
    }

    // Ejercicio #12
    // Escribe un método que reciba como parámetro un arreglo de Alumno y devuelva el promedio de todo el grupo.
    public double promedioDelGrupo(Alumno[] alumnos) {
        double promedio = 0;

        for (Alumno alum : alumnos) {
            promedio += alum.getPromedio();
        }
        promedio /= alumnos.length;

        return promedio;
    }

    public double promedioDelGrupo() {
        double promedio = 0;

        for (Alumno alum : alumnos) {
            promedio += alum.getPromedio();
        }
        promedio /= alumnos.length;

        return promedio;
    }

    // Ejercicio #13
    // Escribe un método que reciba como parámetro un arreglo de Alumno y devuelva como resultado el total de
    // alumnos reprobados con promedio menor que 70.
    public int cantidadDeReprobados(Alumno[] alumnos) {
        int contador = 0;

        for (Alumno alumno : alumnos) {
            if (alumno.getPromedio() < 70) {
                contador++;
            }
        }

        return contador;
    }

    /*==================
            Getters
     ==================*/

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    /*==================
            Setters
     ==================*/

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
}
