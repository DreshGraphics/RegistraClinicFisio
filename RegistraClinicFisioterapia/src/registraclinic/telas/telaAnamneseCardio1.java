/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.telas;

import javax.swing.JOptionPane;
import registraclinic.cardiorespiratorio.CardioRespiratorio;
import registraclinic.cardiorespiratorio.CardioRespiratorioDAO;

/**
 *
 * @author Paulo
 */
public class telaAnamneseCardio1 extends javax.swing.JDialog {

    /**
     * Creates new form telaAnamneseCardio1
     */
    public telaAnamneseCardio1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    CardioRespiratorio cardio = new CardioRespiratorio();
    CardioRespiratorioDAO cardioDAO = new CardioRespiratorioDAO();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        ANAMNESE = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTDiagnosticoClinico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTQueixaPrincipal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTHDA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTHistoricoFamiliar = new javax.swing.JTextField();
        HABITOS = new javax.swing.JPanel();
        jCTabagismo = new javax.swing.JCheckBox();
        jCObesidade = new javax.swing.JCheckBox();
        jCHAS = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jTCigarrosDia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTTempoParado = new javax.swing.JTextField();
        jCEtilismo = new javax.swing.JCheckBox();
        jChEstresse = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jTAnosTabagismo = new javax.swing.JTextField();
        jcAtividadeFisica = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jCControleAlimentar = new javax.swing.JCheckBox();
        jCDiabetes = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jTMedicacoesUso = new javax.swing.JTextField();
        jTExamesComplementares = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);

        jLabel2.setText("DIAGNÓSTICO CLÍNICO:");

        jLabel3.setText("QUEIXA PRINCIPAL:");

        jLabel4.setText("HDA:");

        jLabel5.setText("HISTÓRICO FAMILIAR:");

        javax.swing.GroupLayout ANAMNESELayout = new javax.swing.GroupLayout(ANAMNESE);
        ANAMNESE.setLayout(ANAMNESELayout);
        ANAMNESELayout.setHorizontalGroup(
            ANAMNESELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ANAMNESELayout.createSequentialGroup()
                .addGroup(ANAMNESELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ANAMNESELayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTDiagnosticoClinico))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ANAMNESELayout.createSequentialGroup()
                        .addGroup(ANAMNESELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ANAMNESELayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(ANAMNESELayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ANAMNESELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTHDA, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                            .addComponent(jTHistoricoFamiliar)))
                    .addGroup(ANAMNESELayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTQueixaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        ANAMNESELayout.setVerticalGroup(
            ANAMNESELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ANAMNESELayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(ANAMNESELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDiagnosticoClinico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ANAMNESELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQueixaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(ANAMNESELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTHDA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ANAMNESELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTHistoricoFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("ANAMNESE", ANAMNESE);

        jCTabagismo.setText("TABAGISMO");
        jCTabagismo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTabagismoActionPerformed(evt);
            }
        });

        jCObesidade.setText("OBESIDADE");

        jCHAS.setText("HAS");

        jLabel6.setText("CIGARROS/DIA:");

        jTCigarrosDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCigarrosDiaActionPerformed(evt);
            }
        });

        jLabel8.setText("TEMPO PARADO:");

        jCEtilismo.setText("ETILISMO");

        jChEstresse.setText("ESTRESSE");
        jChEstresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChEstresseActionPerformed(evt);
            }
        });

        jLabel7.setText("ANOS/TABAGISMO:");

        jcAtividadeFisica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("ATIVDADE FÍSICA:");

        jCControleAlimentar.setText("CONTROLE ALIMENTAR");

        jCDiabetes.setText("DIABETES");

        jLabel10.setText("MAEDICAÇÕES DE USO:");

        jLabel11.setText("EXAMES COMPLEMENTARES:");

        javax.swing.GroupLayout HABITOSLayout = new javax.swing.GroupLayout(HABITOS);
        HABITOS.setLayout(HABITOSLayout);
        HABITOSLayout.setHorizontalGroup(
            HABITOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HABITOSLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(HABITOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HABITOSLayout.createSequentialGroup()
                        .addGroup(HABITOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HABITOSLayout.createSequentialGroup()
                                .addComponent(jCTabagismo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCObesidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCHAS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HABITOSLayout.createSequentialGroup()
                                .addComponent(jCEtilismo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jChEstresse, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HABITOSLayout.createSequentialGroup()
                                .addComponent(jCDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCControleAlimentar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(HABITOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HABITOSLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcAtividadeFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HABITOSLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTCigarrosDia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTTempoParado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HABITOSLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTAnosTabagismo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HABITOSLayout.createSequentialGroup()
                        .addGroup(HABITOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(HABITOSLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTExamesComplementares))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HABITOSLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTMedicacoesUso, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
        );
        HABITOSLayout.setVerticalGroup(
            HABITOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HABITOSLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(HABITOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCTabagismo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCObesidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCHAS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCigarrosDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTempoParado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(HABITOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCEtilismo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChEstresse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTAnosTabagismo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(HABITOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCControleAlimentar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcAtividadeFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(HABITOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTMedicacoesUso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(HABITOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTExamesComplementares, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HABITOS DE VIDA E FR", HABITOS);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 130, 700, 290);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/voltar_fisio.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 430, 70, 60);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/limpar_fisio.png"))); // NOI18N
        jPanel1.add(jButton3);
        jButton3.setBounds(460, 430, 70, 60);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/save_fisio.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(580, 430, 70, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/anamnesecardio0000.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTCigarrosDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCigarrosDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCigarrosDiaActionPerformed

    private void jChEstresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChEstresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChEstresseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaCardioRespiratorio cr = new TelaCardioRespiratorio(null, rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!jTDiagnosticoClinico.getText().equals(" ")){
            cardio.setDiagnosticoClinico(jTDiagnosticoClinico.getText());
            cardio.setQueixaPrincipal(jTQueixaPrincipal.getText());
            cardio.setHDA(jTHDA.getText());
            cardio.setHistoricoFamiliar(jTHistoricoFamiliar.getText());
            cardio.setMedicacaoDeUso(jTMedicacoesUso.getText());
            cardio.setExamesComplementares(jTExamesComplementares.getText());
            cardio.setCigarrosDias(jTCigarrosDia.getText());
            cardio.setTempoParado(jTTempoParado.getText());
            cardio.setAnosTabag(jTAnosTabagismo.getText());
            cardio.setAtividadeFisica(jcAtividadeFisica.getSelectedItem().toString());
            cardio.setObesidade(jCTabagismo.isSelected());
            cardio.setTabagismo(jCTabagismo.isSelected());
            cardio.setHAS(jCHAS.isSelected());
            cardio.setEtilismo(jCEtilismo.isSelected());
            cardio.setEstresse(jChEstresse.isSelected());
            cardio.setDiabetes(jCControleAlimentar.isSelected());
            cardio.setControleAlimentar(jCControleAlimentar.isSelected());
            cardioDAO.salvar(cardio);
            JOptionPane.showMessageDialog(null,"salvo com sucesso");

        }else{
            JOptionPane.showMessageDialog(null,"preencha todos os campos");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCTabagismoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTabagismoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTabagismoActionPerformed

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
            java.util.logging.Logger.getLogger(telaAnamneseCardio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaAnamneseCardio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaAnamneseCardio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaAnamneseCardio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                telaAnamneseCardio1 dialog = new telaAnamneseCardio1(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel ANAMNESE;
    private javax.swing.JPanel HABITOS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCControleAlimentar;
    private javax.swing.JCheckBox jCDiabetes;
    private javax.swing.JCheckBox jCEtilismo;
    private javax.swing.JCheckBox jCHAS;
    private javax.swing.JCheckBox jCObesidade;
    private javax.swing.JCheckBox jCTabagismo;
    private javax.swing.JCheckBox jChEstresse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTAnosTabagismo;
    private javax.swing.JTextField jTCigarrosDia;
    private javax.swing.JTextField jTDiagnosticoClinico;
    private javax.swing.JTextField jTExamesComplementares;
    private javax.swing.JTextField jTHDA;
    private javax.swing.JTextField jTHistoricoFamiliar;
    private javax.swing.JTextField jTMedicacoesUso;
    private javax.swing.JTextField jTQueixaPrincipal;
    private javax.swing.JTextField jTTempoParado;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcAtividadeFisica;
    // End of variables declaration//GEN-END:variables
}
