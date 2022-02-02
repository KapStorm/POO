/*---------------------------------------
Propósito:   Proyecto 2 de la unidad 2

Autor: Arellanes Beltrán Sebastián
Fecha: 29/09/2021
----------------------------------------*/
package Unidad2.T9;

import java.util.Scanner;

public class Menu {
    Scanner input;
    MetodoMatematicos mMate;
    MetodoCadenas mCade;
    MetodoAlumnos mAlumnos;

    public Menu() {
        input = new Scanner(System.in);
        mMate = new MetodoMatematicos();
        mCade = new MetodoCadenas();
        mAlumnos = new MetodoAlumnos();
    }

    public Menu(int num, String str) {
        input = new Scanner(System.in);
        mMate = new MetodoMatematicos(num);
        mCade = new MetodoCadenas(str);
        mAlumnos = new MetodoAlumnos(crearAlumnos());
    }

    public static void main(String[] args) {
        Menu m = new Menu();
        while (!m.menu("Sebastian"));
    }

    private boolean menu() {
        int opcion = 0, num, size;
        int[] arrInt1, arrInt2, arrInt3;
        double numDecimal;
        double[] arrNumDecimal;
        String str1, str2;
        Alumno[] alumnos;

        System.out.println("====== Menu =======");
        System.out.println("1. Numero aleatorio del 1 al 100");
        System.out.println("2. Obtener de un entero su nombre en letras (0 al 10)");
        System.out.println("3. Multiplos de 4 con limite de un numero aleatorio");
        System.out.println("4. Convertir pesos a dolares, euros y libras");
        System.out.println("5. Sumar dos arreglos enteros");
        System.out.println("6. Cuantas letras 'a' contiene una cadena");
        System.out.println("7. Las cadenas son iguales");
        System.out.println("8. Cuantas palabras tiene una cadena");
        System.out.println("9. La cadena contiene una palabra");
        System.out.println("10. Cuantas mujeres hay en un grupo");
        System.out.println("11. Promedio del grupo");
        System.out.println("12. Cantidad de alumnos reprobados");
        System.out.println("0. Salir");
        System.out.print(">>> ");
        opcion = input.nextInt();
        System.out.print('\n'); // Salto de linea

        switch (opcion) {
            case 1:
                System.out.println("Numero: " + mMate.numeroRandom());
                break;
            case 2:
                System.out.println("Ingrese un numero entero (0 - 10)");
                System.out.print(">>> ");
                num = input.nextInt();
                System.out.println("En letras: " + mMate.numeroEnLetras(num));
                break;
            case 3:
                mMate.multiplosDe4(mMate.numeroRandom());
                break;
            case 4:
                System.out.println("Ingrese la cantidad en pesos mxn");
                System.out.print(">>> ");
                num = input.nextInt();
                arrNumDecimal = mMate.convertirADolaresEurosLibras(num);
                System.out.println("Dolares: $" + arrNumDecimal[0]);
                System.out.println("Euros: €" + arrNumDecimal[1]);
                System.out.println("Libras: £" + arrNumDecimal[2]);
                break;
            case 5:
                System.out.println("Tamanio del arreglo");
                System.out.print(">>> ");
                size = input.nextInt();
                arrInt1 = new int[size];
                arrInt2 = new int[size];

                System.out.println("Arreglo 1");
                for (int i = 0; i < arrInt1.length; i++) {
                    System.out.printf("[%d] = ", i);
                    arrInt1[i] = input.nextInt();
                }

                System.out.println("Arreglo 2");
                for (int i = 0; i < arrInt1.length; i++) {
                    System.out.printf("[%d] = ", i);
                    arrInt2[i]= input.nextInt();
                }

                arrInt3 = mMate.sumaDeDosArreglos(arrInt1, arrInt2);
                System.out.println("Suma");
                for (int i = 0; i < arrInt3.length; i++) {
                    System.out.printf("[%d] = %d\n", i, arrInt3[i]);
                }

                System.out.print('\n');
                break;
            case 6:
                System.out.println("Ingrese una cadena");
                System.out.print(">>> ");
                str1 = input.next();
                str1 += input.nextLine();
                System.out.println(str1);
                System.out.println("Veces que aparece el caracter 'a': " + mCade.contarLetrasA(str1));
                break;
            case 7:
                System.out.println("Ingrese dos cadenas");
                System.out.print(">>> ");
                str1 = input.next();
                str1 += input.nextLine();
                System.out.print(">>> ");
                str2 = input.next();
                str2 += input.nextLine();
                System.out.println("Cadenas iguales: " + mCade.cadenasIguales(str1, str2));
                break;
            case 8:
                System.out.println("Ingrese una cadena");
                System.out.print(">>> ");
                str1 = input.next();
                str1 += input.nextLine();
                System.out.println("Cantidad de palabras: " + mCade.cantidadDePalabras(str1));
                break;
            case 9:
                System.out.println("Ingrese una palabra");
                System.out.print(">>> ");
                str1 = input.next();
                str1 += input.nextLine();
                System.out.println("Contiene la palabra " + str1 +": " + mCade.contieneLaPalabra(str1));
                break;
            case 10:
                alumnos = crearAlumnos();
                System.out.println("Mujeres en el grupo: " + mAlumnos.cuantasMujeresHay(alumnos));
                break;
            case 11:
                alumnos = crearAlumnos();
                System.out.printf("Promedio del grupo: %.2f\n", mAlumnos.promedioDelGrupo(alumnos));
                break;
            case 12:
                alumnos = crearAlumnos();
                System.out.println("Cantidad de alumnos reprobados en el grupo: " + mAlumnos.cantidadDeReprobados(alumnos));
                break;
            case 0:
                System.out.println("Saliendo del programa...");
                return true;
            default:
                System.out.println("Opcion no encontrada");
        }
        System.out.print('\n'); // Salto de linea
        return false;
    }

    private boolean menu(String nombre) {
        System.out.println("Bienvenido " + nombre);
        return menu();
    }

    private Alumno[] crearAlumnos() {
        // También se puede hacer con un getAlumnos en la clase Alumno, ya que el constructor no parametrizado
        // crea 4 alumnos por default
        Alumno[] alumnos = new Alumno[6];

        alumnos[0] = new Alumno("00001", "Alicia", "Perez", "Sistemas Computacionales", false, 86);
        alumnos[1] = new Alumno("00002", "Juan", "Lopez", "Gestion Empresarial", true, 69);
        alumnos[2] = new Alumno("00003", "Sebastian", "Arellanes", "Sistemas Computacionales", true, 98);
        alumnos[3] = new Alumno("00004", "Maria", "Torres", "Mecanica", false, 82);
        alumnos[4] = new Alumno("00005", "Natalia", "Rendon", "Energias Renovables", false, 59);
        alumnos[5] = new Alumno("00006", "Maximiliano", "Orpinela", "Mecatronica", true, 70);

        return alumnos;
    }
}
