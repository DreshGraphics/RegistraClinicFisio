/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.vincularalunosupervisor;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import registraclinic.vincularpacientealuno.VincularPacienteAluno;

/**
 *
 * @author Karlos
 */
public class VincularAlunoSupervisorTableModel extends AbstractTableModel{
    
    private List<VincularAlunoSupervisor> vincularAlunosSupervisors = new ArrayList<>();
    private String[] colunas = {"Código", "Aluno", "Supervisor", "Início Supervisão"};

    public VincularAlunoSupervisorTableModel(List<VincularAlunoSupervisor> vincularAlunosSupervisor) {
        this.vincularAlunosSupervisors = vincularAlunosSupervisor;
    }

    @Override
    public int getRowCount() {
        return vincularAlunosSupervisors.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VincularAlunoSupervisor vincularAlunosSupervisor = vincularAlunosSupervisors.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return vincularAlunosSupervisor.getIdVincularAlunosSupervisor();
            case 1:
                return vincularAlunosSupervisor.getAluno().getNomeAluno();
            case 2:
                return vincularAlunosSupervisor.getSupervisor().getNomeSupervisor();
            case 3:
                return vincularAlunosSupervisor.getDataInicioSupervisao();
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
        }
        return null;
    }
    
}
