/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.prioridadeatendimento;

import javax.swing.JOptionPane;
import registraclinic.atendimento.Atendimento;
import registraclinic.util.GenericDAO;

/**
 *
 * @author Karlos Oliveira
 */
public class PrioridadeAtendimentoDAO extends GenericDAO<PrioridadeAtendimento>{
    
    public PrioridadeAtendimentoDAO() {
        super(PrioridadeAtendimento.class);
    }
    
     public boolean salvar(PrioridadeAtendimento prioridadeAtendimento) {
        Object[] options = {"Sim", "Não"};
        if (prioridadeAtendimento.getIdPrioridadeAtendimento() == 0) {
            if (adicionar(prioridadeAtendimento)) {
                JOptionPane.showMessageDialog(null, "Atendimento cadastrado com sucesso!");
                return true;
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(prioridadeAtendimento)) {
                JOptionPane.showMessageDialog(null, "Atendimento editado com sucesso!");
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
            
        }
        return false;
    }
     public boolean excluir(PrioridadeAtendimento prioridadeAtendimento) {
        Object[] options = {"Sim", "Não"};
        if (prioridadeAtendimento.getIdPrioridadeAtendimento() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir a Atendimento? "
                    + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(prioridadeAtendimento)) {
                    JOptionPane.showMessageDialog(null, "Atendimento excluída com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir a Atendimento!",
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
