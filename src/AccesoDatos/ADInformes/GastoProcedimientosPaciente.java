/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos.ADInformes;

/**
 *
 * @author Keylor
 */
public class GastoProcedimientosPaciente {
    
    private String consultaPacientes = "select paciente.idPaciente, paciente.ValorIdentificacion, paciente.Carne, " +
            "concat(paciente.Nombre,\" \",paciente.PrimerApellido,\" \",paciente.SegundoApellido) as ncompl " +
            "from paciente where paciente.IdPoblacion ";
    private String consultaGasto = "select sum(pc.PrecioHistorico*pc.Cantidad) as total "
            + "from procedimientoxconsulta as pc inner join procedimiento " +
            " on procedimiento.idProcedimiento = pc.IdProcedimiento"
            + " inner join consulta ON pc.idConsulta = consulta.idConsulta " +
            "where ";
    
    // <editor-fold desc="Funciones para consultaPacientes">
    
    public void agregarPoblacion( int idPobl){
        consultaPacientes = consultaPacientes + "= " + idPobl + "";
    }
    
    public void agregarBeneficio (boolean beneficio){
        if (beneficio == true) {
            consultaPacientes = consultaPacientes + " AND paciente.Beca IN (4,5)";
        }else{
            consultaPacientes = consultaPacientes + " AND paciente.Beca IN (1,2,3)";
        }
    }    
    // </editor-fold>
    
    
    // <editor-fold desc="Funciones para consultaGasto">
    
    // </editor-fold>
}
