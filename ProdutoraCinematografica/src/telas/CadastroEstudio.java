/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.BancoDeDados;
import classes.Estudio;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author haris
 */
public class CadastroEstudio extends javax.swing.JFrame {

    static ArrayList<Estudio> listaEstudios;
    String botao;
    BancoDeDados bd;

    /**
     * Creates new form CadastroEstudio
     */
    public CadastroEstudio() {
        initComponents();

        File fileBd = new File(BancoDeDados.getFilePath());
        if (fileBd.exists()) {
            bd = BancoDeDados.readBancoDeDados();
        } else {
            bd = new BancoDeDados();
            BancoDeDados.writeBancoDeDados(bd);
        }

        listaEstudios = bd.getEstudios();
        carregarTabelaEstudios();

        btnNovoEstudio.setEnabled(true);
        btnSalvarEstudio.setEnabled(false);
        btnEditarEstudio.setEnabled(false);
        btnProcurarEstudio.setEnabled(true);
        btnExcluirEstudio.setEnabled(false);
        btnCancelarEstudio.setEnabled(false);
        btnOk.setEnabled(false);

        txtNome.setEnabled(false);
        txtIdEstudio.setEnabled(false);
        txtLocalizacao.setEnabled(false);
    }

    public void carregarTabelaEstudios() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome", "ID Estudio", "Localização"}, 0);

        for (int i = 0; i < listaEstudios.size(); i++) {
            Object linha[] = new Object[]{listaEstudios.get(i).getNome(), listaEstudios.get(i).getIdestudio(), listaEstudios.get(i).getLocalizacao()};
            modelo.addRow(linha);
        }
        tblEstudios.setModel(modelo);

