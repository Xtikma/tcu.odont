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
public class Doctor {
    
    private int idDoctor;
    private String nombre;
    private boolean eliminado;

    public Doctor() {
    }

    public Doctor(int idDoctor, String nombre, boolean eliminado) {
        this.idDoctor = idDoctor;
        this.nombre = nombre;
        this.eliminado = eliminado;
    }

 
    /**
     * @return the idDoctor
     */
    public int getIdDoctor() {
        return idDoctor;
    }

    /**
     * @param idDoctor the idDoctor to set
     */
    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
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
