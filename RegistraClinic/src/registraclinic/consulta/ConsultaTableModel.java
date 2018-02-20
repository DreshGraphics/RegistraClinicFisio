/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.consulta;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karlos Oliveira
 */
public class ConsultaTableModel extends AbstractTableModel {

    private List<Consulta> consulta = new ArrayList<>();
    private String[] colunas = {"Código", "Consulta", "Paciente", "Data", "Hora", "Funcionário"};

    public ConsultaTableModel(List<Consulta> conculta) {
        this.consulta = conculta;
    }

    @Override
    public int getRowCount() {
        return consulta.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Consulta consultas = consulta.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return consultas.getIdConsulta();
            case 1:
                return consultas.getNomeConsulta();
            case 2:
                return consultas.getPacienteConsulta().getNomePaciente();
            case 3:
                return consultas.getDataConsulta();
            case 4:
                return consultas.getHoraConsulta();
            case 5:
                return consultas.getFuncionarioConsulta().getNomeFuncionario();

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

        }
        return null;
    }

}
