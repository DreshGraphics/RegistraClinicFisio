/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.traumatoortopedia;

import registraclinic.triagem.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karlos Oliveira
 */
public class TraumatoOrtopediaTableModel extends AbstractTableModel{
    
    private List<TraumatoOrtopedia> traumatoOrtopedias = new ArrayList<>();
    private String[] colunas = {"Código", "Paciente", "Diagnóstico Médico", "HDA", "HPP", "História Familiar", "PA", "FR", "FC"};
    
    public TraumatoOrtopediaTableModel(List<TraumatoOrtopedia> traumatoOrtopedia) {
        this.traumatoOrtopedias = traumatoOrtopedia;
    }

    public TraumatoOrtopedia getValoresTriagem(int rowIndex){
        return traumatoOrtopedias.get(rowIndex);
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
            case 1:
                return traumatoOrtopedia.getPaciente().getNomePessoa();
            case 2:
                return traumatoOrtopedia.getDiagnosticoMedico();
            case 3:
                return traumatoOrtopedia.getHda();
            case 4:
                return traumatoOrtopedia.getHpp();
            case 5:
                return traumatoOrtopedia.getHistoriaFamiliar();
            case 6:
                return traumatoOrtopedia.getPa();
            case 7:
                return traumatoOrtopedia.getFr();
            case 8:
                return traumatoOrtopedia.getFc();
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
        }
        return null;
    }
    
}
