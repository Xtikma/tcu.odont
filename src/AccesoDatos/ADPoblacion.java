
package AccesoDatos;

import Entidades.Poblacion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ADPoblacion {
    
    private final Connection conexion = ConexionBD.conexion();
    
    public void InsertarPoblacion(Poblacion poblacion) {
        try {
            CallableStatement cs = conexion.prepareCall("{call insertar_poblacion(?,?,?)}");
            cs.setString(1, poblacion.getNombre());
            cs.setString(2, poblacion.getInstitucion());
            cs.setBoolean(3, poblacion.getBecado());
            cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void ModificarPoblacion(Poblacion poblacion) {
        try {
            CallableStatement cs = conexion.prepareCall("{call modificar_poblacion(?,?,?,?)}");
            cs.setInt(1, poblacion.getId());
            cs.setString(2, poblacion.getNombre());
            cs.setString(3, poblacion.getInstitucion());
            cs.setBoolean(4, poblacion.getBecado());
            cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void EliminarPoblacion(Poblacion poblacion) {
        try {
            CallableStatement cs = conexion.prepareCall("{call eliminar_poblacion(?)}");
            cs.setInt(1, poblacion.getId());
            cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    // No es necesario porque en consultar paciente sale la información
//    public void ConsultarPoblacion(JTable tblPoblacion) {
//        try {
//            ResultSet rsPoblacion;
//            
//            DefaultTableModel model = (DefaultTableModel) tblPoblacion.getModel();
//            int a = model.getRowCount() - 1;
//            for (int i = a; i >= 0; i--) {
//                model.removeRow(i);
//            }
//            CallableStatement cs = conexion.prepareCall("{call consultar_poblacion()}");
//            rsPoblacion = cs.executeQuery();
//            
//            while (rsPoblacion.next()) {
//                try {
//                    model.addRow(new Object[]{rsPoblacion.getString(1), rsPoblacion.getString(2), rsPoblacion.getString(3), rsPoblacion.getString(4)});
//                } catch (SQLException ex) {
//                    System.out.println("Mensaje de Error"); //Poner mensaje de error real
//                }
//            }
//            tblPoblacion.setModel(model);
//            conexion.close();
//        } catch (SQLException ex) {
//            System.out.println(ex.toString()); //Poner mensaje de error real
//        }
//    }
}