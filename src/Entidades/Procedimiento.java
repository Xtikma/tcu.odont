/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Keylor
 */
public class Procedimiento {
    
    private int idProcedimiento;
    private String nombreProcedimiento;
    private double precio;
    private int idCategoria;

    
    public Procedimiento(int idProcedimiento, String nombreProcedimiento, double precio, int idCategoria) {
        this.idProcedimiento = idProcedimiento;
        this.nombreProcedimiento = nombreProcedimiento;
        this.precio = precio;
        this.idCategoria = idCategoria;
    }

    public int getIdProcedimiento() {
        return idProcedimiento;
    }

    public void setIdProcedimiento(int idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    public String getNombreProcedimiento() {
        return nombreProcedimiento;
    }

    public void setNombreProcedimiento(String nombreProcedimiento) {
        this.nombreProcedimiento = nombreProcedimiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    public Procedimiento getProcedimiento(){
        return new Procedimiento(idProcedimiento, nombreProcedimiento, precio, idCategoria);
    }
    
}
