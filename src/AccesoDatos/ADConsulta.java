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
    
    
    
}
