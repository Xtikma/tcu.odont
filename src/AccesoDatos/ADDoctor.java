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
import Entidades.Doctor;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ADDoctor {

    private final Connection conexion = ConexionBD.conexion();

    public boolean insertarDoctor(Doctor doctor) {
        try {
            CallableStatement cs = conexion.prepareCall("{call insertar_doctor(?,?)}");
            cs.setString(1, doctor.getNombre());
            cs.setBoolean(2, doctor.isEliminado());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }

    public boolean EliminarDoctor(Doctor doctor) {
        try {
            CallableStatement cs = conexion.prepareCall("{call eliminar_doctor(?)}");
            cs.setInt(1, doctor.getIdDoctor());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }

    public boolean ModificarDoctor(Doctor doctor) {
        try {
            CallableStatement cs = conexion.prepareCall("{call modificar_doctor(?,?,?)}");
            cs.setInt(1, doctor.getIdDoctor());
            cs.setString(2, doctor.getNombre());
            cs.setBoolean(3, doctor.isEliminado());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }

    public void consultarDoctor(JTable TdDoctor) {

        try {
            ResultSet rsDoctores = null;
            DefaultTableModel modelo = (DefaultTableModel) TdDoctor.getModel();
            
            int a = modelo.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
           
            CallableStatement cs = conexion.prepareCall("{call consultar_doctores()}");
            rsDoctores = cs.executeQuery();

            while (rsDoctores.next()) {
                try {
                    modelo.addRow(new Object[]{rsDoctores.getInt(1), rsDoctores.getString(2), rsDoctores.getBoolean(3)});
                } catch (SQLException ex) {
                    System.out.println("Mensaje de Error"); 
                }
            }
            TdDoctor.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

}
