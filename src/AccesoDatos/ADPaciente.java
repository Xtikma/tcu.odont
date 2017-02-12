
package AccesoDatos;

import Entidades.Paciente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ADPaciente {
    
    private final Connection conexion = ConexionBD.conexion();
    
    public boolean InsertarPaciente(Paciente paciente) {
        try {
            CallableStatement cs = conexion.prepareCall("{call insertar_paciente(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, paciente.getFechaNacimiento());
            cs.setInt(2, paciente.getEdad());
            cs.setString(3, paciente.getNombre());
            cs.setString(4, paciente.getPrimerApellido());
            cs.setString(5, paciente.getSegundoApellido());
            cs.setString(6, paciente.getValorIdentificacion());
            cs.setString(7, paciente.getGenero());
            cs.setInt(8, paciente.getBeca());
            cs.setString(9, paciente.getCarne());
            cs.setBoolean(10, paciente.getPrimerIngreso());
            cs.setBoolean(11, paciente.getEliminado());
            cs.setInt(12, 0); //IdPoblacion
            cs.setInt(13, 0); //IdTipoIndentificacion
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString()); //Poner mensaje de error real
        }
        return false;
    }
    
    public boolean ModificarPaciente(Paciente paciente) {
        try {
            CallableStatement cs = conexion.prepareCall("{call modificar_paciente(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, paciente.getId());
            cs.setString(2, paciente.getFechaNacimiento());
            cs.setInt(3, paciente.getEdad());
            cs.setString(4, paciente.getNombre());
            cs.setString(5, paciente.getPrimerApellido());
            cs.setString(6, paciente.getSegundoApellido());
            cs.setString(7, paciente.getValorIdentificacion());
            cs.setString(8, paciente.getGenero());
            cs.setInt(9, paciente.getBeca());
            cs.setString(10, paciente.getCarne());
            cs.setBoolean(11, paciente.getPrimerIngreso());
            cs.setBoolean(12, paciente.getEliminado());
            cs.setInt(13, 6); //IdPoblacion
            cs.setInt(14, 2); //IdTipoIndentificacion
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString()); //Poner mensaje de error real
        }
        return false;
    }
    
    public boolean ActivarDesactivarPaciente(Paciente paciente) {
        try {
            CallableStatement cs = conexion.prepareCall("{call activar_desactivar_paciente(?,?)}");
            cs.setInt(1, paciente.getId());
            cs.setBoolean(2, paciente.getEliminado());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString()); //Poner mensaje de error real
        }
        return false;
    }
    
    public void ConsultarTodosPacientes(JTable tblPacientes) {
        try {
            ResultSet rsPacientes = null;
            
            DefaultTableModel model = (DefaultTableModel) tblPacientes.getModel();
            int a = model.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                model.removeRow(i);
            }
            CallableStatement cs = conexion.prepareCall("{call consultar_pacientes()}");
            rsPacientes = cs.executeQuery();
            
            while (rsPacientes.next()) {
                try {
                    model.addRow(new Object[]{rsPacientes.getString(1), rsPacientes.getString(2), rsPacientes.getString(3), rsPacientes.getString(4),
                        rsPacientes.getInt(5), rsPacientes.getString(6), rsPacientes.getString(7),rsPacientes.getInt(8),rsPacientes.getString(9),
                        rsPacientes.getBoolean(10), rsPacientes.getBoolean(11), rsPacientes.getString(12), rsPacientes.getString(13), rsPacientes.getBoolean(14)});
                } catch (SQLException ex) {
                    System.out.println("Mensaje de Error"); //Poner mensaje de error real
                }
            }
            tblPacientes.setModel(model);
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString()); //Poner mensaje de error real
        }
    }
}