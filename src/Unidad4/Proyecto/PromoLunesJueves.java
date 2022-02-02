/*---------------------------------------
Propósito:   Proyecto 1 U4

Autor: Arellanes Beltrán Sebastián
Fecha: 05/11/2021
----------------------------------------*/
package Unidad4.Proyecto;

import java.util.ArrayList;

public class PromoLunesJueves extends PromocioSemanal {
    @Override
    public ArrayList<Producto> aplicarPromocion(ArrayList<Producto> lista) {
        double descuento = 0.15;
        for (Producto p : lista) {
            if (p.tipo.equalsIgnoreCase("Lacteo") || p.tipo.equalsIgnoreCase("Carniceria")) {
                p.descuento = (p.precio * p.cant * descuento);
                p.total = (p.precio * p.cant) - p.descuento;
            } else {
                p.total = (p.precio * p.cant);
            }
        }
        return lista;
    }

    @Override
    public String descripcionPromocion() {
        return "Los lunes y jueves: Carniceria y lacteos tienen el 15% de descuento (todos los clientes)";
    }
}
