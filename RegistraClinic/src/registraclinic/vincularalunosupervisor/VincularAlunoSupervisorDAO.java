/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.vincularalunosupervisor;

import javax.swing.JOptionPane;
import registraclinic.util.GenericDAO;

/**
 *
 * @author Karlos
 */
public class VincularAlunoSupervisorDAO extends GenericDAO<VincularAlunoSupervisor>{
    
    public VincularAlunoSupervisorDAO() {
        super(VincularAlunoSupervisor.class);
    }

    public void salvar(VincularAlunoSupervisor vincularAlunosSupervisor) {
        Object[] options = {"Sim", "Não"};
        if (vincularAlunosSupervisor.getIdVincularAlunosSupervisor() == 0) {
            if (adicionar(vincularAlunosSupervisor)) {
                JOptionPane.showMessageDialog(null, "Aluno vinculado com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "RegistraClinic", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(vincularAlunosSupervisor)) {
                JOptionPane.showMessageDialog(null, "Vinculação editada com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }

    public boolean excluir(VincularAlunoSupervisor vincularAlunosSupervisor) {
        Object[] options = {"Sim", "Não"};
        if (vincularAlunosSupervisor.getIdVincularAlunosSupervisor() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir a vinculação do aluno?"
                    + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {

                if (remover(vincularAlunosSupervisor)) {
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
