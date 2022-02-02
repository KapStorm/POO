package Unidad3.T1;

public class Rectangulo extends Figura {
    // lado1 = base; lado2 = altura; lado3 = ancho
    public Rectangulo(float lado1, float lado2, float lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    public String toString() {
        return super.toString() + " tiene dos pares de lados iguales";
    }
}
