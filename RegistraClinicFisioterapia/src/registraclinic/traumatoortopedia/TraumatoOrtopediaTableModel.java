/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.traumatoortopedia;

import registraclinic.atendimento.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author root 
 */
public class TraumatoOrtopediaTableModel extends AbstractTableModel {

    private List<TraumatoOrtopedia> traumatoOrtopedias = new ArrayList<>();
    private String[] colunas = {"Código"};

    public TraumatoOrtopediaTableModel(List<TraumatoOrtopedia> traumatoOrtopedias) {
        this.traumatoOrtopedias = traumatoOrtopedias;
    }

    @Override
    public int getRowCount() {
        return traumatoOrtopedias.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TraumatoOrtopedia traumatoOrtopedia = traumatoOrtopedias.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return traumatoOrtopedia.getIdTraumatoOrtopedia();
//            case 1:
//                return traumatoOrtopedia.getNomeAtendimento();
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

