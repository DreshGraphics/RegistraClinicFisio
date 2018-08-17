/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.provapulmonar;


import javax.swing.JOptionPane;
import registraclinic.util.GenericDAO;

/**
 *
 * @author Karlos
 */
public class ProvaPulmonarDAO extends GenericDAO<ProvaPulmonar>{
    
    public ProvaPulmonarDAO() {
        super(ProvaPulmonar.class);
    }
    
    public void salvar(ProvaPulmonar provaPulmonar) {
        Object[] options = {"Sim", "Não"};
        if (provaPulmonar.getIdProvaPulmonar() == 0) {
            if (adicionar(provaPulmonar)) {
                JOptionPane.showMessageDialog(null, "ProvaPulmonar salvo(a) com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "RegistraClinic", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(provaPulmonar)) {
                JOptionPane.showMessageDialog(null, "ProvaPulmonar editado(a) com sucesso!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }
    
    public boolean excluir(ProvaPulmonar provaPulmonar) {
        Object[] options = {"Sim", "Não"};
        if (provaPulmonar.getIdProvaPulmonar() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o(a) ProvaPulmonar: " + provaPulmonar
                    + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {

                if (remover(provaPulmonar)) {
                    JOptionPane.showMessageDialog(null, "ProvaPulmonar excluído com sucesso!");                    
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o(a) ProvaPulmonar " + provaPulmonar,
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
