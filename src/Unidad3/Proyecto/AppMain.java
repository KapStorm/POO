package Unidad3.Proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMain {
    /*
        EQUIPO 1.
        Arellanes Beltran Sebastian
        Barraza Leon Miguel Angel
        Laija Guzman Juan Jose

        NOTA:
            JOSUE RAMÓN NO PARTICIPÓ EN EL PROYECTO
     */

    // Sebastian A.
    Scanner input;
    Usuario usuarioActual;
    ArrayList<Producto> productos;
    ArrayList<Usuario> usuarios;
    ArrayList<String> ventas;

    // Sebastian A.
    public AppMain() {
        input = new Scanner(System.in);
        crearUsuarios();
        crearArregloProductos();
        usuarioActual = login();
        ventas = new ArrayList<>();
    }

    // Sebastian A.
    public void crearUsuarios() {
        usuarios = new ArrayList<>();
        usuarios.add(new Vendedor("1", "Sebastian", "123123"));
        usuarios.add(new Gerente("2", "Diana", "00000"));
        usuarios.add(new Administrador("3", "Max", "hola"));
    }

    // Sebastian A.
    public void crearArregloProductos() {
        productos = new ArrayList<>();
        productos.add(new Producto("1", "Tostitos", 15.0, 10));
        productos.add(new Producto("2", "Coca 600ml", 16.5, 2));
        productos.add(new Producto("3", "Paketaxo", 22.3, 0));
        productos.add(new Producto("4", "Cigarros", 56, 1));
        productos.add(new Producto("5", "Monster", 20, 4));
    }

    // Sebastian A.
    public Usuario login() {
        String id, password;
        Usuario usuario = null;
        boolean bandera = true;
        System.out.println("=== BIENVENIDO A OXXO ===");
        while(bandera) {
            System.out.println("Ingrese el ID");
            id = input.next();
            System.out.println("Ingrese el password");
            password = input.next();
            for (Usuario u : usuarios) {
                if (u.id.equals(id)) {
                    if (u.password.equals(password)) {
                        usuario = u;
                        bandera = false;
                        break;
                    }
                }
            }
            if (usuario == null) {
                System.out.println("ID o password incorrecto");
            }
        }
        System.out.println();
        return usuario;
    }

    // Sebastian A.
    public static void main(String[] args) {
        AppMain app = new AppMain();
        int opcion = 0;
        boolean salirUsuario = false, salirApp = false;

        while (!salirApp) {
            salirUsuario = false;

            while (!salirUsuario) {
                salirUsuario = app.usuarioActual.menu(app.usuarios, app.productos, app.ventas);
                app.usuarios = app.usuarioActual.usuarios;
                app.productos = app.usuarioActual.productos;
                app.ventas = app.usuarioActual.ventas;
            }

            boolean bandera = true;
            while (bandera) {
                System.out.println();
                System.out.println("1. Iniciar sesion");
                System.out.println("0. Salir del programa");
                System.out.print(">>> ");
                opcion = app.input.nextInt();

                switch (opcion) {
                    case 1:
                        app.usuarioActual = app.login();
                        bandera = false;
                        break;
                    case 0:
                        salirApp = true;
                        System.out.println("Salir del programa");
                        bandera = false;
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                }
            }
            System.out.println();
        }
    }
}
