/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

/**
 *
 * @author Alejandra
 */

import Entidades.LugarAtencion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ADLugarAtencion {
    
    private final Connection conexion = ConexionBD.conexion();
    
    public boolean insertarLugarAtencion( LugarAtencion lugar) {
        try {
            CallableStatement cs = conexion.prepareCall("{call insertar_lugar(?,?,?)}");
            cs.setString(1, lugar.getLugar());
            cs.setString(2, lugar.getDescripcion());
            cs.setBoolean(3, lugar.isEliminado());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }
    
     public boolean EliminarLugarAtencion(LugarAtencion lugar) {
        try {
            CallableStatement cs = conexion.prepareCall("{call eliminar_lugar(?)}");
            cs.setInt(1, lugar.getIdLugarAtencion());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }
     
       
     public boolean ModificarLugarAtencion(LugarAtencion lugar) {
        try {
            CallableStatement cs = conexion.prepareCall("{call modificar_lugar(?,?,?,?)}");
            cs.setInt(1, lugar.getIdLugarAtencion());
            cs.setString(2,lugar.getLugar());
            cs.setString(3,lugar.getDescripcion());
            cs.setBoolean(4, lugar.isEliminado());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }
     
}
