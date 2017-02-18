/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Animacion.Animacion;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author doliv
 */
public class Menu extends javax.swing.JFrame {

    //Instancias
    private MenuPrincipal menuPrincipal;
    private ConfigCatProc configCP;
    private PanelGenerico panGen;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(new ImageIcon(getClass().getResource("/Recursos/ico.png")).getImage());
        intercambiarPaneles(0);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        lbl_icon = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Control de Servicios Odontológicos");
        setMaximumSize(new java.awt.Dimension(1100, 600));
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setPreferredSize(new java.awt.Dimension(1100, 600));
        getContentPane().setLayout(null);

        panelBase.setMaximumSize(new java.awt.Dimension(1280, 700));
        panelBase.setMinimumSize(new java.awt.Dimension(1280, 700));
        panelBase.setOpaque(false);
        panelBase.setPreferredSize(new java.awt.Dimension(1280, 700));
        panelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bajar_drk.png"))); // NOI18N
        lbl_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl_iconMouseReleased(evt);
            }
        });
        panelBase.add(lbl_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 0, -1, -1));

        panelMenu.setBackground(new java.awt.Color(102, 204, 255));
        panelMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelMenu.setMaximumSize(new java.awt.Dimension(1100, 150));
        panelMenu.setMinimumSize(new java.awt.Dimension(1100, 150));
        panelMenu.setPreferredSize(new java.awt.Dimension(1100, 150));

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        panelBase.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -150, -1, -1));

        panelPrincipal.setOpaque(false);
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1000, 500));
        panelPrincipal.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        panelBase.add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        getContentPane().add(panelBase);
        panelBase.setBounds(0, 0, 1280, 700);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondooff.png"))); // NOI18N
        lblFondo.setText("jLabel1");
        lblFondo.setMaximumSize(new java.awt.Dimension(1280, 700));
        lblFondo.setMinimumSize(new java.awt.Dimension(1280, 700));
        lblFondo.setPreferredSize(new java.awt.Dimension(1100, 600));
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, -20, 1100, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_iconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_iconMouseReleased
        int posicion = lbl_icon.getY();
        if (posicion > 0) {//Subir
            Animacion.subir(0, -150, 2, panelMenu);
            Animacion.subir(155, 0, 2, lbl_icon);
            lbl_icon.setIcon(new ImageIcon(getClass().getResource("/Recursos/bajar_drk.png")));
        }else{//Bajar
            Animacion.bajar(-150, 0, 2, panelMenu);
            Animacion.bajar(0, 155, 2, lbl_icon);
            lbl_icon.setIcon(new ImageIcon(getClass().getResource("/Recursos/subir_drk.png")));
        }

    }//GEN-LAST:event_lbl_iconMouseReleased

    /**
     * Metodo que cambia los paneles en el panel principal de la ventana
     * @param cod numero que indica en el swicth la ventana que se necesita
     */
    public void intercambiarPaneles(int cod){
        try {
            switch(cod){
                case 0: //Menu Principal;
                    menuPrincipal = new MenuPrincipal();
                    menuPrincipal.setSize(1000, 500);
                    menuPrincipal.setLocation(0, 0);
                    insertarPanel(menuPrincipal);
                    break;
                case 1://Categoria y Procedimiento
                    configCP = new ConfigCatProc();
                    configCP.setSize(1000, 500);
                    configCP.setLocation(0, 0);
                    insertarPanel(configCP);
                    break;
                case 2://Panel Generico
                    panGen = new PanelGenerico(1);
                    panGen.setSize(1000, 500);
                    panGen.setLocation(0, 0);
                    insertarPanel(panGen);
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
        }
    }
    
    public void insertarPanel(JPanel panel){
        try {
            panelPrincipal.removeAll();
            panelPrincipal.add(panel, BorderLayout.CENTER);
            panelPrincipal.revalidate();
            panelPrincipal.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Existe un problema al cargar la ventana", "Problema visual", JOptionPane.ERROR);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc="Tema">
        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeBlue2007Skin");
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
