/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.consulta;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import registraclinic.funcionario.Funcionario;
import registraclinic.paciente.Paciente;

/**
 *
 * @author Karlos
 */
@Entity
public class Consulta {
    
    @Id
    @GeneratedValue
    private int idConsulta;
    private String nomeConsulta;
    private Paciente pacienteConsulta;
    private Date dataConsulta;
    private String horaConsulta;
    private Funcionario funcionarioConsulta;

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getNomeConsulta() {
        return nomeConsulta;
    }

    public void setNomeConsulta(String nomeConsulta) {
        this.nomeConsulta = nomeConsulta;
    }

    public Paciente getPacienteConsulta() {
        return pacienteConsulta;
    }

    public void setPacienteConsulta(Paciente pacienteConsulta) {
        this.pacienteConsulta = pacienteConsulta;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public Funcionario getFuncionarioConsulta() {
        return funcionarioConsulta;
    }

    public void setFuncionarioConsulta(Funcionario funcionarioConsulta) {
        this.funcionarioConsulta = funcionarioConsulta;
    }

    
}
