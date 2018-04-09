/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.funcionario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Adriano Lima
 */
public class FuncionarioTableModel extends AbstractTableModel {

    private List<Funcionario> funcionarios = new ArrayList<>();
    private String[] colunas = {"Código", "Nome", "Login", "Senha", "Função", "RG", "CPF", "Cidade", "Telefone"};

    public FuncionarioTableModel(List<Funcionario> professor) {
        this.funcionarios = professor;
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
                return funcionario.getIdPessoa();
            case 1:
                return funcionario.getNomePessoa();
            case 2:
                return funcionario.getLoginUsuario();
            case 3:
                return funcionario.getSenhaUsuario();
            case 4:
                return funcionario.getFuncaoFuncionario();
            case 5:
                return funcionario.getRgPessoa();
            case 6:
                return funcionario.getCpfPessoa();
            case 7:
                return funcionario.getCidade();
            case 8:
                return funcionario.getTelefonePessoa();
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

        }
        return null;
    }

}
