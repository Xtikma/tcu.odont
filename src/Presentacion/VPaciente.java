package Presentacion;

import AccesoDatos.ADPaciente;
import AccesoDatos.ADPoblacion;
import AccesoDatos.ADTipoIdentificacion;
import Entidades.Paciente;
import Entidades.Poblacion;
import Entidades.TipoIdentificacion;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import org.jvnet.substance.SubstanceLookAndFeel;

public class VPaciente extends javax.swing.JDialog {

    /**
     * Creates new form VPaciente
     */
    private ADPaciente adPaciente = new ADPaciente();
    private ADTipoIdentificacion adTipoId = new ADTipoIdentificacion();
    private ADPoblacion adPoblacion = new ADPoblacion();

    public VPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeBlue2007Skin");

        buttonGroup.add(RbMasculino);
        buttonGroup.add(RbFemenino);
        RbMasculino.setSelected(true);
        RbFemenino.setSelected(false);

        List<TipoIdentificacion> listaTipoId = adTipoId.ConsultarTipoIdentificacion();
        CbTipoId.setModel(new DefaultComboBoxModel(listaTipoId.toArray()));

        List<Poblacion> listaPoblacion = adPoblacion.ConsultarPoblacion();
        CbPoblacion.setModel(new DefaultComboBoxModel(listaPoblacion.toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        LblNombre = new javax.swing.JLabel();
        LblPApellido = new javax.swing.JLabel();
        LblSApellido = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtPApellido = new javax.swing.JTextField();
        TxtsApellido = new javax.swing.JTextField();
        CbTipoId = new javax.swing.JComboBox<>();
        TxtIdentificacion = new javax.swing.JTextField();
        RbFemenino = new javax.swing.JRadioButton();
        TxtFechaNacimiento = new javax.swing.JFormattedTextField();
        TxtEdad = new javax.swing.JTextField();
        CbPoblacion = new javax.swing.JComboBox<>();
        RbNoFecha = new javax.swing.JRadioButton();
        PanelEstudiante = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RdPrimerIngreso = new javax.swing.JRadioButton();
        TxtCarne = new javax.swing.JTextField();
        CbBeca = new javax.swing.JComboBox<>();
        BtnCancelar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        RbMasculino = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LblNombre.setText("Nombre:");

        LblPApellido.setText("Primer Apellido:");

        LblSApellido.setText("Segundo Apellido");

        jLabel4.setText("Tipo de Identificación:");

        jLabel5.setText("Identificación:");

        jLabel6.setText("Genero:");

        jLabel9.setText("Fecha de Nacimiento:");

        jLabel11.setText("Edad:");

        jLabel13.setText("Población:");

        CbTipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        RbFemenino.setText("Femenino");

        try {
            TxtFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtFechaNacimiento.setToolTipText("dd-mm-aaaa");

        CbPoblacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CbPoblacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbPoblacionItemStateChanged(evt);
            }
        });

