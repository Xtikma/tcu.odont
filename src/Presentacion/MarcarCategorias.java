/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidades.Categoria;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
    private Tareas_GastoProcPac origen;
    private int modo = 0;
    
    /**
     * Recibe la lista de categorias del sistema, una lista vacia o con categorias
     * que representa las categorias que hayan sido seleccionados para el informe, 
     * y la venta de origen donde parte la lista.
     * @param lst lista con las categorias del sistema
     * @param sel lista con categorias seleccionadas o una vacia si no han sido 
     * seleccionadas
     * @param frame la ventana origen donde se marco la ventana.
     */
    public MarcarCategorias(ArrayList<Categoria> lst, ArrayList<Categoria> sel, Tareas_GastoProcPac frame, int md) {
        initComponents();
        DefinirTema();
        lista = lst;
        listaSeleccionada = sel;
        origen = frame;
        this.modo = md;
        cargarCategorias();
        seleccionarCategorias();
    }
    
    /**
     * Carga en el ComboBox las categorias del sistema.
     */
    private void cargarCategorias(){
        if (lista != null || lista.size() > 0) {
            boxCategoria.setModel(new DefaultComboBoxModel(lista.toArray()));
        }else{
            JOptionPane.showMessageDialog(this, "No se ha cargado anteriormente categorias", "Lista vacia", 1);
        }
    }

    /**
     * Convierte la lista en texto para ser agregada al campo de texto
     */
    private void seleccionarCategorias(){
        String lst = "";
        if (listaSeleccionada != null) {
            for (Categoria c : listaSeleccionada) {
                lst = lst + c.getNombre() + "\n";
            }
            txtALista.setText(lst);
        }
    }
    
    /**
     * Define el tema de la ventana para que coincida con el tema de la aplicación.
     */
    private void DefinirTema(){
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeBlue2007Skin");
        } catch (Exception e) {
            Herramientas.InformeErrores.getInforme().escribirError(e, "MarcarCategorias", "DefinirTema");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Instrucciones = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        boxCategoria = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtALista = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Instrucciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Instrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instrucciones.setText("Marque las categorias necesarias");

        btnEnviar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEnviar.setText("Aceptar selección");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        boxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAdd.setText("Agregar");
        btnAdd.setMaximumSize(new java.awt.Dimension(76, 40));
        btnAdd.setMinimumSize(new java.awt.Dimension(76, 40));
        btnAdd.setPreferredSize(new java.awt.Dimension(76, 40));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDel.setText("Eliminar");
        btnDel.setMaximumSize(new java.awt.Dimension(76, 40));
        btnDel.setMinimumSize(new java.awt.Dimension(76, 40));
        btnDel.setPreferredSize(new java.awt.Dimension(76, 40));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        txtALista.setEditable(false);
        txtALista.setColumns(20);
        txtALista.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtALista.setRows(5);
        jScrollPane1.setViewportView(txtALista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Instrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnviar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Finaliza la ventana y agrega al informe una lista seleccionada 
     * de categorias a filtrar
     * @param evt 
     */
    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try {
            if (listaSeleccionada.size() > 0) {
                AlmacenarDinamico();
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Debe marcar al menos una categoria", "No marco Categorias", 1);
            }        
        }catch(Exception e) {
             Herramientas.InformeErrores.getInforme().escribirError(e, "MarcarCategorias", "btnEnviarActionPerformed");
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    /**
     * Agrega a la lista de seleccionados el item seleccionado en el checkbox
     * @param evt 
     */
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int selected = boxCategoria.getSelectedIndex();
        Categoria c = lista.get(selected);
        boolean existe = false;
        for (Categoria cs : listaSeleccionada) {
            if (cs.getId() == c.getId()) {
                existe = true;
            }
        }
        if (existe == false) {
            listaSeleccionada.add(c);
        } else {
            JOptionPane.showMessageDialog(null, "Ya se habia agregado", "Entrada repetida", 1);
        }
        seleccionarCategorias();
    }//GEN-LAST:event_btnAddActionPerformed

    /**
     * Borra de la lista de seleccionados el item en en el checkbox.
     * @param evt 
     */
    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        int selected = boxCategoria.getSelectedIndex();
        Categoria c = lista.get(selected);
        boolean existe = false;
        for (Categoria cs : listaSeleccionada) {
            if (cs.getId() == c.getId()) {
                listaSeleccionada.remove(cs);
                existe = true;
            }
        }
        if (existe == false) {
             JOptionPane.showMessageDialog(null, "No se ha agregado a la lista", "Entrada ausente", 1);
        }
        seleccionarCategorias();
    }//GEN-LAST:event_btnDelActionPerformed

    /**
     * Elige el metodo a guardar depende del origen, este se determina en el 
     * contructor por un entero que entra en un codigo
     */
    private void AlmacenarDinamico (){
        switch (modo){
            case 0: //Gasto_ProcPac
                origen.setCategorias(listaSeleccionada);
                break;
            case 1:
                break;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Instrucciones;
    private javax.swing.JComboBox<String> boxCategoria;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtALista;
    // End of variables declaration//GEN-END:variables
}
