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

    private List<Atendimento> atendimentos = new ArrayList<>();
    private String[] colunas = {"Código", "Atendimento"};

    public AtendimentoTableModel(List<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }

    @Override
    public int getRowCount() {
        return atendimentos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Atendimento atendimento = atendimentos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return atendimento.getIdAtendimento();
            case 1:
                return atendimento.getNomeAtendimento();
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

