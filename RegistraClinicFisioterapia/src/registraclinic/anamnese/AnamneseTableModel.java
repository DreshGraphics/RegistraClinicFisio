/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.anamnese;

import registraclinic.atendimento.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author root
 */
public class AnamneseTableModel extends AbstractTableModel {

    private List<Anamnese> anamneses = new ArrayList<>();
    private String[] colunas = {"Código", "HDA", "HPP", "História Familiar", "PA", "FR", "FC"};

    public AnamneseTableModel(List<Anamnese> anamneses) {
        this.anamneses = anamneses;
    }

    @Override
    public int getRowCount() {
        return anamneses.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Anamnese anamnese = anamneses.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return anamnese.getIdAnamnese();
            case 1:
                return anamnese.getHda();
            case 2:
                return anamnese.getHpp();
            case 3:
                return anamnese.getHistoriaFamiliar();
            case 4:
                return anamnese.getPa();
            case 5:
                return anamnese.getFr();
            case 6:
                return anamnese.getFc();
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
        }
        return null;
    }

}
