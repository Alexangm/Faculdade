package ViewsVenda;

import Controllers.*;
import java.awt.Color;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class ViewFazerVenda extends javax.swing.JInternalFrame {
    
    ClienteController cc = new ClienteController();
    ProdutoController pc = new ProdutoController();
    VendaController vc = new VendaController();
    private double preco1, preco2, preco3, preco4, preco5, precoTotal;

    public ViewFazerVenda() {
        initComponents();
        setLocation(153, 102);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdProduto1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQtde1 = new javax.swing.JTextField();
        txtNomeProduto1 = new javax.swing.JTextField();
        txtPrecoTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnVender = new javax.swing.JButton();
        txtPreco1 = new javax.swing.JTextField();
        txtPreco2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIdProduto2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtQtde2 = new javax.swing.JTextField();
        txtNomeProduto2 = new javax.swing.JTextField();
        txtNomeProduto4 = new javax.swing.JTextField();
        txtNomeProduto3 = new javax.swing.JTextField();
        txtPreco3 = new javax.swing.JTextField();
        txtPreco4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIdProduto4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtIdProduto3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtQtde3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtQtde4 = new javax.swing.JTextField();
        txtNomeProduto5 = new javax.swing.JTextField();
        txtPreco5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtIdProduto5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtQtde5 = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Excluir Cliente");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nova Venda");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("ID Cliente:");

        txtIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyReleased(evt);
            }
        });

        txtNomeCliente.setEditable(false);
        txtNomeCliente.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("ID Produto 1:");

        txtIdProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProduto1ActionPerformed(evt);
            }
        });
        txtIdProduto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdProduto1KeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setText("Qtde:");

        txtQtde1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtde1KeyReleased(evt);
            }
        });

        txtNomeProduto1.setEditable(false);
        txtNomeProduto1.setBackground(new java.awt.Color(255, 255, 255));

        txtPrecoTotal.setEditable(false);
        txtPrecoTotal.setText("0.0");
        txtPrecoTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecoTotalKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setText("Preço Total:");

        btnVender.setText("Concluir venda");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        txtPreco1.setEditable(false);
        txtPreco1.setBackground(new java.awt.Color(255, 255, 255));

        txtPreco2.setEditable(false);
        txtPreco2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel8.setText("ID Produto 2:");

        txtIdProduto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdProduto2KeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel9.setText("Qtde:");

        txtQtde2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtde2KeyReleased(evt);
            }
        });

        txtNomeProduto2.setEditable(false);
        txtNomeProduto2.setBackground(new java.awt.Color(255, 255, 255));

        txtNomeProduto4.setEditable(false);
        txtNomeProduto4.setBackground(new java.awt.Color(255, 255, 255));

        txtNomeProduto3.setEditable(false);
        txtNomeProduto3.setBackground(new java.awt.Color(255, 255, 255));

        txtPreco3.setEditable(false);
        txtPreco3.setBackground(new java.awt.Color(255, 255, 255));

        txtPreco4.setEditable(false);
        txtPreco4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel10.setText("ID Produto 4:");

        txtIdProduto4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdProduto4KeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel11.setText("ID Produto 3:");

        txtIdProduto3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdProduto3KeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel12.setText("Qtde:");

        txtQtde3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtde3KeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel13.setText("Qtde:");

        txtQtde4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtde4KeyReleased(evt);
            }
        });

        txtNomeProduto5.setEditable(false);
        txtNomeProduto5.setBackground(new java.awt.Color(255, 255, 255));

        txtPreco5.setEditable(false);
        txtPreco5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel15.setText("ID Produto 5:");

        txtIdProduto5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdProduto5KeyReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel16.setText("Qtde:");

        txtQtde5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtde5KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVender)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdProduto3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdProduto4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNomeProduto3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNomeProduto4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQtde3, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(txtQtde4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPreco3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtPreco4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdProduto1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                    .addComponent(txtIdCliente)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdProduto2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNomeProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNomeProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQtde2)
                                    .addComponent(txtQtde1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPreco1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(txtPreco2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdProduto5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeProduto5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(13, 13, 13)
                        .addComponent(txtQtde5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPreco5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtNomeProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtNomeProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtde2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtPreco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProduto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtNomeProduto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtde3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtPreco3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProduto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtNomeProduto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtde4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtPreco4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProduto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtNomeProduto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtde5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtPreco5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btnVender)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private double qtdeReleased(javax.swing.JTextField quantidade, javax.swing.JTextField id, javax.swing.JTextField precox, double preco, java.awt.event.KeyEvent evt){
        int qtde, estoque;

        if (!"".equals(quantidade.getText()) && !"".equals(id.getText())) {
            estoque = pc.findQuantidadeById(Integer.parseInt(id.getText()));
            qtde = Integer.parseInt(quantidade.getText());

            if (qtde > estoque) {
                quantidade.setForeground(Color.red);
                id.setText("");
            } else {
                quantidade.setForeground(Color.black);
                preco = pc.findPrecoById(Integer.parseInt(txtIdProduto1.getText()));
                preco *= qtde;
                precox.setText(String.valueOf(preco));
                this.txtPrecoTotalKeyReleased(evt);
            }

        } else if ("".equals(quantidade.getText())) {
            preco = this.qtdeReleased(quantidade, id, precox, preco, evt);
        }

        return preco;
    }
    
    private double idReleased(javax.swing.JTextField nomeP, javax.swing.JTextField quantidade, javax.swing.JTextField id, javax.swing.JTextField precox, double preco, java.awt.event.KeyEvent evt){
        if("".equals(id.getText())) {
            nomeP.setText("");
            precox.setText("");
            quantidade.setText("");
            preco = 0;
            this.txtPrecoTotalKeyReleased(evt);
        } else {
            if(pc.existeById(Integer.parseInt(id.getText()))){
                nomeP.setText(pc.findNomeById(Integer.parseInt(id.getText())));
                quantidade.setText("1");
                preco = this.qtdeReleased(quantidade, id, precox, preco, evt);
            } else {
                nomeP.setText("Produto inexistente!");
                quantidade.setText("");
            }
        }
        return preco;
    }
    
    private void txtIdClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyReleased
        if(!"".equals(txtIdCliente.getText()))
            txtNomeCliente.setText(cc.findNomeById(Integer.parseInt(txtIdCliente.getText())));
        else txtNomeCliente.setText("");
    }//GEN-LAST:event_txtIdClienteKeyReleased

    private void txtIdProduto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProduto1KeyReleased
        preco1 = this.idReleased(txtNomeProduto1, txtQtde1, txtIdProduto1, txtPreco1, preco1, evt);
        this.txtPrecoTotalKeyReleased(evt);
    }//GEN-LAST:event_txtIdProduto1KeyReleased

    private void txtQtde1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtde1KeyReleased
        preco1 = this.qtdeReleased(txtQtde1, txtIdProduto1, txtPreco1, preco1, evt);
        this.txtPrecoTotalKeyReleased(evt);
    }//GEN-LAST:event_txtQtde1KeyReleased

    private void txtIdProduto2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProduto2KeyReleased
        preco2 = this.idReleased(txtNomeProduto2, txtQtde2, txtIdProduto2, txtPreco2, preco2, evt);
        this.txtPrecoTotalKeyReleased(evt);
    }//GEN-LAST:event_txtIdProduto2KeyReleased

    private void txtQtde2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtde2KeyReleased
        preco2 = this.qtdeReleased(txtQtde2, txtIdProduto2, txtPreco2, preco2, evt);
        this.txtPrecoTotalKeyReleased(evt);
    }//GEN-LAST:event_txtQtde2KeyReleased

    private void txtIdProduto3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProduto3KeyReleased
        preco3 = this.idReleased(txtNomeProduto3, txtQtde3, txtIdProduto3, txtPreco3, preco3, evt);
        this.txtPrecoTotalKeyReleased(evt);
    }//GEN-LAST:event_txtIdProduto3KeyReleased

    private void txtQtde3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtde3KeyReleased
        preco3 = this.qtdeReleased(txtQtde3, txtIdProduto3, txtPreco3, preco3, evt);
        this.txtPrecoTotalKeyReleased(evt);
    }//GEN-LAST:event_txtQtde3KeyReleased

    private void txtIdProduto4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProduto4KeyReleased
        preco4 = this.idReleased(txtNomeProduto4, txtQtde4, txtIdProduto4, txtPreco4, preco4, evt);
        this.txtPrecoTotalKeyReleased(evt);
    }//GEN-LAST:event_txtIdProduto4KeyReleased

    private void txtQtde4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtde4KeyReleased
        preco4 = this.qtdeReleased(txtQtde4, txtIdProduto4, txtPreco4, preco4, evt);
        this.txtPrecoTotalKeyReleased(evt);
    }//GEN-LAST:event_txtQtde4KeyReleased

    private void txtIdProduto5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProduto5KeyReleased
        preco5 = this.idReleased(txtNomeProduto5, txtQtde5, txtIdProduto5, txtPreco5, preco5, evt);
        this.txtPrecoTotalKeyReleased(evt);
    }//GEN-LAST:event_txtIdProduto5KeyReleased

    private void txtQtde5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtde5KeyReleased
        preco5 = this.qtdeReleased(txtQtde5, txtIdProduto5, txtPreco5, preco5, evt);
        this.txtPrecoTotalKeyReleased(evt);
    }//GEN-LAST:event_txtQtde5KeyReleased

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        if("".equals(txtIdCliente.getText()))
            JOptionPane.showMessageDialog(rootPane, "Informe o ID cliente que realizou a compra!");
        else if(!cc.existeById(Integer.parseInt(txtIdCliente.getText())))
            JOptionPane.showMessageDialog(rootPane, "O ID informado não pertence a nenhum cliente!");
        else if(txtQtde1.getForeground() == Color.red ||
                txtQtde2.getForeground() == Color.red ||
                txtQtde3.getForeground() == Color.red ||
                txtQtde4.getForeground() == Color.red ||
                txtQtde5.getForeground() == Color.red)
            JOptionPane.showMessageDialog(rootPane, "Em pelo menos em uma das compras o valor solicitado é superior ao estoque!");
        else if(Double.parseDouble(txtPrecoTotal.getText()) == 0)
            JOptionPane.showMessageDialog(rootPane, "Nenhum produto comprado!");
        else{
            String id1, id2, id3, id4, id5;
            
            if(!txtQtde1.getText().equals(""))
                if(Integer.parseInt(txtQtde1.getText()) > 0){
                    id1 = txtIdProduto1.getText();
                    pc.editEstoque(-Integer.parseInt(txtQtde1.getText()), Integer.parseInt(txtIdProduto1.getText()));
                }
                else id1 = null;
            else id1 = null;
            
            if(!txtQtde2.getText().equals(""))
                if(Integer.parseInt(txtQtde2.getText()) > 0){
                    id2 = txtIdProduto2.getText();
                    pc.editEstoque(-Integer.parseInt(txtQtde2.getText()), Integer.parseInt(txtIdProduto2.getText()));
                
                }
                else id2 = null;
            else id2 = null;
            
            if(!txtQtde3.getText().equals(""))
                if(Integer.parseInt(txtQtde3.getText()) > 0){
                    id3 = txtIdProduto3.getText();
                    pc.editEstoque(-Integer.parseInt(txtQtde3.getText()), Integer.parseInt(txtIdProduto3.getText()));
                }
                else id3 = null;
            else id3 = null;
            
            if(!txtQtde4.getText().equals(""))
                if(Integer.parseInt(txtQtde4.getText()) > 0){
                    id4 = txtIdProduto4.getText();
                    pc.editEstoque(-Integer.parseInt(txtQtde4.getText()), Integer.parseInt(txtIdProduto4.getText()));
                }
                else id4 = null;
            else id4 = null;
            
            if(!txtQtde5.getText().equals(""))
                if(Integer.parseInt(txtQtde5.getText()) > 0){
                    id5 = txtIdProduto5.getText();
                    pc.editEstoque(-Integer.parseInt(txtQtde5.getText()), Integer.parseInt(txtIdProduto5.getText()));
                }
                else id5 = null;
            else id5 = null;

            if(vc.create(txtIdCliente.getText(), id1, id2, id3, id4, id5, precoTotal)){
                JOptionPane.showMessageDialog(rootPane, "Venda realizada");
                txtIdCliente.setText("");
                txtIdProduto1.setText("");
                txtIdProduto2.setText("");
                txtIdProduto3.setText("");
                txtIdProduto4.setText("");
                txtIdProduto5.setText("");
            }
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void txtIdProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProduto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProduto1ActionPerformed

    private void txtPrecoTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoTotalKeyReleased
        precoTotal = preco1 + preco2 + preco3 + preco4 + preco5;
        txtPrecoTotal.setText(String.valueOf(precoTotal));
    }//GEN-LAST:event_txtPrecoTotalKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdProduto1;
    private javax.swing.JTextField txtIdProduto2;
    private javax.swing.JTextField txtIdProduto3;
    private javax.swing.JTextField txtIdProduto4;
    private javax.swing.JTextField txtIdProduto5;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeProduto1;
    private javax.swing.JTextField txtNomeProduto2;
    private javax.swing.JTextField txtNomeProduto3;
    private javax.swing.JTextField txtNomeProduto4;
    private javax.swing.JTextField txtNomeProduto5;
    private javax.swing.JTextField txtPreco1;
    private javax.swing.JTextField txtPreco2;
    private javax.swing.JTextField txtPreco3;
    private javax.swing.JTextField txtPreco4;
    private javax.swing.JTextField txtPreco5;
    private javax.swing.JTextField txtPrecoTotal;
    private javax.swing.JTextField txtQtde1;
    private javax.swing.JTextField txtQtde2;
    private javax.swing.JTextField txtQtde3;
    private javax.swing.JTextField txtQtde4;
    private javax.swing.JTextField txtQtde5;
    // End of variables declaration//GEN-END:variables
}
