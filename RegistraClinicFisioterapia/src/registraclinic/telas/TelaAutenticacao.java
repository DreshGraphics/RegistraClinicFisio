/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.telas;

import registraclinic.usuario.Usuario;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import registraclinic.aluno.Aluno;
import registraclinic.aluno.AlunoDAO;
import registraclinic.funcionario.Funcionario;
import registraclinic.funcionario.FuncionarioDAO;
import registraclinic.supervisor.Supervisor;
import registraclinic.supervisor.SupervisorDAO;

public class TelaAutenticacao extends javax.swing.JFrame {

    Usuario aluno;
    AlunoDAO alunoDAO = new AlunoDAO();
    Usuario funcionario;
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    Usuario supervisor;
    SupervisorDAO supervisorDAO = new SupervisorDAO();

    /**
     * Creates new form TelaLogin
     */
    public TelaAutenticacao() {
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

        btCancelar = new javax.swing.JButton();
        btEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcTipoUsuario = new javax.swing.JComboBox<>();
        txtLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 562));
        setUndecorated(true);
        getContentPane().setLayout(null);

        btCancelar.setBackground(new java.awt.Color(0, 102, 0));
        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/Sair_80-80.png"))); // NOI18N
        btCancelar.setText("Sair");
        btCancelar.setBorder(null);
        btCancelar.setBorderPainted(false);
        btCancelar.setContentAreaFilled(false);
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCancelarMouseEntered(evt);
            }
        });
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelar);
        btCancelar.setBounds(780, 430, 90, 110);

        btEntrar.setBackground(new java.awt.Color(255, 255, 255));
        btEntrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/Entrar_80-80.png"))); // NOI18N
        btEntrar.setText("Entrar");
        btEntrar.setContentAreaFilled(false);
        btEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEntrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btEntrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btEntrar);
        btEntrar.setBounds(890, 430, 90, 113);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel3.setText("TIPO DE USUÁRIO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(460, 290, 220, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel2.setText("LOGIN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 90, 110, 30);

        jcTipoUsuario.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jcTipoUsuario.setForeground(new java.awt.Color(58, 100, 62));
        jcTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Aluno", "Funcionário", "Supervisor" }));
        jcTipoUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(58, 100, 62), 2, true));
        jcTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jcTipoUsuario);
        jcTipoUsuario.setBounds(460, 320, 340, 50);

        txtLogin.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        txtLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 100, 62), 2, true));
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        getContentPane().add(txtLogin);
        txtLogin.setBounds(460, 120, 340, 50);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel4.setText("SENHA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 190, 120, 30);

        txtSenha.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        txtSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 100, 62), 2, true));
        txtSenha.setMinimumSize(new java.awt.Dimension(4, 24));
        txtSenha.setPreferredSize(new java.awt.Dimension(4, 24));
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(460, 220, 340, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/Login_2.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 570));
        jLabel1.setMinimumSize(new java.awt.Dimension(1000, 570));
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 570));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseEntered

    }//GEN-LAST:event_btCancelarMouseEntered

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/registraclinic/imagens/adverte.png")));

        Object[] options = {"SIM",
            "NÃO"};
        int n = JOptionPane.showOptionDialog(null,
                "Deseja Realmente SAIR?",
                "",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                figura,
                options,
                options[1]);
        if (n == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        if (txtLogin.getText().equals("") || txtSenha.getText().equals("") || jcTipoUsuario.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Prencha todos os campos !!");
        } else {
            if (jcTipoUsuario.getSelectedItem().equals("Aluno")) {
                aluno = alunoDAO.autenticarUsuario(txtLogin.getText(), txtSenha.getText());
                if (aluno != null) {
                    MenuPrincipal menu = new MenuPrincipal(aluno);
                    dispose();
                    menu.setVisible(true);
                }
            }
            if (jcTipoUsuario.getSelectedItem().equals("Supervisor")) {
                supervisor = supervisorDAO.autenticarUsuario(txtLogin.getText(), txtSenha.getText());
                if (supervisor != null) {
                    MenuPrincipal menu = new MenuPrincipal(supervisor);
                    dispose();
                    menu.setVisible(true);
                }
            }
            if (jcTipoUsuario.getSelectedItem().equals("Funcionário")) {
                funcionario = funcionarioDAO.autenticarUsuario(txtLogin.getText(), txtSenha.getText());
                if (funcionario != null) {
                    MenuPrincipal menu = new MenuPrincipal(funcionario);
                    dispose();
                    menu.setVisible(true);
                }
            }
        }

    }//GEN-LAST:event_btEntrarActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btEntrarActionPerformed(null);
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void jcTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTipoUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAutenticacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> jcTipoUsuario;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
