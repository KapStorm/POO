/*---------------------------------------
Propósito:   Proyecto 1 U4

Autor: Arellanes Beltrán Sebastián
Fecha: 05/11/2021
----------------------------------------*/
package Unidad4.Proyecto;

import java.util.ArrayList;

public class PromoMiercoles extends PromocioSemanal {
    @Override
    public ArrayList<Producto> aplicarPromocion(ArrayList<Producto> lista) {
        double descuento = 0.2;
        for (Producto p : lista) {
            if (p.tipo.equalsIgnoreCase("Frutas") || p.tipo.equalsIgnoreCase("Verduras")) {
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
        return "Miercoles: Frutas y verduras tienen el 20% de descuento (todos los clientes)";
    }
}
