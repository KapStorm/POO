package Unidad3.E3;

public class Membresia {
    private String idCliente, nombre, razonSocial, cRrf, email;
    private double precio;

    public Membresia(String idCliente, String nombre, String razonSocial, String cRrf, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cRrf = cRrf;
        this.email = email;
    }

    /////////////////////////////////////////////////////////////////////////////

    // Calculo del costo de la membresia
    public double comprarMembresia() {
        return precio;
    }

    // Total a pagar considerando el costo de la membresia
    public double totalAPagar(double total) {
        return total + comprarMembresia();
    }

    /////////////////////////////////////////////////////////////////////////////

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getcRrf() {
        return cRrf;
    }

    public void setcRrf(String cRrf) {
        this.cRrf = cRrf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
