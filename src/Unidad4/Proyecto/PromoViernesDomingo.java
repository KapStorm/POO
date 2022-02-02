/*---------------------------------------
Propósito:   Proyecto 1 U4

Autor: Arellanes Beltrán Sebastián
Fecha: 05/11/2021
----------------------------------------*/
package Unidad4.Proyecto;

import java.util.ArrayList;

public class PromoViernesDomingo extends PromocioSemanal {
    @Override
    public ArrayList<Producto> aplicarPromocion(ArrayList<Producto> lista) {
        double descuento = 0.1;
        for (Producto p : lista) {
            p.descuento = (p.precio * p.cant * descuento);
            p.total = (p.precio * p.cant) - p.descuento;
        }
        return lista;
    }

    @Override
    public String descripcionPromocion() {
        return "Viernes y domingo: Toda la tienda tiene el 10% de descuento (todos los clientes)";
    }
}
