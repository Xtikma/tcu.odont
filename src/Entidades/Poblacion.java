
package Entidades;

public class Poblacion {
    
    private int id;
    private String nombre;
    private String institucion;
    private boolean becado;

    public Poblacion(int id, String nombre, String institucion, boolean becado) {
        this.id = id;
        this.nombre = nombre;
        this.institucion = institucion;
        this.becado = becado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public boolean getBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }
}