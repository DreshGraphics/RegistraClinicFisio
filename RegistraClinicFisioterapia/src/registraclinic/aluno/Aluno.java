package registraclinic.aluno;


import javax.persistence.Entity;
import registraclinic.usuario.Usuario;

/**
 *
 * @author Karlos
 */
@Entity
public class Aluno extends Usuario {
    
    private String matriculaAluno;

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

}
