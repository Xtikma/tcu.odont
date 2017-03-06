package Presentacion;

/**
 *
 * @author doliv
 */
public class Periodo {
    
    
    
    public Periodo () {
        
    }
    
    //identificar la fecha y retornar la fecha de inicio del semestre y de final del semestre al que pertenece.
    public String[] identificarSemestre(String fecha) {//formato fecha yyyy-mm-dd
        String[] fechaDividida = fecha.split("-");
        String[] semestre = new String[2];
        int mes = Integer.parseInt(fechaDividida[1]);
        if (mes >= 3 && mes <= 6) {//Primer semestre de Marzo a Junio. Preguntar a doctora de cuando a cuando es el semestre
            semestre[0] = fechaDividida[0] + "-" + "03" + "-" + "01";
            semestre[1] = fechaDividida[0] + "-" + "06" + "-" + "30";
        } else if (mes >= 8 && mes <= 11) {//Segundo semestre de Agosto a Noviembre. Preguntar a doctora de cuando a cuando es el semestre
            semestre[0] = fechaDividida[0] + "-" + "08" + "-" + "01";
            semestre[1] = fechaDividida[0] + "-" + "11" + "-" + "30";
        } else {
            //ver que se hace con las fechas que no pertenecen a ningún semestre
        }
        return semestre;
    }
}
