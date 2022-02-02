/*---------------------------------------
Propósito:   Proyecto 1 U4

Autor: Arellanes Beltrán Sebastián
Fecha: 05/11/2021
----------------------------------------*/
package Unidad4.Proyecto;

import java.util.ArrayList;

public class PromoAdultoMayor implements Promocion {

    @Override
    public ArrayList<Producto> aplicarPromocion(ArrayList<Producto> lista) {
        double descuento = 0.25;
        for (Producto p : lista) {
            p.descuento = (p.precio * p.cant * descuento);
            p.total = (p.precio * p.cant) - p.descuento;
        }
        return lista;
    }

    @Override
    public String descripcionPromocion() {
        return "Martes y sabado: El adulto mayor tiene el 25% de descuento en toda la tienda";
    }
}
