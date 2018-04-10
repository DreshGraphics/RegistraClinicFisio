package registraclinicfisioterapia.supervisor;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import registraclinicfisioterapia.util.GenericDAO;
import registraclinicfisioterapia.util.HibernateUtil;

public class SupervisorDAO extends GenericDAO<Supervisor> {

    public SupervisorDAO() {
        super(Supervisor.class);
    }

    public void salvar(Supervisor supervisor) {
        Object[] options = {"Sim", "Não"};
        if (supervisor.getIdPessoa() == 0) {
            if (adicionar(supervisor)) {
                JOptionPane.showMessageDialog(null, "Supervisor cadastrado com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "RegistraClinic", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(supervisor)) {
                JOptionPane.showMessageDialog(null, "Supervisor editado com sucesso!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }
    
    public boolean excluir(Supervisor supervisor) {
        Object[] options = {"Sim", "Não"};
        if (supervisor.getIdPessoa() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o Supervisor " + supervisor.getNomePessoa()
                    + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {

                if (remover(supervisor)) {
                    JOptionPane.showMessageDialog(null, "Supervisor excluído com sucesso!");                    
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o Supervisor " + supervisor.getNomePessoa(),
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
