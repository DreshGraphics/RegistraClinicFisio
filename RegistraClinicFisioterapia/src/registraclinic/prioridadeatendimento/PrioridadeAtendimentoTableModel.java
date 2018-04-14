/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.prioridadeatendimento;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karlos Oliveira
 */
public class PrioridadeAtendimentoTableModel extends AbstractTableModel{
    
    private List<PrioridadeAtendimento> prioridadeAtendimento = new ArrayList<>();
    private String[] colunas = {"Código", "Paciente"};
    
    public PrioridadeAtendimentoTableModel(List<PrioridadeAtendimento> prioridadeAtendimento) {
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
        PrioridadeAtendimento cidade = prioridadeAtendimento.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cidade.getIdPrioridadeAtendimento();
            case 1:
                return cidade.getPaciente().getNomePessoa();
            

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
        }
        return null;
    }
    
}
