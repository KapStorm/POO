/*---------------------------------------
Propósito:   Tarea 2

Autor: Arellanes Beltrán Sebastián
Fecha: 24/11/2021
----------------------------------------*/
package Unidad5.T2;

public class App {
    public static void main(String[] args) {
        // DEFINIDA
        String s = "";
        try {
            s = "sebastian";
            if (!Character.isUpperCase(s.charAt(0))) {  // error
                throw new PrimeraLetraNoMayuscula();
            }
        } catch (PrimeraLetraNoMayuscula e) {   // excepcion definida
            System.out.println("Error: " + e.getMessage());
            char[] c = s.toCharArray();
            c[0] = Character.toUpperCase(c[0]);
            s = String.valueOf(c);
        } finally {
            System.out.println(s);
        }

        // PREDEFINIDA
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        try {
            System.out.println(vocales[5]); // error, el indice maximo es 4
        } catch (IndexOutOfBoundsException e) { // excepcion predefinida
            System.out.println("Error: " + e.getMessage());
            System.out.println(vocales[4]);
        }
    }
}