/*---------------------------------------
Propósito:   Proyecto 1 U4

Autor: Arellanes Beltrán Sebastián
Fecha: 05/11/2021
----------------------------------------*/
package Unidad4.Proyecto;

import java.util.ArrayList;

public abstract class Cliente {
    protected String nombre;
    protected int edad;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract ArrayList<Producto> aplicarDescuentos(ArrayList<Producto> lista, int diaSemana);

    public void mostrarLista(ArrayList<Producto> lista) {
        double total = 0;
        double ahorro = 0;
        for (Producto p : lista) {
            System.out.println(p);
            total += p.cant * p.precio;
        }
        for (Producto p : lista) {
            ahorro += p.cant * p.precio;
        }
        System.out.println();
        System.out.println("Se ahorro $" + (total - ahorro));
    }

    @Override
    public String toString() {
        return "Bienvenido " + nombre + ". Edad del cliente: " + edad;
    }
}
