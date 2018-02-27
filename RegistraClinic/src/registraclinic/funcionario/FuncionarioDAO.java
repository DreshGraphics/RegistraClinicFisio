/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.funcionario;

import javax.swing.JOptionPane;
import registraclinic.consulta.Consulta;
import registraclinic.util.GenericDAO;

/**
 *
 * @author Katyeudo
 */
public class FuncionarioDAO extends GenericDAO<Funcionario>{
    
    public FuncionarioDAO() {
        super(Consulta.class);
    }
    
    public void salvar(Funcionario funcionario) {
        Object[] options = {"Sim", "Não"};
        if (funcionario.getIdFuncionario() == 0) {
            if (adicionar(funcionario)) {
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "RegistraClinic", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(funcionario)) {
                JOptionPane.showMessageDialog(null, "Consulta editada com sucesso!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }
    
    public boolean excluir(Funcionario funcionario) {
        Object[] options = {"Sim", "Não"};
        if (funcionario.getIdFuncionario() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o Funcionário " + funcionario.getNomeFuncionario()
                    + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {

                if (remover(funcionario)) {
                    JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");                    
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o Funcionário " + funcionario.getNomeFuncionario(),
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
