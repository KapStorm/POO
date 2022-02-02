package Unidad1;/*---------------------------------------
Propósito:   Instrucciones: Desarrolla los ejercicios en el lenguaje de programación JAVA. El objetivo es
        reforzar el uso de estructuras selectivas (if, switch) y estructuras repetitivas (for, while).

Autor: Arellanes Beltrán Sebastián
Fecha: 29/08/2021
----------------------------------------*/

import java.util.Scanner;

public class ProgramasDeRepaso1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int ejercicio;
        do {
            System.out.print("\nIngrese el ejercicio (1 al 8, 0 para terminar el programa): ");
            ejercicio = input.nextInt();
            switch (ejercicio) {
                case 1: ejercicio1(); break;
                case 2: ejercicio2(); break;
                case 3: ejercicio3(); break;
                case 4: ejercicio4(); break;
                case 5: ejercicio5(); break;
                case 6: ejercicio6(); break;
                case 7: ejercicio7(); break;
                case 8: ejercicio8(); break;
                case 0: System.out.println("Cerrando el programa"); break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (ejercicio != 0);
    }

    public static void ejercicio1() {
        /*
        1.	Elabora un programa en Java donde introduzcas un número del 1 al 12 y despliegues como resultado el mes del
        año al que equivale ese número. Si el mes termina con las letras “bre”, Mostrar la leyenda “Mi mes favorito es” +
        seguido del mes del año. En caso contrario solo desplegar el nombre del mes.
         */
        System.out.print("Introduzca un mes (1 al 12): ");
        int opcion = input.nextInt();
        final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre"};

        switch (opcion) {
            // Casos sin el "bre"
            case 1, 2, 3, 4, 5, 6, 7, 8:
                System.out.println(MESES[opcion - 1]);
                break;
            // Casos con el "bre"
            case 9, 10, 11, 12:
                System.out.println("Mi mes favorito es " + MESES[opcion - 1]);
                break;
            default:
                System.out.println("La opción no entra en el rango");
        }
    }

    public static void ejercicio2() {
        /*
        2.	Elabora un programa en Java donde definas un ciclo infinito con una variable String y este se
        rompa cuando escribas la letra “q” o “Q”. Al romper el ciclo deberás imprimir cuantas veces se
        ejecutó el ciclo.
         */
        System.out.println("Introduzca cadenas, el programa termina cuando introduzca 'q' o 'Q'");
        String s;
        int contador = 0;
        do {
            s = input.next();
            contador++;
        } while (!s.contains("Q") && !s.contains("q"));
        System.out.println("Veces que se ejecutó el ciclo: " + contador);
    }

    public static void ejercicio3() {
        /*
        3.	Elabora un programa en java donde definas una variable de tipo String que su valor deberá ser leído
        5 veces desde el teclado. Si el valor leído contiene diez o más caracteres deberás imprimir @@@@@@@@@@”,
        si contiene de 6 a nueve caracteres, deberás mostrar la leyenda “Valor de 6-9 caracteres”. En caso contrario
        despliega el valor que tenga la variable.
         */
        System.out.println("Introduzcan 5 cadenas");
        for (int i = 0; i < 5; i++) {
           String s = input.next();
           if (s.length() >= 10)
               System.out.println("@@@@@@@@@@");
           else if (s.length() >= 6)
               System.out.println("Valor de 6 - 9 caracteres");
           else
               System.out.println(s);
        }
    }

    public static void ejercicio4() {
        /*
        4.	Elabora un programa que calcula el cuadrado, el cubo, y el cuádruple de cinco números introducidos
        por el usuario
         */
        System.out.println("Introduzca 5 numeros");
        for (int i = 0; i < 5; i++) {
            double numero = input.nextDouble();
            double cuadrado = Math.pow(numero, 2), cubo = Math.pow(numero, 3), cuadruple = Math.pow(numero, 4);
            System.out.printf("Numero: %.2f; Cuadrado: %.2f; Cubo: %.2f; Cuadruple: %.2f\n", numero, cuadrado, cubo, cuadruple);
        }
    }

    public static void ejercicio5() {
        /*
        5.	Elabora un programa en Java donde leas desde el teclado el consumo de gasolina (incluye IVA) que realizan
        diez automovilistas. Desglosar cuanto generó de IVA cada consumidor. Al final del ciclo imprimir cuanto se
        vendió de gasolina y cuanto IVA se cobró.
         */
        System.out.println("Introduzca consumo de gasolina de 10 automovilistas");
        double gasolinaVendida = 0, ivaCobrado = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Automovilista %d: ", (i + 1));
            double gasolinaConIva = input.nextDouble();
            double gasolinaSinIva = gasolinaConIva / 1.16;
            double iva = gasolinaConIva - gasolinaSinIva;
            gasolinaVendida += gasolinaConIva;
            ivaCobrado += iva;
            System.out.printf("IVA generado: $%.2f\n", iva);
        }
        System.out.printf("Gasolina vendida: $%.2f.; IVA cobrado: $%.2f\n", gasolinaVendida, ivaCobrado);
    }

    public static void ejercicio6() {
        /*
        6.	Elabora un programa que leas un conjunto de estudiantes en la materia de programación. Lee desde
        teclado el sexo del estudiante (puede ser boolean, int o String). Imprimir cuantos son hombres y cuantas
        son mujeres.
         */
        System.out.print("Cantidad de estudiantes a leer: ");
        int estudiantes = input.nextInt();
        int hombres = 0, mujeres = 0;
        System.out.println("Introduzca 'H' para hombre y 'M' para mujer");
        for (int i = 0; i < estudiantes; i++) {
            char sexo = input.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
            if (sexo == 'H')
                hombres++;
            if (sexo == 'M')
                mujeres++;
        }
        System.out.printf("Hombres del curso:%d ; Mujeres del curso: %d\n", hombres, mujeres);
    }

    public static void ejercicio7() {
        /*
        7.	Elabora un programa en Java donde introduzcas un número del 1 al 255 y despliegues como resultado el valor
        equivalente en código ASCII.
         */
        System.out.print("Introduzca un numero del 1 al 255: ");
        char c = (char) input.nextInt();
        System.out.println(c);
    }

    public static void ejercicio8() {
        /*
        8.	Un empleado gana una comisión dependiendo de la venta generada en un mes. Dicha comisión es del 5% si vende
        menos de 6,999.99 pesos; 10% si vende más de 7,000.00 pero menos de 10,000.00; y 10% si venden más de 10,000.01.
        Considera que la empresa tiene siete empleados. Imprimir el total de comisiones que la empresa “MiNegocio.com”
        tiene que pagar.
         */
        double comision = 0;
        System.out.println("Introduzca las ventas de 7 vendedores");
        for (int i = 0; i < 7; i++) {
            System.out.printf("Ventas del mes del vendedor #%d: ", (i + 1));
            double ventasDelMes = input.nextFloat();
            if (ventasDelMes > 10000.00)
                comision += ventasDelMes * 0.12;
            else if (ventasDelMes > 7000.00)
                comision += ventasDelMes * 0.10;
            else
                comision += ventasDelMes * 0.05;
        }
        System.out.printf("Comisiones a pagar: $%.2f\n", comision);
    }
}
