package Presentacion;

//<editor-fold defaultstate="collapsed" desc="Importaciones">
import AccesoDatos.ADPaciente;
import AccesoDatos.ADPoblacion;
import AccesoDatos.ADTipoIdentificacion;
import Entidades.Paciente;
import Entidades.Poblacion;
import Entidades.TipoIdentificacion;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
//</editor-fold>

public class ListarPacientes extends javax.swing.JPanel {

    //<editor-fold defaultstate="collapsed" desc="Declaración de variables">
    private boolean eliminado = false;
    private Menu menu = null;
    private VPaciente vPaciente = null;
    private ADPaciente adPaciente = null;
    private List<Paciente> pacientes = null;
    //</editor-fold>
    
    /**
     * Creates new form PanelListarPacientes
     * @param menu el menu de donde se llamó este panel
     */
    public ListarPacientes(Menu menu) {
        initComponents();
        this.menu = menu;
        consultarPacientesActivos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable() {
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        btnCargarEliminados = new javax.swing.JButton();
        btnAgregarConsulta = new javax.swing.JButton();
        btnAgregarPaciente = new javax.swing.JButton();
        btnModificarPaciente = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();
        btnVerExpediente = new javax.swing.JButton();
        cbPoblacion = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        setOpaque(false);

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        )
    );
    tblPacientes.getTableHeader().setReorderingAllowed(false);
    tblPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblPacientesMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tblPacientes);

    btnCargarEliminados.setText("Cargar Eliminados");
    btnCargarEliminados.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCargarEliminadosActionPerformed(evt);
        }
    });

    btnAgregarConsulta.setText("Agregar Consulta");

    btnAgregarPaciente.setText("Agregar Paciente");
    btnAgregarPaciente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAgregarPacienteActionPerformed(evt);
        }
    });

    btnModificarPaciente.setText("Modificar Paciente");
    btnModificarPaciente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnModificarPacienteActionPerformed(evt);
        }
    });

    btnDesactivar.setText("Eliminar");
    btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDesactivarActionPerformed(evt);
        }
    });

    btnVerExpediente.setText("Ver Expediente");

    cbPoblacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jRadioButton1.setText("Pimer Ingreso");

    jLabel1.setText("Buscar:");

    btnRegresar.setText("<< Regresar");
    btnRegresar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRegresarActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(cbPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jRadioButton1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(btnCargarEliminados, javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(btnRegresar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                    .addComponent(btnAgregarConsulta)
                    .addGap(18, 18, 18)
                    .addComponent(btnAgregarPaciente)
                    .addGap(18, 18, 18)
                    .addComponent(btnModificarPaciente)
                    .addGap(18, 18, 18)
                    .addComponent(btnDesactivar)
                    .addGap(18, 18, 18)
                    .addComponent(btnVerExpediente)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(btnCargarEliminados)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cbPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jRadioButton1)
                .addComponent(jLabel1)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnAgregarConsulta)
                .addComponent(btnAgregarPaciente)
                .addComponent(btnModificarPaciente)
                .addComponent(btnDesactivar)
                .addComponent(btnVerExpediente)
                .addComponent(btnRegresar))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    /** btnCargarEliminadosActionPerformed
     * Cambia el contenido de la tabla con los pacientes eliminados o activos
     * @param evt evento
     */
    private void btnCargarEliminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarEliminadosActionPerformed
        if (eliminado) {
                    consultarPacientesActivos();
                    btnCargarEliminados.setText("Cargar Eliminados");
                    eliminado = false;
                    btnDesactivar.setText("Eliminar");
                } else {
                    consultarPacientesEliminados();
                    btnCargarEliminados.setText("Cargar Activos");
                    eliminado = true;
                    btnDesactivar.setText("Reactivar");
                }
    }//GEN-LAST:event_btnCargarEliminadosActionPerformed

    /** btnRegresarActionPerformed
     * Regresa al menú principal
     * @param evt evento
     */
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        menu.intercambiarPaneles(0);
    }//GEN-LAST:event_btnRegresarActionPerformed

    /** btnAgregarPacienteActionPerformed
     * Llama a la ventana para agregar un paciente nuevo
     * @param evt evento
     */
    private void btnAgregarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPacienteActionPerformed
        ADTipoIdentificacion adTipoId = new ADTipoIdentificacion();
        List<TipoIdentificacion> listaTipoId = adTipoId.ConsultarTipoIdentificacion();
        ADPoblacion adPoblacion = new ADPoblacion();
        List<Poblacion> listaPoblacion = adPoblacion.ConsultarPoblacion();
        
        if (listaTipoId.isEmpty() || listaPoblacion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una población y un tipo de identificación primero.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            vPaciente = new VPaciente(menu, true);
            vPaciente.setVisible(true);
            consultarPacientesActivos();
        }
    }//GEN-LAST:event_btnAgregarPacienteActionPerformed

    /** btnModificarPacienteActionPerformed
     * Llama a la ventana para modificar un paciente seleccionado en la tabla
     * @param evt evento
     */
    private void btnModificarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPacienteActionPerformed
        int indiceFila = tblPacientes.getSelectedRow();
        if (indiceFila == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un paciente.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            String texto = (tblPacientes.getValueAt(indiceFila, 0)).toString().trim();
            int id = Integer.parseInt(texto);
            vPaciente = new VPaciente(menu, true, id, true);
            vPaciente.setVisible(true);
        }
    }//GEN-LAST:event_btnModificarPacienteActionPerformed

    /** tblPacientesMouseClicked
     * Carga la información del paciente seleccionado en una ventana emergente
     * @param evt evento
     */
    private void tblPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPacientesMouseClicked
        int indiceFila = tblPacientes.getSelectedRow();
        if (evt.getClickCount() == 2 && indiceFila >= 0) {
            String texto = (tblPacientes.getValueAt(indiceFila, 0)).toString().trim();
            int id = Integer.parseInt(texto);
            vPaciente = new VPaciente(menu, true, id, false);
            vPaciente.setVisible(true);
        }
    }//GEN-LAST:event_tblPacientesMouseClicked

    /** btnDesactivarActionPerformed
     * Cambia el estado del paciente según su estado actual (Eliminado o Activo)
     * @param evt evento
     */
    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed
        int indiceFila = tblPacientes.getSelectedRow();
        if (indiceFila == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un paciente.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            String texto = (tblPacientes.getValueAt(indiceFila, 0)).toString().trim();
            int id = Integer.parseInt(texto);
            adPaciente = new ADPaciente();
            for (Paciente paciente : pacientes) {
                if (paciente.getId() == id) {
                    adPaciente.ActivarDesactivarPaciente(id, !(paciente.getEliminado()));
                }
            }
            if (eliminado) {
                consultarPacientesEliminados();
            } else {
                consultarPacientesActivos();
            }
        }
    }//GEN-LAST:event_btnDesactivarActionPerformed

    //<editor-fold defaultstate="collapsed" desc="Mis métodos">
    
    /** consultarPacientesActivos
     * Carga la tabla con los pacientes activos
     */
    private void consultarPacientesActivos() {
        try {
            ADPaciente bd = new ADPaciente();
            pacientes = bd.ConsultarPacientesActivos();
            tblPacientes.setModel(new DefaultTableModel());
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Código");
            model.addColumn("Nombre");
            model.addColumn("P. Apellido");
            model.addColumn("Edad");
            model.addColumn("Identificación");
            model.addColumn("Carné");

            String[] fila = new String[6];
            for (Paciente paciente : pacientes) {
                    fila[0] = paciente.getId() + "";
                    fila[1] = paciente.getNombre();
                    fila[2] = paciente.getPrimerApellido();
                    fila[3] = paciente.getEdad() + "";
                    fila[4] = paciente.getValorIdentificacion()+ "";
                    fila[5] = paciente.getCarne() + "";
                    model.addRow(fila);
            }
            tblPacientes.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ConsultarPacientesActivos en ListarPacientes", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        centrarColumans();
        cambiarTitulo("Lista de Pacientes Activos");
    }
    
    /** consultarPacientesEliminados
     * Carga la tabla con los pacientes activos
     */
    private void consultarPacientesEliminados() {
        try {
            ADPaciente bd = new ADPaciente();
            pacientes = bd.ConsultarPacientesEliminados();
            tblPacientes.setModel(new DefaultTableModel());
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Código");
            model.addColumn("Nombre");
            model.addColumn("P. Apellido");
            model.addColumn("Edad");
            model.addColumn("Identificación");
            model.addColumn("Carné");

            String[] fila = new String[6];
            for (Paciente paciente : pacientes) {
                    fila[0] = paciente.getId() + "";
                    fila[1] = paciente.getNombre();
                    fila[2] = paciente.getPrimerApellido();
                    fila[3] = paciente.getEdad() + "";
                    fila[4] = paciente.getValorIdentificacion()+ "";
                    fila[5] = paciente.getCarne() + "";
                    model.addRow(fila);
            }
            tblPacientes.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen consultarPacientesEliminados en ListarPacientes", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        centrarColumans();
        cambiarTitulo("Lista de Pacientes Eliminados");
    }
    
    /** centrarColumnas
     * Centra el contenido de las celdas en la tabla
     */
    private void centrarColumans() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tblPacientes.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblPacientes.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblPacientes.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tblPacientes.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tblPacientes.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        tblPacientes.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
    }
    
    /** cambiarTitulo
     * Cambia el título del panel
     * @param titulo nuevo título a mostrar
     */
    private void cambiarTitulo(String titulo) {
        TitledBorder border = null;
        border = BorderFactory.createTitledBorder(titulo);
        border.setTitleFont(new Font("Dialog", Font.BOLD, 14));
        this.setBorder(border);
    }
    
    //</editor-fold>
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarConsulta;
    private javax.swing.JButton btnAgregarPaciente;
    private javax.swing.JButton btnCargarEliminados;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JButton btnModificarPaciente;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerExpediente;
    private javax.swing.JComboBox<String> cbPoblacion;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPacientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}