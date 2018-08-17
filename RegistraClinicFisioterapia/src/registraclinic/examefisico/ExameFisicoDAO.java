/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.examefisico;


import javax.swing.JOptionPane;
import registraclinic.util.GenericDAO;

/**
 *
 * @author Karlos
 */
public class ExameFisicoDAO extends GenericDAO<ExameFisico>{
    
    public ExameFisicoDAO() {
        super(ExameFisico.class);
    }
    
    public void salvar(ExameFisico exameFisico) {
        Object[] options = {"Sim", "Não"};
        if (exameFisico.getIdExameFisico() == 0) {
            if (adicionar(exameFisico)) {
                JOptionPane.showMessageDialog(null, "ExameFisico salvo(a) com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "RegistraClinic", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(exameFisico)) {
                JOptionPane.showMessageDialog(null, "ExameFisico editado(a) com sucesso!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }
    
    public boolean excluir(ExameFisico exameFisico) {
        Object[] options = {"Sim", "Não"};
        if (exameFisico.getIdExameFisico() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o(a) ExameFisico: " + exameFisico
                    + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {

                if (remover(exameFisico)) {
                    JOptionPane.showMessageDialog(null, "ExameFisico excluído com sucesso!");                    
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o(a) ExameFisico " + exameFisico,
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
