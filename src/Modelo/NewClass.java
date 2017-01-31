/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author doliv
 */
public class NewClass {
    
    private static Connection csql = ConexionBD.conexion();
    private static Statement myStmt = null;
    private static ResultSet myRs = null;
    
    public static void main(String[] args) throws SQLException {
        myStmt = csql.createStatement();
        myRs = myStmt.executeQuery("select * from doctor");
        
        while (myRs.next()) {
            System.out.println(myRs.getString("Nombre"));
        }
    }
}
