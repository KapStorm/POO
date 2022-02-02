package Unidad2.Examen;

public class Examen {
    /*/////////////////////////
        METODO MAIN HASTA ABAJO
     */////////////////////////
    private int calif1, calif2, calif3;
    private String numControl, nombre;

    // Constructor con todos los atributos
    public Examen(int calif1, int calif2, int calif3, String numControl, String nombre) {
        this.calif1 = calif1;
        this.calif2 = calif2;
        this.calif3 = calif3;
        this.numControl = numControl;
        this.nombre = nombre;
    }

    // Constructor solo calificaciones
    public Examen(int calf1, int calf2, int calf3) {
        this.calif1 = calf1;
        this.calif2 = calf2;
        this.calif3 = calf3;
        this.numControl = "0000000000";
        this.nombre = "Sin Nombre";
    }

    public double calcPromedio() {
        double promedio = 0;

        promedio = (double)(calif1 + calif2 + calif3) / 3;

        return promedio;
        /*
            O simplemente
            return (double)(calif1 + calif2 + calif3) / 3;
         */
    }

    /*
        Getters
     */
    public int getCalif1() {
        return calif1;
    }

    public int getCalif2() {
        return calif2;
    }

    public int getCalif3() {
        return calif3;
    }

    public String getNumControl() {
        return numControl;
    }

    public String getNombre() {
        return nombre;
    }

    /*
        Setters
     */
    public void setCalif1(int calif1) {
        this.calif1 = calif1;
    }

    public void setCalif2(int calif2) {
        this.calif2 = calif2;
    }

    public void setCalif3(int calif3) {
        this.calif3 = calif3;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Main
    public static void main(String[] args) {
        Examen examen1 = new Examen(6, 7, 9, "1231231231", "Sebastian");
        System.out.println("Nombre: " + examen1.getNombre());
        System.out.println("Num. Control: " + examen1.getNumControl());
        System.out.println("Calificacion 1: " + examen1.getCalif1());
        System.out.println("Calificacion 2: " + examen1.getCalif2());
        System.out.println("Calificacion 3: " + examen1.getCalif3());
        System.out.printf("Promedio: %.2f\n", examen1.calcPromedio());

        System.out.println();

        Examen examen2 = new Examen(4, 5, 10);
        examen2.setNombre("Arellanes");
        examen2.setNumControl("9999999999");
        System.out.println("Nombre: " + examen2.getNombre());
        System.out.println("Num. Control: " + examen2.getNumControl());
        System.out.println("Calificacion 1: " + examen2.getCalif1());
        System.out.println("Calificacion 2: " + examen2.getCalif2());
        System.out.println("Calificacion 3: " + examen2.getCalif3());
        System.out.printf("Promedio: %.2f\n", examen2.calcPromedio());
    }
}
