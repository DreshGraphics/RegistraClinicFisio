/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.telas;

import registraclinic.usuario.Usuario;
import registraclinic.usuario.UsuarioDAO;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaAutenticacao extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();

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
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        getContentPane().setLayout(null);

        btCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/Sair2.png"))); // NOI18N
        btCancelar.setBorder(null);
        btCancelar.setBorderPainted(false);
        btCancelar.setContentAreaFilled(false);
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btCancelar.setBounds(170, 390, 60, 60);

        btEntrar.setBackground(new java.awt.Color(255, 255, 255));
        btEntrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/Entrar2.png"))); // NOI18N
        btEntrar.setContentAreaFilled(false);
        btEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btEntrar);
        btEntrar.setBounds(460, 390, 70, 60);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel3.setText("SENHA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 280, 120, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel2.setText("LOGIN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 170, 110, 30);

        txtLogin.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        txtLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        getContentPane().add(txtLogin);
        txtLogin.setBounds(190, 200, 310, 50);

        txtSenha.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        txtSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSenha.setMinimumSize(new java.awt.Dimension(4, 24));
        txtSenha.setPreferredSize(new java.awt.Dimension(4, 24));
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(190, 310, 310, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/Login3.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(700, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(700, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btEntrarActionPerformed(null);
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseEntered

    }//GEN-LAST:event_btCancelarMouseEntered

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/registraclinic/imagens/adverte.png")));

        Object[] options = {"SIM",
            "NÃO"};
        int n = JOptionPane.showOptionDialog(null,
            "Deseja Realmente SAIR?",
            "QUIRON",
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
        if (txtLogin.getText().equals("") || txtSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Prencha todos os campos !!");
        } else {
            
            usuario = usuarioDAO.autenticarUsuario(txtLogin.getText(), txtSenha.getText());

            if (usuario != null) {
                TelaInicial menu = new TelaInicial(null, rootPaneCheckingEnabled,usuario);
                dispose();
                menu.setVisible(true);
            }
        }
    }//GEN-LAST:event_btEntrarActionPerformed

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
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
