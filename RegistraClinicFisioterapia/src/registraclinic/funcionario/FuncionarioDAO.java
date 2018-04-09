/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.funcionario;

import registraclinic.util.GenericDAO;
import javax.swing.JOptionPane;
import registraclinic.paciente.Paciente;

/**
 *
 * @author Karlos Oliveira
 */
public class FuncionarioDAO extends GenericDAO<Funcionario> {

    public FuncionarioDAO() {
        super(Funcionario.class);
    }

    public void salvar(Funcionario funcionario) {
        Object[] options = {"Sim", "Não"};
        if (funcionario.getIdPessoa() == 0) {
            if (adicionar(funcionario)) {
                JOptionPane.showMessageDialog(null, "Funcionario(a) cadastrado(a) com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "BirdPoint", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(funcionario)) {
                JOptionPane.showMessageDialog(null, "Funcionario(a) editado(a) com sucesso!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }

    public boolean excluir(Funcionario funcionario) {
        Object[] options = {"Sim", "Não"};
        if (funcionario.getIdPessoa() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o(a) Funcionário(a): " + funcionario.getNomePessoa()
                    + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {

                if (remover(funcionario)) {
                    JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");                    
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o(a) Funcionário(a) " + funcionario.getNomePessoa(),
                            "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "A exclusão foi cancelada!");
            }

        }
        return true;
    }
    
}
