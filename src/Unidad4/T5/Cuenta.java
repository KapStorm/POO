/*---------------------------------------
Propósito:   Proyecto 2 U4

Autor: Arellanes Beltrán Sebastián
Fecha: 09/11/2021
----------------------------------------*/
package Unidad4.T5;

public class Cuenta {
    protected String cveCuenta, nombre, tipoDeCuenta, NIP, vencimiento;
    protected double saldo;

    public Cuenta(String cveCuenta, String nombre, String tipoDeCuenta, String NIP, String vencimiento, double saldo) {
        this.cveCuenta = cveCuenta;
        this.nombre = nombre;
        this.tipoDeCuenta = tipoDeCuenta;
        this.NIP = NIP;
        this.vencimiento = vencimiento;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente: " + cveCuenta + " Nombre: " + nombre + " Tipo de cuenta: " + tipoDeCuenta;
    }
}
