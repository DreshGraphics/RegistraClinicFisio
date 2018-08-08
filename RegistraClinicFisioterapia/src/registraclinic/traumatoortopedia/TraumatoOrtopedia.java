package registraclinic.traumatoortopedia;

import registraclinic.supervisor.*;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import registraclinic.anamnese.Anamnese;
import registraclinic.avaliacaopostural.AvaliacaoPostural;
import registraclinic.diagnosticocineticofuncional.DiagnosticoCineticoFuncional;
import registraclinic.examescomplementares.ExamesComplementares;
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
    
    @OneToOne
    private Anamnese anamnese;
    
    @OneToOne
    private AvaliacaoPostural avaliacaoPostural;
    
    @OneToOne
    private ExamesComplementares examesComplementares;
    
    @OneToOne
    private DiagnosticoCineticoFuncional diagnosticoCineticoFuncional;

    public int getIdTraumatoOrtopedia() {
        return idTraumatoOrtopedia;
    }

    public void setIdTraumatoOrtopedia(int idTraumatoOrtopedia) {
        this.idTraumatoOrtopedia = idTraumatoOrtopedia;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Anamnese getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(Anamnese anamnese) {
        this.anamnese = anamnese;
    }

    public AvaliacaoPostural getAvaliacaoPostural() {
        return avaliacaoPostural;
    }

    public void setAvaliacaoPostural(AvaliacaoPostural avaliacaoPostural) {
        this.avaliacaoPostural = avaliacaoPostural;
    }

    public ExamesComplementares getExamesComplementares() {
        return examesComplementares;
    }

    public void setExamesComplementares(ExamesComplementares examesComplementares) {
        this.examesComplementares = examesComplementares;
    }

    public DiagnosticoCineticoFuncional getDiagnosticoCineticoFuncional() {
        return diagnosticoCineticoFuncional;
    }

    public void setDiagnosticoCineticoFuncional(DiagnosticoCineticoFuncional diagnosticoCineticoFuncional) {
        this.diagnosticoCineticoFuncional = diagnosticoCineticoFuncional;
    }
    
    
    
    
}
