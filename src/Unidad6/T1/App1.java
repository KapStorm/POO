/*---------------------------------------
Propósito:   Tarea 1

Autor: Arellanes Beltrán Sebastián
Fecha: 30/11/2021
----------------------------------------*/
package Unidad6.T1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class App1 {

    public static void main(String[] args) {
        String archivo = "archivo1.txt";
        escribirArchivo(archivo);
    }

    public static void escribirArchivo(String archivo) {
        Random rnd = new Random();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    bw.write(String.valueOf(rnd.nextInt(100)));
                    if (j != 4) {
                        bw.write(',');
                    }
                    bw.write(' ');
                }
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
