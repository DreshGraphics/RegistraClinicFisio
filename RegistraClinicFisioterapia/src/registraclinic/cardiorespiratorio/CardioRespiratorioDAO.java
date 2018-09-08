
package registraclinic.cardiorespiratorio;

import registraclinic.avaliacaopostural.*;
import registraclinic.anamnese.*;
import registraclinic.atendimento.*;
import javax.swing.JOptionPane;
import registraclinic.atendimento.Atendimento;
import registraclinic.util.GenericDAO;

/**
 *
 * @author root
 */
public class CardioRespiratorioDAO extends GenericDAO<CardioRespiratorio> {

    public CardioRespiratorioDAO() {
        super(CardioRespiratorio.class);
    }
    
     public boolean salvar(CardioRespiratorio cardiorespiratorio) {
        Object[] options = {"Sim", "Não"};
        if (cardiorespiratorio.getIdCardioRespiratorio() == 0) {
            if (adicionar(cardiorespiratorio)) {
                JOptionPane.showMessageDialog(null, "Cardio Respiratorio cadastrada com sucesso!");
                return true;
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(cardiorespiratorio)) {
                JOptionPane.showMessageDialog(null, "Cardio Respiratorio editada com sucesso!");
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
            
        }
        return false;
    }
     public boolean excluir(CardioRespiratorio cardiorespiratorio) {
        Object[] options = {"Sim", "Não"};
        if (cardiorespiratorio.getIdCardioRespiratorio() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir a Cardio Respiratorio"
                    + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(cardiorespiratorio)) {
                    JOptionPane.showMessageDialog(null, "Cardio Respiratorio excluída com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir a Cardio Respiratorio ",
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
