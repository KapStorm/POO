package Unidad3.E3;

public class MembresiaNegocios extends Membresia {
    public MembresiaNegocios(String idCliente, String nombre, String razonSocial, String cRrf, String email) {
        super(idCliente, nombre, razonSocial, cRrf, email);
        setPrecio(800);
    }

    /////////////////////////////////////////////////////////////////////////////

    @Override
    public double totalAPagar(double total) {
        return total * 0.80 + super.comprarMembresia();
    }

    @Override
    public String toString() {
        return "El cliente: " + getNombre() + " adquirio la membresia negocios para la empresa " + getRazonSocial();
    }

    public String agradecimientos() {
        return "Gracias por su compra";
    }
}
