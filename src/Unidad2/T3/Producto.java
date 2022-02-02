package Unidad2.T3;

public class Producto {
    private String idProducto;
    private String descripcion;
    private float precio;
    private boolean esAlimento;

    public Producto(String idProducto, String descripcion, float precio, boolean esAlimento) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.esAlimento = esAlimento;
    }

    @Override
    public String toString() {
        return "ID: " + idProducto + "\tDescripcion: " + descripcion + "\tPrecio: $" + precio + "\tEs alimento: " + esAlimento;
    }

    /*
    Getters
     */
    public String getIdProducto() {
        return idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public boolean getEsAlimento() {
        return esAlimento;
    }

    /*
    Setters
     */
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setEsAlimento(boolean esAlimento) {
        this.esAlimento = esAlimento;
    }
}
