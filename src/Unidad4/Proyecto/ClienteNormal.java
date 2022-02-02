/*---------------------------------------
Propósito:   Proyecto 1 U4

Autor: Arellanes Beltrán Sebastián
Fecha: 05/11/2021
----------------------------------------*/
package Unidad4.Proyecto;

import java.util.ArrayList;

public class ClienteNormal extends Cliente {
    public ClienteNormal(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public ArrayList<Producto> aplicarDescuentos(ArrayList<Producto> lista, int diaSemana) {
        Promocion promo = null; // Default
        switch (diaSemana) {
            case 1: case 4: // Lunes y Jueves
                promo = new PromoLunesJueves();
                break;
            case 2: case 6: // Martes y Sabado
                System.out.println("Este dia no hay descuentos");
                break;
            case 3:         // Miercoles
                promo = new PromoMiercoles();
                break;
            case 5: case 7: // Viernes y Domingo
                promo = new PromoViernesDomingo();
                break;
        }
        if (promo != null) {
            System.out.println(promo.descripcionPromocion());
            System.out.println();
            lista = promo.aplicarPromocion(lista);
        }
        return lista;
    }
}
