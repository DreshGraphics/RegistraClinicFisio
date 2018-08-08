
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
public class DiagnosticoCineticoFuncionalDAO extends GenericDAO<DiagnosticoCineticoFuncional> {

    public DiagnosticoCineticoFuncionalDAO() {
        super(DiagnosticoCineticoFuncional.class);
    }
    
     public boolean salvar(DiagnosticoCineticoFuncional diagnosticoCineticoFuncional) {
        Object[] options = {"Sim", "Não"};
        if (diagnosticoCineticoFuncional.getIdDiagnosticoCineticoFuncional() == 0) {
            if (adicionar(diagnosticoCineticoFuncional)) {
                JOptionPane.showMessageDialog(null, "Diagnóstico Cinético Funcional cadastrado com sucesso!");
                return true;
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(diagnosticoCineticoFuncional)) {
                JOptionPane.showMessageDialog(null, "Diagnóstico Cinético Funcional editado com sucesso!");
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
            
        }
        return false;
    }
     public boolean excluir(DiagnosticoCineticoFuncional diagnosticoCineticoFuncional) {
        Object[] options = {"Sim", "Não"};
        if (diagnosticoCineticoFuncional.getIdDiagnosticoCineticoFuncional() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o Diagnóstico Cinético Funcional"
                    + "?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(diagnosticoCineticoFuncional)) {
                    JOptionPane.showMessageDialog(null, "Diagnóstico Cinético Funcional excluído com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o Diagnóstico Cinético Funcional ",
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
