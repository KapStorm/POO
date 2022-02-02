package Unidad3.T1;

public class AppFigura {
    public static void main(String[] args) {
        // Ciruclo
        Circulo circulo1 = new Circulo(3, 0, 10);
        System.out.println(circulo1);
        circulo1.mostrarDatos();
        System.out.println();

        // Triangulo
        Triangulo triangulo1 = new Triangulo(2, 3, 5);
        System.out.println(triangulo1);
        triangulo1.mostrarDatos();
        System.out.println();

        // Cuadrado
        Cuadrado cuadrado1 = new Cuadrado(5, 0, 2);
        System.out.println(cuadrado1);
        cuadrado1.mostrarDatos();
        System.out.println();

        // Triangulo
        Rectangulo rectangulo1 = new Rectangulo(13.5f, 4.1f, 4);
        System.out.println(rectangulo1);
        rectangulo1.mostrarDatos();
        System.out.println();

        // Poligono
        Poligono poligono1 = new Poligono(10, 5, 2);
        System.out.println(poligono1);
        poligono1.mostrarDatos();
    }
}
