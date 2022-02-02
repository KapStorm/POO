/*---------------------------------------
Propósito:   Proyecto 2 U4

Autor: Arellanes Beltrán Sebastián
Fecha: 09/11/2021
----------------------------------------*/
package Unidad4.T5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
    static ArrayList<Cuenta> lista = new ArrayList<>();

    public static void main(String[] args) {
        lista = crearCuentas();
        while (menu());
    }

    private static boolean menu() {
        Operacion op = null;
        Random rnd = new Random();
        Cuenta cuenta = lista.get(rnd.nextInt(lista.size()));
        int opcion;
        double importe;
        Scanner input = new Scanner(System.in);

        System.out.println("\n=== MENU ===");
        System.out.println("1. Retirar efectivo");
        System.out.println("2. Depositar efectivo");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Cambiar NIP");
        System.out.println("0. Salir");
        System.out.println(cuenta);
        System.out.print(">>> ");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                op = new Retiro();
                System.out.print("Ingrese el saldo a retirar: $");
                importe = input.nextDouble();
                op.realizarOperacion(cuenta, importe);
                op = new ConsultarSaldo();
                System.out.printf("Saldo actual $%.2f\n", op.realizarOperacion(cuenta, 0));
                break;
            case 2:
                op = new Deposito();
                System.out.print("Ingrese el saldo a depositar: $");
                importe = input.nextDouble();
                op.realizarOperacion(cuenta, importe);
                op = new ConsultarSaldo();
                System.out.printf("Saldo actual $%.2f\n", op.realizarOperacion(cuenta, 0));
                break;
            case 3:
                op = new ConsultarSaldo();
                System.out.printf("Saldo actual $%.2f\n", op.realizarOperacion(cuenta, 0));
                break;
            case 4:
                op = new CambiarNIP();
                op.realizarOperacion(cuenta, 0);
                break;
            case 0:
                return false;
        }
        return true;
    }

    static public ArrayList<Cuenta> crearCuentas() {
        ArrayList<Cuenta> l = new ArrayList<>();
        l.add(new Cuenta("12345", "Sebastian", "Nomina", "1234", "1121", 9999.99));
        l.add(new Cuenta("98234", "Aldo", "Ahorro", "8942", "1223", 100.00));
        l.add(new Cuenta("51243", "Emanuel", "Debito", "0329", "0124", 123312.54));
        l.add(new Cuenta("87343", "Max", "Credito", "8904", "1225", 7777.77));
        l.add(new Cuenta("80944", "Diana", "Ahorro", "9034", "1221", 843.32));
        l.add(new Cuenta("90324", "Lucia", "Debito", "0394", "0321", 98432.43));
        l.add(new Cuenta("23413", "Karla", "Nomina", "2942", "0923", 302.32));
        l.add(new Cuenta("43242", "Bryan", "Ahorro", "9034", "0921", 23.2));
        l.add(new Cuenta("23453", "Ricardo", "Debito", "2498", "0122", 434.0));
        l.add(new Cuenta("43423", "Santiago", "Credito", "3342", "0423", 4444.32));
        return l;
    }
}
