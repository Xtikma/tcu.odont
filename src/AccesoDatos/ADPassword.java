/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alejandra
 */
public class ADPassword {

    private final Connection conexion = ConexionBD.conexion();

    public ArrayList<String> obtenerPassword() {
        ArrayList<String> lista = new ArrayList<String>();
        String temp;
        try {
            ResultSet rs = null;
            CallableStatement cc = conexion.prepareCall("call Consultar_Contrasena()");
            rs = cc.executeQuery();

            while (rs.next()) {
                try {
                    temp = rs.getString(2);
                    lista.add(temp);
                } catch (SQLException ex) {
                    System.out.println("Ubicación: Consultar_Contrasena.while " + ex.getMessage());
                    throw ex;
                }
            }
            return lista;
        } catch (Exception e) {
            System.out.println("Ubicación: Consultar_Contrasena " + e.getMessage());
            return lista;
        }
    }

}
