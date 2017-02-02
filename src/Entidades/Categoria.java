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
    
    private int id;
    private String nombre;
    private ArrayList<Procedimiento> procedimientos;

    /***
     * Constructor que recibe una lista de procedimientos ya agregados
     * @param id identificador de la categoria
     * @param nombre nombre de la categoria
     * @param procedimientos arraylist con procedimientos, los mismos pertenecen
     * a la categoria en memoria
     */
    public Categoria(int id, String nombre, ArrayList<Procedimiento> procedimientos) {
        this.id = id;
        this.nombre = nombre;
        this.procedimientos = procedimientos;
    }

    /***
     * Constructor que no recibe una lista de procedimientos
     * @param id 
     * @param nombre 
     */
    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    public ArrayList<Procedimiento> getProcedimientos() {
        return procedimientos;
    }

    public void setProcedimientos(ArrayList<Procedimiento> procedimientos) {
        this.procedimientos = procedimientos;
    }
    
    public void agregarProcedimiento(Procedimiento proc){
        if (proc != null) {
            this.procedimientos.add(proc);
        }
    }
    
    public Categoria obtenerCategoria(){
        return new Categoria(id, nombre, procedimientos);
    }
}
