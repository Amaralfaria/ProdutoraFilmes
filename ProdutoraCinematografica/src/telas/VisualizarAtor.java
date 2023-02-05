
package telas;

import classes.Ator;
import java.util.Date;  

/**
 *
 * @author wesle
 */
public class VisualizarAtor extends javax.swing.JFrame {

    private Ator ator;
    
    public VisualizarAtor(Ator ator) {
        
        this.ator = ator;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        jlbMenu = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlCadastroFilme1 = new javax.swing.JPanel();
        jbtDados = new javax.swing.JButton();
        pnlCadastroFilme = new javax.swing.JPanel();
        jbtFilmes = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu do ator");
        setBackground(new java.awt.Color(114, 134, 211));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone.png")).getImage());

        pnlMenu.setBackground(new java.awt.Color(114, 134, 211));

        jlbMenu.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        jlbMenu.setForeground(new java.awt.Color(255, 255, 255));
        jlbMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMenu.setText("Menu do Ator");

        pnlCadastroFilme1.setBackground(new java.awt.Color(229, 224, 255));
        pnlCadastroFilme1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCadastroFilme1MouseClicked(evt);
            }
        });

        jbtDados.setBackground(new java.awt.Color(142, 167, 233));
        jbtDados.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jbtDados.setForeground(new java.awt.Color(255, 242, 242));
        jbtDados.setText("Dados do Ator");
        jbtDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroFilme1Layout = new javax.swing.GroupLayout(pnlCadastroFilme1);
        pnlCadastroFilme1.setLayout(pnlCadastroFilme1Layout);
        pnlCadastroFilme1Layout.setHorizontalGroup(
            pnlCadastroFilme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroFilme1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtDados, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCadastroFilme1Layout.setVerticalGroup(
            pnlCadastroFilme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroFilme1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtDados, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pnlCadastroFilme.setBackground(new java.awt.Color(229, 224, 255));
        pnlCadastroFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCadastroFilmeMouseClicked(evt);
            }
        });

        jbtFilmes.setBackground(new java.awt.Color(142, 167, 233));
        jbtFilmes.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jbtFilmes.setForeground(new java.awt.Color(255, 242, 242));
        jbtFilmes.setText("Personagens do Ator");
        jbtFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFilmesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroFilmeLayout = new javax.swing.GroupLayout(pnlCadastroFilme);
        pnlCadastroFilme.setLayout(pnlCadastroFilmeLayout);
        pnlCadastroFilmeLayout.setHorizontalGroup(
            pnlCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroFilmeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtFilmes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCadastroFilmeLayout.setVerticalGroup(
            pnlCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroFilmeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtFilmes, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(114, 134, 211));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/5396419 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pnlCadastroFilme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlCadastroFilme1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCadastroFilme1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(pnlCadastroFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlCadastroFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCadastroFilmeMouseClicked
        new CadastroFilme().setVisible(true);
    }//GEN-LAST:event_pnlCadastroFilmeMouseClicked

    private void pnlCadastroFilme1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCadastroFilme1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCadastroFilme1MouseClicked

    private void jbtDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDadosActionPerformed
        new VisuDadosAtor(ator).setVisible(true);
    }//GEN-LAST:event_jbtDadosActionPerformed

    private void jbtFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFilmesActionPerformed
        new VisuPersonagensAtor(ator).setVisible(true);
    }//GEN-LAST:event_jbtFilmesActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizarAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Date data = new Date();
                //Ator ator = new Ator(0,"","","","","","",data,"","",4.0);
                //new VisualizarAtor(ator).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtDados;
    private javax.swing.JButton jbtFilmes;
    private javax.swing.JLabel jlbMenu;
    private javax.swing.JPanel pnlCadastroFilme;
    private javax.swing.JPanel pnlCadastroFilme1;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
