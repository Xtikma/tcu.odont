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

    public Categoria(int id, String nombre, ArrayList<Procedimiento> procedimientos) {
        this.id = id;
        this.nombre = nombre;
        this.procedimientos = procedimientos;
    }

    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        procedimientos = new ArrayList<Procedimiento>();
    }

    public Categoria() {
        procedimientos = new ArrayList<>();
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
    
    /***
     * Agrega un procedimiento a la lista si este no llego nulo
     * @param proc 
     */
    public void agregarProcedimiento(Procedimiento proc){
        if (proc != null) {
            this.procedimientos.add(proc);
        }
    }
    
    public void eliminarProcedimiento(int id){
        for (int i = 0; i < procedimientos.size(); i++) {
            if (procedimientos.get(i).getId() == id) {
                procedimientos.remove(i);
            }
        }
    }
    
    public Categoria obtenerCategoria(){
        return new Categoria(id, nombre, procedimientos);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
