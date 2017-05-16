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
public class Informe_GPxP {

    private Paciente pac;
    private int total;
    private ArrayList<ProcedimientoConsulta> pcs;

    public Informe_GPxP() {
        pac = new Paciente();
        total = 0;
        pcs = new ArrayList<ProcedimientoConsulta>();
    }

    public Paciente getPac() {
        return pac;
    }

    public void setPac(Paciente pac) {
        this.pac = pac;
    }

    public int getTotal() {
        return total;
    }

    public ArrayList<ProcedimientoConsulta> getPcs() {
        return pcs;
    }

    public void addProcedimientos(ProcedimientoConsulta pc) {
        if (pcs != null) {
            boolean nuevo = true;
            for (int i = 0; i < pcs.size(); i++) {
                if (pc.getIdProcedimiento() == pcs.get(i).getIdProcedimiento()) {
                    int actual = pcs.get(i).getCantidad();
                    pcs.get(i).setCantidad(actual + pc.getCantidad());
                    nuevo = false;
                }
            }
            if (nuevo == true) {
                pcs.add(pc);
            }
        }
    }

}
