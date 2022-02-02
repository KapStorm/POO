package Unidad3.E2;

public class Material {
    protected String tipoMateria, codigo, autor, titulo, status;
    protected int anio;

    public Material altaMaterial(String tipo) {
        if (tipo.equalsIgnoreCase("libro")) {
            return agregarLibro();
        }
        return new Material();
    }

    public Libro agregarLibro() {
        return new Libro();
    }

    public Revista agregarRevista() {
        return new Revista();
    }

    public void bajaMaterial() {

    }

    public void cambioMaterial() {

    }
}
