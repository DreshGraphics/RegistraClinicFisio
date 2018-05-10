package registraclinic.supervisor;

import javax.persistence.Entity;
import registraclinic.usuario.Usuario;

/**
 *
 * @author Karlos Oliveira.
 */
@Entity
public class Supervisor extends Usuario {

    private String especializacaoSupervisor;

    public String getEspecializacaoSupervisor() {
        return especializacaoSupervisor;
    }

    public void setEspecializacaoSupervisor(String especializacaoSupervisor) {
        this.especializacaoSupervisor = especializacaoSupervisor;
    }
    
}
