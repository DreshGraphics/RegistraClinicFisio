/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.paciente;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
    private String situacaoDeAtendimento = "Aguardando atendimento";
    //Aguardando triagem
    //Aguardando atendimento <- já fica nesse
    //Em atendimento
    
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

    public String getSituacaoDeAtendimento() {
        return situacaoDeAtendimento;
    }

    public void setSituacaoDeAtendimento(String situacaoDeAtendimento) {
        this.situacaoDeAtendimento = situacaoDeAtendimento;
    }

    public String getQueixaDoPaciente() {
        return queixaDoPaciente;
    }

    public void setQueixaDoPaciente(String queixaDoPaciente) {
        this.queixaDoPaciente = queixaDoPaciente;
    }

    
        
    
}
