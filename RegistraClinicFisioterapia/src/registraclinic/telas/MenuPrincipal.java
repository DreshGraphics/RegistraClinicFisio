/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.telas;

import registraclinic.usuario.Usuario;
import registraclinic.util.Util;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karlos Oliveira
 */
public class MenuPrincipal extends javax.swing.JFrame {

    Usuario usuario;

    public MenuPrincipal(Usuario usuario) {
        initComponents();
        menuRelatorio.setVisible(false);
        menuSaida.setVisible(false);
        menuSaida1.setVisible(false);
        this.usuario = usuario;
        jlUsuario.setText(usuario.getLoginUsuario());
        if (usuario.getTipoUsuario().equalsIgnoreCase("Aluno")) {
            subUsuario.setVisible(false);
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btLogout = new javax.swing.JButton();
        jlUsuario = new javax.swing.JLabel();
        jlNome3 = new javax.swing.JLabel();
        jlHome = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        subTriagem = new javax.swing.JMenuItem();
        subAtendimento = new javax.swing.JMenuItem();
        subCidades = new javax.swing.JMenuItem();
        subUsuario = new javax.swing.JMenuItem();
        menuSaida = new javax.swing.JMenu();
        subProdutoConsumo = new javax.swing.JMenuItem();
        subUsuario2 = new javax.swing.JMenuItem();
        saidaProdutoDeConsumo = new javax.swing.JMenuItem();
        subDevolverEstoqueConsumo = new javax.swing.JMenuItem();
        menuSaida1 = new javax.swing.JMenu();
        subProdutoPermanente = new javax.swing.JMenuItem();
        subEstoquePermanente3 = new javax.swing.JMenuItem();
        saidaProdutoPermanente1 = new javax.swing.JMenuItem();
        subDevolverEstoquePermanente = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1020, 623));
        setUndecorated(true);
        getContentPane().setLayout(null);

