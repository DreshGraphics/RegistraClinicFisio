package registraclinic.supervisor;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import registraclinic.util.Util;

public class SupervisorTableModel extends AbstractTableModel {

    private List<Supervisor> supervisor = new ArrayList<>();
    private String[] colunas = {"Código", "Nome", "CPF", "RG", "Telefone", "Nascimento", "Sexo", "Endereço", "Turma", "Especialização"};

    public SupervisorTableModel(List<Supervisor> supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    /*get row pega o numero de linhas.*/
    public int getRowCount() {
        return supervisor.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Supervisor supervisores = supervisor.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return supervisores.getIdPessoa();
            case 1:
                return supervisores.getNomePessoa();
            case 2:
                return supervisores.getCpfSupervisor();
            case 3:
                return supervisores.getRgSupervisor();
            case 4:
                return supervisores.getTelefonePessoa();
            case 5:
                return supervisores.getDataNascimentoPessoa();
            case 6:
                return supervisores.getSexoPessoa();
            case 7:
                return supervisores.getEnderecoPessoa();
            case 8:
                return supervisores.getTurmaSupervisor();
            case 9:
                return supervisores.getEspecializacaoSupervisor();
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

        }
        return null;
    }
}
