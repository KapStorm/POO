package Unidad3.E2;

import java.util.ArrayList;
import java.util.Scanner;

public class Prestamo {
    Scanner input;
    ArrayList<Material> materialArrayList;
    ArrayList<Persona> personaArrayList;
    protected String codigo, id, fechaSalida, fechaEntrada;

    public Prestamo() {
        materialArrayList = new ArrayList<>();
        personaArrayList = new ArrayList<>();
        input = new Scanner(System.in);
    }

    public Persona agregarPersona() {
        Persona p = new Persona();
        System.out.println("Nombre de la persona");
        p.nombre = input.next();
        System.out.println("Tipo de persona");
        p.tipoPersona = input.next();
        System.out.println("Apellido de la persona");
        p.apellido = input.next();
        System.out.println("Correo de la persona");
        p.correo = input.next();
        System.out.println("Numero de la persona");
        p.telefono = input.nextInt();
        System.out.println("Numero de libros");
        p.numLibros = input.nextInt();
        System.out.println("Tiene adeudo (true/false)");
        p.adeudo = input.nextBoolean();
        return p;
    }

    public void cuota() {

    }
}
