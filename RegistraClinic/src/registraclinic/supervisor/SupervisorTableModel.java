package registraclinic.supervisor;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import registraclinic.util.Util;

public class SupervisorTableModel extends AbstractTableModel {

    private List<Supervisor> supervisor = new ArrayList<>();
    private String[] colunas = {"Código", "Nome", "CPF", "RG", "Telefone", "Nascimento", "Sexo", "Endereço", "Email", "Turma", "Especialização"};

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
                return supervisores.getIdSupervisor();
            case 1:
                return supervisores.getNomeSupervisor();
            case 2:
                return supervisores.getCpfSupervisor();
            case 3:
                return supervisores.getRgSupervisor();
            case 4:
                return supervisores.getTelefoneSupervisor();
            case 5:
                return supervisores.getDataNascimentoSupervisor();
            case 6:
                return supervisores.getSexoSupervisor();
            case 7:
                return supervisores.getEnderecoSupervisor();
            case 8:
                return supervisores.getEmailSupervisor();
            case 9:
                return supervisores.getTurmaSupervisor();
            case 10:
                return supervisores.getEspecializaçãoSupervisor();
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
