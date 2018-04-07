package registraclinic.supervisor;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import registraclinic.usuario.Usuario;

/**
 *
 * @author Karlos Oliveira.
 */
@Entity
public class Supervisor extends Usuario {

    private String cpfSupervisor;
    private String rgSupervisor;
    private String turmaSupervisor;
    private String especializacaoSupervisor;
    
    public String getTurmaSupervisor() {
        return turmaSupervisor;
    }

    public String getCpfSupervisor() {
        return cpfSupervisor;
    }

    public void setCpfSupervisor(String cpfSupervisor) {
        this.cpfSupervisor = cpfSupervisor;
    }

    public String getRgSupervisor() {
        return rgSupervisor;
    }

    public void setRgSupervisor(String rgSupervisor) {
        this.rgSupervisor = rgSupervisor;
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
