/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoDatos.ADPoblacion;
import AccesoDatos.ADTipoIdentificacion;
import Animacion.Animacion;
import Entidades.Poblacion;
import Entidades.TipoIdentificacion;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
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
    private CrearConsulta consulta;
    private VerConsultas verCons;
    private ListarPacientes lPacientes;
    private Configuraciones conf;
    private CargarInforme informes;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(new ImageIcon(getClass().getResource("/Recursos/ico.png")).getImage());
        intercambiarPaneles(0);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                Object[] options = {"Aceptar", "Cancelar"};
                int n = JOptionPane.showOptionDialog(null, "Si sale el sistema se cerrará.", "Advertencia",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                if (n == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else if (n == JOptionPane.NO_OPTION) {
                    
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        lbl_icon = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        btnRegresarMenu = new javax.swing.JButton();
        btnBloquear = new javax.swing.JButton();
        btnAgregarPaciente = new javax.swing.JButton();
        btnConfPacientes = new javax.swing.JButton();
        btnAddConsulta = new javax.swing.JButton();
        btnVerConsultas = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Control de Servicios Odontológicos");
        setMinimumSize(new java.awt.Dimension(1100, 600));
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
        panelMenu.setMaximumSize(new java.awt.Dimension(1090, 100));
        panelMenu.setMinimumSize(new java.awt.Dimension(1090, 100));
        panelMenu.setPreferredSize(new java.awt.Dimension(1090, 100));

        btnRegresarMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegresarMenu.setText("Menu principal");
        btnRegresarMenu.setPreferredSize(new java.awt.Dimension(150, 30));
        btnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuActionPerformed(evt);
            }
        });

        btnBloquear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBloquear.setText("Bloquear ");
        btnBloquear.setPreferredSize(new java.awt.Dimension(150, 30));
        btnBloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloquearActionPerformed(evt);
            }
        });

        btnAgregarPaciente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregarPaciente.setText("Nuevo Paciente");
        btnAgregarPaciente.setPreferredSize(new java.awt.Dimension(150, 30));
        btnAgregarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPacienteActionPerformed(evt);
            }
        });

        btnConfPacientes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConfPacientes.setText("Conf. de Pacientes");
        btnConfPacientes.setPreferredSize(new java.awt.Dimension(150, 30));
        btnConfPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfPacientesActionPerformed(evt);
            }
        });

        btnAddConsulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAddConsulta.setText("Agregar Consulta");
        btnAddConsulta.setPreferredSize(new java.awt.Dimension(150, 30));
        btnAddConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddConsultaActionPerformed(evt);
            }
        });

        btnVerConsultas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVerConsultas.setText("Ver Consultas");
        btnVerConsultas.setPreferredSize(new java.awt.Dimension(150, 30));
        btnVerConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerConsultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(btnRegresarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(btnBloquear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(588, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBloquear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        panelBase.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, -1, -1));

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
            Animacion.subir(0, -100, 1, panelMenu);
            Animacion.subir(105, 0, 1, lbl_icon);
            lbl_icon.setIcon(new ImageIcon(getClass().getResource("/Recursos/bajar_drk.png")));
        }else{//Bajar
            Animacion.bajar(-100, 0, 1, panelMenu);
            Animacion.bajar(0, 105, 1, lbl_icon);
            lbl_icon.setIcon(new ImageIcon(getClass().getResource("/Recursos/subir_drk.png")));
        }

    }//GEN-LAST:event_lbl_iconMouseReleased

    private void btnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuActionPerformed
        intercambiarPaneles(0);
    }//GEN-LAST:event_btnRegresarMenuActionPerformed

    private void btnAgregarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPacienteActionPerformed
        ADTipoIdentificacion adTipoId = new ADTipoIdentificacion();
        List<TipoIdentificacion> listaTipoId = adTipoId.ConsultarTipoIdentificacion();
        ADPoblacion adPoblacion = new ADPoblacion();
        List<Poblacion> listaPoblacion = adPoblacion.ConsultarPoblacion();
        
        if (listaTipoId.isEmpty() || listaPoblacion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una población y un tipo de identificación primero.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            VPaciente vista = new VPaciente(this, true);
            vista.setLocationRelativeTo(this);
            vista.setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarPacienteActionPerformed

    private void btnBloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloquearActionPerformed
        Object[] options = {"Bloquear", "Cancelar"};
        int n = JOptionPane.showOptionDialog(null, "¿Desea bloquear del sistema?", "Confirmación",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if (n == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            VBloqueo bloqueo = new VBloqueo(this, true);
                bloqueo.setLocationRelativeTo(this);
                bloqueo.setVisible(true);
                this.setVisible(true);
        } else if (n == JOptionPane.NO_OPTION) {
        }
    }//GEN-LAST:event_btnBloquearActionPerformed

    private void btnConfPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfPacientesActionPerformed
        intercambiarPaneles(9);
    }//GEN-LAST:event_btnConfPacientesActionPerformed

    private void btnAddConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddConsultaActionPerformed
        intercambiarPaneles(7);
    }//GEN-LAST:event_btnAddConsultaActionPerformed

    private void btnVerConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerConsultasActionPerformed
        intercambiarPaneles(8);
    }//GEN-LAST:event_btnVerConsultasActionPerformed

    /**
     * Metodo que cambia los paneles en el panel principal de la ventana
     * @param cod numero que indica en el swicth la ventana que se necesita
     */
    public void intercambiarPaneles(int cod) {
        try {
            switch (cod) {
                case 0: //Menu Principal;
                    menuPrincipal = new MenuPrincipal(this);
                    menuPrincipal.setSize(1000, 500);
                    menuPrincipal.setLocation(0, 0);
                    insertarPanel(menuPrincipal);
                    break;
                case 1://Panel Tipo ID
                    panGen = new PanelGenerico(1, this);
                    panGen.setSize(1000, 500);
                    panGen.setLocation(0, 0);
                    insertarPanel(panGen);
                    break;
                case 2://Panel Doctor
                    panGen = new PanelGenerico(2, this);
                    panGen.setSize(1000, 500);
                    panGen.setLocation(0, 0);
                    insertarPanel(panGen);
                    break;
                case 3://Panel Practicante
                    panGen = new PanelGenerico(3, this);
                    panGen.setSize(1000, 500);
                    panGen.setLocation(0, 0);
                    insertarPanel(panGen);
                    break;

                case 4://Panel Población
                    panGen = new PanelGenerico(4, this);
                    panGen.setSize(1000, 500);
                    panGen.setLocation(0, 0);
                    insertarPanel(panGen);
                    break;
                case 5://Panel Lugar Atención
                    panGen = new PanelGenerico(5, this);
                    panGen.setSize(1000, 500);
                    panGen.setLocation(0, 0);
                    insertarPanel(panGen);
                    break;
                case 6://Categoria y Procedimiento
                    configCP = new ConfigCatProc(this);
                    configCP.setSize(1000, 500);
                    configCP.setLocation(0, 0);
                    insertarPanel(configCP);
                    break;
                case 7://Crear consulta
                    consulta = new CrearConsulta(this);
                    consulta.setSize(1000, 500);
                    consulta.setLocation(0, 0);
                    insertarPanel(consulta);
                    break;
                case 8:
                    verCons = new VerConsultas(this);
                    verCons.setSize(1000,500);
                    verCons.setLocation(0,0);
                    insertarPanel(verCons);
                    break;
                case 9:// Lista de Pacientes
                    lPacientes = new ListarPacientes(this);
                    lPacientes.setSize(1000,500);
                    lPacientes.setLocation(0, 0);
                    insertarPanel(lPacientes);
                    break;
                case 10:// Otros Ajustes
                    conf = new Configuraciones(this);
                    conf.setSize(1000, 500);
                    conf.setLocation(0, 0);
                    insertarPanel(conf);
                    break;
                case 11:
                    informes = new CargarInforme(this);
                    informes.setSize(1000, 500);
                    informes.setLocation(0, 0);
                    insertarPanel(informes);
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
    
    public void crearConsultaPaciente(CrearConsulta consulta){
        consulta.setSize(1000,500);
        consulta.setLocation(0,0);
        insertarPanel(consulta);
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
                Menu menu = new Menu();
                menu.setVisible(false);
                VBloqueo bloqueo = new VBloqueo(menu, true);
                bloqueo.setLocationRelativeTo(menu);
                bloqueo.setVisible(true);
                menu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddConsulta;
    private javax.swing.JButton btnAgregarPaciente;
    private javax.swing.JButton btnBloquear;
    private javax.swing.JButton btnConfPacientes;
    private javax.swing.JButton btnRegresarMenu;
    private javax.swing.JButton btnVerConsultas;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
