/*---------------------------------------
Propósito:   Clase libro para tarea 2

Autor: Arellanes Beltrán Sebastián
Fecha: 10/09/2021
----------------------------------------*/
package Unidad2.T2;

public class Libro {
    private String nombre, autor, ISBN, idioma;
    private int paginas;
    private boolean esTapaDura;

    // Constructor con todos los parametros
    public Libro(String nombre, String autor, String ISBN, String idioma, int paginas, boolean esTapaDura) {
        this.nombre = nombre;
        this.autor = autor;
        this.ISBN = ISBN;
        this.idioma = idioma;
        this.paginas = paginas;
        this.esTapaDura = esTapaDura;
    }

    // Constructor con nombre, autor e ISBN
    public Libro(String nombre, String autor, String ISBN) {
        this.nombre = nombre;
        this.autor = autor;
        this.ISBN = ISBN;
        this.idioma = "Espaniol";
        this.paginas = 0;
        this.esTapaDura = false;
    }

    // Constructor sin parametros
    public Libro() {
        this("El Camino de los Reyes", "Brandon Sanderson", "9780765326355", "Ingles", 1008, true);
    }

    /*
    Getters
     */
    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getPaginas() {
        return paginas;
    }

    public boolean isEsTapaDura() {
        return esTapaDura;
    }

    /*
    Setters
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setEsTapaDura(boolean esTapaDura) {
        this.esTapaDura = esTapaDura;
    }
}
