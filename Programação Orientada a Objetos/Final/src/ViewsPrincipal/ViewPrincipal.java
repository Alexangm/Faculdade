package ViewsPrincipal;

import ViewsCliente.ViewDelCliente;
import ViewsCliente.ViewCadCliente;
import ViewsCliente.ViewEditCliente;
import ViewsCliente.ViewConsultaCliente;
import ViewsProduto.ViewCadProduto;
import ViewsProduto.ViewConsultaProduto;
import ViewsProduto.ViewDelProduto;
import ViewsProduto.ViewEditProduto;
import ViewsVenda.ViewFazerVenda;

public class ViewPrincipal extends javax.swing.JFrame {

    private String tipo;
    
    public ViewPrincipal() {
        initComponents();
    }
    
    public ViewPrincipal(String tipo) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.tipo = tipo;

        if(tipo.equals("Visitante")) {
            cadProduto.setEnabled(false);
            editProduto.setEnabled(false);
            deleteProduto.setEnabled(false);
            menCliente.setEnabled(false);
            menVendas.setEnabled(false);
        } else if (tipo.equals("Vendedor")) {
            cadCliente.setEnabled(false);
            editCliente.setEnabled(false);
            deleteCliente.setEnabled(false);
            cadProduto.setEnabled(false);
            editProduto.setEnabled(false);
            deleteProduto.setEnabled(false);
        } else if (tipo.equals("Estoquista")) {
            menCliente.setEnabled(false);
            menVendas.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menCliente = new javax.swing.JMenu();
        cadCliente = new javax.swing.JMenuItem();
        editCliente = new javax.swing.JMenuItem();
        deleteCliente = new javax.swing.JMenuItem();
        consultaCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cadProduto = new javax.swing.JMenuItem();
        editProduto = new javax.swing.JMenuItem();
        deleteProduto = new javax.swing.JMenuItem();
        consultaProduto = new javax.swing.JMenuItem();
        menVendas = new javax.swing.JMenu();
        fazerVenda = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 550));
        setResizable(false);

        desktop.setBackground(new java.awt.Color(51, 51, 51));
        desktop.setMaximumSize(new java.awt.Dimension(800, 529));
        desktop.setMinimumSize(new java.awt.Dimension(800, 529));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        menCliente.setText("Cliente");

        cadCliente.setText("Cadastrar");
        cadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadClienteActionPerformed(evt);
            }
        });
        menCliente.add(cadCliente);

        editCliente.setText("Editar");
        editCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editClienteActionPerformed(evt);
            }
        });
        menCliente.add(editCliente);

        deleteCliente.setText("Excluir");
        deleteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClienteActionPerformed(evt);
            }
        });
        menCliente.add(deleteCliente);

        consultaCliente.setText("Consultar");
        consultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaClienteActionPerformed(evt);
            }
        });
        menCliente.add(consultaCliente);

        jMenuBar1.add(menCliente);

        jMenu2.setText("Produto");

        cadProduto.setText("Cadastrar");
        cadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(cadProduto);

        editProduto.setText("Editar");
        editProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(editProduto);

        deleteProduto.setText("Excluir");
        deleteProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(deleteProduto);

        consultaProduto.setText("Consultar");
        consultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(consultaProduto);

        jMenuBar1.add(jMenu2);

        menVendas.setText("Vendas");

        fazerVenda.setText("Fazer uma venda");
        fazerVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fazerVendaActionPerformed(evt);
            }
        });
        menVendas.add(fazerVenda);

        jMenuBar1.add(menVendas);

        jMenu4.setText("Opções");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jMenu4.add(btnSair);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadClienteActionPerformed
        ViewCadCliente vcc = new ViewCadCliente();
        vcc.setVisible(true);
        desktop.add(vcc);
    }//GEN-LAST:event_cadClienteActionPerformed

    private void editClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editClienteActionPerformed
        ViewEditCliente vec = new ViewEditCliente();
        vec.setVisible(true);
        desktop.add(vec);
    }//GEN-LAST:event_editClienteActionPerformed

    private void deleteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClienteActionPerformed
        ViewDelCliente vdc = new ViewDelCliente();
        vdc.setVisible(true);
        desktop.add(vdc);
    }//GEN-LAST:event_deleteClienteActionPerformed

    private void consultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaClienteActionPerformed
        ViewConsultaCliente vcc = new ViewConsultaCliente(desktop);
        vcc.setVisible(true);
        desktop.add(vcc);
    }//GEN-LAST:event_consultaClienteActionPerformed

    private void cadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadProdutoActionPerformed
        ViewCadProduto vcp = new ViewCadProduto();
        vcp.setVisible(true);
        desktop.add(vcp);
    }//GEN-LAST:event_cadProdutoActionPerformed

    private void editProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProdutoActionPerformed
        ViewEditProduto vep = new ViewEditProduto();
        vep.setVisible(true);
        desktop.add(vep);
    }//GEN-LAST:event_editProdutoActionPerformed

    private void deleteProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProdutoActionPerformed
        ViewDelProduto vdp = new ViewDelProduto();
        vdp.setVisible(true);
        desktop.add(vdp);
    }//GEN-LAST:event_deleteProdutoActionPerformed

    private void consultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaProdutoActionPerformed
        ViewConsultaProduto vcp = new ViewConsultaProduto(desktop, tipo);
        vcp.setVisible(true);
        desktop.add(vcp);
    }//GEN-LAST:event_consultaProdutoActionPerformed

    private void fazerVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fazerVendaActionPerformed
        ViewFazerVenda vfv = new ViewFazerVenda();
        vfv.setVisible(true);
        desktop.add(vfv);
    }//GEN-LAST:event_fazerVendaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
    private javax.swing.JMenuItem btnSair;
    private javax.swing.JMenuItem cadCliente;
    private javax.swing.JMenuItem cadProduto;
    private javax.swing.JMenuItem consultaCliente;
    private javax.swing.JMenuItem consultaProduto;
    private javax.swing.JMenuItem deleteCliente;
    private javax.swing.JMenuItem deleteProduto;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem editCliente;
    private javax.swing.JMenuItem editProduto;
    private javax.swing.JMenuItem fazerVenda;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menCliente;
    private javax.swing.JMenu menVendas;
    // End of variables declaration//GEN-END:variables
}
