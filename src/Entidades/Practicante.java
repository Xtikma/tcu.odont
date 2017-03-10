/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Alejandra
 */
public class Practicante {
    
    private int idPracticante;
    private String nombre;
    private boolean eliminado;

    public Practicante() {
    }

    public Practicante(int idPracticante, String nombre, boolean eliminado) {
        this.idPracticante = idPracticante;
        this.nombre = nombre;
        this.eliminado = eliminado;
    }

    /**
     * @return the idPracticante
     */
    public int getIdPracticante() {
        return idPracticante;
    }

    /**
     * @param idPracticante the idPracticante to set
     */
    public void setIdPracticante(int idPracticante) {
        this.idPracticante = idPracticante;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the eliminado
     */
    public boolean isEliminado() {
        return eliminado;
    }

    /**
     * @param eliminado the eliminado to set
     */
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    
    
    
}
