/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.cidade;

import registraclinic.util.GenericDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Karlos
 */
public class CidadeDAO extends GenericDAO<Cidade> {
    
    public CidadeDAO() {
        super(Cidade.class);
    }

    public void salvar(Cidade cidade) {
        Object[] options = {"Sim", "Não"};
        if (cidade.getIdCidade() == 0) {
            if (adicionar(cidade)) {
                JOptionPane.showMessageDialog(null, "Cidade cadastrada com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(cidade)) {
                JOptionPane.showMessageDialog(null, "Cidade editada com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }

    public boolean excluir(Cidade cidade) {
        Object[] options = {"Sim", "Não"};
        if (cidade.getIdCidade() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir a Cidade" + cidade.getNomeCidade()
                    + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(cidade)) {
                    JOptionPane.showMessageDialog(null, "Cidade excluída com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir a Cidade" + cidade.getNomeCidade(),
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
