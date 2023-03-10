/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.Ator;
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Locale;  

/**
 *
 * @author wesle
 */
public class VisuDadosAtor extends javax.swing.JFrame {

    private Ator ator;
    
    public VisuDadosAtor(Ator ator) {
        
        this.ator = ator;
        initComponents();
        
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
        String strDate = formatter.format(ator.getData_nascimento());

        //mostrar dados do ator
        jlbMostraNome.setText(ator.getNome());
        jlbMostraCPF.setText(ator.getCpf());
        jlbMostraTelefone.setText(ator.getTelefone());
        jlbMostraEmail.setText(ator.getEmail());
        jlbMostraData_nascimento.setText(strDate);
        jlbMostraSexo.setText(ator.getSexo());
        jlbMostraNacionalidade.setText(ator.getNacionalidade());
        jlbMostraPagamento.setText(String.valueOf(ator.getPagamento()));
        jlbMostraTempo_experiencia.setText(String.valueOf(ator.getTempoExperiencia()));
        jlbMostraBiografia.setText(ator.getBiografia());
        jlbMostraTotal_Receber.setText(String.valueOf(ator.totalReceber()));
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDadosFuncionario = new javax.swing.JPanel();
        jlbNome = new javax.swing.JLabel();
        jlbCpf = new javax.swing.JLabel();
        jlbData_nascimento = new javax.swing.JLabel();
        jlbTelefone = new javax.swing.JLabel();
        jlbEmail = new javax.swing.JLabel();
        jlbSexo = new javax.swing.JLabel();
        jlbNacionalidade = new javax.swing.JLabel();
        jlbPagamento = new javax.swing.JLabel();
        jlbTempo_experiencia = new javax.swing.JLabel();
        jlbTotal_receber = new javax.swing.JLabel();
        jlbMostraNome = new javax.swing.JLabel();
        jlbMostraCPF = new javax.swing.JLabel();
        jlbMostraTelefone = new javax.swing.JLabel();
        jlbMostraEmail = new javax.swing.JLabel();
        jlbMostraData_nascimento = new javax.swing.JLabel();
        jlbMostraSexo = new javax.swing.JLabel();
        jlbMostraNacionalidade = new javax.swing.JLabel();
        jlbMostraPagamento = new javax.swing.JLabel();
        jlbMostraTempo_experiencia = new javax.swing.JLabel();
        jlbMostraBiografia = new javax.swing.JLabel();
        jlbMostraTotal_Receber = new javax.swing.JLabel();
        jlbBiografia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dados do ator");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone.png")).getImage());

        pnlDadosFuncionario.setBackground(new java.awt.Color(114, 134, 211));
        pnlDadosFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Dados do Ator", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 242, 242))); // NOI18N
        pnlDadosFuncionario.setForeground(new java.awt.Color(229, 224, 255));
        pnlDadosFuncionario.setName(""); // NOI18N

        jlbNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbNome.setForeground(new java.awt.Color(255, 242, 242));
        jlbNome.setText("Nome:");

        jlbCpf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbCpf.setForeground(new java.awt.Color(255, 242, 242));
        jlbCpf.setText("CPF:");

        jlbData_nascimento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbData_nascimento.setForeground(new java.awt.Color(255, 242, 242));
        jlbData_nascimento.setText("Data de Nascimento:");

        jlbTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbTelefone.setForeground(new java.awt.Color(255, 242, 242));
        jlbTelefone.setText("Telefone:");

        jlbEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbEmail.setForeground(new java.awt.Color(255, 242, 242));
        jlbEmail.setText("Email:");

        jlbSexo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbSexo.setForeground(new java.awt.Color(255, 242, 242));
        jlbSexo.setText("Sexo:");

        jlbNacionalidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbNacionalidade.setForeground(new java.awt.Color(255, 242, 242));
        jlbNacionalidade.setText("Nacionalidade:");

        jlbPagamento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbPagamento.setForeground(new java.awt.Color(255, 242, 242));
        jlbPagamento.setText("Pagamento:");

        jlbTempo_experiencia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbTempo_experiencia.setForeground(new java.awt.Color(255, 242, 242));
        jlbTempo_experiencia.setText("Tempo de Experiencia:");

        jlbTotal_receber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbTotal_receber.setForeground(new java.awt.Color(255, 242, 242));
        jlbTotal_receber.setText("Total para Receber:");

        jlbMostraNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jlbMostraCPF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jlbMostraTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jlbMostraEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jlbMostraData_nascimento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jlbMostraSexo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jlbMostraNacionalidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jlbMostraPagamento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jlbMostraTempo_experiencia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jlbMostraBiografia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jlbMostraTotal_Receber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jlbBiografia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbBiografia.setForeground(new java.awt.Color(255, 242, 242));
        jlbBiografia.setText("Biogafria:");

        javax.swing.GroupLayout pnlDadosFuncionarioLayout = new javax.swing.GroupLayout(pnlDadosFuncionario);
        pnlDadosFuncionario.setLayout(pnlDadosFuncionarioLayout);
        pnlDadosFuncionarioLayout.setHorizontalGroup(
            pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosFuncionarioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosFuncionarioLayout.createSequentialGroup()
                        .addComponent(jlbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(pnlDadosFuncionarioLayout.createSequentialGroup()
                        .addGroup(pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosFuncionarioLayout.createSequentialGroup()
                                .addGroup(pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbNome)
                                    .addGroup(pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jlbTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlbData_nascimento))
                                    .addComponent(jlbPagamento)
                                    .addComponent(jlbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbNacionalidade)
                                    .addComponent(jlbTempo_experiencia)
                                    .addComponent(jlbBiografia))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jlbTotal_receber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlbMostraTotal_Receber, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                        .addComponent(jlbMostraBiografia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbMostraTempo_experiencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jlbMostraData_nascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                        .addComponent(jlbMostraEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbMostraTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbMostraCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbMostraNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbMostraSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbMostraNacionalidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbMostraPagamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlDadosFuncionarioLayout.setVerticalGroup(
            pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosFuncionarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbMostraNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbMostraCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbMostraTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbEmail)
                    .addComponent(jlbMostraEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbData_nascimento)
                    .addComponent(jlbMostraData_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDadosFuncionarioLayout.createSequentialGroup()
                        .addComponent(jlbSexo)
                        .addGap(18, 18, 18)
                        .addComponent(jlbNacionalidade)
                        .addGap(18, 18, 18)
                        .addComponent(jlbPagamento))
                    .addGroup(pnlDadosFuncionarioLayout.createSequentialGroup()
                        .addComponent(jlbMostraSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlbMostraNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbMostraPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosFuncionarioLayout.createSequentialGroup()
                        .addComponent(jlbMostraTempo_experiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlbMostraBiografia, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDadosFuncionarioLayout.createSequentialGroup()
                        .addComponent(jlbTempo_experiencia)
                        .addGap(18, 18, 18)
                        .addComponent(jlbBiografia)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(pnlDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbTotal_receber)
                    .addComponent(jlbMostraTotal_Receber, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VisuDadosAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisuDadosAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisuDadosAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisuDadosAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Date data = new Date();
                //Ator ator = new Ator(0,"","","","","","",data,"","",4.0);
                //new VisuDadosAtor(ator).setVisible(true);
                //new VisuDadorAtor().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbBiografia;
    private javax.swing.JLabel jlbCpf;
    private javax.swing.JLabel jlbData_nascimento;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbMostraBiografia;
    private javax.swing.JLabel jlbMostraCPF;
    private javax.swing.JLabel jlbMostraData_nascimento;
    private javax.swing.JLabel jlbMostraEmail;
    private javax.swing.JLabel jlbMostraNacionalidade;
    private javax.swing.JLabel jlbMostraNome;
    private javax.swing.JLabel jlbMostraPagamento;
    private javax.swing.JLabel jlbMostraSexo;
    private javax.swing.JLabel jlbMostraTelefone;
    private javax.swing.JLabel jlbMostraTempo_experiencia;
    private javax.swing.JLabel jlbMostraTotal_Receber;
    private javax.swing.JLabel jlbNacionalidade;
    private javax.swing.JLabel jlbNome;
    private javax.swing.JLabel jlbPagamento;
    private javax.swing.JLabel jlbSexo;
    private javax.swing.JLabel jlbTelefone;
    private javax.swing.JLabel jlbTempo_experiencia;
    private javax.swing.JLabel jlbTotal_receber;
    private javax.swing.JPanel pnlDadosFuncionario;
    // End of variables declaration//GEN-END:variables
}
