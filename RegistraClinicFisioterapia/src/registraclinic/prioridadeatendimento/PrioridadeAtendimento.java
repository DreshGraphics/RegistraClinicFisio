/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.prioridadeatendimento;

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
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Atendimento atendimento;
    
    @OneToOne
    private Paciente paciente;

    public int getIdPrioridadeAtendimento() {
        return idPrioridadeAtendimento;
    }

    public void setIdPrioridadeAtendimento(int idPrioridadeAtendimento) {
        this.idPrioridadeAtendimento = idPrioridadeAtendimento;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
