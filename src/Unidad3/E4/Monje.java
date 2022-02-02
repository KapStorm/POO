package Unidad3.E4;

public class Monje extends Personaje {
    public Monje(String nombre, int hp, int mp) {
        super(nombre, "Monje", hp, mp);
    }

    @Override
    public int especial() {
        // El comando especial del monge produce un da�o entre 200 y 300 puntos de vitalidad
        // consume 8 puntos de magia
        int danio = 0;
        if ((mp - 8) >= 0) {
            danio = rnd.nextInt(101) + 200;
            mp -= 8;
        }
        return danio;
    }

    @Override
    public String toString() {
        return "Soy el " +this.getClass().getSimpleName() + " " + this.nombre + ". HP: " + this.hp + ". MP: " + this.mp;
    }
}
