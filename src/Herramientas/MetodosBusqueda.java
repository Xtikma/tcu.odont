/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import Entidades.*;
import java.util.ArrayList;

/**
 *
 * @author Keylor
 */
public class MetodosBusqueda {
    
    /***
     * Selecciona los pacientes que cumplen con el criterio que ingresa el usuario
     * @param criterio texto ingresado por el usuario
     * @param lista lista con los pacientes activos
     * @return lista con los pacientes que cumplen con el criterio
     */
    public ArrayList<Paciente> BuscarPacientes(String criterio, ArrayList<Paciente> lista){
        ArrayList<Paciente> copia = new ArrayList<Paciente>();
        for (Paciente p : lista) {
            if (p.getNombre().toLowerCase().matches("(.*)"+criterio.toLowerCase()+"(.*)") == true ||
                    p.getPrimerApellido().toLowerCase().matches("(.*)"+criterio.toLowerCase()+"(.*)") == true ||
                    p.getSegundoApellido().toLowerCase().matches("(.*)"+criterio.toLowerCase()+"(.*)") == true ||
                    p.getValorIdentificacion().toLowerCase().matches("(.*)"+criterio.toLowerCase()+"(.*)") == true ||
                    p.getCarne().toLowerCase().matches("(.*)"+criterio.toLowerCase()+"(.*)") == true) {
                copia.add(p);
            }            
        }
        return copia;
    }
    
    /**
     * 
     * Filtra los procedimientos que cumplan con el criterio que ingreso el usuario
     * @param criterio texto ingresado por el usuario    
     * @param lista lista de categorias con los procedimientos a filtrar
     * @return lista con procedimientos que coinicidan con la lista.
     */
    public ArrayList<Procedimiento> BuscarProcedimientos(String criterio, ArrayList<Categoria> lista){
        ArrayList<Procedimiento> copia = new ArrayList<Procedimiento>();
        for (Categoria ct : lista) {
            for (Procedimiento pr : ct.getProcedimientos()) {
                if (pr.getNombre().toLowerCase().matches("(.*)" + criterio.toLowerCase() + "(.*)")) {
                    copia.add(pr);
                }
            }            
        }        
        return copia;
    }
    
    /**
     * Filtra los practicantes que cumplan con el criterio que ingreso el usuario
     * @param criterio texto ingresado por el usuario 
     * @param lista lista de practicantes registrados y activos
     * @return lista con los practicantes que cumplen con el criterio de busqueda
     */
    public ArrayList<Practicante> BuscarPracticantes(String criterio, ArrayList<Practicante> lista) {
        ArrayList<Practicante> copia = new ArrayList<Practicante>();
        for (Practicante p : lista) {
            if (p.getNombre().toLowerCase().matches("(.*)" + criterio.toLowerCase() + "(.*)")) {
                copia.add(p);
            }
        }
        return copia;
    }
    
    /**
     * Filtra los doctores que cumplan con el criterio que ingreso el usuario
     * @param criterio texto ingresado por el usuario 
     * @param lista lista de doctores registrados y activos
     * @return lista con los doctores que cumplen con el criterio de busqueda
     */
    public ArrayList<Doctor> BuscarDoctores(String criterio, ArrayList<Doctor> lista) {
        ArrayList<Doctor> copia = new ArrayList<Doctor>();
        for (Doctor d : lista) {
            if (d.getNombre().toLowerCase().matches("(.*)" + criterio.toLowerCase() + "(.*)")) {
                copia.add(d);
            }
        }
        return copia;
    }
    
    public ArrayList<Consulta> BuscarConsultas(String criterio, ArrayList<Consulta> lista){
        ArrayList<Consulta> copia = new ArrayList<>();
        for (Consulta c : lista) {
            if (c.getDoctor().getNombre().toLowerCase().matches("(.*)" + criterio.toLowerCase() + "(.*)") ||
                    c.getLugar().getLugar().toLowerCase().matches("(.*)" + criterio.toLowerCase() + "(.*)") ||
                    c.getPracticante().getNombre().toLowerCase().matches("(.*)" + criterio.toLowerCase() + "(.*)") ||
                    c.getPaciente().getNombre().toLowerCase().matches("(.*)" + criterio.toLowerCase() + "(.*)") ||
                    c.getPaciente().getPrimerApellido().toLowerCase().matches("(.*)" + criterio.toLowerCase() + "(.*)") ||
                    c.getPaciente().getSegundoApellido().toLowerCase().matches("(.*)" + criterio.toLowerCase() + "(.*)") ||
                    c.getPaciente().getCarne().toLowerCase().matches("(.*)" + criterio.toLowerCase() + "(.*)")) {
                copia.add(c);
            }            
        }
        return copia;
    }
    
}
