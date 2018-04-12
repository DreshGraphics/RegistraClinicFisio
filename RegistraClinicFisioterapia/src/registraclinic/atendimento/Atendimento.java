package registraclinic.atendimento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author root
 */
@Entity
public class Atendimento {

    @Id
    @GeneratedValue

    private int idAtendimento;
    @Column(length = 50, nullable = false)
    private String nomeAtendimento;

    public int getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(int idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public String getNomeAtendimento() {
        return nomeAtendimento;
    }

    public void setNomeAtendimento(String nomeAtendimento) {
        this.nomeAtendimento = nomeAtendimento;
    }

}
