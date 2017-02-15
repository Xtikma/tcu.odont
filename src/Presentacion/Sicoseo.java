/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoDatos.ADPaciente;
import AccesoDatos.ConexionBD;
import Entidades.Paciente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Keylor
 */
public class Sicoseo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection csql = ConexionBD.conexion();
        Statement myStmt;
        try {
            Paciente paciente = new Paciente(5, "2000-01-25", "Pedro", "Suarez", "Piedra", "B45033", "Masculino", 5, 17, "", true, true);
            ADPaciente ad = new ADPaciente();
//            myStmt = csql.createStatement();
//            ResultSet myRs = myStmt.executeQuery("select * from doctor");
//            
//            while (myRs.next()) {
//            System.out.println(myRs.getString("Nombre"));
//        }
        } catch (Exception ex) {
            Logger.getLogger(Sicoseo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
//        ConexionBD cx = new ConexionBD();
//        Connection cnx = cx.conectar();
//        
//        if (cnx == null) {
//            JOptionPane.showMessageDialog(null, "Fallo");
//        }else{
//            JOptionPane.showMessageDialog(null, "Funciono");
//        }
        
    }
    
}
