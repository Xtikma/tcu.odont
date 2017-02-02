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
import java.sql.SQLException;

public class ADPracticante {

    private final Connection conexion = ConexionBD.conexion();

    public void insertaPracticante(Practicante practicante) {
        try {
            CallableStatement cc = conexion.prepareCall("{call insertar_practicante(?,?)}");
            cc.setString(1, practicante.getNombre());
            cc.setBoolean(2, practicante.isEliminado());
            cc.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

    }

    public void EliminarPracticante(Practicante practicante) {
        try {
            CallableStatement cc = conexion.prepareCall("{call eliminar_practicante(?)}");
            cc.setInt(1, practicante.getIdPracticante());
            cc.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void ModificarPracticante(Practicante practicante) {
        try {
            CallableStatement cc = conexion.prepareCall("{call modificar_practicante(?,?,?)}");
            cc.setInt(1, practicante.getIdPracticante());
            cc.setString(2, practicante.getNombre());
            cc.setBoolean(3, practicante.isEliminado());
            cc.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

    }
}
