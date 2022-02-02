package Unidad3.T1;

public class Poligono extends Figura {
    protected float apotema;
    protected int numLados;

    // lado1 = lado; lado2 = numLados; lado3 = ancho
    public Poligono(float lado1, float lado2, float lado3) {
        super(lado1, lado2, lado3);
        this.apotema = (float)(Math.sqrt( Math.pow(lado1, 2) - (Math.pow(lado1, 2) / 2) ));
        numLados = (int) lado2;
    }

    @Override
    public float calcularPerimetro() {
        return numLados * lado1;
    }

    @Override
    public float calcularArea() {
        return calcularPerimetro() * apotema / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " y tiene " + numLados + " lados";
    }
}
