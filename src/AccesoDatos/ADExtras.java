/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import com.mysql.jdbc.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 *
 * @author Keylor
 */
public class ADExtras {
    private String Clase = "AccesoDatos.ADExtras";
    Connection conexion = ConexionBD.conexion();
    
    /**
     * Cambia el valor de primer ingreso, este metodo deberia usarse al finalizar 
     * o iniciar un año lectivo
     * @throws SQLException 
     */
    public void LimpiarPrimerIngreso() throws SQLException{
        try {
            CallableStatement cc = conexion.prepareCall("CALL desactivar_nuevoIngreso();");
            cc.executeUpdate();
        } catch (SQLException e) {
            Herramientas.InformeErrores.getInforme().escribirError(e, Clase, "LimpiarPrimerIngreso");
            throw e;
        }
    }
    /**
     * Actualiza las edades de los pacientes que poseen ingresados una fecha de
     * naciemiento, se obvia a los que no la poseean
     * @throws SQLException 
     */
    public void ActualizarEdades() throws SQLException{
        try {
            CallableStatement cc = conexion.prepareCall("CALL actualizar_edad();");
            cc.executeUpdate();
        } catch (SQLException e) {
            Herramientas.InformeErrores.getInforme().escribirError(e, Clase, "ActualizarEdades");
            throw e;
        }
    }
    
}
