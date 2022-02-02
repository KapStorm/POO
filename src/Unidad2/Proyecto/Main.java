package Unidad2.Proyecto;

import java.util.Scanner;

public class Main {
    // Sebastian A.
    final private static Scanner input = new Scanner(System.in);
    final private static DirectorioT directorioT = new DirectorioT();

    // Sebastian A.
    public static void main(String[] args) {
        while(!menu());
    }

    // Sebastian A.
    private static boolean menu() {
        int opcion = 0;
        System.out.println();
        System.out.println("====== Directorio Telefonico =======");
        System.out.println("1. Imprimir todo el directorio telefonico");
        System.out.println("2. Imprimir por tipo de telefono");
        System.out.println("3. Agregar contacto");
        System.out.println("4. Buscar contacto");
        System.out.println("5. Eliminar contacto");
        System.out.println("6. Consultar contacto");
        System.out.println("7. Salir del programa");
        System.out.print("Opcion: ");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                directorioT.imprimirContactos();
                break;
            case 2:
                directorioT.imprimirContactoPorTipo();
                break;
            case 3:
                directorioT.agregarContacto();
                break;
            case 4:
                directorioT.buscarContacto();
                break;
            case 5:
                directorioT.eliminarContacto();
                break;
            case 6:
                directorioT.consultarContacto();
                break;
            case 7:
                System.out.println("Saliendo del programa...");
                return true;
            default:
                System.out.println("Opcion incorrecta");
        }

        return false;
    }
}
