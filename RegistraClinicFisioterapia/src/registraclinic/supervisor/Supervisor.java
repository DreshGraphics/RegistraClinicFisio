package registraclinic.supervisor;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import registraclinic.usuario.Usuario;

/**
 *
 * @author Karlos Oliveira.
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
		@AttributeOverride(name="ocupacao",column=@Column(name="ocupacaoPessoa")),
		@AttributeOverride(name="login",column=@Column(name="loginUsuario")),
		@AttributeOverride(name="senha",column=@Column(name="senhaUsuario")),
		@AttributeOverride(name="tipoUsuario",column=@Column(name="tipoUsuario"))
})
public class Supervisor extends Usuario {

    private String cpfSupervisor;
    private String rgSupervisor;
    private String turmaSupervisor;
    private String especializacaoSupervisor;
    
    public String getTurmaSupervisor() {
        return turmaSupervisor;
    }

    public String getCpfSupervisor() {
        return cpfSupervisor;
    }

    public void setCpfSupervisor(String cpfSupervisor) {
        this.cpfSupervisor = cpfSupervisor;
    }

    public String getRgSupervisor() {
        return rgSupervisor;
    }

    public void setRgSupervisor(String rgSupervisor) {
        this.rgSupervisor = rgSupervisor;
    }

    public void setTurmaSupervisor(String turmaSupervisor) {
        this.turmaSupervisor = turmaSupervisor;
    }

    public String getEspecializacaoSupervisor() {
        return especializacaoSupervisor;
    }

    public void setEspecializacaoSupervisor(String especializacaoSupervisor) {
        this.especializacaoSupervisor = especializacaoSupervisor;
    }
    
}
