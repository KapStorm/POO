package Unidad1;
/*---------------------------------------
Autor: Arellanes Beltrán Sebastián
Fecha: 25/08/2021
----------------------------------------*/

public class Diagnostico {
    public static void main(String[] args) {
        Tablas();
    }

    public static void Tablas() {
        for (int i = 1; i <= 10; i ++) {
            for (int j = 1; j <= 10; j++) {
                int producto = i * j;

                if (i <= 6 && producto > 35)
                    System.out.printf("%d x %d = %d Numero mayor a 35\n", i, j, producto);
                else
                    System.out.printf("%d x %d = %d\n", i, j, producto);
            }
        }
    }
}
