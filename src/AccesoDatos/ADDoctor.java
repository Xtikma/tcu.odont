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
import java.sql.SQLException;

public class ADDoctor {

    private final Connection conexion = ConexionBD.conexion();

    public void insertarDoctor(Doctor doctor) {
        try {
            CallableStatement cc = conexion.prepareCall("{call insertar_doctor(?,?)}");
            cc.setString(1, doctor.getNombre());
            cc.setBoolean(2, doctor.isEliminado());
            cc.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
     public void EliminarDoctor(Doctor doctor) {
        try {
            CallableStatement cc = conexion.prepareCall("{call eliminar_doctor(?)}");
            cc.setInt(1, doctor.getIdDoctor());
            cc.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
     
     public void ModificarDoctor(Doctor doctor) {
        try {
            CallableStatement cc = conexion.prepareCall("{call modificar_doctor(?,?,?)}");
            cc.setInt(1, doctor.getIdDoctor());
            cc.setString(2,doctor.getNombre());
            cc.setBoolean(3, doctor.isEliminado());
            cc.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    

}
