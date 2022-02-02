package Unidad2.Proyecto2;

import java.util.Scanner;

public class Nomina {
    // 9.	Especificar que es cada atributo con su respectivo comentario.
    Scanner input;  // Objeto scanner como atributo de la clase Nomina
    Trabajador[] tr;    // Arreglo tipo Trabajador como atributo de la clase Nomina

    // Constructor para inicializar los atributos de la clase
    public Nomina(int size) {
        input = new Scanner(System.in);
        tr = new Trabajador[size];
    }

    // 6.	El método main solo se usa para iniciar el programa
    // 7.	Hacer uso de objetos, evitar el uso de métodos estáticos innecesarios.
    public static void main(String[] args) {
        Nomina n = new Nomina(10);
        n.tr = n.llenarDatos(n.tr.length);
        n.tr = n.sueldoTotal(n.tr);
        System.out.println();
        n.mostrarDatosEmpleado(n.tr);
        System.out.println();
        System.out.println("Promedio del sueldo de los trabajadores masculinos: $" + n.promedioSueldo(n.tr, "Masculino"));
        System.out.println("Promedio del sueldo de las trabajadoras femeninas: $" + n.promedioSueldo(n.tr, "Femenino"));
        System.out.println();
        n.quienGanaMas(n.tr);
    }

    // Ingresar datos al arreglo de tipo Trabajador
    public Trabajador[] llenarDatos(int size) {
        Trabajador[] t = new Trabajador[size];

        t[0] = new Trabajador("Sebastian", "Masculino", "Semanal", 400, 2800);
        t[1] = new Trabajador("Roberto", "Masculino", "Quincenal", 435, 6525);
        t[2] = new Trabajador("Anette", "Femenino", "Mensual", 450, 13500);
        t[3] = new Trabajador("Yamileth", "Femenino", "Semanal", 425, 2975);
        t[4] = new Trabajador("Ramon", "Masculino", "Quincena", 380, 5700);
        t[5] = new Trabajador("Cesar", "Masculino", "Quincenal", 500, 7500);
        t[6] = new Trabajador("Rosario", "Femenino", "Quincenal", 750, 11250);
        t[7] = new Trabajador("Maria", "Femenino", "Mensual", 480, 14400);
        t[8] = new Trabajador("Jesus", "Masculino", "Mensual", 600, 18000);
        t[9] = new Trabajador("Rocio", "Femenino", "Quincena", 300, 4500);

        return t;
    }

    // 1.	Si horasTrabajadas > 40, las horas extra se pagan al doble.
    public double pagoHorasExtras(Trabajador emp) {
        double total = 0, costoHorasExtras = 0;

        System.out.printf("Ingrese las horas trabajadas del trabajador %s: ", emp.getNombre());
        emp.setHorasTrabajadas(input.nextInt());
        costoHorasExtras = (emp.getHorasTrabajadas() > 40) ? ((emp.getSueldoDiario() / 8) * 2) : 0;
        total = (emp.getHorasTrabajadas() - 40) * costoHorasExtras;

        return total;
    }

    // 2.	Definir un METODO para calcular el pagoTotal para cada Empleado y Guardarlo en un arreglo.
    public Trabajador[] sueldoTotal(Trabajador[] t) {
        for (Trabajador trab : t) {
            trab.setTotalPago(trab.getSueldo() + pagoHorasExtras(trab));
        }
        
        return t;
    }

    // 3.	Utilizar un METODO para Imprimir el Nombre del empleado y pagoTotal (puedes usar toString()).
    public void mostrarDatosEmpleado(Trabajador[] t) {
        for (Trabajador trab : t) {
            System.out.printf("Nombre: %s, sueldo total: $%.2f\n", trab.getNombre(), trab.getTotalPago());
        }
    }

    // 4.	Definir UN METODO para Calcula e Imprimir el pago promedio para las mujeres y el pago promedio para hombres.
    public double promedioSueldo(Trabajador[] t, String genero) {
        double promedio = 0;
        int contador = 0;

        for (Trabajador trab : t) {
            if (trab.getGenero().equalsIgnoreCase(genero)) {
                promedio += trab.getSueldoDiario() * 7;
                contador++;
            }
        }
        promedio /= contador;

        return promedio;
    }

    // 5.	Otro Método para Imprimir el Empleado que Ganó Más y si es Hombre o Mujer.
    public void quienGanaMas(Trabajador[] t) {
        Trabajador tMayor = t[0];
        double mayor = ((tMayor.getHorasTrabajadas() - 40) * tMayor.getSueldoDiario() / 8 * 2);
        double sueldo;

        for (Trabajador trab : t) {
            sueldo = (trab.getHorasTrabajadas() - 40) * trab.getSueldoDiario() / 8 * 2;
            if (sueldo < 0) {
                sueldo = 0;
            }

            if ((trab.getSueldoDiario() * 7 + sueldo) > mayor) {
                mayor = (trab.getSueldoDiario() * 7) + sueldo;
                tMayor = trab;
            }
        }
        System.out.printf("El empleado que mas gano esta semana es %s con $%.2f y es de genero %s\n", tMayor.getNombre(), mayor, tMayor.getGenero());
    }
}
