/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.prioridadeatendimento;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import registraclinic.atendimento.Atendimento;
import registraclinic.paciente.Paciente;

/**
 *
 * @author Karlos Oliveira
 */
@Entity
public class PrioridadeAtendimento {
    
    @Id
    @GeneratedValue
    private int idPrioridadeAtendimento;
    
    @Column(length = 100)
    private String prioridade;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Atendimento tipoAtendimento;
    
    @OneToOne
    private Paciente paciente;

    public int getIdPrioridadeAtendimento() {
        return idPrioridadeAtendimento;
    }

    public void setIdPrioridadeAtendimento(int idPrioridadeAtendimento) {
        this.idPrioridadeAtendimento = idPrioridadeAtendimento;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the atendimento
     */
    public Atendimento getAtendimento() {
        return atendimento;
    }

    /**
     * @param atendimento the atendimento to set
     */
    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    /**
     * @return the prioridade
     */
    public String getPrioridade() {
        return prioridade;
    }

    /**
     * @param prioridade the prioridade to set
     */
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
    
}
