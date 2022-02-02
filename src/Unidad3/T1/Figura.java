package Unidad3.T1;

public class Figura {
    protected float lado1, lado2, lado3;
    protected String descripcion;

    public Figura(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        descripcion = this.getClass().getSimpleName();
    }

    protected float calcularPerimetro() {
        return (lado1 + lado2) * 2;
    }

    protected float calcularArea() {
        return lado1 * lado2;
    }

    protected float calcularVolumen() {
        return calcularArea() * lado3;
    }

    protected void mostrarDatos() {
        System.out.printf("Perimetro: %.2f u\n", calcularPerimetro());
        System.out.printf("Area: %.2f u²\n", calcularArea());
        System.out.printf("Volumen: %.2f u³\n", calcularVolumen());
    }

    @Override
    public String toString() {
        return "La figura es " + descripcion;
    }
}
