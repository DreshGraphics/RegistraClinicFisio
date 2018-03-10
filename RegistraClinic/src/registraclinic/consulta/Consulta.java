/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.consulta;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import registraclinic.usuario.Usuario;
import registraclinic.paciente.Paciente;

/**
 *
 * @author Karlos
 */
@Entity
public class Consulta implements Serializable {
    
    @Id
    @GeneratedValue
    private int idConsulta;
    private String nomeConsulta;
    
    @OneToOne
    private Paciente pacienteConsulta;
    private String dataConsulta;
    private String horaConsulta;
    @OneToOne
    private Usuario funcionarioConsulta;

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

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
    
    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public Usuario getFuncionarioConsulta() {
        return funcionarioConsulta;
    }

    public void setFuncionarioConsulta(Usuario funcionarioConsulta) {
        this.funcionarioConsulta = funcionarioConsulta;
    }

    
}
