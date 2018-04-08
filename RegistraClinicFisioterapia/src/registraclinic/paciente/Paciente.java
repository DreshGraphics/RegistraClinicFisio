/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.paciente;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import registraclinic.pessoa.Pessoa;

/**
 *
 * @author Karlos
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@AttributeOverrides(value={
		@AttributeOverride(name="nome",column=@Column(name="nomePessoa")),
		@AttributeOverride(name="telefone",column=@Column(name="telefonePessoa")),
		@AttributeOverride(name="data",column=@Column(name="dataNascimentoPessoa")),
		@AttributeOverride(name="sexo",column=@Column(name="sexoPessoa")),
		@AttributeOverride(name="idade",column=@Column(name="idadePessoa")),
		@AttributeOverride(name="estadoCivil",column=@Column(name="estadoCivilPessoa")),
		@AttributeOverride(name="endereco",column=@Column(name="enderecoPessoa")),
		@AttributeOverride(name="bairro",column=@Column(name="bairroPessoa")),
		@AttributeOverride(name="numero",column=@Column(name="enderecoNumeroPessoa")),
		@AttributeOverride(name="cidade",column=@Column(name="cidadePessoa")),
		@AttributeOverride(name="estado",column=@Column(name="estadoPessoa")),
		@AttributeOverride(name="complemento",column=@Column(name="complementoPessoa")),
		@AttributeOverride(name="naturalidade",column=@Column(name="naturalidadePessoa")),
		@AttributeOverride(name="ocupacao",column=@Column(name="ocupacaoPessoa"))
})
@PrimaryKeyJoinColumn(name="idPessoa")
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
