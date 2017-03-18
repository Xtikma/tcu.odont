/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import java.io.*;
import java.util.Calendar;
import javax.swing.JOptionPane;
/**
 *
 * @author Keylor
 */
public class InformeErrores {
    
    private static final InformeErrores INFORME = new InformeErrores();
    private static final String RUTA = "C:\\SicoseoLog\\informe_errores.txt"; 
    private File f;
        
    public void escribirError(Exception ex, String clase, String mensaje){
        try {
            f = new File(RUTA);
            FileWriter w = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            
            wr.append("--------------- " + Calendar.getInstance().get(Calendar.YEAR)
                    + "/" + Calendar.getInstance().get(Calendar.MONTH)
                    + "/" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
                    + " ---------------\r\n");
            wr.append("Mensaje de error: " + ex.getMessage() + "\r\n");
            wr.append("Más detalles: " + ex.toString()+ "\r\n");
            wr.append("Clase de origen: " + clase + "\r\n");
            wr.append("Metodo: " + mensaje + "\r\n");
            wr.append("===========================================+ \r\n");
            wr.append("\r\n");
            wr.append("\r\n");
            wr.close();
            bw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo", e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }              
    }
    
    private InformeErrores(){
        
    }
    
    public static InformeErrores getInforme(){
        return INFORME;
    }
}
