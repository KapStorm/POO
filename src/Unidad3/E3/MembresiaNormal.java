package Unidad3.E3;

public class MembresiaNormal extends Membresia {
    public MembresiaNormal(String idCliente, String nombre, String razonSocial, String cRrf, String email) {
        super(idCliente, nombre, razonSocial, cRrf, email);
        setPrecio(500);
    }

    /////////////////////////////////////////////////////////////////////////////

    @Override
    public double comprarMembresia() {
        return super.comprarMembresia() * 0.95;
    }

    @Override
    public double totalAPagar(double total) {
        return total * 0.90 + comprarMembresia();
    }

    @Override
    public String toString() {
        return "Cliente: " + getIdCliente() + " - " + getNombre();
    }
}
