package Unidad3.E4;

public class Enemigo extends Personaje {
    public Enemigo(String nombre, int hp, int mp) {
        super(nombre, "Enemigo", hp, mp);
    }

    @Override
    public int especial() {
        return 0;
    }

    public int especial(Personaje p) {
        return megaAtaque(p);
    }

    public int megaAtaque(Personaje p) {
        // El enemigo tiene un cuarto comando que se llama megaAtaque que resta el 50% de los puntos de vitalidad
        // de un personaje y consume 20 puntos de magia
        int danio = 0;
        if ((mp - 20) >= 0) {
            danio = (int)(p.hp * 0.50);
        }
        return danio;
    }

    @Override
    public String toString() {
        return "Soy el " +this.getClass().getSimpleName() + " " + this.nombre + ". HP: " + this.hp + ". MP: " + this.mp;
    }
}
