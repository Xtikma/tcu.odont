/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Keylor
 */
public class MenuPrincipal extends javax.swing.JPanel {

    private Menu m;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(Menu me) {
        initComponents();
        m = me;
        //Reactivar cuando se agregue la función
        btnFiltros.setEnabled(false);
        //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSecundarios = new javax.swing.JPanel();
        btnDoctor = new javax.swing.JButton();
        btnPracticantes = new javax.swing.JButton();
        btnTiposIden = new javax.swing.JButton();
        btnLugar = new javax.swing.JButton();
        btnPoblacion = new javax.swing.JButton();
        btnCatProc = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        btnVerConsulta = new javax.swing.JButton();
        btnAgregarConsulta = new javax.swing.JButton();
        btnPacientes = new javax.swing.JButton();
        btnFiltros = new javax.swing.JButton();
        btnInformes = new javax.swing.JButton();
        btnBloqueo = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu principal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1000, 500));

        panelSecundarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Otras Funciones"));
        panelSecundarios.setOpaque(false);
        panelSecundarios.setPreferredSize(new java.awt.Dimension(275, 450));
        panelSecundarios.setLayout(null);

        btnDoctor.setText("Configuraciones de Doctor");
        btnDoctor.setPreferredSize(new java.awt.Dimension(182, 50));
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });
        panelSecundarios.add(btnDoctor);
        btnDoctor.setBounds(11, 18, 253, 50);

        btnPracticantes.setText("Configuraciones de Estudiantes");
        btnPracticantes.setPreferredSize(new java.awt.Dimension(182, 50));
        btnPracticantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPracticantesActionPerformed(evt);
            }
        });
        panelSecundarios.add(btnPracticantes);
        btnPracticantes.setBounds(11, 74, 253, 50);

        btnTiposIden.setText("Conf. de Tipos de Identificación");
        btnTiposIden.setPreferredSize(new java.awt.Dimension(182, 50));
        btnTiposIden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiposIdenActionPerformed(evt);
            }
        });
        panelSecundarios.add(btnTiposIden);
        btnTiposIden.setBounds(11, 130, 253, 50);

        btnLugar.setText("Configuraciones de Lugares");
        btnLugar.setPreferredSize(new java.awt.Dimension(182, 50));
        btnLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLugarActionPerformed(evt);
            }
        });
        panelSecundarios.add(btnLugar);
        btnLugar.setBounds(11, 186, 253, 50);

        btnPoblacion.setText("Configuraciones de Poblaciones");
        btnPoblacion.setPreferredSize(new java.awt.Dimension(182, 50));
        btnPoblacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoblacionActionPerformed(evt);
            }
        });
        panelSecundarios.add(btnPoblacion);
        btnPoblacion.setBounds(11, 242, 253, 50);

        btnCatProc.setText("Conf. de Categorias y Procedimientos");
        btnCatProc.setPreferredSize(new java.awt.Dimension(182, 50));
        btnCatProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatProcActionPerformed(evt);
            }
        });
        panelSecundarios.add(btnCatProc);
        btnCatProc.setBounds(11, 298, 253, 50);

        btnAjustes.setText("Otros Ajustes");
        btnAjustes.setPreferredSize(new java.awt.Dimension(182, 50));
        btnAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjustesActionPerformed(evt);
            }
        });
        panelSecundarios.add(btnAjustes);
        btnAjustes.setBounds(11, 354, 253, 50);

        btnVerConsulta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnVerConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/revisarConsulta.png"))); // NOI18N
        btnVerConsulta.setBorderPainted(false);
        btnVerConsulta.setOpaque(false);
        btnVerConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerConsultaActionPerformed(evt);
            }
        });

        btnAgregarConsulta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAgregarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/agregarConsulta.png"))); // NOI18N
        btnAgregarConsulta.setBorderPainted(false);
        btnAgregarConsulta.setOpaque(false);
        btnAgregarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarConsultaActionPerformed(evt);
            }
        });

        btnPacientes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/confPacientes.png"))); // NOI18N
        btnPacientes.setBorderPainted(false);
        btnPacientes.setOpaque(false);
        btnPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesActionPerformed(evt);
            }
        });

        btnFiltros.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnFiltros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/AreaFiltros.png"))); // NOI18N
        btnFiltros.setBorderPainted(false);
        btnFiltros.setOpaque(false);

        btnInformes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/generarInformes.png"))); // NOI18N
        btnInformes.setBorderPainted(false);
        btnInformes.setOpaque(false);
        btnInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformesActionPerformed(evt);
            }
        });

        btnBloqueo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnBloqueo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bloquearSistema.png"))); // NOI18N
        btnBloqueo.setBorderPainted(false);
        btnBloqueo.setOpaque(false);
        btnBloqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloqueoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSecundarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVerConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInformes, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBloqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(413, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInformes, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBloqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(panelSecundarios, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCatProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatProcActionPerformed
        m.intercambiarPaneles(6);
    }//GEN-LAST:event_btnCatProcActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        m.intercambiarPaneles(2);
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnPracticantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPracticantesActionPerformed
        m.intercambiarPaneles(3);
    }//GEN-LAST:event_btnPracticantesActionPerformed

    private void btnTiposIdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiposIdenActionPerformed
        m.intercambiarPaneles(1);
    }//GEN-LAST:event_btnTiposIdenActionPerformed

    private void btnLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLugarActionPerformed
        m.intercambiarPaneles(5);
    }//GEN-LAST:event_btnLugarActionPerformed

    private void btnAgregarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarConsultaActionPerformed
        m.intercambiarPaneles(7);
    }//GEN-LAST:event_btnAgregarConsultaActionPerformed

    private void btnPoblacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoblacionActionPerformed
        m.intercambiarPaneles(4);
    }//GEN-LAST:event_btnPoblacionActionPerformed

    private void btnVerConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerConsultaActionPerformed
        m.intercambiarPaneles(8);
    }//GEN-LAST:event_btnVerConsultaActionPerformed

    private void btnPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesActionPerformed
        m.intercambiarPaneles(9);
    }//GEN-LAST:event_btnPacientesActionPerformed

    private void btnBloqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloqueoActionPerformed
        Object[] options = {"Bloquear", "Cancelar"};
        int n = JOptionPane.showOptionDialog(null, "¿Desea bloquear el sistema?", "Advertencia",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if (n == JOptionPane.YES_OPTION) {
            m.setVisible(false);
            VBloqueo bloqueo = new VBloqueo(m, true);
                bloqueo.setLocationRelativeTo(this);
                bloqueo.setVisible(true);
                m.setVisible(true);
        } else if (n == JOptionPane.NO_OPTION) {
        }
    }//GEN-LAST:event_btnBloqueoActionPerformed

    private void btnAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjustesActionPerformed
        m.intercambiarPaneles(10);
    }//GEN-LAST:event_btnAjustesActionPerformed

    private void btnInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformesActionPerformed
        m.intercambiarPaneles(11);
    }//GEN-LAST:event_btnInformesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarConsulta;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnBloqueo;
    private javax.swing.JButton btnCatProc;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnFiltros;
    private javax.swing.JButton btnInformes;
    private javax.swing.JButton btnLugar;
    private javax.swing.JButton btnPacientes;
    private javax.swing.JButton btnPoblacion;
    private javax.swing.JButton btnPracticantes;
    private javax.swing.JButton btnTiposIden;
    private javax.swing.JButton btnVerConsulta;
    private javax.swing.JPanel panelSecundarios;
    // End of variables declaration//GEN-END:variables
}
