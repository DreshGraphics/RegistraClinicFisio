/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.diagnosticocineticofuncional;

import registraclinic.examescomplementares.*;
import registraclinic.avaliacaopostural.*;
import registraclinic.anamnese.*;
import registraclinic.atendimento.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author root
 */
public class DiagnosticoCineticoFuncionalTableModel extends AbstractTableModel {

    private List<DiagnosticoCineticoFuncional> diagnosticoCineticoFuncionals = new ArrayList<>();
    private String[] colunas = {"Código"};

    public DiagnosticoCineticoFuncionalTableModel(List<DiagnosticoCineticoFuncional> diagnosticoCineticoFuncionals) {
        this.diagnosticoCineticoFuncionals = diagnosticoCineticoFuncionals;
    }

    @Override
    public int getRowCount() {
        return diagnosticoCineticoFuncionals.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DiagnosticoCineticoFuncional diagnosticoCineticoFuncional = diagnosticoCineticoFuncionals.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return diagnosticoCineticoFuncional.getIdDiagnosticoCineticoFuncional();
//            case 1:
//                return avaliacaoPostural.getHda();
//            case 2:
//                return avaliacaoPostural.getHpp();
//            case 3:
//                return avaliacaoPostural.getHistoriaFamiliar();
//            case 4:
//                return avaliacaoPostural.getPa();
//            case 5:
//                return avaliacaoPostural.getFr();
//            case 6:
//                return avaliacaoPostural.getFc();//            case 1:
//                return examesComplementares.getHda();
//            case 2:
//                return examesComplementares.getHpp();
//            case 3:
//                return examesComplementares.getHistoriaFamiliar();
//            case 4:
//                return examesComplementares.getPa();
//            case 5:
//                return examesComplementares.getFr();
//            case 6:
//                return examesComplementares.getFc();//            case 1:
//                return avaliacaoPostural.getHda();
//            case 2:
//                return avaliacaoPostural.getHpp();
//            case 3:
//                return avaliacaoPostural.getHistoriaFamiliar();
//            case 4:
//                return avaliacaoPostural.getPa();
//            case 5:
//                return avaliacaoPostural.getFr();
//            case 6:
//                return avaliacaoPostural.getFc();//            case 1:
//                return diagnosticoCineticoFuncional.getHda();
//            case 2:
//                return diagnosticoCineticoFuncional.getHpp();
//            case 3:
//                return diagnosticoCineticoFuncional.getHistoriaFamiliar();
//            case 4:
//                return diagnosticoCineticoFuncional.getPa();
//            case 5:
//                return diagnosticoCineticoFuncional.getFr();
//            case 6:
//                return diagnosticoCineticoFuncional.getFc();
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
