/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.triagem;

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
public class Triagem {
    
    @Id
    @GeneratedValue
    private int idTriagem;
    
    @Column(length = 100)
    private String prioridade;
    
    @OneToOne
    private Atendimento tipoAtendimento;
    
    @OneToOne
    private Paciente paciente;

    public int getIdTriagem() {
        return idTriagem;
    }

    public void setIdTriagem(int idTriagem) {
        this.idTriagem = idTriagem;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public Atendimento getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(Atendimento tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }
        
}
