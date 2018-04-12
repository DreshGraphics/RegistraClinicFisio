/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.atendimento;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author root 
 */
public class AtendimentoTableModel extends AbstractTableModel {

    private List<Atendimento> atendimento = new ArrayList<>();
    private String[] colunas = {"Código", "Atendimento"};

    public AtendimentoTableModel(List<Atendimento> atendimento) {
        this.atendimento = atendimento;
    }

    @Override
    public int getRowCount() {
        return atendimento.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Atendimento cidade = atendimento.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cidade.getIdAtendimento();
            case 1:
                return cidade.getNomeAtendimento();
            

        }
        return null;
    }

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

