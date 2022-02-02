package Unidad3.T1;

public class Cuadrado extends Figura{
    // lado1 = lado; lado2 no funcional; lado3 = ancho
    public Cuadrado(float lado1, float lado2, float lado3) {
        super(lado1, lado2, lado3);
        this.lado2 = this.lado1; // Miden lo mismo
        descripcion = this.getClass().getSimpleName();
    }

    @Override
    public float calcularArea() {
        return (float) Math.pow(lado1, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " y tiene 4 lados iguales";
    }
}
