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
public class ProcedimientoConsulta {
    
    private Consulta consulta;
    private int idConsulta;
    private Procedimiento procedimiento;
    private int idProcedimiento;
    private double precioHistorico;
    private int cantidad;

    public ProcedimientoConsulta(Consulta consulta, Procedimiento procedimiento, double precioHistorico, int cantidad) {
        this.consulta = consulta;
        this.idConsulta = consulta.getIdConsulta();
        this.procedimiento = procedimiento;
        this.idProcedimiento = procedimiento.getId();
        this.precioHistorico = precioHistorico;
        this.cantidad = cantidad;
    }

    public ProcedimientoConsulta(int idConsulta, int idProcedimiento, double precioHistorico, int cantidad) {
        this.idConsulta = idConsulta;
        this.idProcedimiento = idProcedimiento;
        this.precioHistorico = precioHistorico;
        this.cantidad = cantidad;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Procedimiento getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(Procedimiento procedimiento) {
        this.procedimiento = procedimiento;
    }

    public int getIdProcedimiento() {
        return idProcedimiento;
    }

    public void setIdProcedimiento(int idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    public double getPrecioHistorico() {
        return precioHistorico;
    }

    public void setPrecioHistorico(double precioHistorico) {
        this.precioHistorico = precioHistorico;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    /***
     * Obtiene el objeto de procedimientoConsulta
     * @param completo se utiliza para indicar que se espera recibir
     * @return un objeto ProcedimientoConsulta con la información almacenada
     */
    public ProcedimientoConsulta obtenerProcedimientoConsulta(boolean completo){
        if(completo == true){
            return new ProcedimientoConsulta(consulta, procedimiento, precioHistorico, cantidad);
        }else{
            return new ProcedimientoConsulta(idConsulta, idProcedimiento, precioHistorico, cantidad);
        }        
    }
    
    
}