        btLogout.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/Logoff_2.png"))); // NOI18N
        btLogout.setText("Sair");
        btLogout.setToolTipText("Sair");
        btLogout.setContentAreaFilled(false);
        btLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btLogout);
        btLogout.setBounds(910, 470, 100, 120);

        jlUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlUsuario.setText("???");
        getContentPane().add(jlUsuario);
        jlUsuario.setBounds(120, 510, 670, 30);

        jlNome3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlNome3.setText("Usuário:");
        getContentPane().add(jlNome3);
        jlNome3.setBounds(10, 510, 110, 30);

        jlHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/TELA_INICIAL_3.png"))); // NOI18N
        jlHome.setMaximumSize(new java.awt.Dimension(1020, 620));
        jlHome.setMinimumSize(new java.awt.Dimension(1020, 620));
        jlHome.setPreferredSize(new java.awt.Dimension(1020, 620));
        getContentPane().add(jlHome);
        jlHome.setBounds(0, 0, 1020, 620);

        jMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu.setForeground(new java.awt.Color(51, 204, 0));
        jMenu.setBorderPainted(false);
        jMenu.setMaximumSize(new java.awt.Dimension(900, 200));
        jMenu.setMinimumSize(new java.awt.Dimension(900, 200));

        menuCadastros.setText("Cadastro");
        menuCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuCadastros.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menuCadastros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuCadastros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        subTriagem.setText("Triagem");
        subTriagem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subTriagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subTriagemActionPerformed(evt);
            }
        });
        menuCadastros.add(subTriagem);

        subAtendimento.setText("Atendimento");
        subAtendimento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subAtendimentoActionPerformed(evt);
            }
        });
        menuCadastros.add(subAtendimento);

        subCidades.setText("Cidades");
        subCidades.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCidadesActionPerformed(evt);
            }
        });
        menuCadastros.add(subCidades);

        subUsuario.setText("Usuário");
        subUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subUsuarioActionPerformed(evt);
            }
        });
        menuCadastros.add(subUsuario);

        jMenu.add(menuCadastros);

        menuSaida.setText("Consumo");
        menuSaida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuSaida.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menuSaida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuSaida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuSaida.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        subProdutoConsumo.setText("Cadastro Produto de Consumo");
        subProdutoConsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subProdutoConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subProdutoConsumoActionPerformed(evt);
            }
        });
        menuSaida.add(subProdutoConsumo);

        subUsuario2.setText("Cadastro Estoque Consumo");
        subUsuario2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subUsuario2ActionPerformed(evt);
            }
        });
        menuSaida.add(subUsuario2);

        saidaProdutoDeConsumo.setText("Saída Produto Consumo");
        saidaProdutoDeConsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        saidaProdutoDeConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saidaProdutoDeConsumoActionPerformed(evt);
            }
        });
        menuSaida.add(saidaProdutoDeConsumo);

        subDevolverEstoqueConsumo.setText("Devolver Produtos Consumo");
        subDevolverEstoqueConsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subDevolverEstoqueConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subDevolverEstoqueConsumoActionPerformed(evt);
            }
        });
        menuSaida.add(subDevolverEstoqueConsumo);

        jMenu.add(menuSaida);

        menuSaida1.setText("Permanente");
        menuSaida1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuSaida1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menuSaida1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuSaida1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuSaida1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        subProdutoPermanente.setText("Cadastro Produto Permanente");
        subProdutoPermanente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subProdutoPermanente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subProdutoPermanenteActionPerformed(evt);
            }
        });
        menuSaida1.add(subProdutoPermanente);

        subEstoquePermanente3.setText("Cadastro Estoque Permanente");
        subEstoquePermanente3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subEstoquePermanente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subEstoquePermanente3ActionPerformed(evt);
            }
        });
        menuSaida1.add(subEstoquePermanente3);

        saidaProdutoPermanente1.setText("Saída Produto Permanente");
        saidaProdutoPermanente1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        saidaProdutoPermanente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saidaProdutoPermanente1ActionPerformed(evt);
            }
        });
        menuSaida1.add(saidaProdutoPermanente1);

        subDevolverEstoquePermanente.setText("Devolver Produtos Permanente");
        subDevolverEstoquePermanente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subDevolverEstoquePermanente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subDevolverEstoquePermanenteActionPerformed(evt);
            }
        });
        menuSaida1.add(subDevolverEstoquePermanente);

        jMenu.add(menuSaida1);

        menuRelatorio.setText("Relatórios");
        menuRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuRelatorio.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menuRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioActionPerformed(evt);
            }
        });
        jMenu.add(menuRelatorio);

        setJMenuBar(jMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        TelaAutenticacao telaAutenticar = new TelaAutenticacao();
        telaAutenticar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btLogoutActionPerformed

    private void subUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subUsuarioActionPerformed
        

    }//GEN-LAST:event_subUsuarioActionPerformed

    private void subProdutoConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subProdutoConsumoActionPerformed
       
    }//GEN-LAST:event_subProdutoConsumoActionPerformed

    private void subTriagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subTriagemActionPerformed
        
    }//GEN-LAST:event_subTriagemActionPerformed

    private void menuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRelatorioActionPerformed

    private void subUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subUsuario2ActionPerformed
       
    }//GEN-LAST:event_subUsuario2ActionPerformed

    private void saidaProdutoDeConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saidaProdutoDeConsumoActionPerformed
       
    }//GEN-LAST:event_saidaProdutoDeConsumoActionPerformed

    private void subProdutoPermanenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subProdutoPermanenteActionPerformed
        
    }//GEN-LAST:event_subProdutoPermanenteActionPerformed

    private void subAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subAtendimentoActionPerformed
       
    }//GEN-LAST:event_subAtendimentoActionPerformed

    private void subDevolverEstoqueConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subDevolverEstoqueConsumoActionPerformed
       
    }//GEN-LAST:event_subDevolverEstoqueConsumoActionPerformed

    private void saidaProdutoPermanente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saidaProdutoPermanente1ActionPerformed
       
    }//GEN-LAST:event_saidaProdutoPermanente1ActionPerformed

    private void subEstoquePermanente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subEstoquePermanente3ActionPerformed
        
    }//GEN-LAST:event_subEstoquePermanente3ActionPerformed

    private void subDevolverEstoquePermanenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subDevolverEstoquePermanenteActionPerformed
        
    }//GEN-LAST:event_subDevolverEstoquePermanenteActionPerformed

    private void subCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCidadesActionPerformed
       
    }//GEN-LAST:event_subCidadesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogout;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JLabel jlHome;
    private javax.swing.JLabel jlNome3;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSaida;
    private javax.swing.JMenu menuSaida1;
    private javax.swing.JMenuItem saidaProdutoDeConsumo;
    private javax.swing.JMenuItem saidaProdutoPermanente1;
    private javax.swing.JMenuItem subAtendimento;
    private javax.swing.JMenuItem subCidades;
    private javax.swing.JMenuItem subDevolverEstoqueConsumo;
    private javax.swing.JMenuItem subDevolverEstoquePermanente;
    private javax.swing.JMenuItem subEstoquePermanente3;
    private javax.swing.JMenuItem subProdutoConsumo;
    private javax.swing.JMenuItem subProdutoPermanente;
    private javax.swing.JMenuItem subTriagem;
    private javax.swing.JMenuItem subUsuario;
    private javax.swing.JMenuItem subUsuario2;
    // End of variables declaration//GEN-END:variables
}
