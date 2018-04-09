package registraclinic.supervisor;

import javax.persistence.Entity;
import registraclinic.usuario.Usuario;

/**
 *
 * @author Karlos Oliveira.
 */
@Entity
public class Supervisor extends Usuario {

    private String turmaSupervisor;
    private String especializacaoSupervisor;

    public String getTurmaSupervisor() {
        return turmaSupervisor;
    }

    public void setTurmaSupervisor(String turmaSupervisor) {
        this.turmaSupervisor = turmaSupervisor;
    }

    public String getEspecializacaoSupervisor() {
        return especializacaoSupervisor;
    }

    public void setEspecializacaoSupervisor(String especializacaoSupervisor) {
        this.especializacaoSupervisor = especializacaoSupervisor;
    }
    
}
