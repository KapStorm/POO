package Unidad2.Proyecto;

public class Contacto {
    // Sebastian A.
    private int idContacto;
    private String nombre, apellido, alias, tipoDeTelefono, numeroTelefonico, email;

    // Sebastian A.
    public Contacto(int idContacto, String nombre, String apellido, String alias, String tipoDeTelefono, String numeroTelefonico, String email) {
        this.idContacto = idContacto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.alias = alias;
        this.tipoDeTelefono = tipoDeTelefono;
        this.numeroTelefonico = numeroTelefonico;
        this.email = email;
    }

    // Brian
    public Contacto(int idContacto, String nombre, String apellido, String numeroTelefonico) {
        this.idContacto = idContacto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.alias = "Sin alias";
        this.tipoDeTelefono = "Oficina";
        this.numeroTelefonico = numeroTelefonico;
        this.email = "Sin email";
    }

    // Brian
    public Contacto() {
        this(0, "Sin nombre", "Sin apellido", "Sin alias", "Oficina", "0000000000", "Sin email");
    }

    /*
    toString
     */
    // Sebastian A.
    @Override
    public String toString() {
        return "ID: " + idContacto + "\tNombre: " + nombre + "\tApellido: " + apellido + "\tAlias:" + alias + "\tTipo de tel.:" + tipoDeTelefono + "\tTel.: " + numeroTelefonico + "\tEmail: " + email;
    }

    /*
    Getters
     */
    // Brian
    public int getIdContacto() {
        return idContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getAlias() {
        return alias;
    }

    public String getTipoDeTelefono() {
        return tipoDeTelefono;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public String getEmail() {
        return email;
    }

    /*
    Setters
     */
    // Brian
    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setTipoDeTelefono(String tipoDeTelefono) {
        this.tipoDeTelefono = tipoDeTelefono;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
