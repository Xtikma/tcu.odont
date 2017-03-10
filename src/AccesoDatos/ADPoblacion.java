package AccesoDatos;

//<editor-fold defaultstate="collapsed" desc="Importaciones">
import Entidades.Poblacion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//</editor-fold>

public class ADPoblacion {
    
    private final Connection conexion = ConexionBD.conexion();
    
     /** InsertarPoblacion
      * Inserta en la base de datos una nueva población
      * @param poblacion población a insertar
      * @return si se insertó o no
      */
    public boolean InsertarPoblacion(Poblacion poblacion) {
        try {
            CallableStatement cs = conexion.prepareCall("{call insertar_poblacion(?,?,?)}");
            cs.setString(1, poblacion.getNombre());
            cs.setString(2, poblacion.getInstitucion());
            cs.setBoolean(3, poblacion.getBecado());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen InsertarPoblacion en ADPoblacion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    /** ModificarPoblacion
     * Modifica una población ya existente en la base de datos
     * @param poblacion población a modificar con los datos nuevos
     * @return si se modificó o no
     */
    public boolean ModificarPoblacion(Poblacion poblacion) {
        try {
            CallableStatement cs = conexion.prepareCall("{call modificar_poblacion(?,?,?,?)}");
            cs.setInt(1, poblacion.getId());
            cs.setString(2, poblacion.getNombre());
            cs.setString(3, poblacion.getInstitucion());
            cs.setBoolean(4, poblacion.getBecado());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ModificarPoblacion en ADPoblacion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    /** EliminarPoblacion
     * Cambia el estado de una población a eliminada
     * @param poblacion la población a eliminar
     * @return si se eliminó o no
     */
    public boolean EliminarPoblacion(Poblacion poblacion) {
        try {
            CallableStatement cs = conexion.prepareCall("{call eliminar_poblacion(?)}");
            cs.setInt(1, poblacion.getId());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen EliminarPoblacion en ADPoblacion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    /** ConsultarPoblacion
     * Consulta todas las poblaciones existentes en la base de datos
     * @return una lista con las poblaciones
     */
    public List<Poblacion> ConsultarPoblacion() {
        try {
            ResultSet rsPoblacion = null;
            
            CallableStatement cs = conexion.prepareCall("{call consultar_poblacion()}");
            rsPoblacion = cs.executeQuery();
            List <Poblacion> listaPoblacion = new ArrayList();
            while (rsPoblacion.next()) {
                try {
                    listaPoblacion.add(new Poblacion(rsPoblacion.getInt(1), rsPoblacion.getString(2), rsPoblacion.getString(3), rsPoblacion.getBoolean(4)));
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ConsultarPoblacion en ADPoblacion", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            conexion.close();
            return listaPoblacion;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ConsultarPoblacion en ADPoblacion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    /** consultarPoblacion
     * Consulta todas las poblaciones existentes en la base de datos
     * @param tblPoblacion JTable donde se insertan las poblaciones consultadas
     */
    public void consultarPoblacion(JTable tblPoblacion) {
        try {
            ResultSet rsPoblacion = null;
            DefaultTableModel modelo = (DefaultTableModel) tblPoblacion.getModel();
            
            int a = modelo.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
           
            CallableStatement cs = conexion.prepareCall("{call consultar_poblacion()}");
            rsPoblacion = cs.executeQuery();

            String estado2 = "No";
            while (rsPoblacion.next()) {
                try {
                    if ((rsPoblacion.getBoolean(4) == true)) {
                        estado2 = "Si";
                    } else {
                        estado2 = "No";
                    }
                    modelo.addRow(new Object[]{rsPoblacion.getInt(1), rsPoblacion.getString(2), rsPoblacion.getString(3), estado2});
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ConsultarPoblacion(JTable) en ADPoblacion", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            tblPoblacion.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ConsultarPoblacion(JTable) en ADPoblacion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}