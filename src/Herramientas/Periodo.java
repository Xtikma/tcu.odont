package Herramientas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author doliv
 */
public class Periodo {
    
    private SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat formatoVista = new SimpleDateFormat("dd-MM-yyyy");
    
    public Periodo () {
        
    }
    
    //identificar la fecha y retornar la fecha de inicio del semestre y de final del semestre al que pertenece.
    public String[] identificarSemestre(String fecha) {//formato fecha yyyy-mm-dd
        String[] fechaDividida = fecha.split("-");
        String[] semestre = new String[2];
        int mes = Integer.parseInt(fechaDividida[1]);
        if (mes >= 1 && mes <= 6) {//Primer semestre de Marzo a Junio. Preguntar a doctora de cuando a cuando es el semestre
            semestre[0] = fechaDividida[0] + "-" + "01" + "-" + "01";
            semestre[1] = fechaDividida[0] + "-" + "06" + "-" + "30";
        } else if (mes >= 7 && mes <= 12) {//Segundo semestre de Agosto a Noviembre. Preguntar a doctora de cuando a cuando es el semestre
            semestre[0] = fechaDividida[0] + "-" + "07" + "-" + "01";
            semestre[1] = fechaDividida[0] + "-" + "12" + "-" + "31";
        } else {
            //ver que se hace con las fechas que no pertenecen a ningún semestre
        }
        return semestre;
    }
    /**
     * Formatea un Date a una cadena de texto para almacenarse en base de datos
     * o presentarla en interfaz grafica.
     * @param fecha el Date a formatear
     * @param modo la manera de imprimir que se requiere, modo 1 o 2
     * @return un formato yyyy-MM-dd con modo 1 y dd-MM-yyyy en modo 2
     */
    public String getFecha(Date fecha, int modo) {
        if (fecha != null) {
            if (modo == 1) {
                return formato.format(fecha);
            }else{
                return formatoVista.format(fecha);
            }            
        } else {
            return null;
        }
    }
}