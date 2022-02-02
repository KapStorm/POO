package Unidad3.T1;

public class Circulo extends Figura {
    protected float radio;

    // lado1 = area; lado 2 no funcional; lado3 = ancho
    public Circulo(float lado1, float lado2, float lado3) {
        super(lado1, lado2, lado3);
        radio = lado1;
    }

    @Override
    public float calcularPerimetro() {
        return (float) (Math.PI * radio * 2);
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    @Override
    public String toString() {
        return super.toString() + " y no tiene lados rectos";
    }
}
