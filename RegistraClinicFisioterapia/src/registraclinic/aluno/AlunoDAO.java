package registraclinic.aluno;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import registraclinic.usuario.Usuario;
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
        if (aluno.getIdPessoa() == 0) {
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
    
    public Aluno autenticarUsuario(String login, String senha) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Aluno aluno = (Aluno) sessao.createCriteria(Aluno.class).add(Restrictions.eq("senhaUsuario", senha)).add(Restrictions.eq("loginUsuario", login)).uniqueResult();
        if (aluno == null) {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválidos!");
        } else {
            sessao.close();
            return aluno;
        }
        return aluno;
    }
    
    public boolean excluir(Aluno aluno) {
        Object[] options = {"Sim", "Não"};
        if (aluno.getIdPessoa() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o aluno" + aluno.getNomePessoa()
                    + "?", "BirdStork", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(aluno)) {
                    JOptionPane.showMessageDialog(null, "Consulta excluída com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o aluno" + aluno.getNomePessoa(),
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
