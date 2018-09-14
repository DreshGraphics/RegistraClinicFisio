
package registraclinic.cardiorespiratorio;

import registraclinic.cardiorespiratorio.*;
import javax.swing.JOptionPane;
import registraclinic.cardiorespiratorio.CardioRespiratorio;
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
                JOptionPane.showMessageDialog(null, "CardioRespiratorio cadastrado com sucesso!");
                return true;
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(cardiorespiratorio)) {
                JOptionPane.showMessageDialog(null, "CardioRespiratorio editado com sucesso!");
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
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o CardioRespiratorio " + cardiorespiratorio.getIdCardioRespiratorio()
                    + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(cardiorespiratorio)) {
                    JOptionPane.showMessageDialog(null, "CardioRespiratorio excluído com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o CardioRespiratorio " + cardiorespiratorio.getIdCardioRespiratorio(),
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
