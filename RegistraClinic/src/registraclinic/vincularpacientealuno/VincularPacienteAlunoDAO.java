/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.vincularpacientealuno;

import javax.swing.JOptionPane;
import registraclinic.util.GenericDAO;

/**
 *
 * @author Karlos
 */
public class VincularPacienteAlunoDAO extends GenericDAO<VincularPacienteAluno> {

    public VincularPacienteAlunoDAO() {
        super(VincularPacienteAluno.class);
    }

    public void salvar(VincularPacienteAluno vincularPacienteAluno) {
        Object[] options = {"Sim", "Não"};
        if (vincularPacienteAluno.getIdVincularPacienteAluno() == 0) {
            if (adicionar(vincularPacienteAluno)) {
                JOptionPane.showMessageDialog(null, "Paciente vinculado com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "RegistraClinic", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(vincularPacienteAluno)) {
                JOptionPane.showMessageDialog(null, "Vinculação editada com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }

    public boolean excluir(VincularPacienteAluno vincularPacienteAluno) {
        Object[] options = {"Sim", "Não"};
        if (vincularPacienteAluno.getIdVincularPacienteAluno() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir a vinculação do paciente?"
                    + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {

                if (remover(vincularPacienteAluno)) {
                    JOptionPane.showMessageDialog(null, "Vinculação excluída com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir a vinculação!",
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
