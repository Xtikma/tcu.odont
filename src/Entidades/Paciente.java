package Entidades;

public class Paciente {

    private int id;
    private String fechaNacimiento;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String valorIdentificacion;
    private String genero;
    private String carne;
    private int beca;
    private int edad;
    private boolean primerIngreso;
    private boolean eliminado;

    private Poblacion poblacion;
    private String nombreTipoId;
    private String nombrePoblacion;

    public Paciente() {
        poblacion = new Poblacion();
    }

    public Paciente(int id, String fechaNacimiento, String nombre, String primerApellido, String segundoApellido,
            String valorIdentificacion, String genero, int beca, int edad, String carne, boolean primerIngreso, boolean eliminado) {
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.valorIdentificacion = valorIdentificacion;
        this.genero = genero;
        this.beca = beca;
        this.edad = edad;
        this.carne = carne;
        this.primerIngreso = primerIngreso;
        this.eliminado = eliminado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getValorIdentificacion() {
        return valorIdentificacion;
    }

    public void setValorIdentificacion(String valorIdentificacion) {
        this.valorIdentificacion = valorIdentificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public int getBeca() {
        return beca;
    }

    public void setBeca(int beca) {
        this.beca = beca;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getPrimerIngreso() {
        return primerIngreso;
    }

    public void setPrimerIngreso(boolean primerIngreso) {
        this.primerIngreso = primerIngreso;
    }

    public boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String getNombreTipoId() {
        return nombreTipoId;
    }

    public void setNombreTipoId(String nombreTipoId) {
        this.nombreTipoId = nombreTipoId;
    }

    public String getNombrePoblacion() {
        return nombrePoblacion;
    }

    public void setNombrePoblacion(String nombrePoblacion) {
        this.nombrePoblacion = nombrePoblacion;
    }

    public void setPoblacion(int id, String nombre, String institucion, boolean becado) {
        poblacion = new Poblacion(id, nombre, institucion, becado);
    }

    public Poblacion getPoblacion() {
        return poblacion;
    }
}