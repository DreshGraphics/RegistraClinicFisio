/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.usuario;

import javax.swing.JOptionPane;
import registraclinic.consulta.Consulta;
import registraclinic.util.GenericDAO;

/**
 *
 * @author Katyeudo
 */
public class UsuarioDAO extends GenericDAO<Usuario>{
    
    public UsuarioDAO() {
        super(Usuario.class);
    }
    
    public void salvar(Usuario usuario) {
        Object[] options = {"Sim", "Não"};
        if (usuario.getIdLogin() == 0) {
            if (adicionar(usuario)) {
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "RegistraClinic", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(usuario)) {
                JOptionPane.showMessageDialog(null, "Funcionário editado com sucesso!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }
    
    public boolean excluir(Usuario funcionario) {
        Object[] options = {"Sim", "Não"};
        if (funcionario.getIdLogin() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o Funcionário " + funcionario.getNomeUsuario()
                    + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {

                if (remover(funcionario)) {
                    JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");                    
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o Funcionário " + funcionario.getNomeUsuario(),
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
