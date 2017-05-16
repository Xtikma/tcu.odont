/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidades.Categoria;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Keylor
 */
public class MarcarCategorias extends javax.swing.JFrame {

    /**
     * Creates new form MarcarCategorias
     */
    
    private ArrayList<Categoria> lista;
    private ArrayList<Categoria> listaSeleccionada;
    private ArrayList<JCheckBox> listaGrafica;
    private Tareas_GastoProcPac origen;
    
    public MarcarCategorias(ArrayList<Categoria> lst, ArrayList<Categoria> sel, Tareas_GastoProcPac frame) {
        initComponents();
        DefinirTema();
        lista = lst;
        listaSeleccionada = sel;
        origen = frame;
        dibujarSeleccion();
    }

    private void DefinirTema(){
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeBlue2007Skin");
        } catch (Exception e) {
            Herramientas.InformeErrores.getInforme().escribirError(e, "MarcarCategorias", "DefinirTema");
        }
    }
    
    private void dibujarSeleccion(){
        try {
            JCheckBox generic;
            JCheckBox copia;
            int x = 10;
            int y = 10;
            for (int i = 0; i < lista.size(); i++) {
                generic = new JCheckBox();
                generic.setSize(200, 30);
                generic.setText(lista.get(i).getNombre());
                generic.setLocation(x, y);
                generic.setOpaque(false);
                y+=35;    
                panelGenericos.add(generic);
            }
        } catch (Exception e) {
             Herramientas.InformeErrores.getInforme().escribirError(e, "MarcarCategorias", "dibujarSeleccion");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Instrucciones = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        scrollGenerico = new javax.swing.JScrollPane();
        panelGenericos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Instrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instrucciones.setText("Marque las categorias necesarias");

        btnEnviar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEnviar.setText("Agregar al informe");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGenericosLayout = new javax.swing.GroupLayout(panelGenericos);
        panelGenericos.setLayout(panelGenericosLayout);
        panelGenericosLayout.setHorizontalGroup(
            panelGenericosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        panelGenericosLayout.setVerticalGroup(
            panelGenericosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        scrollGenerico.setViewportView(panelGenericos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Instrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollGenerico, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollGenerico, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnviar)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try {
            for (int i = 0; i < listaGrafica.size(); i++) {
                if (listaGrafica.get(i).isSelected() == true) {
                    listaSeleccionada.add(lista.get(i));
                }
            }
            if (listaSeleccionada.size() > 0) {
                origen.setCategorias(listaSeleccionada);
            }
        
        }catch(Exception e) {
             Herramientas.InformeErrores.getInforme().escribirError(e, "MarcarCategorias", "dibujarSeleccion");
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Instrucciones;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JPanel panelGenericos;
    private javax.swing.JScrollPane scrollGenerico;
    // End of variables declaration//GEN-END:variables
}
