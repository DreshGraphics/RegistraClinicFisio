/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.pessoa;

import javax.swing.JOptionPane;
import registraclinic.paciente.Paciente;
import registraclinic.util.GenericDAO;

/**
 *
 * @author Karlos
 */
public class PessoaDAO extends GenericDAO<Pessoa>{
    
    public PessoaDAO() {
        super(Pessoa.class);
    }
    
    public void salvar(Pessoa pessoa) {
        Object[] options = {"Sim", "Não"};
        if (pessoa.getIdPessoa() == 0) {
            if (adicionar(pessoa)) {
                JOptionPane.showMessageDialog(null, "Cadastrado(a) efetuado com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "RegistraClinic", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(pessoa)) {
                JOptionPane.showMessageDialog(null, "Editadição efetuada com sucesso!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }
    
    public boolean excluir(Pessoa pessoa) {
        Object[] options = {"Sim", "Não"};
        if (pessoa.getIdPessoa() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir: " + pessoa.getNomePessoa()
                    + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {

                if (remover(pessoa)) {
                    JOptionPane.showMessageDialog(null, "Excluído com sucesso!");                    
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir:" + pessoa.getNomePessoa(),
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
