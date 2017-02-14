/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Entidades.Categoria;
import Entidades.Procedimiento;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Keylor
 */
public class ADCategoria {
    
    private final Connection conexion = ConexionBD.conexion();
    
   // <editor-fold desc="Metodos para categoria">
    
    /***
     * Ingresa una entidad categoria a la base de de datos
     * @param cat objeto categoria
     */
    public void insertarCategoria(Categoria cat){
        ResultSet rs = null;
        
        try {
            CallableStatement cc = conexion.prepareCall("call insertar_categoria(?)");
            cc.setString(1, cat.getNombre());
            cc.executeUpdate();
            
            int index = 0;
            if (!cat.getProcedimientos().isEmpty()) {
                cc = conexion.prepareCall("call obtener_ultima_categoria()");
                rs = cc.executeQuery();
                rs.first();
                index = rs.getInt(1);
                insertarProcedimientos(cat.getProcedimientos(), index);
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void actualizarCategoria(Categoria cat){
        try {
            CallableStatement cs = conexion.prepareCall("call actualizar_categoria(?,?)");
            cs.setString(1, cat.getNombre());
            cs.setInt(2, cat.getId());            
            cs.executeUpdate();
            
            
            if (!cat.getProcedimientos().isEmpty()) {
                actualizarProcedimientos(cat.getProcedimientos(), cat.getId());
            }
        } catch (SQLException e) {
        }
    }
    //Editarlo -.-
    public JTable obtenerCategorias(JTable tblCategorias){
        try {
            ResultSet rsCategorias = null;
           
            DefaultTableModel model = (DefaultTableModel) tblCategorias.getModel();
            int a = model.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                model.removeRow(i);
            }
            
            CallableStatement cs = conexion.prepareCall("call obtener_categorias()");
            rsCategorias = cs.executeQuery();
            while (rsCategorias.next()) {
                try {
                    model.addRow(new Object[]{rsCategorias.getString(1), rsCategorias.getString(2)});
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage()); //Poner mensaje de error real
                }
            }
            tblCategorias.setModel(model);
            conexion.close();
            return tblCategorias;  
        } catch (SQLException e) {
            return null;
        }
    }
    
    //</editor-fold>
    
    // <editor-fold desc="Metodos especificos para procedimientos">
    private void insertarProcedimientos(ArrayList<Procedimiento> procedimientos, int index){
        try {
            CallableStatement cc = conexion.prepareCall("call insertar_procedimiento(?,?,?)");
            for (Procedimiento procedimiento : procedimientos) {
                cc.setString(1, procedimiento.getNombre());
                cc.setDouble(2, procedimiento.getPrecio());
                cc.setInt(3, index);
                cc.executeUpdate();
            }
        } catch (SQLException e) {
        }   
    }
    
    private void actualizarProcedimientos(ArrayList<Procedimiento> procedimientos, int index){
        try {
            CallableStatement cs;
            String sqlInsert = "call insertar_procedimiento(?,?,?)";
            String sqlUpdate = "call actualizar_procedimiento(?,?,?)";
            
            for (Procedimiento procedimiento : procedimientos) {
                if (procedimiento.getId() != 0) {
                    cs = conexion.prepareCall(sqlUpdate);
                    cs.setString(1, procedimiento.getNombre());
                    cs.setDouble(3, procedimiento.getPrecio());
                    cs.setInt(3, procedimiento.getId());
                    cs.executeUpdate();
                }else{
                    cs = conexion.prepareCall(sqlInsert);
                    cs.setString(1, procedimiento.getNombre());
                    cs.setDouble(3, procedimiento.getPrecio());
                    cs.setInt(3, index);
                    cs.executeUpdate();
                }
            }            
        } catch (SQLException e) {
            
        }
    }
    
    public void eliminarProcedimiento(int id){
        
    }
    
    public void moverProcedimiento(int idProcedimiento, int idCategoria){
        try {
            CallableStatement cc = conexion.prepareCall("call mover_de_categoria(?,?)");
            cc.setInt(1, idProcedimiento);
            cc.setInt(2, idCategoria);
            cc.executeUpdate();
        } catch (SQLException e) {
        }
    }
    
    // </editor-fold>
    
}
