/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Keylor
 */
public class Consulta {
    
    private int idConsulta;
    //private Doctor doctor;
    //private int idDoctor;
    //private Practicante practicante;
    //private int idPracticante;
    //private LugarAtencion lugar;
    //private int idLugar
    private Paciente paciente;
    private int idPaciente;
    private Date fechaConsulta;
    private double totalConsulta;
    private ArrayList<ProcedimientoConsulta> listaProcedimientos;

    public Consulta(int idConsulta, Paciente paciente, Date fechaConsulta, double totalConsulta) {
        this.idConsulta = idConsulta;
        this.paciente = paciente;
        this.fechaConsulta = fechaConsulta;
        this.totalConsulta = totalConsulta;
    }

    public Consulta(int idConsulta, int idPaciente, Date fechaConsulta, double totalConsulta) {
        this.idConsulta = idConsulta;
        this.idPaciente = idPaciente;
        this.fechaConsulta = fechaConsulta;
        this.totalConsulta = totalConsulta;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public double getTotalConsulta() {
        return totalConsulta;
    }

    public void setTotalConsulta(double totalConsulta) {
        this.totalConsulta = totalConsulta;
    }

    public ArrayList<ProcedimientoConsulta> getListaProcedimientos() {
        return listaProcedimientos;
    }

    public void setListaProcedimientos(ArrayList<ProcedimientoConsulta> listaProcedimientos) {
        this.listaProcedimientos = listaProcedimientos;
    }
    
    public void agregarProcedimiento(ProcedimientoConsulta procedimiento){
        this.listaProcedimientos.add(procedimiento);
    }
    
    
}