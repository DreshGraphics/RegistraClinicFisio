package registraclinic.supervisor;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Karlos Oliveira.
 */
@Entity
public class Supervisor{

    @Id
    @GeneratedValue
    private int idSupervisor;

    @Column(length = 500, nullable = false)
    private String nomeSupervisor;

    @Column(length = 20)
    private String cpfSupervisor;

    @Column(length = 50)
    private String rgSupervisor;

    @Column(length = 20)
    private String telefoneSupervisor;

    @Column(length = 15)
    private String dataNascimentoSupervisor;

    @Column(length = 10)
    private String sexoSupervisor;

    @Column(length = 550)
    private String enderecoSupervisor;

    @Column(length = 550)
    private String bairroSupervisor;

    @Column(length = 16)
    private String enderecoNumeroSupervisor;

    @Column(length = 500)
    private String cidadeSupervisor;

    @Column(length = 20)
    private String estadoSupervisor;

    @Column(length = 50)
    private String emailSupervisor;

    @Column(length = 300)
    private String complementoSupervisor;

    @Column(length = 40)
    private String turmaSupervisor;

    @Column(length = 50)
    private String especializacaoSupervisor;

    public int getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public String getNomeSupervisor() {
        return nomeSupervisor;
    }

    public void setNomeSupervisor(String nomeSupervisor) {
        this.nomeSupervisor = nomeSupervisor;
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

    public String getTelefoneSupervisor() {
        return telefoneSupervisor;
    }

    public void setTelefoneSupervisor(String telefoneSupervisor) {
        this.telefoneSupervisor = telefoneSupervisor;
    }

    public String getDataNascimentoSupervisor() {
        return dataNascimentoSupervisor;
    }

    public void setDataNascimentoSupervisor(String dataNascimentoSupervisor) {
        this.dataNascimentoSupervisor = dataNascimentoSupervisor;
    }
    
    public String getSexoSupervisor() {
        return sexoSupervisor;
    }

    public void setSexoSupervisor(String sexoSupervisor) {
        this.sexoSupervisor = sexoSupervisor;
    }

    public String getEnderecoSupervisor() {
        return enderecoSupervisor;
    }

    public void setEnderecoSupervisor(String enderecoSupervisor) {
        this.enderecoSupervisor = enderecoSupervisor;
    }

    public String getBairroSupervisor() {
        return bairroSupervisor;
    }

    public void setBairroSupervisor(String bairroSupervisor) {
        this.bairroSupervisor = bairroSupervisor;
    }

    public String getEnderecoNumeroSupervisor() {
        return enderecoNumeroSupervisor;
    }

    public void setEnderecoNumeroSupervisor(String enderecoNumeroSupervisor) {
        this.enderecoNumeroSupervisor = enderecoNumeroSupervisor;
    }

    public String getCidadeSupervisor() {
        return cidadeSupervisor;
    }

    public void setCidadeSupervisor(String cidadeSupervisor) {
        this.cidadeSupervisor = cidadeSupervisor;
    }

    public String getEstadoSupervisor() {
        return estadoSupervisor;
    }

    public void setEstadoSupervisor(String estadoSupervisor) {
        this.estadoSupervisor = estadoSupervisor;
    }

    public String getEmailSupervisor() {
        return emailSupervisor;
    }

    public void setEmailSupervisor(String emailSupervisor) {
        this.emailSupervisor = emailSupervisor;
    }

    public String getComplementoSupervisor() {
        return complementoSupervisor;
    }

    public void setComplementoSupervisor(String complementoSupervisor) {
        this.complementoSupervisor = complementoSupervisor;
    }


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
