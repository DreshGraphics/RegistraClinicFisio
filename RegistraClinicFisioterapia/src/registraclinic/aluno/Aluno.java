package registraclinic.aluno;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import registraclinic.usuario.Usuario;

/**
 *
 * @author Karlos
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@AttributeOverrides(value={
		@AttributeOverride(name="login",column=@Column(name="loginUsuario")),
		@AttributeOverride(name="senha",column=@Column(name="senhaUsuario")),
		@AttributeOverride(name="tipoUsuario",column=@Column(name="tipoUsuario"))
})

public class Aluno extends Usuario {

    private String matriculaAluno;
    private String turmaAluno;
    private String emailAluno;
    
    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public String getTurmaAluno() {
        return turmaAluno;
    }

    public void setTurmaAluno(String turmaAluno) {
        this.turmaAluno = turmaAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }
    
}
