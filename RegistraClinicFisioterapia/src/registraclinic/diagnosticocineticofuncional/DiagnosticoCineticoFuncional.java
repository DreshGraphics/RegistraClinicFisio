package registraclinic.diagnosticocineticofuncional;

import registraclinic.examescomplementares.*;
import registraclinic.avaliacaopostural.*;
import registraclinic.atendimento.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author root
 */
@Entity
public class DiagnosticoCineticoFuncional implements Serializable {

    @Id
    @GeneratedValue
    private int idDiagnosticoCineticoFuncional;
    
    private String diagnosticoCineticoFuncional;
    private String objetivosDoTratamento;
    private String observacoesGerais;

    public int getIdDiagnosticoCineticoFuncional() {
        return idDiagnosticoCineticoFuncional;
    }

    public void setIdDiagnosticoCineticoFuncional(int idDiagnosticoCineticoFuncional) {
        this.idDiagnosticoCineticoFuncional = idDiagnosticoCineticoFuncional;
    }

    public String getDiagnosticoCineticoFuncional() {
        return diagnosticoCineticoFuncional;
    }

    public void setDiagnosticoCineticoFuncional(String diagnosticoCineticoFuncional) {
        this.diagnosticoCineticoFuncional = diagnosticoCineticoFuncional;
    }

    public String getObjetivosDoTratamento() {
        return objetivosDoTratamento;
    }

    public void setObjetivosDoTratamento(String objetivosDoTratamento) {
        this.objetivosDoTratamento = objetivosDoTratamento;
    }

    public String getObservacoesGerais() {
        return observacoesGerais;
    }

    public void setObservacoesGerais(String observacoesGerais) {
        this.observacoesGerais = observacoesGerais;
    }
    
}
