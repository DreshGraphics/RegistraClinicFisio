/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.funcionario;

import javax.persistence.Entity;
import registraclinic.usuario.Usuario;

/**
 *
 * @author Karlos Oliveira
 */
@Entity
public class Funcionario extends Usuario {
    
    private String funcaoFuncionario;

    public String getFuncaoFuncionario() {
        return funcaoFuncionario;
    }

    public void setFuncaoFuncionario(String funcaoFuncionario) {
        this.funcaoFuncionario = funcaoFuncionario;
    }
    
}
