/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.examefisico;

import registraclinic.examefisico.*;
import registraclinic.atendimento.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author root 
 */
public class ExameFisicoTableModel extends AbstractTableModel {

    private List<ExameFisico> examesfisicos = new ArrayList<>();
    private String[] colunas = {"Código", "Atendimento"};

    public ExameFisicoTableModel(List<Atendimento> atendimentos) {
        this.examesfisicos = examesfisicos;
    }

    @Override
    public int getRowCount() {
        return examesfisicos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ExameFisico examefisico = examesfisicos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return examefisico.getIdExameFisico();
            case 1:
                return examefisico.getPA();
            case 2:
                return examefisico.getFC();
            case 3:
                return examefisico.getFR();
            case 4:
                return examefisico.getSaO2();
            case 5:
                return examefisico.getAuscutaPulmonar();
            case 6:
                return examefisico.getAuscutaCardiaca();
            case 7:
                return examefisico.getFormaDoTorax();
            case 8:
                return examefisico.getSimetriaDoTorax();
            case 9:
                return examefisico.getExpansibilidade();
            case 10:
                return examefisico.getMobilidadeToracica();
            case 11:
                return examefisico.isDispneia();
            case 12:
                return examefisico.isRespiracaoParadoxal();
            case 13:
                return examefisico.getUsoDeMusculaturaAcessoria();
            case 14:
                return examefisico.getRitmoRespiratorio();
            case 15:
                return examefisico.getTosse();
            case 16:
                return examefisico.getExpectoracao();
            case 17:
                return examefisico.getPalpacao();
            case 18:
                return examefisico.getPercucao();
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
            case 16:
                return colunas[16];
            case 17:
                return colunas[17];
            case 18:
                return colunas[18];
        }
        return null;
    }

}

