/*---------------------------------------
Propósito:   Proyecto 1 U4

Autor: Arellanes Beltrán Sebastián
Fecha: 05/11/2021
----------------------------------------*/
package Unidad4.Proyecto;

import java.util.ArrayList;

public interface Promocion {
    public ArrayList<Producto> aplicarPromocion(ArrayList<Producto> lista);

    public String descripcionPromocion();
}
