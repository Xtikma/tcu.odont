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
import Entidades.Practicante;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ADPracticante {

    private final Connection conexion = ConexionBD.conexion();

    public boolean insertaPracticante(Practicante practicante) {
        try {
            CallableStatement cs = conexion.prepareCall("{call insertar_practicante(?,?)}");
            cs.setString(1, practicante.getNombre());
            cs.setBoolean(2, practicante.isEliminado());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }

    public boolean EliminarPracticante(Practicante practicante) {
        try {
            CallableStatement cs = conexion.prepareCall("{call eliminar_practicante(?)}");
            cs.setInt(1, practicante.getIdPracticante());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }

    public boolean ModificarPracticante(Practicante practicante) {
        try {
            CallableStatement cs = conexion.prepareCall("{call modificar_practicante(?,?,?)}");
            cs.setInt(1, practicante.getIdPracticante());
            cs.setString(2, practicante.getNombre());
            cs.setBoolean(3, practicante.isEliminado());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public void consultarPracticante(JTable tblPracticante, boolean estado) {
        try {
            ResultSet rsPracticantes = null;
            DefaultTableModel modelo = (DefaultTableModel) tblPracticante.getModel();
            
            int a = modelo.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
           
            CallableStatement cs = conexion.prepareCall("{call consultar_practicante(?)}");
            cs.setBoolean(1, estado);
            rsPracticantes = cs.executeQuery();

            String estado2 = "Activo";
            while (rsPracticantes.next()) {
                try {
                    if ((rsPracticantes.getBoolean(3))) {
                        estado2 = "Inactivo";
                    } else {
                        estado2 = "Activo";
                    }
                    modelo.addRow(new Object[]{rsPracticantes.getInt(1), rsPracticantes.getString(2), estado2});
                } catch (SQLException ex) {
                    System.out.println("Mensaje de Error"); 
                }
            }
            tblPracticante.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
