/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.provapulmonar;

import registraclinic.provapulmonar.*;
import registraclinic.provapulmonar.*;
import registraclinic.atendimento.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author root 
 */
public class ProvaPulmonarTableModel extends AbstractTableModel {

    private List<ProvaPulmonar> provaspulmonares = new ArrayList<>();
    private String[] colunas = {"Código", "Atendimento"};

    public ProvaPulmonarTableModel(List<Atendimento> atendimentos) {
        this.provaspulmonares = provaspulmonares;
    }

    @Override
    public int getRowCount() {
        return provaspulmonares.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProvaPulmonar provapulmonar = provaspulmonares.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return provapulmonar.getIdProvaPulmonar();
            case 1:
                return provapulmonar.getPregaAxilar();
            case 2:
                return provapulmonar.getMelhorFluxoPessoal();
            case 3:
                return provapulmonar.getProcessoXifoide();
            case 4:
                return provapulmonar.getLinhaUmbilical();
            case 5:
                return provapulmonar.getConclusao();
            case 6:
                return provapulmonar.getPImax();
            case 7:
                return provapulmonar.getPEmax();
            case 8:
                return provapulmonar.getPIParecer();
            case 9:
                return provapulmonar.getPEParecer();
            case 10:
                return provapulmonar.getTipoRespiratorio();
            case 11:
                return provapulmonar.getOBJTratamento();
            case 12:
                return provapulmonar.getCondultas();
            
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
            
        }
        return null;
    }

}

