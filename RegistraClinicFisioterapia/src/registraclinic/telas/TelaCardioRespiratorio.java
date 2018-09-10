/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.telas;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.JOptionPane;

import registraclinic.cardiorespiratorio.CardioRespiratorio;
import registraclinic.cardiorespiratorio.CardioRespiratorioDAO;

import registraclinic.paciente.Paciente;
import registraclinic.paciente.PacienteDAO;
import registraclinic.paciente.PacienteTableModel;


/**
 *
 * @author Paulo
 */
public class TelaCardioRespiratorio extends javax.swing.JDialog {

    /**
     * Creates new form TelaCardioRespiratorio
     */
            
   CardioRespiratorio cardio = new CardioRespiratorio();
   CardioRespiratorioDAO cardiodao = new CardioRespiratorioDAO();
   
   Paciente paciente = new Paciente();
   PacienteDAO pacienteDAO = new PacienteDAO();
    
    public TelaCardioRespiratorio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        txtPaciente.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBAnamnese = new javax.swing.JButton();
        jBExameFisico = new javax.swing.JButton();
        jBFuncaoPulmonar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonPesquisa = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtPaciente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);

        jBAnamnese.setText("Anamnese");
        jBAnamnese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnamneseActionPerformed(evt);
            }
        });
        jPanel1.add(jBAnamnese);
        jBAnamnese.setBounds(60, 130, 130, 30);

        jBExameFisico.setText("Exame Fisico");
        jBExameFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExameFisicoActionPerformed(evt);
            }
        });
        jPanel1.add(jBExameFisico);
        jBExameFisico.setBounds(270, 130, 150, 30);

        jBFuncaoPulmonar.setText("Função Pulmonar");
        jBFuncaoPulmonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFuncaoPulmonarActionPerformed(evt);
            }
        });
        jPanel1.add(jBFuncaoPulmonar);
        jBFuncaoPulmonar.setBounds(490, 130, 160, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/voltar_fisio.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(290, 430, 70, 60);

        jButtonPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/pesquisar_fisio.png"))); // NOI18N
        jButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPesquisa);
        jButtonPesquisa.setBounds(440, 430, 70, 60);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/save_fisio.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(590, 430, 70, 60);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/add_sub_14-14.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(550, 210, 49, 40);
        jPanel1.add(txtPaciente);
        txtPaciente.setBounds(60, 210, 470, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/cardiorespiratotio0000.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAnamneseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnamneseActionPerformed
        telaAnamneseCardio1 tac = new telaAnamneseCardio1(null, rootPaneCheckingEnabled);
        tac.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAnamneseActionPerformed

    private void jBExameFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExameFisicoActionPerformed
        TelaExameFisico tef = new TelaExameFisico(null, rootPaneCheckingEnabled);
        tef.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBExameFisicoActionPerformed

    private void jBFuncaoPulmonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFuncaoPulmonarActionPerformed
        TelaFuncaoPulmonar tfp = new TelaFuncaoPulmonar(null, rootPaneCheckingEnabled);
        tfp.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBFuncaoPulmonarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       if(!txtPaciente.getText().isEmpty()){
        
        cardio.setPaciente(paciente);
        cardiodao.salvar(cardio);
           JOptionPane.showMessageDialog(null, "salvo com sucesso");
       }else{
       
          JOptionPane.showMessageDialog(null, "deu errdo");
       }

        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
        PesquisaGenerica pg = new PesquisaGenerica(null, rootPaneCheckingEnabled);
        pg.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPesquisaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        List<Paciente> lista;
        lista = (pacienteDAO.listar());
        PacienteTableModel itm = new PacienteTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Pacinte");
        if (objetoRetorno != null) {
            paciente = pacienteDAO.consultarObjetoId("idPessoa", objetoRetorno);
            txtPaciente.setText(paciente.getNomePessoa());
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCardioRespiratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCardioRespiratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCardioRespiratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCardioRespiratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCardioRespiratorio dialog = new TelaCardioRespiratorio(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnamnese;
    private javax.swing.JButton jBExameFisico;
    private javax.swing.JButton jBFuncaoPulmonar;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
