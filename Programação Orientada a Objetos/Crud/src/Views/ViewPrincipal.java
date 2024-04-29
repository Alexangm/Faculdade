package Views;

public class ViewPrincipal extends javax.swing.JFrame {

    public ViewPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        pacCadastrar = new javax.swing.JMenuItem();
        pacEditar = new javax.swing.JMenuItem();
        pacVisualizar = new javax.swing.JMenuItem();
        pacExcluir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        conCadastrar = new javax.swing.JMenuItem();
        conEditar = new javax.swing.JMenuItem();
        conVisualizar = new javax.swing.JMenuItem();
        conExcluir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktop.setBackground(new java.awt.Color(235, 235, 235));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        jMenu1.setText("Pacientes");

        pacCadastrar.setText("Cadastrar");
        pacCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacCadastrarActionPerformed(evt);
            }
        });
        jMenu1.add(pacCadastrar);

        pacEditar.setText("Editar");
        pacEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacEditarActionPerformed(evt);
            }
        });
        jMenu1.add(pacEditar);

        pacVisualizar.setText("Visualizar");
        pacVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacVisualizarActionPerformed(evt);
            }
        });
        jMenu1.add(pacVisualizar);

        pacExcluir.setText("Excluir");
        pacExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacExcluirActionPerformed(evt);
            }
        });
        jMenu1.add(pacExcluir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        conCadastrar.setText("Cadastrar");
        jMenu2.add(conCadastrar);

        conEditar.setText("Editar");
        jMenu2.add(conEditar);

        conVisualizar.setText("Visualizar");
        conVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conVisualizarActionPerformed(evt);
            }
        });
        jMenu2.add(conVisualizar);

        conExcluir.setText("Excluir");
        jMenu2.add(conExcluir);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Opções");

        menSair.setText("Sair");
        menSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSairActionPerformed(evt);
            }
        });
        jMenu3.add(menSair);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_menSairActionPerformed

    private void pacCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacCadastrarActionPerformed
        ViewCadastroPaciente vcp = new ViewCadastroPaciente();
        vcp.setVisible(true);
        desktop.add(vcp);
    }//GEN-LAST:event_pacCadastrarActionPerformed

    private void pacVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacVisualizarActionPerformed
        ViewIndexPaciente vip = new ViewIndexPaciente();
        vip.setVisible(true);
        desktop.add(vip);
    }//GEN-LAST:event_pacVisualizarActionPerformed

    private void pacEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacEditarActionPerformed
        ViewEditarPaciente vep = new ViewEditarPaciente();
        vep.setVisible(true);
        desktop.add(vep);
    }//GEN-LAST:event_pacEditarActionPerformed

    private void pacExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacExcluirActionPerformed
        ViewExcluirPaciente vep = new ViewExcluirPaciente();
        vep.setVisible(true);
        desktop.add(vep);
    }//GEN-LAST:event_pacExcluirActionPerformed

    private void conVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conVisualizarActionPerformed
        ViewIndexConsulta vic = new ViewIndexConsulta();
        vic.setVisible(true);
        desktop.add(vic);
    }//GEN-LAST:event_conVisualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem conCadastrar;
    private javax.swing.JMenuItem conEditar;
    private javax.swing.JMenuItem conExcluir;
    private javax.swing.JMenuItem conVisualizar;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menSair;
    private javax.swing.JMenuItem pacCadastrar;
    private javax.swing.JMenuItem pacEditar;
    private javax.swing.JMenuItem pacExcluir;
    private javax.swing.JMenuItem pacVisualizar;
    // End of variables declaration//GEN-END:variables
}
