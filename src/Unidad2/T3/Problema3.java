/*---------------------------------------
Propósito:   3. Elabora un método donde compres 10 productos de un supermercado (alimentos y abarrotes). Considera que
            los alimentos tienen el 0% de IVA, mientras que el resto de los productos tienen el 16% de IVA. Calcula el
            total a pagar tomando en cuenta que seleccionas n cantidad de un mismo producto.

Autor: Arellanes Beltrán Sebastián
Fecha: 12/09/2021
----------------------------------------*/
package Unidad2.T3;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema3 {
    static Scanner input = new Scanner(System.in);

    public double comprarDiezProductos() {
        ArrayList<Producto> productosArrayList = new ArrayList<>();
        productosArrayList.add(new Producto("1", "Leche 2 lts.", 30.0f, true));
        productosArrayList.add(new Producto("2", "Smartphone", 3999.0f, false));
        productosArrayList.add(new Producto("3", "Tacos al pastor", 25.5f, true));
        productosArrayList.add(new Producto("4", "Hamburguesa", 82.32f, true));
        productosArrayList.add(new Producto("5", "Coca-Cola 600ml", 15.0f, true));
        productosArrayList.add(new Producto("6", "Bolsa de plastico grande", 16.5f, false));
        productosArrayList.add(new Producto("7", "Boneless 10 pz", 115.0f, true));
        productosArrayList.add(new Producto("8", "Vaso de plastico", 3.5f, false));
        productosArrayList.add(new Producto("9", "Juego puzzle", 499.99f, false));
        productosArrayList.add(new Producto("10", "Mesa de madera", 899.99f, false));

        double costoProd = 0, totalAPagar = 0;
        int cantidad = 0;
        for (Producto p : productosArrayList) {
            System.out.println(p);
            System.out.print("Cantidad a comprar: ");
            cantidad = input.nextInt();
            cantidad = cantidad >= 0 ? cantidad : 1; // No negatividad

            if (!p.getEsAlimento())
                costoProd = (p.getPrecio() * cantidad) * 1.16;
            else
                costoProd = p.getPrecio() * cantidad;

            totalAPagar += costoProd;
            System.out.printf("Agregado $%.2f\n", costoProd);
        }

        return totalAPagar;
    }
}
