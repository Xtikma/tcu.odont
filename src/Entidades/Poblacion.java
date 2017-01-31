
package Entidades;

public class Poblacion {
    
    private String nombre;
    private String institucion;
    private boolean becado;

    public Poblacion(String nombre, String institucion, boolean becado) {
        this.nombre = nombre;
        this.institucion = institucion;
        this.becado = becado;
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

    public boolean isBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }
}