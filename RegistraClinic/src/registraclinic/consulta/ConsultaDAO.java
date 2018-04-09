/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.consulta;

import javax.swing.JOptionPane;
import registraclinic.util.GenericDAO;

/**
 *
 * @author Karlos
 */
public class ConsultaDAO extends GenericDAO<Consulta>{
    
    public ConsultaDAO() {
        super(Consulta.class);
    }
    
    public void salvar(Consulta consulta) {
        Object[] options = {"Sim", "Não"};
        if (consulta.getIdConsulta() == 0) {
            if (adicionar(consulta)) {
                JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "RegistraClinic", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(consulta)) {
                JOptionPane.showMessageDialog(null, "Consulta editada com sucesso!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }
    
    public boolean excluir(Consulta consulta) {
        Object[] options = {"Sim", "Não"};
        if (consulta.getIdConsulta() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir a Consulta" + consulta.getNomeConsulta()
                    + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(consulta)) {
                    JOptionPane.showMessageDialog(null, "Consulta excluída com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o Destino" + consulta.getNomeConsulta(),
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
