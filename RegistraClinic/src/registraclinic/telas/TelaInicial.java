/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.telas;

import java.awt.Frame;
import registraclinic.usuario.Usuario;

/**
 *
 * @author DSONE
 */
public class TelaInicial extends javax.swing.JDialog {

    
    Usuario usuario = new Usuario();
    
    /**
     * Creates new form TelaInicial
     */
    public TelaInicial(java.awt.Frame parent, boolean modal, Usuario usuario) {
        super(parent, modal);
        initComponents();
        this.usuario = usuario;
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
        tfAluno = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tfPaciente = new javax.swing.JButton();
        tfSupervisor1 = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        tfAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/icons8_Student_Male_50px.png"))); // NOI18N
        tfAluno.setText("Aluno");
        tfAluno.setContentAreaFilled(false);
        tfAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tfAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tfAluno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tfAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAlunoActionPerformed(evt);
            }
        });
        jPanel1.add(tfAluno);
        tfAluno.setBounds(520, 210, 83, 100);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/icons8_Delete_26px_2.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(650, 0, 50, 50);

        tfPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/icons8_Cast_50px.png"))); // NOI18N
        tfPaciente.setText("Paciente");
        tfPaciente.setContentAreaFilled(false);
        tfPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tfPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tfPaciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tfPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(tfPaciente);
        tfPaciente.setBounds(70, 210, 100, 100);

        tfSupervisor1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfSupervisor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/icons8_Course_50px.png"))); // NOI18N
        tfSupervisor1.setText("Supervisor");
        tfSupervisor1.setContentAreaFilled(false);
        tfSupervisor1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tfSupervisor1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tfSupervisor1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tfSupervisor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSupervisor1ActionPerformed(evt);
            }
        });
        jPanel1.add(tfSupervisor1);
        tfSupervisor1.setBounds(60, 340, 120, 100);

        btnUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/icon_func.png"))); // NOI18N
        btnUsuario.setText("Usuário");
        btnUsuario.setContentAreaFilled(false);
        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuario);
        btnUsuario.setBounds(510, 340, 100, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/Menu-Principal.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAlunoActionPerformed
        CadastroAluno MainAluno = new CadastroAluno(null, rootPaneCheckingEnabled);
        MainAluno.setVisible(true);
    }//GEN-LAST:event_tfAlunoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPacienteActionPerformed
        CadastroPaciente MainPaciente = new CadastroPaciente(null, rootPaneCheckingEnabled);
        MainPaciente.setVisible(true);
    }//GEN-LAST:event_tfPacienteActionPerformed

    private void tfSupervisor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSupervisor1ActionPerformed
        CadastroSupervisor cadastroSupervisor = new CadastroSupervisor(null, rootPaneCheckingEnabled);
        cadastroSupervisor.setVisible(true);
    }//GEN-LAST:event_tfSupervisor1ActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        CadastroUsuario cadastroFuncionario = new CadastroUsuario(null, rootPaneCheckingEnabled);
        cadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_btnUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaInicial dialog = new TelaInicial(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tfAluno;
    private javax.swing.JButton tfPaciente;
    private javax.swing.JButton tfSupervisor1;
    // End of variables declaration//GEN-END:variables
}
