/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.vincularpacientealuno;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karlos
 */
public class VincularPacienteAlunoTableModel extends AbstractTableModel{
    
    private List<VincularPacienteAluno> vincularPacienteAlunos = new ArrayList<>();
    private String[] colunas = {"Código", "Aluno", "Paciente", "Início Atendimento", "Situação"};

    public VincularPacienteAlunoTableModel(List<VincularPacienteAluno> vincularPacienteAluno) {
        this.vincularPacienteAlunos = vincularPacienteAluno;
    }

    @Override
    public int getRowCount() {
        return vincularPacienteAlunos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VincularPacienteAluno vincularPacienteAluno = vincularPacienteAlunos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return vincularPacienteAluno.getIdVincularPacienteAluno();
            case 1:
                return vincularPacienteAluno.getAluno().getNomeAluno();
            case 2:
                return vincularPacienteAluno.getPaciente().getNomePaciente();
            case 3:
                return vincularPacienteAluno.getDataInicioAtendimento();
            case 4:
                return vincularPacienteAluno.getPaciente().getSituacaoPaciente();
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
        }
        return null;
    }
    
}
