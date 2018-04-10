package registraclinicfisioterapia.aluno;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import registraclinicfisioterapia.util.Util;

public class AlunoTableModel extends AbstractTableModel {

    private List<Aluno> aluno = new ArrayList<>();
    private String[] colunas = {"Código", "Nome", "Matrícula", "Login", "Senha", "Turma", "Nascimento", "Sexo", "Cidade", "Endereço", "Telefone", "Email"};

    public AlunoTableModel(List<Aluno> aluno) {
        this.aluno = aluno;
    }

    @Override
    /*get row pega o numero de linhas.*/
    public int getRowCount() {
        return aluno.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    private String converterDataString(Date date) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return f.format(date);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Aluno alunos = aluno.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return alunos.getIdPessoa();
            case 1:
                return alunos.getNomePessoa();
            case 2:
                return alunos.getMatriculaAluno();
            case 3:
                return alunos.getLoginUsuario();
            case 4:
                return alunos.getSenhaUsuario();
            case 5:
                return alunos.getTurmaAluno();
            case 6:
                return converterDataString(alunos.getDataNascimentoPessoa());
            case 7:
                return alunos.getSexoPessoa();
            case 8:
                return alunos.getCidade();
            case 9:
                return alunos.getEnderecoPessoa();
            case 10:
                return alunos.getTelefonePessoa();
            case 11:
                return alunos.getEmailUsuario();

        }
        return null;
    }

    @Override
    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];
            case 4:
                return colunas[4];
            case 5:
                return colunas[5];
            case 6:
                return colunas[6];
            case 7:
                return colunas[7];
            case 8:
                return colunas[8];
            case 9:
                return colunas[9];
            case 10:
                return colunas[10];
            case 11:
                return colunas[11];

        }
        return null;
    }

}
