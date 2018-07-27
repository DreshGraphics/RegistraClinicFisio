/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.paciente;


import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import registraclinic.atendimento.Atendimento;
import registraclinic.pessoa.Pessoa;
import registraclinic.triagem.Triagem;

/**
 *
 * @author Karlos
 */
@Entity
public class Paciente extends Pessoa{

//    @OneToMany(mappedBy = "paciente")
//    private List<PrioridadeAtendimento> prioridadeAtendimentos;
    
    private String numeroProntuarioPaciente;
    private String postoDeSaudePaciente;
    private String agenteDeSaudePaciente;
    private String pesoPaciente;
    private String alturaPaciente;
    private String tipoPaciente;
    private String cpfResponsavelPaciente;
    private String rgResponsavelPaciente;
    private String registroNascimentoPaciente;
    private String nomeResponsavelPaciente;
    private String situacaoPaciente;
    private Date dataCadastroPaciente;
    
    private String tipoAtendimento;
    @Column(length = 100)
    private String queixaDoPaciente;

    public String getNumeroProntuarioPaciente() {
        return numeroProntuarioPaciente;
    }

    public void setNumeroProntuarioPaciente(String numeroProntuarioPaciente) {
        this.numeroProntuarioPaciente = numeroProntuarioPaciente;
    }

    public String getPostoDeSaudePaciente() {
        return postoDeSaudePaciente;
    }

    public void setPostoDeSaudePaciente(String postoDeSaudePaciente) {
        this.postoDeSaudePaciente = postoDeSaudePaciente;
    }

    public String getAgenteDeSaudePaciente() {
        return agenteDeSaudePaciente;
    }

    public void setAgenteDeSaudePaciente(String agenteDeSaudePaciente) {
        this.agenteDeSaudePaciente = agenteDeSaudePaciente;
    }

    public String getPesoPaciente() {
        return pesoPaciente;
    }

    public void setPesoPaciente(String pesoPaciente) {
        this.pesoPaciente = pesoPaciente;
    }

    public String getAlturaPaciente() {
        return alturaPaciente;
    }

    public void setAlturaPaciente(String alturaPaciente) {
        this.alturaPaciente = alturaPaciente;
    }

    public String getQueixaDoPaciente() {
        return queixaDoPaciente;
    }

    public void setQueixaDoPaciente(String queixaDoPaciente) {
        this.queixaDoPaciente = queixaDoPaciente;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    public String getCpfResponsavelPaciente() {
        return cpfResponsavelPaciente;
    }

    public void setCpfResponsavelPaciente(String cpfResponsavelPaciente) {
        this.cpfResponsavelPaciente = cpfResponsavelPaciente;
    }

    public String getRgResponsavelPaciente() {
        return rgResponsavelPaciente;
    }

    public void setRgResponsavelPaciente(String rgResponsavelPaciente) {
        this.rgResponsavelPaciente = rgResponsavelPaciente;
    }

    public String getRegistroNascimentoPaciente() {
        return registroNascimentoPaciente;
    }

    public void setRegistroNascimentoPaciente(String registroNascimentoPaciente) {
        this.registroNascimentoPaciente = registroNascimentoPaciente;
    }

    public String getNomeResponsavelPaciente() {
        return nomeResponsavelPaciente;
    }

    public void setNomeResponsavelPaciente(String nomeResponsavelPaciente) {
        this.nomeResponsavelPaciente = nomeResponsavelPaciente;
    }

    public String getSituacaoPaciente() {
        return situacaoPaciente;
    }

    public void setSituacaoPaciente(String situacaoPaciente) {
        this.situacaoPaciente = situacaoPaciente;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public Date getDataCadastroPaciente() {
        return dataCadastroPaciente;
    }

    public void setDataCadastroPaciente(Date dataCadastroPaciente) {
        this.dataCadastroPaciente = dataCadastroPaciente;
    }
    
}
