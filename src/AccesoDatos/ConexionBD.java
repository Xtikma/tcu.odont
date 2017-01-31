/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Keylor
 */
public class ConexionBD {
    Connection conexion = null;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/sicoseo", "root", "sicoseo");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Hola");
        }
        
        return conexion;
    }
}
