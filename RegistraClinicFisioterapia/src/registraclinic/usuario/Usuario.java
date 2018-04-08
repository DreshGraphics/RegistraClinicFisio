/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.usuario;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
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
public abstract class Usuario extends Pessoa{
        
    private String loginUsuario;
    private String senhaUsuario;
    private String tipoUsuario;
    
    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
}
