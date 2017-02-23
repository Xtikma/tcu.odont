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
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ADLugarAtencion {
    
    private final Connection conexion = ConexionBD.conexion();
    
    public boolean insertarLugarAtencion( LugarAtencion lugar) {
        try {
            CallableStatement cs = conexion.prepareCall("{call insertar_lugar(?)}");
            cs.setString(1, lugar.getLugar());
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
            CallableStatement cs = conexion.prepareCall("{call modificar_lugar(?,?,?)}");
            cs.setInt(1, lugar.getIdLugarAtencion());
            cs.setString(2,lugar.getLugar());
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
     
     public void ConsultarLugaresAtención(JTable tblLugar, boolean estado) {
         try {
            ResultSet rsLugar = null;
            DefaultTableModel modelo = (DefaultTableModel) tblLugar.getModel();
            
            int a = modelo.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
           
            CallableStatement cs = conexion.prepareCall("{call consultar_lugar(?)}");
            cs.setBoolean(1, estado);
            rsLugar = cs.executeQuery();

            String estado2 = "Activo";
            while (rsLugar.next()) {
                try {
                    if ((rsLugar.getBoolean(3))) {
                        estado2 = "Inactivo";
                    } else {
                        estado2 = "Activo";
                    }
                    modelo.addRow(new Object[]{rsLugar.getInt(1), rsLugar.getString(2), estado2});
                } catch (SQLException ex) {
                    System.out.println("Mensaje de Error"); 
                }
            }
            tblLugar.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
     }
}
