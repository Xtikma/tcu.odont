/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Keylor
 */
public class CargarInforme extends javax.swing.JPanel {

    Menu menu;
    /**
     * Creates new form CargarInforme
     */
    public CargarInforme(Menu m) {
        initComponents();
        menu = m;
        cargarTareaEspecifica(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelConfiguraciones = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elaboración de Informes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1000, 500));
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1000, 500));

        PanelConfiguraciones.setMaximumSize(new java.awt.Dimension(988, 100));
        PanelConfiguraciones.setMinimumSize(new java.awt.Dimension(988, 100));
        PanelConfiguraciones.setOpaque(false);

        javax.swing.GroupLayout PanelConfiguracionesLayout = new javax.swing.GroupLayout(PanelConfiguraciones);
        PanelConfiguraciones.setLayout(PanelConfiguracionesLayout);
        PanelConfiguracionesLayout.setHorizontalGroup(
            PanelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelConfiguracionesLayout.setVerticalGroup(
            PanelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelConfiguraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 978, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelConfiguraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void cargarTareaEspecifica( int tareaCod){
        switch(tareaCod){
            case 0:
                Tareas_Basicas tarea0 = new Tareas_Basicas(this);
                tarea0.setSize(978,100);
                tarea0.setLocation(0, 0);
                insertarTareas(tarea0);
                break;
            case 1:
                Tareas_GastoProcPac tarea1 = new Tareas_GastoProcPac(this);
                tarea1.setSize(978,100);
                tarea1.setLocation(0, 0);
                insertarTareas(tarea1);
                break;
        }
    }
    
    public void insertarTareas(JPanel panel){
        try {
            PanelConfiguraciones.removeAll();
            PanelConfiguraciones.add(panel, BorderLayout.CENTER);
            PanelConfiguraciones.revalidate();
            PanelConfiguraciones.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Existe un problema al cargar la ventana", "Problema visual", JOptionPane.ERROR);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelConfiguraciones;
    // End of variables declaration//GEN-END:variables
}