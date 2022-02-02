package Unidad2.Proyecto2;

public class Trabajador {
    // 9.	Especificar que es cada atributo con su respectivo comentario.
    private String nombre, genero, tipoPago;    // Nombre, género y tipo de pago del trabajador
    private double horasTrabajadas, horasExtras, sueldoDiario, sueldo, totalPago;   // Todo respectivo al sueldo y horas
                                                                                    // trabajadas del trabajador
    // Constructor no parametrizado
    public Trabajador() {

    }

    // Constructor parametrizado
    public Trabajador(String nombre, String genero, String tipoPago, double sueldoDiario, double sueldo) {
        this.nombre = nombre;
        this.genero = genero;
        this.tipoPago = tipoPago;
        this.sueldoDiario = sueldoDiario;
        this.sueldo = sueldo;
    }

    // 8.	Hacer uso de getter and setter, así como la nomenclatura para nombrar variables, métodos (nAlumnos, idClave).
    /*-----------
        Getters
     -----------*/
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public double getSueldoDiario() {
        return sueldoDiario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getTotalPago() {
        return totalPago;
    }

    /*-----------
        Setters
    -----------*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void setSueldoDiario(double sueldoDiario) {
        this.sueldoDiario = sueldoDiario;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }
}
