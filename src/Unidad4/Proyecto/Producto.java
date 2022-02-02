package Unidad4.Proyecto;

public class Producto {
    protected String idProducto, descripcion, tipo, UM;
    protected double cant, precio, descuento, total;

    public Producto(String idProducto, String descripcion, String tipo, String UM, double cant, double precio) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.UM = UM;
        this.cant = cant;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return cant + " " + UM + " de " + descripcion + " costaron " + (precio * cant) + " aplicandole un descuento de " + descuento;
    }
}
