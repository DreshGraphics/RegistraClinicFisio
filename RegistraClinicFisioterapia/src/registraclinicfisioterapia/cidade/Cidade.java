/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinicfisioterapia.cidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Karlos
 */
@Entity
public class Cidade implements Serializable {
    
    @Id
    @GeneratedValue
    private int idCidade;
    
    @Column(length = 50,nullable = false)
    private String nomeCidade;
    
    @Column(length = 50,nullable = false)
    private String estadoCidade;
    
    @Column(length = 50,nullable = false)
    private String cepCidade;

    /**
     * @return the idCidade
     */
    public int getIdCidade() {
        return idCidade;
    }

    /**
     * @param idCidade the idCidade to set
     */
    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    /**
     * @return the nomeCidade
     */
    public String getNomeCidade() {
        return nomeCidade;
    }

    /**
     * @param nomeCidade the nomeCidade to set
     */
    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    /**
     * @return the estadoCidade
     */
    public String getEstadoCidade() {
        return estadoCidade;
    }

    /**
     * @param estadoCidade the estadoCidade to set
     */
    public void setEstadoCidade(String estadoCidade) {
        this.estadoCidade = estadoCidade;
    }

    /**
     * @return the cepCidade
     */
    public String getCepCidade() {
        return cepCidade;
    }

    /**
     * @param cepCidade the cepCidade to set
     */
    public void setCepCidade(String cepCidade) {
        this.cepCidade = cepCidade;
    }

    
}
