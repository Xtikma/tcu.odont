/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Keylor
 */
public class Categoria {
    
    //Atributos
    private int idCategoria;
    private String nombreCategoria;
    private ArrayList<Procedimiento> procedimientos;

    public Categoria(String NombreCategoria, ArrayList<Procedimiento> procedimientos) {
        this.nombreCategoria = NombreCategoria;
        this.procedimientos = procedimientos;
        
    }

    public Categoria(int IdCategoria, String NombreCategoria, ArrayList<Procedimiento> procedimientos) {
        this.idCategoria = IdCategoria;
        this.nombreCategoria = NombreCategoria;
        this.procedimientos = procedimientos;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.idCategoria = IdCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String NombreCategoria) {
        this.nombreCategoria = NombreCategoria;
    }
    
    public ArrayList<Procedimiento> getProcedimientos() {
        return procedimientos;
    }

    public void setProcedimientos(ArrayList<Procedimiento> procedimientos) {
        this.procedimientos = procedimientos;
    }
    
    public Categoria getCategoria(){
        return new Categoria(idCategoria, nombreCategoria, procedimientos);
    }  
    
}
