/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import java.io.*;
import java.util.Calendar;
/**
 *
 * @author Keylor
 */
public class InformeErrores {
    
    private static final InformeErrores INFORME = new InformeErrores();
    private static final String RUTA = "C:\\SicoseoLog\\informe_errores_"; 
    
    private InformeErrores(){
        String fecha =Calendar.getInstance().get(Calendar.YEAR)+
                "-"+Calendar.getInstance().get(Calendar.MONTH)+
                "-"+Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        String rutaCompleta = RUTA + fecha + ".txt";
        
        File f = new File(rutaCompleta);      
    }
    
    public InformeErrores getInformer(){
        return INFORME;
    }
    
    public void escribirError(String mensaje, Exception ex){
        
    }
}
