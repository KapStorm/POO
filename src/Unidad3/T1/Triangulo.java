package Unidad3.T1;

public class Triangulo extends Figura{
    // lado1 = base; lado2 = altura; lado3 = ancho
    public Triangulo(float lado1, float lado2, float lado3) {
        super(lado1, lado2, lado3);
        descripcion = this.getClass().getSimpleName();
    }

    @Override
    public float calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public float calcularArea() {
        return super.calcularArea() / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " y tiene solo 3 lados";
    }
}
