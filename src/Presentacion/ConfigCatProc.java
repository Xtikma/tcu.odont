/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoDatos.*;
/**
 *
 * @author Keylor
 */
public class ConfigCatProc extends javax.swing.JPanel {

    ADCategoria access = new ADCategoria();
    
    /**
     * Creates new form ConfigCatProc
     */
    public ConfigCatProc() {
        initComponents();
    }
    
    private void cargarCategorias(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCategoria = new javax.swing.JLabel();
        boxCategoria = new javax.swing.JComboBox<>();
        btnAddCategoria = new javax.swing.JButton();
        panelEdiciónCat = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNomCat = new javax.swing.JTextField();
        btnEditCat = new javax.swing.JButton();
        panelProcedimientos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelEditProc = new javax.swing.JPanel();
        lblNomProc = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtNomProc = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnSaveProc = new javax.swing.JButton();
        btnMoveProc = new javax.swing.JButton();
        btnAddProc = new javax.swing.JButton();
        btnAplicarCambios = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuración de categorias y procedimientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1000, 500));
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setOpaque(false);

        lblCategoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCategoria.setText("Seleccione la categoría:");

        boxCategoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        boxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxCategoria.setMinimumSize(new java.awt.Dimension(100, 30));

        btnAddCategoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAddCategoria.setText("Agregar nueva categoria");
        btnAddCategoria.setPreferredSize(new java.awt.Dimension(180, 30));

        panelEdiciónCat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edición de categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        panelEdiciónCat.setEnabled(false);
        panelEdiciónCat.setOpaque(false);

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre de la categoria:");
        lblNombre.setToolTipText("");
        lblNombre.setEnabled(false);
        lblNombre.setMaximumSize(new java.awt.Dimension(160, 30));
        lblNombre.setMinimumSize(new java.awt.Dimension(160, 30));
        lblNombre.setPreferredSize(new java.awt.Dimension(160, 30));
        lblNombre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        txtNomCat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNomCat.setToolTipText("Ingrese el nombre de la categoria");
        txtNomCat.setEnabled(false);
        txtNomCat.setMaximumSize(new java.awt.Dimension(250, 30));
        txtNomCat.setMinimumSize(new java.awt.Dimension(250, 30));
        txtNomCat.setPreferredSize(new java.awt.Dimension(250, 30));

        btnEditCat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditCat.setText("Editar categoria");
        btnEditCat.setEnabled(false);
        btnEditCat.setPreferredSize(new java.awt.Dimension(170, 32));

        panelProcedimientos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procedimientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        panelProcedimientos.setEnabled(false);
        panelProcedimientos.setOpaque(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        panelEditProc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Edición de Procedimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        panelEditProc.setEnabled(false);

        lblNomProc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNomProc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomProc.setText("Nombre:");
        lblNomProc.setEnabled(false);
        lblNomProc.setPreferredSize(new java.awt.Dimension(55, 20));

        lblPrecio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecio.setText("Precio:");
        lblPrecio.setEnabled(false);
        lblPrecio.setPreferredSize(new java.awt.Dimension(55, 20));

        txtNomProc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNomProc.setToolTipText("Ingrese el nombre del procedimiento");
        txtNomProc.setEnabled(false);
        txtNomProc.setPreferredSize(new java.awt.Dimension(150, 30));

        txtPrecio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtPrecio.setToolTipText("Ingrese el precio del procedimiento");
        txtPrecio.setEnabled(false);
        txtPrecio.setPreferredSize(new java.awt.Dimension(150, 30));

        btnSaveProc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSaveProc.setText("Agregar");
        btnSaveProc.setToolTipText("Agrega el procedimiento a la categoria activa.");
        btnSaveProc.setEnabled(false);
        btnSaveProc.setMaximumSize(new java.awt.Dimension(104, 35));
        btnSaveProc.setMinimumSize(new java.awt.Dimension(104, 35));
        btnSaveProc.setPreferredSize(new java.awt.Dimension(104, 35));

        btnMoveProc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMoveProc.setText("Transladar");
        btnMoveProc.setToolTipText("Agrega el procedimiento a la categoria activa.");
        btnMoveProc.setEnabled(false);

        javax.swing.GroupLayout panelEditProcLayout = new javax.swing.GroupLayout(panelEditProc);
        panelEditProc.setLayout(panelEditProcLayout);
        panelEditProcLayout.setHorizontalGroup(
            panelEditProcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditProcLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelEditProcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomProc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEditProcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomProc, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditProcLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSaveProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMoveProc)
                .addContainerGap())
        );
        panelEditProcLayout.setVerticalGroup(
            panelEditProcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditProcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditProcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEditProcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panelEditProcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoveProc))
                .addContainerGap())
        );

        btnAddProc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAddProc.setText("Agregar procedimiento");
        btnAddProc.setEnabled(false);
        btnAddProc.setPreferredSize(new java.awt.Dimension(170, 32));

        javax.swing.GroupLayout panelProcedimientosLayout = new javax.swing.GroupLayout(panelProcedimientos);
        panelProcedimientos.setLayout(panelProcedimientosLayout);
        panelProcedimientosLayout.setHorizontalGroup(
            panelProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcedimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProcedimientosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddProc, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelEditProc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelProcedimientosLayout.setVerticalGroup(
            panelProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcedimientosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProcedimientosLayout.createSequentialGroup()
                        .addComponent(btnAddProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelEditProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btnAplicarCambios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAplicarCambios.setText("Aplicar cambios");
        btnAplicarCambios.setToolTipText("Aplica los cambios que se hayan hecho a la categoria activa.");
        btnAplicarCambios.setEnabled(false);

        javax.swing.GroupLayout panelEdiciónCatLayout = new javax.swing.GroupLayout(panelEdiciónCat);
        panelEdiciónCat.setLayout(panelEdiciónCatLayout);
        panelEdiciónCatLayout.setHorizontalGroup(
            panelEdiciónCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEdiciónCatLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelEdiciónCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEdiciónCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelProcedimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelEdiciónCatLayout.createSequentialGroup()
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(txtNomCat, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditCat, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAplicarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        panelEdiciónCatLayout.setVerticalGroup(
            panelEdiciónCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEdiciónCatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEdiciónCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEdiciónCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelProcedimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAplicarCambios)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblCategoria)
                .addGap(18, 18, 18)
                .addComponent(boxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEdiciónCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(boxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelEdiciónCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCategoria;
    private javax.swing.JButton btnAddCategoria;
    private javax.swing.JButton btnAddProc;
    private javax.swing.JButton btnAplicarCambios;
    private javax.swing.JButton btnEditCat;
    private javax.swing.JButton btnMoveProc;
    private javax.swing.JButton btnSaveProc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNomProc;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JPanel panelEdiciónCat;
    private javax.swing.JPanel panelEditProc;
    private javax.swing.JPanel panelProcedimientos;
    private javax.swing.JTextField txtNomCat;
    private javax.swing.JTextField txtNomProc;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
