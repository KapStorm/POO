package Unidad6.Examen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {
                       
    }
    
    public static ArrayList<Alumnos> leerArchivo() {
        ArrayList<Alumnos> al = new ArrayList<>();
        String linea = "";
        String[] separador = {""};
        Alumnos aux;
        try {
            BufferedReader br = new BufferedReader(new FileReader("alumnos.txt"));
            while ((linea = br.readLine()) != null) {
                separador = linea.split(",");
                try {
                    aux = new Alumnos(separador[0].trim(), separador[1].trim(), separador[2].trim(), Double.parseDouble(separador[3].trim()), Boolean.parseBoolean(separador[4].trim()));
                    al.add(aux);
                } catch(Exception e) {
                    System.out.println("Error al leer al alumno");
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return al;
    }
}

class Alumnos {
    private String control;
    private String nombre;
    private String apellido;
    private double calificacion;
    private boolean sexo; // T: Hombre; F: Mujer
    
    public Alumnos(String control, String nombre, String apellido, double calificacion, boolean sexo) {
        this.control = control;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;
        this.sexo = sexo;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
}
