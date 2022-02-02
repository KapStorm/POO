package Unidad3.Proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    // Migue Barraza
    protected ArrayList<Usuario> usuarios;
    protected ArrayList<Producto> productos;
    protected ArrayList<String> ventas;
    protected Scanner input;
    protected String id, nombre, password, perfil;

    // Miguel Barraza
    public Usuario(String id, String nombre, String password) {
        input = new Scanner(System.in);
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.perfil = this.getClass().getSimpleName();
    }

    // Sebastian A.
    public boolean menu(ArrayList<Usuario> usuarios, ArrayList<Producto> productos, ArrayList<String> ventas) {
        this.usuarios = usuarios;
        this.productos = productos;
        this.ventas = ventas;
        int opcion;
        Producto producto;
        System.out.println();
        System.out.println(this);
        System.out.println("1. Vender");
        System.out.println("2. Consultar existencia");
        System.out.println("0. Cerrar sesion");
        System.out.print(">>> ");
        opcion = input.nextInt();
        switch (opcion) {
            case 1:
                vender();
                break;
            case 2:
                consultarExistencia();
                break;
            case 0:
                System.out.println("Cerrando sesion");
                return true;
        }
        return false;
    }

    // Sebastian A.
    public void vender() {
        String id;
        String venta = "ID del vendedor: " + this.id + "; Ventas: ";
        double dinero = 0;
        boolean seEcontroProducto = false, bandera = true;
        System.out.println("Introduzca los productos, 0 para terminar de introducir");

        while (bandera) {
            seEcontroProducto = false;
            System.out.println("Ingrese el ID del producto");
            id = input.next();
            if (id.equals("0")) {
                bandera = false;
                break;
            }
            for (Producto p : productos) {
                if (p.id.equals(id)) {
                    seEcontroProducto = true;
                    if (p.existencia > 0) {
                        p.existencia -= 1;
                        dinero += p.precio;
                        System.out.println(p.descrip + " agregado");
                        System.out.printf("Dinero acumulado: $%.2f\n", dinero);
                        venta = venta.concat(p.descrip + "; ");
                    } else {
                        System.out.println("El producto " + p.descrip + " no tiene existencia");
                    }
                }
            }
            if (!seEcontroProducto) {
                System.out.println("Producto no encontrado");
            }
        }
        if (dinero > 0) {
            System.out.println("Venta agregada");
            System.out.printf("TOTAL: $%.2f\n", dinero);
            venta = venta.concat("TOTAL: $" + dinero);
            ventas.add(venta);
        } else {
            System.out.println("Venta no agregada");
        }
    }

    // Juan Jose
    public void consultarExistencia() {
        String id;
        Producto producto = null;
        System.out.println("Ingrese el ID del producto");
        id = input.next();

        for (Producto p : productos) {
            if (p.id.equals(id)) {
                producto = p;
            }
        }

        if (producto != null) {
            if (producto.existencia > 0) {
                System.out.println("El producto " + producto.descrip + " tiene en existencia " + producto.existencia + " unidades");
            } else {
                System.out.println("El producto " + producto.descrip + " no tiene existencia");
            }
        } else {
            System.out.println("No se encontro el ID");
        }
    }

    // Sebastian A.
    @Override
    public String toString() {
        return "Bienvenido " + this.getClass().getSimpleName() + ": " + nombre;
    }
}
