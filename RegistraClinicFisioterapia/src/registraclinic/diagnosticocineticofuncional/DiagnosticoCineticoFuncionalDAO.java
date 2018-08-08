
package registraclinic.diagnosticocineticofuncional;

import registraclinic.examescomplementares.*;
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
public class DiagnosticoCineticoFuncionalDAO extends GenericDAO<ExamesComplementares> {

    public DiagnosticoCineticoFuncionalDAO() {
        super(ExamesComplementares.class);
    }
    
     public boolean salvar(ExamesComplementares examesComplementares) {
        Object[] options = {"Sim", "Não"};
        if (examesComplementares.getIdExamesComplementares() == 0) {
            if (adicionar(examesComplementares)) {
                JOptionPane.showMessageDialog(null, "Exame Complementar cadastrado com sucesso!");
                return true;
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(examesComplementares)) {
                JOptionPane.showMessageDialog(null, "Exame Complementar editado com sucesso!");
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
            
        }
        return false;
    }
     public boolean excluir(ExamesComplementares examesComplementares) {
        Object[] options = {"Sim", "Não"};
        if (examesComplementares.getIdExamesComplementares() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o Exame Complementar"
                    + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(examesComplementares)) {
                    JOptionPane.showMessageDialog(null, "Exame Complementar excluído com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o Exame Complementar ",
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
