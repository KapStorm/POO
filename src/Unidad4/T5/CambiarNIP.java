/*---------------------------------------
Propósito:   Proyecto 2 U4

Autor: Arellanes Beltrán Sebastián
Fecha: 09/11/2021
----------------------------------------*/
package Unidad4.T5;

import java.util.Scanner;

public class CambiarNIP implements Operacion {
    @Override
    public double realizarOperacion(Cuenta c, double imp) {
        Scanner input = new Scanner(System.in);
        String NIP;
        System.out.print("Ingrese el NIP anterior: ");
        NIP = input.next();
        if (NIP.equals(c.NIP)) {
            System.out.print("Ingrese el nuevo NIP: ");
            NIP = input.next();
            if (NIP.length() == 4 && validarString(NIP)) {
                System.out.println("NIP modificado con exito");
                c.NIP = NIP;
                return 1;
            } else {
                System.out.println("El NIP solo debe de contener numeros");
            }
        } else {
            System.out.println("NIP incorrecto");
        }
        return 0;
    }

    private boolean validarString(String NIP) {
        for (char c : NIP.toCharArray()) {
            if ((c - '0') < 0 || (c - '0') > 9) {
                return false;
            }
        }
        return true;
    }
}
