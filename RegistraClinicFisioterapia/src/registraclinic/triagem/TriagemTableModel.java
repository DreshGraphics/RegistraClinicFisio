/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.triagem;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karlos Oliveira
 */
public class TriagemTableModel extends AbstractTableModel{
    
    private List<Triagem> prioridadeAtendimento = new ArrayList<>();
    private String[] colunas = {"Código", "Paciente", "Tipo Atendimento", "Prioridade"};
    
    public TriagemTableModel(List<Triagem> prioridadeAtendimento) {
        this.prioridadeAtendimento = prioridadeAtendimento;
    }

    @Override
    public int getRowCount() {
        return prioridadeAtendimento.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Triagem prioridadeatendimento = prioridadeAtendimento.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return prioridadeatendimento.getIdTriagem();
            case 1:
                return prioridadeatendimento.getPaciente().getNomePessoa();
            case 2:
                return prioridadeatendimento.getTipoAtendimento().getNomeAtendimento();
            case 3:
                return prioridadeatendimento.getPrioridadeDoAtendimento();
            

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
