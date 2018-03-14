/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.vincularalunosupervisor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import registraclinic.aluno.Aluno;
import registraclinic.supervisor.Supervisor;

/**
 *
 * @author Karlos
 */
@Entity
public class VincularAlunoSupervisor {
    
    @Id
    @GeneratedValue
    private int idVincularAlunosSupervisor;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Aluno aluno;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Supervisor supervisor;
    
    private String dataInicioSupervisao;

    public int getIdVincularAlunosSupervisor() {
        return idVincularAlunosSupervisor;
    }

    public void setIdVincularAlunosSupervisor(int idVincularAlunosSupervisor) {
        this.idVincularAlunosSupervisor = idVincularAlunosSupervisor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public String getDataInicioSupervisao() {
        return dataInicioSupervisao;
    }

    public void setDataInicioSupervisao(String dataInicioSupervisao) {
        this.dataInicioSupervisao = dataInicioSupervisao;
    }
        
}
