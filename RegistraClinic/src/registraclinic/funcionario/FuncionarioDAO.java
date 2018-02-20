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
    
}
