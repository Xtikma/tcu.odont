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
import javax.swing.JOptionPane;
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
    public ArrayList<Categoria> obtenerCategorias(){
        try {
            ResultSet rsCategorias = null;
            ArrayList<Categoria> lista = new ArrayList<Categoria>();
            ArrayList<Procedimiento> copia = new ArrayList<Procedimiento>();
            copia = cargarProcedimientos();
            Categoria temp;
            CallableStatement cs = conexion.prepareCall("call obtener_categorias()");
            rsCategorias = cs.executeQuery();            
            
            while (rsCategorias.next()) {
                try {
                    temp = new Categoria(rsCategorias.getInt(1), rsCategorias.getString(2));
                    lista.add(temp);
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage()); //Poner mensaje de error real
                }
            }
            for(int i = 0; i < lista.size(); i++){
                for (int j = 0; j < copia.size(); j++){
                    if (lista.get(i).getId() == copia.get(j).getIdCategoria()) {
                        lista.get(i).agregarProcedimiento(copia.get(j));
                    }
                }
            }            
            return lista; 
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
            System.err.println(">>" + e.getMessage());
        }
    }
    
    private ArrayList<Procedimiento> cargarProcedimientos(){
        ArrayList<Procedimiento> lista = new ArrayList<Procedimiento>();
        Procedimiento temp;
        try {
            ResultSet rs = null;
            CallableStatement cc = conexion.prepareCall("call obtener_procedimientos()");
            rs = cc.executeQuery();
            
            while (rs.next()) {
                try {
                    temp = new Procedimiento(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
                    lista.add(temp);
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage()); //Poner mensaje de error real
                }                
            }
            return lista;
        } catch (Exception e) {
            System.out.println("cayo acá"); //Poner mensaje de error real
            return lista;
        }
    }
    
    // </editor-fold>
    
}
