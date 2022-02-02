package Unidad2.T1;

public class Jugador {
    private String nombreDelPersonaje;
    private String personaje;
    private String rol;
    private int nivel;
    private boolean genero; // true hombre | false mujer

    // Constructor sin parametros
    public Jugador() {
        this.nombreDelPersonaje = "player";
        this.personaje = "Orco";
        this.rol = "Guerrero";
        this.nivel = 1;
        this.genero = true;
    }

    // Constructor con parametros
    public Jugador(String nombreDelPersonaje, String personaje, String rol, int nivel, boolean genero) {
        this.nombreDelPersonaje = nombreDelPersonaje;
        this.personaje = personaje;
        this.rol = rol;
        this.nivel = nivel;
        this.genero = genero;
    }

    /*
        getters
         */
    public String getNombreDelPersonaje() {
        return nombreDelPersonaje;
    }

    public int getNivel() {
        return nivel;
    }

    public String getPersonaje() {
        return personaje;
    }

    public String getRol() {
        return rol;
    }

    public boolean isGenero() {
        return genero;
    }

    /*
    setters
     */
    public void setNombreDelPersonaje(String nombreDelPersonaje) {
        this.nombreDelPersonaje = nombreDelPersonaje;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }
}