        RbNoFecha.setText("No disponible");
        RbNoFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbNoFechaMouseClicked(evt);
            }
        });

        PanelEstudiante.setBackground(new java.awt.Color(235, 235, 235));
        PanelEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        PanelEstudiante.setOpaque(false);

        jLabel1.setText("Carné:");

        jLabel2.setText("Beca:");

        RdPrimerIngreso.setText("Primer Ingreso");

        CbBeca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        javax.swing.GroupLayout PanelEstudianteLayout = new javax.swing.GroupLayout(PanelEstudiante);
        PanelEstudiante.setLayout(PanelEstudianteLayout);
        PanelEstudianteLayout.setHorizontalGroup(
            PanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEstudianteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEstudianteLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(CbBeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEstudianteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TxtCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RdPrimerIngreso)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        PanelEstudianteLayout.setVerticalGroup(
            PanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEstudianteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtCarne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RdPrimerIngreso))
                .addGap(18, 18, 18)
                .addGroup(PanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CbBeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        RbMasculino.setText("Masculino");

        jLabel7.setText("Ej: 31-12-2017");

        jLabel3.setText("*");

        jLabel8.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(TxtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(157, 157, 157))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(RbMasculino)
                                    .addGap(18, 18, 18)
                                    .addComponent(RbFemenino))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(107, 107, 107))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LblPApellido)
                                        .addComponent(LblSApellido))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(TxtPApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel8))
                                        .addComponent(TxtsApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(99, 99, 99))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(LblNombre)
                                    .addGap(18, 18, 18)
                                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3)
                                    .addContainerGap()))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(CbPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(19, 19, 19)
                                        .addComponent(CbTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(RbNoFecha)))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PanelEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnGuardar)
                .addGap(18, 18, 18)
                .addComponent(BtnCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNombre)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPApellido)
                    .addComponent(TxtPApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSApellido)
                    .addComponent(TxtsApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CbTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RbFemenino)
                    .addComponent(RbMasculino))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TxtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RbNoFecha))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(CbPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PanelEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        if (validarRequeridos()) {
            String genero = "";
            if (RbFemenino.isSelected()) {
                genero = "Femenino";
            } else if (RbMasculino.isSelected()) {
                genero = "Masculino";
            } else {
                genero = "Desconocido";
            }
            Component[] datosPanel = PanelEstudiante.getComponents();
            int beca = 0;
            boolean primerIngreso = false;
            String carne = "";
            for (Component x : datosPanel) {
                if (x instanceof JComboBox) {
                    beca = ((JComboBox) x).getSelectedIndex();
                } else if (x instanceof JRadioButton) {
                    primerIngreso = ((JRadioButton) x).isSelected();
                } else if (x instanceof JTextField) {
                    carne = ((JTextField) x).getText();
                }
            }
            //Considerar espacios vacios
            int edad = 0;
            try {
                if (TxtEdad.getText().equals("") || TxtEdad.getText().equals(" ")) {
                    edad = 0;
                } else {
                    edad = Integer.parseInt(TxtEdad.getText());
                }
            } catch (NumberFormatException numEx) {
                TxtEdad.setText("");
                JOptionPane.showMessageDialog(null, "La edad debe ser ingresada con números", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String fecha = "";
            String texto = TxtFechaNacimiento.getText();
            if (RbNoFecha.isSelected()) {
                fecha = null;
            } else if (texto.matches("\\d\\d-\\d\\d-\\d\\d\\d\\d")) {
                String[] temp = texto.split("-");
                fecha = temp[2] + "-" + temp[1] + "-" + temp[0];
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar una fecha válida o seleccionar \"No disponible\"", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Paciente paciente = new Paciente(0, fecha, TxtNombre.getText(), TxtPApellido.getText(), TxtsApellido.getText(), TxtIdentificacion.getText(),
                    genero, beca, edad, TxtCarne.getText(), primerIngreso, false);

            int idPoblacion = ((Poblacion) CbPoblacion.getSelectedItem()).getId();
            int idTipoId = ((TipoIdentificacion) CbTipoId.getSelectedItem()).getId();

            if (adPaciente.InsertarPaciente(paciente, idPoblacion, idTipoId)) {
                JOptionPane.showMessageDialog(null, "Paciente Registrado con Éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Paciente no Registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Los espacios marcados (*) no deben estar vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void CbPoblacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbPoblacionItemStateChanged
        // TODO add your handling code here:
        String poblacion = ((Poblacion) CbPoblacion.getSelectedItem()).getNombre();
        if (poblacion.equals("Estudiante")) {
            PanelEstudiante.setVisible(true);
        } else {
            PanelEstudiante.setVisible(false);
        }
    }//GEN-LAST:event_CbPoblacionItemStateChanged

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void RbNoFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbNoFechaMouseClicked
        // TODO add your handling code here:
        if (RbNoFecha.isSelected()) {
            TxtFechaNacimiento.setEnabled(false);
        } else {
            TxtFechaNacimiento.setEnabled(true);
        }
    }//GEN-LAST:event_RbNoFechaMouseClicked

    //<editor-fold defaultstate="collapsed" desc="Mi Código">  
    private boolean validarRequeridos() {
        if (TxtNombre.getText().equals("") || TxtNombre.getText().equals(" ")) {
            TxtNombre.setText("");
            return false;
        }
        if (TxtPApellido.getText().equals("") || TxtPApellido.getText().equals(" ")) {
            TxtPApellido.setText("");
            return false;
        }
        return true;
    }

    //</editor-fold>
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VPaciente dialog = new VPaciente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JComboBox<String> CbBeca;
    private javax.swing.JComboBox<String> CbPoblacion;
    private javax.swing.JComboBox<String> CbTipoId;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblPApellido;
    private javax.swing.JLabel LblSApellido;
    private javax.swing.JPanel PanelEstudiante;
    private javax.swing.JRadioButton RbFemenino;
    private javax.swing.JRadioButton RbMasculino;
    private javax.swing.JRadioButton RbNoFecha;
    private javax.swing.JRadioButton RdPrimerIngreso;
    private javax.swing.JTextField TxtCarne;
    private javax.swing.JTextField TxtEdad;
    private javax.swing.JFormattedTextField TxtFechaNacimiento;
    private javax.swing.JTextField TxtIdentificacion;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtPApellido;
    private javax.swing.JTextField TxtsApellido;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}
