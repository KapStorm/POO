/*---------------------------------------
Propósito:   Tarea 1

Autor: Arellanes Beltrán Sebastián
Fecha: 30/11/2021
----------------------------------------*/
package Unidad6.T1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class App3 {

    public static void main(String[] args) {
        String archivo = "archivo3.txt", resultado = "resultado2.txt";
        ArrayList<Integer> lista = new ArrayList<>();
        lista = leerArchivo(archivo);
        escribirArchivo(resultado, lista);
    }

    public static ArrayList leerArchivo(String archivo) {
        ArrayList<Integer> aux = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String auxStr = "";
            while ((auxStr = br.readLine()) != null) {
                aux.add(auxStr.length());
            }
            br.close();
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return aux;
    }

    public static void escribirArchivo(String archivo, ArrayList<Integer> lista) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Primera coleccion\n");
            for (int i : lista) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
            bw.write("\nSegunda coleccion\n");
            for (int i : lista) {
                int auxDouble = (int) Math.pow(i, 2) * 3;
                bw.write(String.valueOf(auxDouble));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
