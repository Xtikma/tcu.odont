/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Keylor
 */
public class Consulta {
    
    private int idConsulta;
    private Doctor doctor;
    private int idDoctor;
    private Practicante practicante;
    private int idPracticante;
    private LugarAtencion lugar;
    private int idLugar;
    private Paciente paciente;
    private int idPaciente;
    private Date fechaConsulta;
    private double totalConsulta;
    private ArrayList<ProcedimientoConsulta> listaProcedimientos;

    public Consulta(int idConsulta, Date fechaConsulta, double total, 
            Paciente pac, Doctor dr , Practicante pr, LugarAtencion lg) {
        this.idConsulta = idConsulta;
        this.fechaConsulta = fechaConsulta;
        this.totalConsulta = total;
        this.doctor = dr;
        this.idDoctor = dr.getIdDoctor();
        this.paciente = pac;
        this.idPaciente = pac.getId();
        this.practicante = pr;
        this.idPracticante = pr.getIdPracticante();
        this.lugar = lg;
        this.idLugar = lg.getIdLugarAtencion();
        
        
    }
    
    

    public Consulta(){
        this.listaProcedimientos = new ArrayList<ProcedimientoConsulta>();
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
        this.idPaciente = paciente.getId();
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
        if (procedimiento != null) {
            this.listaProcedimientos.add(procedimiento);
        }        
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
        this.idDoctor = doctor.getIdDoctor();
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public Practicante getPracticante() {
        return practicante;
    }

    public void setPracticante(Practicante practicante) {
        this.practicante = practicante;
        this.idPracticante = practicante.getIdPracticante();
    }

    public int getIdPracticante() {
        return idPracticante;
    }

    public void setIdPracticante(int idPracticante) {
        this.idPracticante = idPracticante;
    }

    public LugarAtencion getLugar() {
        return lugar;
    }

    public void setLugar(LugarAtencion lugar) {
        this.lugar = lugar;
        this.idLugar = lugar.getIdLugarAtencion();
    }

    public int getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }
}
