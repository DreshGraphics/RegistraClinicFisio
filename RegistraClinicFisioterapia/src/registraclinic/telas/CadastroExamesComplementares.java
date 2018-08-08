/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.telas;

import registraclinic.cidade.Cidade;
import registraclinic.cidade.CidadeDAO;
import registraclinic.cidade.CidadeTableModel;
import registraclinic.usuario.Usuario;
import registraclinic.util.Util;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriano Lima
 */
public class CadastroExamesComplementares extends javax.swing.JDialog {

    

    /**
     * Creates new form TelaCadastroUsuario
     *
     * @param usuario
     */
    public CadastroExamesComplementares(java.awt.Frame parent, boolean modal) {
        initComponents();
        btExcluir.setEnabled(false);
        getRootPane().setDefaultButton(btSalvar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVoltar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtDiagnosticoMedico1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDiagnosticoMedico = new javax.swing.JTextArea();
        jLObrigatorioNome4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLObrigatorioNome13 = new javax.swing.JLabel();
        jlNomeUsuario3 = new javax.swing.JLabel();
        jLObrigatorioNome2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(602, 421));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        btVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/voltar_fisio.png"))); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setContentAreaFilled(false);
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar);
        btVoltar.setBounds(10, 340, 80, 70);

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/pesquisar_fisio.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar);
        btPesquisar.setBounds(260, 340, 100, 70);

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/excluir_fisio.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setContentAreaFilled(false);
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(370, 340, 80, 70);

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/limpar_fisio.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setContentAreaFilled(false);
        btLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(150, 340, 80, 70);

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/save_fisio.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar);
        btSalvar.setBounds(500, 340, 80, 70);

        txtDataNascimento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(58, 100, 62), 1, true));
        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtDataNascimento);
        txtDataNascimento.setBounds(20, 210, 110, 30);

        jtDiagnosticoMedico1.setColumns(20);
        jtDiagnosticoMedico1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtDiagnosticoMedico1.setLineWrap(true);
        jtDiagnosticoMedico1.setRows(3);
        jtDiagnosticoMedico1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 100, 62), 1, true));
        jScrollPane3.setViewportView(jtDiagnosticoMedico1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(140, 210, 440, 110);

        jtDiagnosticoMedico.setColumns(20);
        jtDiagnosticoMedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtDiagnosticoMedico.setLineWrap(true);
        jtDiagnosticoMedico.setRows(3);
        jtDiagnosticoMedico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 100, 62), 1, true));
        jScrollPane2.setViewportView(jtDiagnosticoMedico);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 80, 560, 100);

        jLObrigatorioNome4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome4.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome4.setText("*");
        getContentPane().add(jLObrigatorioNome4);
        jLObrigatorioNome4.setBounds(570, 200, 10, 10);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Laudo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 190, 70, 19);

        jLObrigatorioNome13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome13.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome13.setText("*");
        getContentPane().add(jLObrigatorioNome13);
        jLObrigatorioNome13.setBounds(120, 200, 10, 10);

        jlNomeUsuario3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario3.setText("Exames Complementares");
        getContentPane().add(jlNomeUsuario3);
        jlNomeUsuario3.setBounds(20, 60, 200, 20);

        jLObrigatorioNome2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome2.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome2.setText("*");
        getContentPane().add(jLObrigatorioNome2);
        jLObrigatorioNome2.setBounds(570, 70, 10, 10);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Data");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 190, 35, 19);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/CIDADES.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel6.setMaximumSize(new java.awt.Dimension(600, 424));
        jLabel6.setMinimumSize(new java.awt.Dimension(600, 424));
        jLabel6.setPreferredSize(new java.awt.Dimension(600, 424));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 600, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
//        List<Cidade> lista;
//        lista = cidadeDAO.listar();
//        CidadeTableModel itm = new CidadeTableModel(lista);
//        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Cidade");
//        if (objetoRetorno != null) {
//            cidade = cidadeDAO.consultarObjetoId("idCidade", objetoRetorno);
//            txtCidade.setText(cidade.getNomeCidade());
//            txtCep.setText(cidade.getCepCidade());
//            jcEstado.setSelectedItem(cidade.getEstadoCidade());
//            btExcluir.setEnabled(true);
//
//        }

    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
//        cidadeDAO.excluir(cidade);
//        btLimparActionPerformed(null);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
//        Util.limparCamposGenerico(this);
//        btExcluir.setEnabled(false);
//        cidade = new Cidade();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

//        if (cidadeDAO.consultarValorRepetido("cepCidade", txtCep.getText()) && cidade.getIdCidade() == 0) {
//            JOptionPane.showMessageDialog(rootPane, "O CEP '" + txtCep.getText() + "' já está cadastrado!",
//                    "Erro ao salvar", JOptionPane.ERROR_MESSAGE);
//        } else {
//            if (Util.chkVazio(txtCep.getText(), txtCidade.getText(), String.valueOf(jcEstado.getSelectedItem()))) {
//                cidade.setNomeCidade(txtCidade.getText().toUpperCase());
//                cidade.setEstadoCidade(String.valueOf(jcEstado.getSelectedItem()));
//                cidade.setCepCidade(txtCep.getText());
//                cidadeDAO.salvar(cidade);
//                btLimparActionPerformed(null);
//                jcEstado.setSelectedIndex(0);
//            }
//        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();

    }//GEN-LAST:event_btVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroExamesComplementares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroExamesComplementares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroExamesComplementares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroExamesComplementares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroExamesComplementares dialog = new CadastroExamesComplementares(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLObrigatorioNome13;
    private javax.swing.JLabel jLObrigatorioNome2;
    private javax.swing.JLabel jLObrigatorioNome4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jlNomeUsuario3;
    private javax.swing.JTextArea jtDiagnosticoMedico;
    private javax.swing.JTextArea jtDiagnosticoMedico1;
    private javax.swing.JFormattedTextField txtDataNascimento;
    // End of variables declaration//GEN-END:variables
}