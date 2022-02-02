package Unidad2.T1;

public class Consola {
    private String marca;
    private String modelo;
    private String color;
    private int almacenamiento;
    private int cantidadDeControles;
    private boolean incluyeJuegos;

    // Constructor sin parametros
    public Consola() {
        this.marca = "Microsoft";
        this.modelo = "Series X";
        this.color = "Negro";
        this.almacenamiento = 480;
        this.cantidadDeControles = 1;
        this.incluyeJuegos = false;
    }

    // Constructor con parametros
    public Consola(String marca, String modelo, String color, int almacenamiento, int cantidadDeControles, boolean incluyeJuegos) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.almacenamiento = almacenamiento;
        this.cantidadDeControles = cantidadDeControles;
        this.incluyeJuegos = incluyeJuegos;
    }

    /*
    Getters
     */
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public int getCantidadDeControles() {
        return cantidadDeControles;
    }

    public boolean isIncluyeJuegos() {
        return incluyeJuegos;
    }

    /*
    Setters
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setCantidadDeControles(int cantidadDeControles) {
        this.cantidadDeControles = cantidadDeControles;
    }

    public void setIncluyeJuegos(boolean incluyeJuegos) {
        this.incluyeJuegos = incluyeJuegos;
    }
}
