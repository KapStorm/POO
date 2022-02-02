package Unidad3.E3;

public class AppCostco {
    public static void main(String[] args) {
        System.out.println("Datos membresia normal");
        MembresiaNormal mn = new MembresiaNormal(
                "1", "Seastian", "Estudiante", "FASD", "seb02tian20@gmail.com");
        System.out.println("$" + mn.totalAPagar(10000));
        System.out.println("Costo de la membresia: $" + mn.comprarMembresia());
        System.out.println(mn);
        System.out.println();

        MembresiaNegocios mb = new MembresiaNegocios(
                "2", "Aldo", "OXXO", "OXXO", "oxxo@oxxo.com");
        System.out.println("$" + mb.totalAPagar(10000));
        System.out.println("Costo de la membresia: $" + mb.comprarMembresia());
        System.out.println(mb);
        System.out.println();

        MembresiaGold mg = new MembresiaGold(
                "3", "Sofia", "Extra", "extra", "123@xyz.mx");
        System.out.println("$" + mg.totalAPagar(10000));
        System.out.println("Costo de la membresia: $" + mg.comprarMembresia());
        System.out.println(mg);
    }
}
