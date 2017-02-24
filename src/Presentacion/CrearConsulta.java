/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author Keylor
 */

public class CrearConsulta extends javax.swing.JPanel{

    //Variables para proteger modificación de Chooser
    private boolean consume = false;
    
    /**
     * Creates new form CrearConsulta
     */
    public CrearConsulta() {
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        panelEncabezado = new javax.swing.JPanel();
        lblPaciente = new javax.swing.JLabel();
        btnPaciente = new javax.swing.JButton();
        lblDoctor = new javax.swing.JLabel();
        btnDoctor = new javax.swing.JButton();
        lblPracticante = new javax.swing.JLabel();
        btnPracticante = new javax.swing.JButton();
        lblPaciente1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblFecha = new javax.swing.JLabel();
        fechaConsulta = new com.toedter.calendar.JDateChooser();
        panelProcedimientos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProcedimientos = new javax.swing.JTable();
        panelDetalle = new javax.swing.JPanel();
        lblProcedimiento = new javax.swing.JLabel();
        btnProcedimiento = new javax.swing.JButton();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1000, 500));
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setOpaque(false);

        panelEncabezado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encabezado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        panelEncabezado.setOpaque(false);

        lblPaciente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPaciente.setText("Paciente");

        btnPaciente.setBackground(new java.awt.Color(255, 255, 255));
        btnPaciente.setForeground(new java.awt.Color(0, 0, 0));
        btnPaciente.setText("Seleccionar");
        btnPaciente.setMaximumSize(new java.awt.Dimension(200, 30));
        btnPaciente.setMinimumSize(new java.awt.Dimension(200, 30));
        btnPaciente.setPreferredSize(new java.awt.Dimension(200, 30));
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });

        lblDoctor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDoctor.setText("Doctor");

        btnDoctor.setBackground(new java.awt.Color(255, 255, 255));
        btnDoctor.setForeground(new java.awt.Color(0, 0, 0));
        btnDoctor.setText("Seleccionar");
        btnDoctor.setMaximumSize(new java.awt.Dimension(200, 30));
        btnDoctor.setMinimumSize(new java.awt.Dimension(200, 30));
        btnDoctor.setPreferredSize(new java.awt.Dimension(200, 30));

        lblPracticante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPracticante.setText("Practicante");

        btnPracticante.setBackground(new java.awt.Color(255, 255, 255));
        btnPracticante.setForeground(new java.awt.Color(0, 0, 0));
        btnPracticante.setText("Seleccionar");
        btnPracticante.setMaximumSize(new java.awt.Dimension(200, 30));
        btnPracticante.setMinimumSize(new java.awt.Dimension(200, 30));
        btnPracticante.setPreferredSize(new java.awt.Dimension(200, 30));

        lblPaciente1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPaciente1.setText("Lugar");

        jComboBox1.setMaximumSize(new java.awt.Dimension(200, 30));
        jComboBox1.setMinimumSize(new java.awt.Dimension(200, 30));
        jComboBox1.setPreferredSize(new java.awt.Dimension(200, 30));

        lblFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFecha.setText("Fecha");

        fechaConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechaConsultaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addComponent(lblPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblPracticante)
                        .addGap(6, 6, 6)
                        .addComponent(btnPracticante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addComponent(lblDoctor)
                        .addGap(6, 6, 6)
                        .addComponent(btnDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(lblPaciente1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(lblFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPracticante)
                            .addComponent(btnPracticante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPaciente)
                            .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblFecha)
                        .addComponent(fechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblDoctor))
                    .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPaciente1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelProcedimientos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procedimientos en consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        panelProcedimientos.setOpaque(false);

        tblProcedimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProcedimientos);

        javax.swing.GroupLayout panelProcedimientosLayout = new javax.swing.GroupLayout(panelProcedimientos);
        panelProcedimientos.setLayout(panelProcedimientosLayout);
        panelProcedimientosLayout.setHorizontalGroup(
            panelProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcedimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelProcedimientosLayout.setVerticalGroup(
            panelProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcedimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de consulta", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        panelDetalle.setOpaque(false);

        lblProcedimiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblProcedimiento.setText("Agregar procedimiento:");

        btnProcedimiento.setBackground(new java.awt.Color(255, 255, 255));
        btnProcedimiento.setForeground(new java.awt.Color(0, 0, 0));
        btnProcedimiento.setText("Seleccionar");
        btnProcedimiento.setMaximumSize(new java.awt.Dimension(200, 30));
        btnProcedimiento.setMinimumSize(new java.awt.Dimension(200, 30));
        btnProcedimiento.setPreferredSize(new java.awt.Dimension(200, 30));

        lblCantidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCantidad.setText("Cantidad:");

        txtCantidad.setToolTipText("Ingrese el número de procedimientos realizado");

        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCantidad)
                            .addComponent(lblProcedimiento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProcedimiento))
                .addGap(14, 14, 14)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad))
                .addGap(18, 18, 18)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        btnGuardarCambios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardarCambios.setText("Guardar Cambios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProcedimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarCambios)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelProcedimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fechaConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaConsultaKeyTyped
        if (consume == false) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_fechaConsultaKeyTyped

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        VentanaBusqueda searchPaciente = new VentanaBusqueda(0, 0, this);
        searchPaciente.setLocationRelativeTo(this);
        searchPaciente.setVisible(true);        
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnPracticante;
    private javax.swing.JButton btnProcedimiento;
    private com.toedter.calendar.JDateChooser fechaConsulta;
    private javax.swing.JComboBox<String> jComboBox1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblPaciente1;
    private javax.swing.JLabel lblPracticante;
    private javax.swing.JLabel lblProcedimiento;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelProcedimientos;
    private javax.swing.JTable tblProcedimientos;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
