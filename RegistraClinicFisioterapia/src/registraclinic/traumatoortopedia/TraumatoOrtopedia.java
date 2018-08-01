package registraclinic.traumatoortopedia;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import registraclinic.paciente.Paciente;

/**
 *
 * @author Karlos Oliveira
 */
@Entity
public class TraumatoOrtopedia implements Serializable {
    
    @Id
    @GeneratedValue
    private int idTraumatoOrtopedia;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idPaciente")
    private Paciente paciente;
    
    private String diagnosticoMedico;
    private String hda;
    private String hpp;
    private String historiaFamiliar;
    private String pa;
    private String fr;
    private String fc;

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

    public String getDiagnosticoMedico() {
        return diagnosticoMedico;
    }

    public void setDiagnosticoMedico(String diagnosticoMedico) {
        this.diagnosticoMedico = diagnosticoMedico;
    }

    public String getHda() {
        return hda;
    }

    public void setHda(String hda) {
        this.hda = hda;
    }

    public String getHpp() {
        return hpp;
    }

    public void setHpp(String hpp) {
        this.hpp = hpp;
    }

    public String getHistoriaFamiliar() {
        return historiaFamiliar;
    }

    public void setHistoriaFamiliar(String historiaFamiliar) {
        this.historiaFamiliar = historiaFamiliar;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }
    
}
