/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Keylor
 */
public class MarcarCiclo extends javax.swing.JFrame {

    //AGREGAR UNA INSTANCIA POR VENTANA DE ORIGEN
    private Tareas_GastoProcPac origen;

    private Date desde;
    private Date hasta;

    private int MODO;

    /**
     * Creates new form MarcarCiclo
     */
    public MarcarCiclo(Date dsd, Date hst, Tareas_GastoProcPac frame, int md) {
        initComponents();
        DefinirTema();
        desde = dsd;
        DateDesde.setDate(desde);
        hasta = hst;
        DateHasta.setDate(hasta);
        MODO = md;
        origen = frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DateDesde = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        DateHasta = new com.toedter.calendar.JDateChooser();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Seleccione cada fecha:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Fecha inicial:");

        DateDesde.setPreferredSize(new java.awt.Dimension(118, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Fecha final:");

        DateHasta.setPreferredSize(new java.awt.Dimension(118, 30));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(DateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(DateHasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateDesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateHasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            if (DateDesde.getDate() != null && DateHasta.getDate() != null) {
                desde = DateDesde.getDate();
                hasta = DateHasta.getDate();
                AlmacenarDinamico();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar ambas fechas", "No selecciono las fechas", 1);
            }
        } catch (Exception e) {
            Herramientas.InformeErrores.getInforme().escribirError(e, "MarcarCiclo", "btnAceptarActionPerformed");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * Define el tema de la ventana para que coincida con el tema de la
     * aplicación.
     */
    private void DefinirTema() {
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeBlue2007Skin");
        } catch (Exception e) {
            Herramientas.InformeErrores.getInforme().escribirError(e, "MarcarCategorias", "DefinirTema");
        }
    }

    private void AlmacenarDinamico() {
        switch (MODO) {
            case 0: //Gasto_ProcPac
                origen.setFechas(desde, hasta);
                break;
            case 1:
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateDesde;
    private com.toedter.calendar.JDateChooser DateHasta;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
