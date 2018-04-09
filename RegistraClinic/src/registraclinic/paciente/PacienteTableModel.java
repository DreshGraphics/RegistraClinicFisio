/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.paciente;

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
public class PacienteTableModel extends AbstractTableModel {

    private List<Paciente> pacientes = new ArrayList<>();
    private String[] colunas = {"Código", "Prontuário", "Nome", "RG", "CPF", "Data Nascimento", "Sexo", "Idade", "Endereço", "Cidade", "Telefone Paciente", "Nome Responsável", "Telefone Responsável", "Data Cadastro", "Situação", "Tipo"};

    public PacienteTableModel(List<Paciente> pacientes) {
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

    private String converterDataString(Date date) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return f.format(date);
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paciente paciente = pacientes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return paciente.getIdPaciente();
            case 1:
                return paciente.getNumeroProntuarioPaciente();
            case 2:
                return paciente.getNomePaciente();
            case 3:
                return paciente.getRgPaciente();
            case 4:
                return paciente.getCpfPaciente();
            case 5:
                return converterDataString(paciente.getDataNascimentoPaciente());
            case 6:
                return paciente.getSexoPaciente();
            case 7:
                return paciente.getIdadePaciente();
            case 8:
                return paciente.getEnderecoPaciente();
            case 9:
                return paciente.getCidadePaciente();
            case 10:
                return paciente.getTelefonePaciente();
            case 11:
                return paciente.getNomeResponsavelPaciente();
            case 12:
                return paciente.getTelefoneResponsavelPaciente();
            case 13:
                return paciente.getDataCadastroPaciente();
            case 14:
                return paciente.getSituacaoPaciente();
            case 15:
                return paciente.getTipoPaciente();
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
