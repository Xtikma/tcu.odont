/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sicoseo;

import AccesoDatos.ConexionBD;
import java.sql.Connection;
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
        ConexionBD cx = new ConexionBD();
        Connection cnx = cx.conectar();
        
        if (cnx == null) {
            JOptionPane.showMessageDialog(null, "Fallo");
        }else{
            JOptionPane.showMessageDialog(null, "Funciono");
        }
        
    }
    
}
