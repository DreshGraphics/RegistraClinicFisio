/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinicfisioterapia.paciente;


import javax.persistence.Entity;
import registraclinicfisioterapia.pessoa.Pessoa;

/**
 *
 * @author Karlos
 */
@Entity
public class Paciente extends Pessoa{
    
    private String numeroProntuarioPaciente;
    private String postoDeSaudePaciente;
    private String agenteDeSaudePaciente;
    private String pesoPaciente;
    private String alturaPaciente;

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

    
        
    
}
