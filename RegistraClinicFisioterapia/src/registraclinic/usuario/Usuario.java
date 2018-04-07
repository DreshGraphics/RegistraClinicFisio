/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.usuario;

import javax.persistence.Entity;
import registraclinic.pessoa.Pessoa;

/**
 *
 * @author Karlos
 */
@Entity
public abstract class Usuario extends Pessoa{
    
    
    private String loginUsuario;
    private String senhaUsuario;
    
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
    
}
