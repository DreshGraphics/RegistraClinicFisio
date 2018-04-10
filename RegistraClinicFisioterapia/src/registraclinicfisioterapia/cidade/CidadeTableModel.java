/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinicfisioterapia.cidade;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Adriano Lima
 */
public class CidadeTableModel extends AbstractTableModel {

    private List<Cidade> cidades = new ArrayList<>();
    private String[] colunas = {"Código", "Cidade", "Estado", "CEP"};

    public CidadeTableModel(List<Cidade> cidade) {
        this.cidades = cidade;
    }

    @Override
    public int getRowCount() {
        return cidades.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cidade cidade = cidades.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cidade.getIdCidade();
            case 1:
                return cidade.getNomeCidade();
            case 2:
                return cidade.getEstadoCidade();
            case 3:
                return cidade.getCepCidade();

        }
        return null;
    }

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
