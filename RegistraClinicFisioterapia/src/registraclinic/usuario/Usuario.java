/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.usuario;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.swing.JOptionPane;
import org.hibernate.criterion.Restrictions;
import registraclinic.pessoa.Pessoa;
import registraclinic.util.HibernateUtil;

/**
 *
 * @author Karlos
 */
@Entity
public abstract class Usuario extends Pessoa implements Serializable {

    private String loginUsuario;
    private String senhaUsuario;
    private String tipoUsuario;
    private String emailUsuario;   
    
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

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

}
