package Unidad3.Proyecto;

import java.util.ArrayList;

public class Gerente extends Usuario {
    // Miguel Barraza
    public Gerente(String id, String nombre, String password) {
        super(id, nombre, password);
    }

    // Sebastian A.
    @Override
    public boolean menu(ArrayList<Usuario> usuarios, ArrayList<Producto> productos, ArrayList<String> ventas) {
        this.usuarios = usuarios;
        this.productos = productos;
        this.ventas = ventas;
        int opcion = 0;
        Producto producto;
        System.out.println();
        System.out.println(this);
        System.out.println("1. Vender");
        System.out.println("2. Consultar existencia");
        System.out.println("3. Consultar ventas");
        System.out.println("4. Reporte ventas");
        System.out.println("5. Registrar productos");
        System.out.println("0. Cerrar sesion");
        System.out.print(">>> ");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                vender();
                break;
            case 2:
                consultarExistencia();
                break;
            case 3:
                consultarVentas();
                break;
            case 4:
                reporteDeVentas();
                break;
            case 5:
                registrarProductos();
                break;
            case 0:
                System.out.println("Cerrando sesion");
                return true;
        }
        return false;
    }

    // Sebastian A.
    public void registrarProductos() {
        String id, desc;
        double precio;
        int cantidad;
        boolean yaExiste = false;
        System.out.println("Ingrese el ID del producto");
        id = input.next();

        for (Producto p : productos) {
            if (p.id.equals(id)) {
                System.out.println("El ID ya existe");
                yaExiste = true;
            }
        }

        if (!yaExiste) {
            System.out.println("Ingrese la descripcion");
            desc = input.next();
            System.out.println("Ingrese el precio");
            precio = input.nextDouble();
            System.out.println("Ingrese la cantidad");
            cantidad = input.nextInt();
            productos.add(new Producto(id, desc, precio, cantidad));
        }
    }

    // Migue Barraza
    public void reporteDeVentas() {
        for (String s : ventas) {
            System.out.println(s);
        }
    }

    // Juan Jose
    public void consultarVentas() {
        String id;
        boolean tieneVentas = false;
        System.out.println("Ingrese el ID del vendedor");
        id = input.next();

        for (String s : ventas) {
            if (s.contains(id)) {
                tieneVentas = true;
                System.out.println(s);
            }
        }
        
        if (!tieneVentas) {
            System.out.println("No se encontraron ventas");
        }
    }
}
