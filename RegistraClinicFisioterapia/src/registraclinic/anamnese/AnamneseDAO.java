
package registraclinic.anamnese;

import registraclinic.atendimento.*;
import javax.swing.JOptionPane;
import registraclinic.atendimento.Atendimento;
import registraclinic.util.GenericDAO;

/**
 *
 * @author root
 */
public class AnamneseDAO extends GenericDAO<Anamnese> {

    public AnamneseDAO() {
        super(Anamnese.class);
    }
    
     public boolean salvar(Anamnese anamnese) {
        Object[] options = {"Sim", "Não"};
        if (anamnese.getIdAnamnese() == 0) {
            if (adicionar(anamnese)) {
                JOptionPane.showMessageDialog(null, "Anamnese cadastrada com sucesso!");
                return true;
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(anamnese)) {
                JOptionPane.showMessageDialog(null, "Anamnese editada com sucesso!");
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
            
        }
        return false;
    }
     public boolean excluir(Anamnese anamnese) {
        Object[] options = {"Sim", "Não"};
        if (anamnese.getIdAnamnese() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir a Anamnese"
                    + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(anamnese)) {
                    JOptionPane.showMessageDialog(null, "Anamnese excluída com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir a Anamnese ",
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
