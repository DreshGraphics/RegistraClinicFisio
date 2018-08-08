package registraclinic.traumatoortopedia;

import registraclinic.supervisor.*;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import registraclinic.paciente.Paciente;
import registraclinic.usuario.Usuario;

/**
 *
 * @author Karlos Oliveira.
 */
@Entity
public class TraumatoOrtopedia {

    @Id
    @GeneratedValue
    private int idTraumatoOrtopedia;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idPaciente")
    private Paciente paciente;

    public int getIdTraumatoOrtopedia() {
        return idTraumatoOrtopedia;
    }

    public void setIdTraumatoOrtopedia(int idTraumatoOrtopedia) {
        this.idTraumatoOrtopedia = idTraumatoOrtopedia;
    }
    
    
    
    
}
