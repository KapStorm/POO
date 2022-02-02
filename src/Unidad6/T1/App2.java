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

public class App2 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        String archivo = "archivo2.txt", resultado = "resultado1.txt";
        lista = leerArchivo(archivo);
        escribirResultados(resultado, lista);
    }

    public static ArrayList leerArchivo(String archivo) {
        ArrayList<String> aux = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String auxStr = "";
            while ((auxStr = br.readLine()) != null) {
                if (auxStr.length() > 8) {
                    aux.add(auxStr);
                }
            }
            br.close();
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        return aux;
    }

    public static void escribirResultados(String archivo, ArrayList<String> lista) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true));
            for (String s : lista) {
                bw.write(s);
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
