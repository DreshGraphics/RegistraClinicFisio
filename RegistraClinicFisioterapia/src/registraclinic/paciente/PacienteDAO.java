/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.paciente;

import javax.swing.JOptionPane;
import registraclinic.util.GenericDAO;

/**
 *
 * @author Karlos
 */
public class PacienteDAO extends GenericDAO<Paciente>{
    
    public PacienteDAO() {
        super(Paciente.class);
    }
    
    public void salvar(Paciente paciente) {
        Object[] options = {"Sim", "Não"};
        if (paciente.getIdPessoa() == 0) {
            if (adicionar(paciente)) {
                JOptionPane.showMessageDialog(null, "Paciente cadastrado(a) com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "RegistraClinic", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(paciente)) {
                JOptionPane.showMessageDialog(null, "Paciente editado(a) com sucesso!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }
    
    public boolean excluir(Paciente paciente) {
        Object[] options = {"Sim", "Não"};
        if (paciente.getIdPessoa() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o(a) Paciente: " + paciente.getNomePessoa()
                    + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {

                if (remover(paciente)) {
                    JOptionPane.showMessageDialog(null, "Paciente excluído com sucesso!");                    
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o(a) Paciente " + paciente.getNomePessoa(),
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
