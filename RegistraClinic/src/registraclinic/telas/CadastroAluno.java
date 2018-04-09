/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.telas;

import java.text.SimpleDateFormat;
import java.util.Date;
import registraclinic.util.Util;
import java.util.List;
import javax.swing.JOptionPane;
import registraclinic.aluno.Aluno;
import registraclinic.aluno.AlunoDAO;
import registraclinic.aluno.AlunoTableModel;

/**
 *
 * @author Karlos Oliveira
 */
public class CadastroAluno extends javax.swing.JDialog {

    Aluno alunos = new Aluno();
    AlunoDAO alunoDAO = new AlunoDAO();
    SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Creates new form TelaCadastroUsuario
     */
    public CadastroAluno(java.awt.Frame parent, boolean modal) {
        initComponents();
        getRootPane().setDefaultButton(btSalvar);

        btLimparActionPerformed(null);
        setModal(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLObrigatorioNome15 = new javax.swing.JLabel();
        jLObrigatorioNome14 = new javax.swing.JLabel();
        jLObrigatorioNome13 = new javax.swing.JLabel();
        jLObrigatorioNome12 = new javax.swing.JLabel();
        txtTurma = new javax.swing.JTextField();
        jLObrigatorioNome18 = new javax.swing.JLabel();
        jLObrigatorioNome17 = new javax.swing.JLabel();
        jLObrigatorioNome16 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jcSexo = new javax.swing.JComboBox<>();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        labelDadosPessoais = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLObrigatorioNome19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jcEstado = new javax.swing.JComboBox<>();
        txtEndereco = new javax.swing.JTextField();
        txtEndNumero = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLObrigatorioNome20 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLObrigatorioNome24 = new javax.swing.JLabel();
        jLObrigatorioNome21 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLObrigatorioNome23 = new javax.swing.JLabel();
        jLObrigatorioNome22 = new javax.swing.JLabel();
        jLObrigatorioNome25 = new javax.swing.JLabel();
        labelContato = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(65, 191, 182));
        jTabbedPane1.setForeground(new java.awt.Color(22, 64, 61));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jTabbedPane1.setVerifyInputWhenFocusTarget(false);

        jPanel4.setBackground(new java.awt.Color(65, 191, 182));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setForeground(new java.awt.Color(22, 64, 61));
        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Nome Completo");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(20, 10, 130, 19);

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNome.setMargin(null);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel4.add(txtNome);
        txtNome.setBounds(20, 30, 390, 29);

        txtMatricula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMatricula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtMatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtMatricula.setMargin(null);
        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });
        jPanel4.add(txtMatricula);
        txtMatricula.setBounds(520, 30, 150, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Matrícula");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(520, 10, 100, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Sexo");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 80, 50, 19);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("CPF");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(160, 80, 40, 19);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("RG");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(340, 80, 40, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Data Nascimento");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(520, 80, 130, 19);

        txtRg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtRg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtRg.setMargin(null);
        txtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgActionPerformed(evt);
            }
        });
        jPanel4.add(txtRg);
        txtRg.setBounds(340, 100, 160, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel12.setText("Turma");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(430, 9, 69, 20);

        jLObrigatorioNome15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome15.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome15.setText("*");
        jPanel4.add(jLObrigatorioNome15);
        jLObrigatorioNome15.setBounds(130, 90, 10, 10);

        jLObrigatorioNome14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome14.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome14.setText("*");
        jPanel4.add(jLObrigatorioNome14);
        jLObrigatorioNome14.setBounds(660, 20, 10, 10);

        jLObrigatorioNome13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome13.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome13.setText("*");
        jPanel4.add(jLObrigatorioNome13);
        jLObrigatorioNome13.setBounds(490, 20, 10, 10);

        jLObrigatorioNome12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome12.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome12.setText("*");
        jPanel4.add(jLObrigatorioNome12);
        jLObrigatorioNome12.setBounds(660, 90, 10, 10);

        txtTurma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTurma.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtTurma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtTurma.setMargin(null);
        txtTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurmaActionPerformed(evt);
            }
        });
        jPanel4.add(txtTurma);
        txtTurma.setBounds(430, 30, 70, 30);

        jLObrigatorioNome18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome18.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome18.setText("*");
        jPanel4.add(jLObrigatorioNome18);
        jLObrigatorioNome18.setBounds(490, 90, 10, 10);

        jLObrigatorioNome17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome17.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome17.setText("*");
        jPanel4.add(jLObrigatorioNome17);
        jLObrigatorioNome17.setBounds(310, 90, 10, 10);

        jLObrigatorioNome16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome16.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome16.setText("*");
        jPanel4.add(jLObrigatorioNome16);
        jLObrigatorioNome16.setBounds(400, 20, 10, 10);

        txtCpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        jPanel4.add(txtCpf);
        txtCpf.setBounds(160, 100, 160, 30);

        jcSexo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Masculino", "Feminino", "Não Definido" }));
        jcSexo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jcSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSexoActionPerformed(evt);
            }
        });
        jPanel4.add(jcSexo);
        jcSexo.setBounds(20, 100, 120, 30);

        txtDataNascimento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtDataNascimento);
        txtDataNascimento.setBounds(520, 100, 150, 30);

        labelDadosPessoais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/Tela-CadastrarSupervisor.png"))); // NOI18N
        labelDadosPessoais.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.add(labelDadosPessoais);
        labelDadosPessoais.setBounds(0, 0, 700, 275);

        jTabbedPane1.addTab("Dados Pessoais", jPanel4);

        jPanel3.setBackground(new java.awt.Color(65, 191, 182));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setForeground(new java.awt.Color(22, 64, 61));
        jPanel3.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setText("Endereço");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(30, 10, 90, 19);

        jLObrigatorioNome19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome19.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome19.setText("*");
        jPanel3.add(jLObrigatorioNome19);
        jLObrigatorioNome19.setBounds(480, 200, 10, 10);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel15.setText("N°");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(605, 11, 20, 19);

        jcEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jcEstado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jcEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEstadoActionPerformed(evt);
            }
        });
        jPanel3.add(jcEstado);
        jcEstado.setBounds(510, 150, 160, 30);

        txtEndereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEndereco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        jPanel3.add(txtEndereco);
        txtEndereco.setBounds(30, 30, 560, 30);

        txtEndNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEndNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(txtEndNumero);
        txtEndNumero.setBounds(605, 31, 63, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel16.setText("Estado");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(510, 130, 50, 19);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel17.setText("Bairro");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(30, 70, 80, 19);

        txtBairro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });
        jPanel3.add(txtBairro);
        txtBairro.setBounds(30, 90, 320, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel18.setText("Complemento");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(370, 70, 130, 19);

        txtComplemento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtComplemento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementoActionPerformed(evt);
            }
        });
        jPanel3.add(txtComplemento);
        txtComplemento.setBounds(370, 90, 300, 30);

        txtCidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        jPanel3.add(txtCidade);
        txtCidade.setBounds(30, 150, 460, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel19.setText("Cidade");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(30, 130, 70, 19);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel21.setText("Email");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(30, 190, 41, 19);

        jLObrigatorioNome20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome20.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome20.setText("*");
        jPanel3.add(jLObrigatorioNome20);
        jLObrigatorioNome20.setBounds(580, 20, 10, 10);

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(txtEmail);
        txtEmail.setBounds(30, 210, 460, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel20.setText("Telefone");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(510, 190, 65, 19);

        jLObrigatorioNome24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome24.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome24.setText("*");
        jPanel3.add(jLObrigatorioNome24);
        jLObrigatorioNome24.setBounds(660, 140, 10, 10);

        jLObrigatorioNome21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome21.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome21.setText("*");
        jPanel3.add(jLObrigatorioNome21);
        jLObrigatorioNome21.setBounds(660, 20, 10, 10);

        txtTelefone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txtTelefone);
        txtTelefone.setBounds(512, 210, 160, 30);

        jLObrigatorioNome23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome23.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome23.setText("*");
        jPanel3.add(jLObrigatorioNome23);
        jLObrigatorioNome23.setBounds(660, 200, 10, 10);

        jLObrigatorioNome22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome22.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome22.setText("*");
        jPanel3.add(jLObrigatorioNome22);
        jLObrigatorioNome22.setBounds(340, 80, 10, 10);

        jLObrigatorioNome25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome25.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome25.setText("*");
        jPanel3.add(jLObrigatorioNome25);
        jLObrigatorioNome25.setBounds(480, 140, 10, 10);

        labelContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/Tela-CadastrarSupervisor.png"))); // NOI18N
        labelContato.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(labelContato);
        labelContato.setBounds(0, 0, 700, 275);

        jTabbedPane1.addTab("Contato", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 110, 700, 300);

        btVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/voltar2.png"))); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setContentAreaFilled(false);
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar);
        btVoltar.setBounds(160, 420, 90, 70);

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/pesquisa.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar);
        btPesquisar.setBounds(380, 420, 100, 70);

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/excluir_1.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setContentAreaFilled(false);
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(500, 420, 80, 70);

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/limpar_1.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setContentAreaFilled(false);
        btLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(280, 420, 80, 70);

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/salvar_1.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar);
        btSalvar.setBounds(610, 420, 80, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/Tela-CadastrarAluno.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel6.setMaximumSize(new java.awt.Dimension(700, 500));
        jLabel6.setMinimumSize(new java.awt.Dimension(700, 500));
        jLabel6.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 700, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        List<Aluno> lista;
        lista = (alunoDAO.listar());
        AlunoTableModel itm = new AlunoTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Aluno");
        if (objetoRetorno != null) {
            alunos = alunoDAO.consultarObjetoId("idAluno", objetoRetorno);
            txtNome.setText(alunos.getNomeAluno());
            txtMatricula.setText(alunos.getMatriculaAluno());
            txtCpf.setText(alunos.getCpfAluno());
            txtRg.setText(alunos.getRgAluno());
            txtDataNascimento.setText(alunos.getDataNascimentoAluno());
            txtEndereco.setText(alunos.getEnderecoAluno());
            txtBairro.setText(alunos.getBairroAluno());
            txtEndNumero.setText(alunos.getEnderecoNumeroAluno());
            txtCidade.setText(alunos.getCidadeAluno());
            txtTelefone.setText(alunos.getTelefoneAluno());
            txtEmail.setText(alunos.getEmailAluno());
            txtComplemento.setText(alunos.getComplementoAluno());
            txtTurma.setText(alunos.getTurmaAluno());
            jcEstado.setSelectedItem(alunos.getEstadoAluno());
            jcSexo.setSelectedItem(alunos.getSexoAluno());

            btExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        alunoDAO.excluir(alunos);
        btLimparActionPerformed(null);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        btExcluir.setEnabled(false);

        txtBairro.setText("");
        txtCidade.setText("");
        txtComplemento.setText("");
        txtCpf.setText("");
        txtDataNascimento.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtMatricula.setText("");
        txtNome.setText("");
        txtRg.setText("");
        txtTelefone.setText("");
        txtTurma.setText("");
        txtEndNumero.setText("");
        jcSexo.setSelectedIndex(0);
        jcEstado.setSelectedIndex(0);

        alunos = new Aluno();
        jTabbedPane1.setSelectedComponent(jPanel4);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (txtEndereco.getText().equals("") || txtCpf.getText().equals("")
                || txtDataNascimento.getText().equals("")
                || jcSexo.getSelectedIndex() == 0
                || txtTelefone.getText().equals("") || txtNome.getText().equals("")
                || txtMatricula.getText().equals("") || txtBairro.getText().equals("")
                || txtEndNumero.getText().equals("") || txtCidade.getText().equals("")
                || jcEstado.getSelectedIndex() == 0 || txtEmail.getText().equals("")
                || txtTurma.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Prencha os campos obrigatórios!!");
        } else {
            alunos.setNomeAluno(txtNome.getText().toUpperCase());
            alunos.setMatriculaAluno(txtMatricula.getText());
            alunos.setCpfAluno(txtCpf.getText());
            alunos.setDataNascimentoAluno(txtDataNascimento.getText());
            alunos.setEnderecoAluno(txtEndereco.getText());
            alunos.setEnderecoNumeroAluno(txtEndNumero.getText());
            alunos.setRgAluno(txtRg.getText());
            alunos.setTelefoneAluno(txtTelefone.getText());
            alunos.setSexoAluno(jcSexo.getSelectedItem().toString());
            alunos.setEstadoAluno(jcEstado.getSelectedItem().toString());
            alunos.setCidadeAluno(txtCidade.getText());
            alunos.setBairroAluno(txtBairro.getText());
            alunos.setEmailAluno(txtEmail.getText());
            alunos.setComplementoAluno(txtComplemento.getText());
            alunos.setTurmaAluno(txtTurma.getText());

            alunoDAO.salvar(alunos);
            btLimparActionPerformed(null);

        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed

        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRgActionPerformed

    private void txtTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTurmaActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void jcSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcSexoActionPerformed

    private void jcEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcEstadoActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                CadastroAluno dialog = new CadastroAluno(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLObrigatorioNome12;
    private javax.swing.JLabel jLObrigatorioNome13;
    private javax.swing.JLabel jLObrigatorioNome14;
    private javax.swing.JLabel jLObrigatorioNome15;
    private javax.swing.JLabel jLObrigatorioNome16;
    private javax.swing.JLabel jLObrigatorioNome17;
    private javax.swing.JLabel jLObrigatorioNome18;
    private javax.swing.JLabel jLObrigatorioNome19;
    private javax.swing.JLabel jLObrigatorioNome20;
    private javax.swing.JLabel jLObrigatorioNome21;
    private javax.swing.JLabel jLObrigatorioNome22;
    private javax.swing.JLabel jLObrigatorioNome23;
    private javax.swing.JLabel jLObrigatorioNome24;
    private javax.swing.JLabel jLObrigatorioNome25;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcEstado;
    private javax.swing.JComboBox<String> jcSexo;
    private javax.swing.JLabel labelContato;
    private javax.swing.JLabel labelDadosPessoais;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndNumero;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtTurma;
    // End of variables declaration//GEN-END:variables
}
