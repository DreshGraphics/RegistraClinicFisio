/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.paciente;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import registraclinic.usuario.Usuario;

/**
 *
 * @author Karlos Oliveira
 */
public class PacienteTableModel extends AbstractTableModel {

    private List<Paciente> pacientes = new ArrayList<>();
    private String[] colunas = {"Código", "Prontuário", "Nome", "Endereço", "Telefone"};

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
                return paciente.getEnderecoPaciente();
            case 4:
                return paciente.getTelefonePaciente();
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
                return colunas[3];
        }
        return null;
    }

}
