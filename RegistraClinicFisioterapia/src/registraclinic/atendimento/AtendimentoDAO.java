
package registraclinic.atendimento;

import javax.swing.JOptionPane;
import registraclinic.atendimento.Atendimento;
import registraclinic.util.GenericDAO;

/**
 *
 * @author root
 */
public class AtendimentoDAO extends GenericDAO<Atendimento> {

    public AtendimentoDAO() {
        super(Atendimento.class);
    }
    
     public void salvar(Atendimento atendimento) {
        Object[] options = {"Sim", "Não"};
        if (atendimento.getIdAtendimento() == 0) {
            if (adicionar(atendimento)) {
                JOptionPane.showMessageDialog(null, "Atendimento cadastrada com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(atendimento)) {
                JOptionPane.showMessageDialog(null, "Atendimento editada com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }
     public boolean excluir(Atendimento atendimento) {
        Object[] options = {"Sim", "Não"};
        if (atendimento.getIdAtendimento() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir a Atendimento" + atendimento.getNomeAtendimento()
                    + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(atendimento)) {
                    JOptionPane.showMessageDialog(null, "Atendimento excluída com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir a Atendimento" + atendimento.getNomeAtendimento(),
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
