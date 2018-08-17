/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.examefisico;

import registraclinic.provapulmonar.*;
import registraclinic.paciente.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import registraclinic.usuario.Usuario;

/**
 *
 * @author Karlos Oliveira
 */
public class ExameFisicoTableModel extends AbstractTableModel {

    private List<Paciente> pacientes = new ArrayList<>();
    private final String[] colunas = {"Código", "Prontuário", "Nome", "Sexo", "Idade", "Peso(kg)", "Altura(cm)", "Queixa Paciente", "Endereço", "Cidade", "Telefone", "Situação", "Atendimento"};

    public ExameFisicoTableModel(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public int getRowCount() {
        return pacientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

//    private String converterDataString(Date date) {
//        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
//        return f.format(date);
//    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paciente paciente = pacientes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return paciente.getIdPessoa();
            case 1:
                return paciente.getNumeroProntuarioPaciente();
            case 2:
                return paciente.getNomePessoa();
            case 3:
                return paciente.getSexoPessoa();
            case 4:
                return paciente.getIdadePessoa();
            case 5:
                return paciente.getPesoPaciente();
            case 6:
                return paciente.getAlturaPaciente();
            case 7:
                return paciente.getQueixaDoPaciente();
            case 8:
                return paciente.getEnderecoPessoa();
            case 9:
                return paciente.getCidade().getNomeCidade();
            case 10:
                return paciente.getTelefonePessoa();
            case 11:
                return paciente.getSituacaoPaciente();
            case 12:
                return paciente.getTipoAtendimento();
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
