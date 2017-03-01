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
import Entidades.ProcedimientoConsulta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class ADConsulta {
    
    private final Connection conexion = ConexionBD.conexion();
    
    public void  listarConsultas(JTable TdConsultas,String desde,String hasta){
          try {
            ResultSet rsConsultas = null;
            DefaultTableModel modelo = (DefaultTableModel) TdConsultas.getModel();
            
            int a = modelo.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
           
              CallableStatement cs = conexion.prepareCall("{call obtener_consultas_por_periodo(?,?)}");
              cs.setString(1, desde);
              cs.setString(2, hasta);
              rsConsultas = cs.executeQuery();

           
            while (rsConsultas.next()) {
                try {
                   
                    modelo.addRow(new Object[]{rsConsultas.getDate(1),rsConsultas.getString(3),rsConsultas.getString(6) ,rsConsultas.getString(8),
                        rsConsultas.getString(10),rsConsultas.getString(12),rsConsultas.getDouble(2)});
                } catch (SQLException ex) {
                    System.out.println("Mensaje de Error"); 
                }
            }
            TdConsultas.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
    }
    
    
    
//        private ArrayList<Consulta> cargarConsultas(String desde,String hasta ){
//        ArrayList<Consulta> lista = new ArrayList<Consulta>();
//        Consulta temp;
//        try {
//            ResultSet rsConsultas = null;
//            CallableStatement cs = conexion.prepareCall("call obtener_consultas_por_periodo(?,?)");
//              cs.setString(1, desde);
//              cs.setString(2, hasta);
//            rsConsultas = cs.executeQuery();
//            
//            while (rsConsultas.next()) {
//                try {
//                    temp = new Consulta(rsConsultas.getDate(1),rsConsultas.getString(3),rsConsultas.getString(6) ,rsConsultas.getString(8),
//                        rsConsultas.getString(10),rsConsultas.getString(12),rsConsultas.getDouble(2));
//                    lista.add(temp);
//                } catch (SQLException ex) {
//                    System.out.println("Ubicación: cargarConsultas.while " + ex.getMessage());
//                    throw ex;
//                }                
//            }
//            return lista;
//        } catch (Exception e){            
//            System.out.println("Ubicación: cargarProcedimientos " + e.getMessage());
//            return lista;
//        }
    
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
            cc.setString(1, c.getFechaConsulta().toString());
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
            return false;
        }
        if (agregado == detalles.size()) {
            return true;
        } else {
            return false;
        }
    }
    
    // </editor-fold>
    
}
