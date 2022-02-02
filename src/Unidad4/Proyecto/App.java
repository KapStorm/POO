/*---------------------------------------
Propósito:   Proyecto 1 U4

Autor: Arellanes Beltrán Sebastián
Fecha: 05/11/2021
----------------------------------------*/
package Unidad4.Proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Producto> productos = crearProductos();
        String nombre;
        int edad, diaSemana;
        Cliente cliente;

        System.out.println("Ingrese el nombre del cliente");
        nombre = input.next();
        System.out.println("Ingrese la edad del cliente");
        edad = input.nextInt();
        System.out.println("Ingrese el dia de la semana");
        diaSemana = input.nextInt();

        cliente = (edad >= 60) ? new ClienteMayor(nombre, edad) : new ClienteNormal(nombre, edad);
        System.out.println();
        System.out.println(cliente);
        productos = cliente.aplicarDescuentos(productos, diaSemana);
        cliente.mostrarLista(productos);
    }

    public static ArrayList<Producto> crearProductos() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos = new ArrayList<>();
        productos.add(
                new Producto("lac-01", "Leche", "Lacteo", "Litro", 2, 23.0));
        productos.add(
                new Producto("car-01", "Carne de cerdo", "Carniceria", "Kilo", 1, 99.0));
        productos.add(
                new Producto("lac-02", "Crema", "Lacteo", "Kilo", 1, 19.9));
        productos.add(
                new Producto("lac-03", "Mantequilla", "Lacteo", "Pieza", 2, 14.5));
        productos.add(
                new Producto("car-02", "Jamon Fud", "Carniceria", "Kilo", 0.25, 160.0));
        productos.add(
                new Producto("lac-04", "Queso Lala", "Lacteo", "Kilo", 0.5, 145.0));
        productos.add(
                new Producto("fv-01", "Platano", "Frutas", "Kilo", 1.5, 21.0));
        productos.add(
                new Producto("fv-02", "Manzana", "Frutas", "Kilo", 0.75, 39.0));
        productos.add(
                new Producto("ag-01", "Sopa Knorr", "General", "Pieza", 2, 15.5));
        productos.add(
                new Producto("ag-02", "Pure del Fuerte", "General", "Pieza", 2, 6.5));
        return productos;
    }
}