        tblEstudios.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblEstudios.getColumnModel().getColumn(1).setPreferredWidth(10);
        tblEstudios.getColumnModel().getColumn(2).setPreferredWidth(100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDadosEstudio = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblIdEstudio = new javax.swing.JLabel();
        txtIdEstudio = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        lblLocalizacao = new javax.swing.JLabel();
        txtLocalizacao = new javax.swing.JTextField();
        btnNovoEstudio = new javax.swing.JButton();
        btnSalvarEstudio = new javax.swing.JButton();
        btnEditarEstudio = new javax.swing.JButton();
        btnProcurarEstudio = new javax.swing.JButton();
        btnExcluirEstudio = new javax.swing.JButton();
        btnCancelarEstudio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstudios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar estúdio");
        setBackground(new java.awt.Color(187, 187, 187));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone.png")).getImage());

        pnlDadosEstudio.setBackground(new java.awt.Color(114, 134, 211));
        pnlDadosEstudio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Dados do Estúdio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("MS UI Gothic", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        lblNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");

        txtNome.setToolTipText("Insira o nome do Estúdio");

        lblIdEstudio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblIdEstudio.setForeground(new java.awt.Color(255, 255, 255));
        lblIdEstudio.setText("ID Estúdio");

        txtIdEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEstudioActionPerformed(evt);
            }
        });

        btnOk.setBackground(new java.awt.Color(142, 167, 233));
        btnOk.setForeground(new java.awt.Color(255, 242, 242));
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        lblLocalizacao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblLocalizacao.setForeground(new java.awt.Color(255, 255, 255));
        lblLocalizacao.setText("Localização");

        txtLocalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalizacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDadosEstudioLayout = new javax.swing.GroupLayout(pnlDadosEstudio);
        pnlDadosEstudio.setLayout(pnlDadosEstudioLayout);
        pnlDadosEstudioLayout.setHorizontalGroup(
            pnlDadosEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosEstudioLayout.createSequentialGroup()
                .addGroup(pnlDadosEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosEstudioLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(pnlDadosEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdEstudio)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLocalizacao))
                        .addGap(25, 25, 25)
                        .addGroup(pnlDadosEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLocalizacao)
                            .addGroup(pnlDadosEstudioLayout.createSequentialGroup()
                                .addGroup(pnlDadosEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNome)
                                    .addGroup(pnlDadosEstudioLayout.createSequentialGroup()
                                        .addComponent(txtIdEstudio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4))))
                    .addGroup(pnlDadosEstudioLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(70, 70, 70))
        );
        pnlDadosEstudioLayout.setVerticalGroup(
            pnlDadosEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosEstudioLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnlDadosEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdEstudio)
                    .addComponent(txtIdEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosEstudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocalizacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovoEstudio.setBackground(new java.awt.Color(142, 167, 233));
        btnNovoEstudio.setForeground(new java.awt.Color(255, 242, 242));
        btnNovoEstudio.setText("Novo");
        btnNovoEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoEstudioActionPerformed(evt);
            }
        });

        btnSalvarEstudio.setBackground(new java.awt.Color(142, 167, 233));
        btnSalvarEstudio.setForeground(new java.awt.Color(255, 242, 242));
        btnSalvarEstudio.setText("Salvar");
        btnSalvarEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEstudioActionPerformed(evt);
            }
        });

        btnEditarEstudio.setBackground(new java.awt.Color(142, 167, 233));
        btnEditarEstudio.setForeground(new java.awt.Color(255, 242, 242));
        btnEditarEstudio.setText("Editar");
        btnEditarEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEstudioActionPerformed(evt);
            }
        });

        btnProcurarEstudio.setBackground(new java.awt.Color(142, 167, 233));
        btnProcurarEstudio.setForeground(new java.awt.Color(255, 242, 242));
        btnProcurarEstudio.setText("Procurar");
        btnProcurarEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarEstudioActionPerformed(evt);
            }
        });

        btnExcluirEstudio.setBackground(new java.awt.Color(142, 167, 233));
        btnExcluirEstudio.setForeground(new java.awt.Color(255, 242, 242));
        btnExcluirEstudio.setText("Excluir");
        btnExcluirEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEstudioActionPerformed(evt);
            }
        });

        btnCancelarEstudio.setBackground(new java.awt.Color(142, 167, 233));
        btnCancelarEstudio.setForeground(new java.awt.Color(255, 242, 242));
        btnCancelarEstudio.setText("Cancelar");
        btnCancelarEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEstudioActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(187, 187, 187));

        tblEstudios.setBackground(new java.awt.Color(229, 224, 255));
        tblEstudios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "ID Estúdio", "Localização"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstudios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstudiosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEstudios);
        if (tblEstudios.getColumnModel().getColumnCount() > 0) {
            tblEstudios.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblEstudios.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblEstudios.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovoEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvarEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(btnEditarEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnProcurarEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnExcluirEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancelarEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(pnlDadosEstudio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDadosEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoEstudio)
                    .addComponent(btnEditarEstudio)
                    .addComponent(btnProcurarEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirEstudio)
                    .addComponent(btnCancelarEstudio)
                    .addComponent(btnSalvarEstudio))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEstudioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEstudioActionPerformed

    private void txtLocalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalizacaoActionPerformed

    private void btnNovoEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoEstudioActionPerformed
        botao = "novo";
        btnNovoEstudio.setEnabled(false);
        btnSalvarEstudio.setEnabled(true);
        btnEditarEstudio.setEnabled(false);
        btnProcurarEstudio.setEnabled(false);
        btnExcluirEstudio.setEnabled(false);
        btnCancelarEstudio.setEnabled(true);
        btnOk.setEnabled(false);

        txtNome.setEnabled(true);
        txtIdEstudio.setEnabled(true);
        txtLocalizacao.setEnabled(true);
    }//GEN-LAST:event_btnNovoEstudioActionPerformed

    private void btnEditarEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEstudioActionPerformed
        botao = "editar";
        btnNovoEstudio.setEnabled(false);
        btnSalvarEstudio.setEnabled(true);
        btnEditarEstudio.setEnabled(false);
        btnProcurarEstudio.setEnabled(false);
        btnExcluirEstudio.setEnabled(false);
        btnCancelarEstudio.setEnabled(true);
        btnOk.setEnabled(false);

        txtNome.setEnabled(true);
        txtIdEstudio.setEnabled(true);
        txtLocalizacao.setEnabled(true);
    }//GEN-LAST:event_btnEditarEstudioActionPerformed

    private void btnProcurarEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarEstudioActionPerformed
        if (listaEstudios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum estúdio cadastrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        } else {
            txtNome.setText("");
            txtIdEstudio.setText("");
            txtLocalizacao.setText("");

            btnNovoEstudio.setEnabled(false);
            btnSalvarEstudio.setEnabled(false);
            btnEditarEstudio.setEnabled(false);
            btnProcurarEstudio.setEnabled(false);
            btnExcluirEstudio.setEnabled(false);
            btnCancelarEstudio.setEnabled(true);
            btnOk.setEnabled(true);

            txtNome.setEnabled(false);
            txtIdEstudio.setEnabled(true);
            txtLocalizacao.setEnabled(false);

            txtIdEstudio.requestFocus();
        }
    }//GEN-LAST:event_btnProcurarEstudioActionPerformed

    private void btnSalvarEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEstudioActionPerformed
        if (txtNome.getText().equals("") || txtIdEstudio.getText().equals("") || txtLocalizacao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos os Campos precisão ser preechidos!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String nome = txtNome.getText();
            String idestudio = txtIdEstudio.getText();
            String localizacao = txtLocalizacao.getText();

            if (botao.equals("novo")) {
                Estudio estudio = new Estudio(nome, idestudio, localizacao);

                JOptionPane.showMessageDialog(null, "Estúdio Cadastrado", "Mensagem", JOptionPane.INFORMATION_MESSAGE);

                listaEstudios.add(estudio);
            } else if (botao.equals("editar")) {
                int index = tblEstudios.getSelectedRow();

                listaEstudios.get(index).setNome(nome);
                listaEstudios.get(index).setIdestudio(idestudio);
                listaEstudios.get(index).setLocalizacao(localizacao);

            }
            
            carregarTabelaEstudios();

            txtNome.setText("");
            txtIdEstudio.setText("");
            txtLocalizacao.setText("");

            btnNovoEstudio.setEnabled(true);
            btnSalvarEstudio.setEnabled(false);
            btnEditarEstudio.setEnabled(false);
            btnProcurarEstudio.setEnabled(true);
            btnExcluirEstudio.setEnabled(false);
            btnCancelarEstudio.setEnabled(false);
            btnOk.setEnabled(false);

            txtNome.setEnabled(false);
            txtIdEstudio.setEnabled(false);
            txtLocalizacao.setEnabled(false);
            BancoDeDados.writeBancoDeDados(bd);
        }
    }//GEN-LAST:event_btnSalvarEstudioActionPerformed

    private void btnCancelarEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEstudioActionPerformed
        txtNome.setText("");
        txtIdEstudio.setText("");
        txtLocalizacao.setText("");

        btnNovoEstudio.setEnabled(true);
        btnSalvarEstudio.setEnabled(false);
        btnEditarEstudio.setEnabled(false);
        btnProcurarEstudio.setEnabled(true);
        btnExcluirEstudio.setEnabled(false);
        btnCancelarEstudio.setEnabled(false);
        btnOk.setEnabled(false);

        txtNome.setEnabled(false);
        txtIdEstudio.setEnabled(false);
        txtLocalizacao.setEnabled(false);
    }//GEN-LAST:event_btnCancelarEstudioActionPerformed

    private void tblEstudiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstudiosMouseClicked
        int i = tblEstudios.getSelectedRow();

        if (i >= 0 && i < listaEstudios.size()) {
            Estudio est = listaEstudios.get(i);
            txtNome.setText(est.getNome());
            txtIdEstudio.setText(est.getIdestudio());
            txtLocalizacao.setText(est.getLocalizacao());
        }
        btnNovoEstudio.setEnabled(true);
        btnSalvarEstudio.setEnabled(false);
        btnEditarEstudio.setEnabled(true);
        btnProcurarEstudio.setEnabled(true);
        btnExcluirEstudio.setEnabled(true);
        btnCancelarEstudio.setEnabled(false);
        btnOk.setEnabled(false);

        txtNome.setEnabled(false);
        txtIdEstudio.setEnabled(false);
        txtLocalizacao.setEnabled(false);
    }//GEN-LAST:event_tblEstudiosMouseClicked

    private void btnExcluirEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEstudioActionPerformed
        int index = tblEstudios.getSelectedRow();

        if (index >= 0 && index < listaEstudios.size()) {
            listaEstudios.remove(index);
        }

        carregarTabelaEstudios();

        txtNome.setText("");
        txtIdEstudio.setText("");
        txtLocalizacao.setText("");

        btnNovoEstudio.setEnabled(true);
        btnSalvarEstudio.setEnabled(false);
        btnEditarEstudio.setEnabled(false);
        btnProcurarEstudio.setEnabled(true);
        btnExcluirEstudio.setEnabled(false);
        btnCancelarEstudio.setEnabled(false);
        btnOk.setEnabled(false);

        txtNome.setEnabled(false);
        txtIdEstudio.setEnabled(false);
        txtLocalizacao.setEnabled(false);
        BancoDeDados.writeBancoDeDados(bd);

    }//GEN-LAST:event_btnExcluirEstudioActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (txtIdEstudio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O ID do Estúdio precisa ser informado", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Estudio est;
            String ide = "", nome = "", local = "";
            String id = txtIdEstudio.getText();

            for (int i = 0; i < listaEstudios.size(); i++) {
                est = listaEstudios.get(i);

                if (id.equals(est.getIdestudio())) {
                    ide = String.valueOf(est.getIdestudio());
                    nome = est.getNome();
                    local = est.getLocalizacao();
                }
            }
            if (ide.equals("")) {
                JOptionPane.showMessageDialog(null, "Este estúdio não existe!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                txtNome.setText("");
                txtLocalizacao.setText("");
            } else {
                txtNome.setText(nome);
                txtIdEstudio.setText(id);
                txtLocalizacao.setText(local);
            }

            txtIdEstudio.selectAll();
        }
       BancoDeDados.writeBancoDeDados(bd);
    }//GEN-LAST:event_btnOkActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroEstudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEstudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEstudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEstudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEstudio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarEstudio;
    private javax.swing.JButton btnEditarEstudio;
    private javax.swing.JButton btnExcluirEstudio;
    private javax.swing.JButton btnNovoEstudio;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnProcurarEstudio;
    private javax.swing.JButton btnSalvarEstudio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdEstudio;
    private javax.swing.JLabel lblLocalizacao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnlDadosEstudio;
    private javax.swing.JTable tblEstudios;
    private javax.swing.JTextField txtIdEstudio;
    private javax.swing.JTextField txtLocalizacao;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
