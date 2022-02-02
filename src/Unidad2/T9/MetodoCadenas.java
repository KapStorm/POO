/*---------------------------------------
Propósito:   Proyecto 2 de la unidad 2

Autor: Arellanes Beltrán Sebastián
Fecha: 29/09/2021
----------------------------------------*/
package Unidad2.T9;

public class MetodoCadenas {
    private String str;

    /*==================
        Constructores
     ==================*/

    // Constructor parametrizado
    public MetodoCadenas(String str) {
        this.str = str;
    }

    // Constructor no parametrizado
    public MetodoCadenas() {
        this("Parangaricutiminicuaro");
    }

    /*==================
            Metodos
     ==================*/

    // Ejercicio #6
    // Escribe un método que reciba como parámetro un String y devuelva como resultado el número de veces que
    // contiene la letra a.
    public int contarLetrasA(String str) {
        str = str.toLowerCase();
        int contador = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                contador++;
            }
        }

        return contador;
    }

    public int contarLetrasA() {
        str = str.toLowerCase();
        int contador = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                contador++;
            }
        }

        return contador;
    }

    // Ejercicio #7
    // Escribe un método que reciba como parámetro dos variables String y devuelva como resultado un valor boolean,
    // verdadero si las cadenas son iguales y falso si son diferentes.
    public boolean cadenasIguales(String str1, String str2) {
        return str1.equals(str2);
    }

    // Ejercicio #8
    // Escribe un método que reciba como parámetro un String y obtenga como resultado el número de palabras
    // que contiene.
    public int cantidadDePalabras(String str) {
        return str.split(" ").length;
    }

    public int cantidadDePalabras() {
        return str.split(" ").length;
    }

    // Ejercicio #9
    // Escriba un metodo que lea una variable String, retorna si contiene una palabra exacta dentro del String
    public boolean contieneLaPalabra(String palabra) {
        str = "Vida antes que muerte. Fuerza antes que debilidad. Viaje antes que destino.";
        str = str.toLowerCase();
        palabra = palabra.toLowerCase();

        return str.contains(palabra);
    }


    /*==================
            Getters
     ==================*/

    public String getStr() {
        return str;
    }

    /*==================
            Setters
     ==================*/

    public void setStr(String str) {
        this.str = str;
    }
}
