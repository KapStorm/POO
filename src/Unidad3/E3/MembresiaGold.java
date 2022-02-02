package Unidad3.E3;

public class MembresiaGold extends Membresia {
    public MembresiaGold(String idCliente, String nombre, String razonSocial, String cRrf, String email) {
        super(idCliente, nombre, razonSocial, cRrf, email);
        setPrecio(1100);
    }

    @Override
    public double totalAPagar(double total) {
        total *= 0.75;
        double rembolso = total * 0.10;
        total -= rembolso;
        return total + comprarMembresia();
    }

    @Override
    public String toString() {
        return getNombre() + " va a pagar un total de: $" + totalAPagar(19990);
    }
}
