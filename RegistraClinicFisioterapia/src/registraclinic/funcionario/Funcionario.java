/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.funcionario;

import java.util.Arrays;
import java.util.Objects;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import registraclinic.usuario.Usuario;

/**
 *
 * @author Karlos Oliveira
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@AttributeOverrides(value={
		@AttributeOverride(name="login",column=@Column(name="loginUsuario")),
		@AttributeOverride(name="senha",column=@Column(name="senhaUsuario")),
		@AttributeOverride(name="tipoUsuario",column=@Column(name="tipoUsuario"))
})
public class Funcionario extends Usuario {
    
    private String cpfFuncionario;
    private String rgFuncionario;
    private String funcaoFuncionario;

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getRgFuncionario() {
        return rgFuncionario;
    }

    public void setRgFuncionario(String rgFuncionario) {
        this.rgFuncionario = rgFuncionario;
    }

    public String getFuncaoFuncionario() {
        return funcaoFuncionario;
    }

    public void setFuncaoFuncionario(String funcaoFuncionario) {
        this.funcaoFuncionario = funcaoFuncionario;
    }
    
}
