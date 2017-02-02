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
    
    public void insertarLugarAtencion( LugarAtencion lugar) {
        try {
            CallableStatement cc = conexion.prepareCall("{call insertar_lugar(?,?,?)}");
            cc.setString(1, lugar.getLugar());
            cc.setString(2, lugar.getDescripcion());
            cc.setBoolean(3, lugar.isEliminado());
            cc.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
     public void EliminarLugarAtencion(LugarAtencion lugar) {
        try {
            CallableStatement cc = conexion.prepareCall("{call eliminar_lugar(?)}");
            cc.setInt(1, lugar.getIdLugarAtencion());
            cc.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
     
       
     public void ModificarLugarAtencion(LugarAtencion lugar) {
        try {
            CallableStatement cc = conexion.prepareCall("{call modificar_lugar(?,?,?,?)}");
            cc.setInt(1, lugar.getIdLugarAtencion());
            cc.setString(2,lugar.getLugar());
             cc.setString(3,lugar.getDescripcion());
            cc.setBoolean(4, lugar.isEliminado());
            cc.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
     
}
