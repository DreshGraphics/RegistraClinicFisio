package registraclinic.traumatoortopedia;

import registraclinic.atendimento.*;
import javax.swing.JOptionPane;
import registraclinic.atendimento.Atendimento;
import registraclinic.util.GenericDAO;

/**
 *
 * @author root
 */
public class TraumatoOrtopediaDAO extends GenericDAO<TraumatoOrtopedia> {

    public TraumatoOrtopediaDAO() {
        super(TraumatoOrtopedia.class);
    }

    public boolean salvar(TraumatoOrtopedia traumatoOrtopedia) {
        Object[] options = {"Sim", "Não"};
        if (traumatoOrtopedia.getIdTraumatoOrtopedia() == 0) {
            if (adicionar(traumatoOrtopedia)) {
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
                return true;
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(traumatoOrtopedia)) {
                JOptionPane.showMessageDialog(null, "Editado com sucesso!");
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");

        }
        return false;
    }

    public boolean excluir(TraumatoOrtopedia traumatoOrtopedia) {
        Object[] options = {"Sim", "Não"};
        if (traumatoOrtopedia.getIdTraumatoOrtopedia() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir"
                    + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(traumatoOrtopedia)) {
                    JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir ",
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
