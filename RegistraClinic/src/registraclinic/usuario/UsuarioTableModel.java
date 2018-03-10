/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.usuario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karlos Oliveira
 */
public class UsuarioTableModel extends AbstractTableModel {

    private List<Usuario> funcionarios = new ArrayList<>();
    private String[] colunas = {"Código", "Nome", "Login", "Usuário",};

    public UsuarioTableModel(List<Usuario> funcionarios) {
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
        Usuario funcionario = funcionarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return funcionario.getIdLogin();
            case 1:
                return funcionario.getNomeUsuario();
            case 2:
                return funcionario.getLoginUsuario();
            case 3:
                return funcionario.getTipoUsuario();
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
