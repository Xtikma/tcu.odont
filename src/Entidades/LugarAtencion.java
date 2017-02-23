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
public class LugarAtencion {
    
    private int idLugarAtencion;
    private String lugar;
    private boolean eliminado;

    public LugarAtencion() {
    }

    public LugarAtencion(int idLugarAtencion, String lugar, boolean eliminado) {
        this.idLugarAtencion = idLugarAtencion;
        this.lugar = lugar;
        this.eliminado = eliminado;
    }

    /**
     * @return the idLugarAtencion
     */
    public int getIdLugarAtencion() {
        return idLugarAtencion;
    }

    /**
     * @param idLugarAtencion the idLugarAtencion to set
     */
    public void setIdLugarAtencion(int idLugarAtencion) {
        this.idLugarAtencion = idLugarAtencion;
    }

    /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
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
