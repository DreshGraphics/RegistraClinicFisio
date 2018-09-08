/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.cardiorespiratorio;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author root
 */
public class CardioRespiratorioTableModel extends AbstractTableModel {

    private List<CardioRespiratorio> CardioRespiratorios = new ArrayList<>();
    private String[] colunas = {"Código","Paciente"};

    public CardioRespiratorioTableModel(List<CardioRespiratorio> CardioRespiratorios) {
        this.CardioRespiratorios = CardioRespiratorios;
    }

    @Override
    public int getRowCount() {
        return CardioRespiratorios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CardioRespiratorio cardioRespiratorio = CardioRespiratorios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cardioRespiratorio.getIdCardioRespiratorio();
            case 1:
                return cardioRespiratorio.getPaciente().getNomePessoa();
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
