/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.funcionario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import registraclinic.consulta.Consulta;

/**
 *
 * @author Karlos Oliveira
 */
public class FuncionarioTableModel extends AbstractTableModel {

    private List<Funcionario> funcionarios = new ArrayList<>();
    private String[] colunas = {"Código", "Nome", "Endereço", "Telefone"};

    public FuncionarioTableModel(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public int getRowCount() {
        return funcionarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionario funcionario = funcionarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return funcionario.getIdFuncionario();
            case 1:
                return funcionario.getNomeFuncionario();
            case 2:
                return funcionario.getEnderecoFuncionario();
            case 3:
                return funcionario.getTelefoneFuncionario();
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
        }
        return null;
    }

}
