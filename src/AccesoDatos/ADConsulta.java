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
import Entidades.Consulta;
import Entidades.Doctor;
import Entidades.LugarAtencion;
import Entidades.Paciente;
import Entidades.Practicante;
import Entidades.ProcedimientoConsulta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class ADConsulta {
    
    private final Connection conexion = ConexionBD.conexion();    
    private SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

    public ArrayList<Consulta> listarConsultasArray(String desde, String hasta) {
        ArrayList<Consulta> lista = new ArrayList<Consulta>();
        Consulta temp;
        try {
            ResultSet rsConsultas = null;
            CallableStatement cs = conexion.prepareCall("call obtener_consultaPorPeriodo(?,?)");
            cs.setString(1, desde);
            cs.setString(2, hasta);
            rsConsultas = cs.executeQuery();

            while (rsConsultas.next()) {
                try {                    
                    Paciente pac = new Paciente();
                    pac.setId(rsConsultas.getInt(9));
                    String nombrecompleto = rsConsultas.getString(4);
                    String[] res = nombrecompleto.split(" ", 3);
                    pac.setNombre(res[0].toString().trim());
                    pac.setPrimerApellido(res[1].toString().trim());
                    pac.setSegundoApellido(res[2].toString().trim());
                    pac.setCarne(rsConsultas.getString(8));
                    pac.setValorIdentificacion(rsConsultas.getString(6));
                    pac.setEdad(rsConsultas.getInt(5));
                    pac.setBeca(rsConsultas.getInt(7)); 
                    
                    Practicante  pr = new Practicante(rsConsultas.getInt(13), rsConsultas.getString(12), true);
                    Doctor dr = new Doctor(rsConsultas.getInt(11), rsConsultas.getString(10), true);
                    LugarAtencion lug = new LugarAtencion(rsConsultas.getInt(15), rsConsultas.getString(14), true);
                    
                    temp = new Consulta(rsConsultas.getInt(1), rsConsultas.getDate(2),
                            rsConsultas.getDouble(3), pac, dr, pr, lug);
                    
                    lista.add(temp);
                } catch (SQLException ex) {
                    System.out.println("Ubicación: cargarConsultas.while " + ex.getMessage());
                    throw ex;
                }
            }
            return lista;
        } catch (Exception e) {
            System.out.println("Ubicación: cargarConsultas " + e.getMessage());
            return lista;
        }
    }
    
    // <editor-fold desc=" Metodos para almacenar una consulta nueva" >
    /**
     * Almacena la consulta, además invoca al metodo de guardarDetalles
     * @param c objeto consulta.
     * @return 
     */
    public boolean almacenarConsulta(Consulta c) {
        ResultSet rs;
        int index = 0;
        boolean sucefull = false;
        int agrego = 0;
        try {
            CallableStatement cc = conexion.prepareCall("{call insertar_consulta_encabezado(?,?,?,?,?,?)}");
            cc.setString(1, getFecha(c.getFechaConsulta()));
            cc.setDouble(2, c.getTotalConsulta());
            cc.setInt(3, c.getIdPaciente());
            cc.setInt(4, c.getIdDoctor());
            cc.setInt(5, c.getIdPracticante());
            cc.setInt(6, c.getIdLugar());
            agrego = cc.executeUpdate();

            if (c.getListaProcedimientos().size() > 0) {
                cc = conexion.prepareCall("call obtener_ultima_categoria()");
                rs = cc.executeQuery();
                rs.first();
                index = rs.getInt(1);

                sucefull = guardarDetalles(c.getListaProcedimientos(), index);

            }
        } catch (Exception e) {
            System.out.println("Ubicación: almacenarConsulta " + e.getMessage());
            return false;
        }
        if (sucefull == true && agrego > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Almacena uno a uno los ProcedimientosConsulta en la lista que posee la Consulta
     * @param detalles una lista de procedimientos consulta.
     * @param idConsulta la id de la consulta recien ingresada.
     * @return true si se agregaron todos los detalles de la consulta
     */
    private boolean guardarDetalles(ArrayList<ProcedimientoConsulta> detalles, int idConsulta) {
        int agregado = 0;
        try {
            CallableStatement cc = conexion.prepareCall("{call agregar_procedimiento_a_consulta(?,?,?,?)}");

            for (ProcedimientoConsulta detalle : detalles) {
                cc.setInt(1, idConsulta);
                cc.setInt(2, detalle.getIdProcedimiento());
                cc.setInt(3, detalle.getCantidad());
                cc.setDouble(4, detalle.getPrecioHistorico());
                int agrego = cc.executeUpdate();
                if (agrego > 0) {
                    agregado = agregado + 1;
                }
            }
        } catch (Exception e) {
            System.out.println("Ubicación: guardarDetalles " + e.getMessage());
            return false;
        }
        if (agregado == detalles.size()) {
            return true;
        } else {
            return false;
        }
    }
    
    // </editor-fold>
    
    /**
     * Transforma una objeto Date en una fecha formateada para la base de datos.
     * @param fecha puede ser una fecha a filtrar o una para insertar en la base
     * de datos.
     * @return un string con la fecha formateada
     */
    public String getFecha(Date fecha) {
        if (fecha != null) {
            return formato.format(fecha);
        } else {
            return null;
        }
    }
    
    private boolean limpiarDetallesConsulta(int idconsulta){
        int funciono = 0;
        try {
            CallableStatement cc = conexion.prepareCall("{call limpiar_detalles(?)}");
            cc.setInt(1, idconsulta);            
            funciono = cc.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Ubicación: almacenarConsulta " + e.getMessage());
            return false;
        }        
        if (funciono > 0) {
            return true;
        } else {
            return false;
        }
    }
}
