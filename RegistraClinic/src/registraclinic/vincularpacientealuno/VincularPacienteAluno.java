/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.vincularpacientealuno;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import registraclinic.aluno.Aluno;
import registraclinic.paciente.Paciente;

/**
 *
 * @author Karlos
 */
@Entity
public class VincularPacienteAluno {
    
    @Id
    @GeneratedValue
    private int idVincularPacienteAluno;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Aluno aluno;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Paciente paciente;
    
    private String dataInicioAtendimento;

    public int getIdVincularPacienteAluno() {
        return idVincularPacienteAluno;
    }

    public void setIdVincularPacienteAluno(int idVincularPacienteAluno) {
        this.idVincularPacienteAluno = idVincularPacienteAluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public String getDataInicioAtendimento() {
        return dataInicioAtendimento;
    }

    public void setDataInicioAtendimento(String dataInicioAtendimento) {
        this.dataInicioAtendimento = dataInicioAtendimento;
    }
    
}
