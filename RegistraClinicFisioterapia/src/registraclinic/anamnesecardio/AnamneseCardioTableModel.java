/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.anamnesecardio;

import registraclinic.atendimento.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author root 
 */
public class AnamneseCardioTableModel extends AbstractTableModel {

    private List<AnamneseCardio> anamnesescardio = new ArrayList<>();
    private String[] colunas = {"Código", "Atendimento"};

    public AnamneseCardioTableModel(List<Atendimento> atendimentos) {
        this.anamnesescardio = anamnesescardio;
    }

    @Override
    public int getRowCount() {
        return anamnesescardio.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AnamneseCardio anamnesecardio = anamnesescardio.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return anamnesecardio.getIdAnamneseCardio();
            case 1:
                return anamnesecardio.getQueixaPrincipal();
            case 2:
                return anamnesecardio.getHistoricoFamiliar();
            case 3:
                return anamnesecardio.getAtividadeFisica();
            case 4:
                return anamnesecardio.getCigarrosDias();
            case 5:
                return anamnesecardio.getAnosTabag();
            case 6:
                return anamnesecardio.getTempoParado();
            case 7:
                return anamnesecardio.getMedicacaoDeUso();
            case 8:
                return anamnesecardio.getExamesComplementares();
            case 9:
                return anamnesecardio.getHDA();
            case 10:
                return anamnesecardio.isTabagismo();
            case 11:
                return anamnesecardio.isEtilismo();
            case 12:
                return anamnesecardio.isDiabetes();
            case 13:
                return anamnesecardio.isObesidade();
            case 14:
                return anamnesecardio.isHAS();
            case 15:
                return anamnesecardio.isControleAlimentar();
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
                return colunas[5];
            case 6:
                return colunas[6];
            case 7:
                return colunas[7];
            case 8:
                return colunas[8];
            case 9:
                return colunas[9];
            case 10:
                return colunas[10];
            case 11:
                return colunas[11];
            case 12:
                return colunas[12];
            case 13:
                return colunas[13];
            case 14:
                return colunas[14];
            case 15:
                return colunas[15];
        }
        return null;
    }

}

