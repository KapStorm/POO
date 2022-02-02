/*---------------------------------------
Propósito:   Tarea 4

Autor: Arellanes Beltrán Sebastián
Fecha: 25/11/2021
----------------------------------------*/
package Unidad5.T4;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        try {
            System.out.print("Ingrese un numero: ");
            n = input.nextInt();
            if (n < 0) {
                throw new EsNegativo("El numero es negativo");
            }
        } catch (EsNegativo e) {
            System.out.println("Error: " + e.getMessage());
            n = 0;
        } finally {
            System.out.println("El numero introducido es " + n);
        }
    }      

}

// Estoy probando con dos clases dentro de una archivo para ahorrar espacio en el disco duro
class EsNegativo extends Throwable {

    public EsNegativo(String message) {
        super(message);
    }
    
}
