/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.anamnesecardio;

import javax.swing.JOptionPane;
import registraclinic.util.GenericDAO;
import registraclinic.anamnesecardio.AnamneseCardio;

/**
 *
 * @author Karlos
 */
public class AnamneseCardioDAO extends GenericDAO<AnamneseCardio>{
    
    public AnamneseCardioDAO() {
        super(AnamneseCardio.class);
    }
    
    public void salvar(AnamneseCardio anamnese) {
        Object[] options = {"Sim", "Não"};
        if (anamnese.getIdAnamneseCardio()== 0) {
            if (adicionar(anamnese)) {
                JOptionPane.showMessageDialog(null, "Anamnese salvo(a) com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "RegistraClinic", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(anamnese)) {
                JOptionPane.showMessageDialog(null, "Anamnese editado(a) com sucesso!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }
    
    public boolean excluir(AnamneseCardio AnamneseCardio) {
        Object[] options = {"Sim", "Não"};
        if (AnamneseCardio.getIdAnamneseCardio() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o(a) Anamnese: " + AnamneseCardio
                    + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {

                if (remover(AnamneseCardio)) {
                    JOptionPane.showMessageDialog(null, "Anamnese excluído com sucesso!");                    
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o(a) Anamnese " + AnamneseCardio,
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
