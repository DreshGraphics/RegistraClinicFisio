package registraclinic.aluno;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import registraclinic.consulta.Consulta;
import registraclinic.util.GenericDAO;
import registraclinic.util.HibernateUtil;

public class AlunoDAO extends GenericDAO<Aluno> {

    public AlunoDAO() {
        super(Aluno.class);
    }

    public boolean existeUmSupervisor() {
        return !listar().isEmpty();
    }
    
    public void salvar(Aluno aluno) {
        Object[] options = {"Sim", "Não"};
        if (aluno.getIdAluno() == 0) {
            if (adicionar(aluno)) {
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "RegistraClinic", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(aluno)) {
                JOptionPane.showMessageDialog(null, "Aluno editado com sucesso!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }
    
    public boolean excluir(Aluno aluno) {
        Object[] options = {"Sim", "Não"};
        if (aluno.getIdAluno() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o aluno" + aluno.getNomeAluno()
                    + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(aluno)) {
                    JOptionPane.showMessageDialog(null, "Consulta excluída com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o aluno" + aluno.getNomeAluno(),
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
