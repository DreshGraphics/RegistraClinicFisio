
package registraclinic.avaliacaopostural;

import registraclinic.anamnese.*;
import registraclinic.atendimento.*;
import javax.swing.JOptionPane;
import registraclinic.atendimento.Atendimento;
import registraclinic.util.GenericDAO;

/**
 *
 * @author root
 */
public class AvaliacaoPosturalDAO extends GenericDAO<AvaliacaoPostural> {

    public AvaliacaoPosturalDAO() {
        super(AvaliacaoPostural.class);
    }
    
     public boolean salvar(AvaliacaoPostural avaliacaoPostural) {
        Object[] options = {"Sim", "Não"};
        if (avaliacaoPostural.getIdAvaliacaoPostural() == 0) {
            if (adicionar(avaliacaoPostural)) {
                JOptionPane.showMessageDialog(null, "Avaliação Postural cadastrada com sucesso!");
                return true;
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(avaliacaoPostural)) {
                JOptionPane.showMessageDialog(null, "Avaliação Postural editada com sucesso!");
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
            
        }
        return false;
    }
     public boolean excluir(AvaliacaoPostural avaliacaoPostural) {
        Object[] options = {"Sim", "Não"};
        if (avaliacaoPostural.getIdAvaliacaoPostural() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir a Avaliação Postural"
                    + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(avaliacaoPostural)) {
                    JOptionPane.showMessageDialog(null, "Avaliação Postural excluída com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir a Avaliação Postural ",
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
