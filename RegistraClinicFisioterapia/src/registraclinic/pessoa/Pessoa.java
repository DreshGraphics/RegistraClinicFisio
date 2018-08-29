/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.pessoa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import registraclinic.cidade.Cidade;

/**
 *
 * @author Karlos
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int idPessoa;
    
    private String nomePessoa;
    private String telefonePessoa;
    private String telefoneOcionalPessoa;
    private Date dataNascimentoPessoa;
    private String sexoPessoa;
    private String idadePessoa;
    private String cpfPessoa;
    private String rgPessoa;
    private String estadoCivilPessoa;
    private String enderecoPessoa;
    private String bairroPessoa;
    private String enderecoNumeroPessoa;
    private String complementoPessoa;
    private String naturalidadePessoa;
    private String ocupacaoPessoa;
    private String profissaoPessoa;
    private Cidade cidade;
    

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }

    public String getTelefoneOcionalPessoa() {
        return telefoneOcionalPessoa;
    }

    public void setTelefoneOcionalPessoa(String telefoneOcionalPessoa) {
        this.telefoneOcionalPessoa = telefoneOcionalPessoa;
    }
    
    public Date getDataNascimentoPessoa() {
        return dataNascimentoPessoa;
    }

    public void setDataNascimentoPessoa(Date dataNascimentoPessoa) {
        this.dataNascimentoPessoa = dataNascimentoPessoa;
    }

    public String getSexoPessoa() {
        return sexoPessoa;
    }

    public void setSexoPessoa(String sexoPessoa) {
        this.sexoPessoa = sexoPessoa;
    }

    public String getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(String idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public String getRgPessoa() {
        return rgPessoa;
    }

    public void setRgPessoa(String rgPessoa) {
        this.rgPessoa = rgPessoa;
    }
    
    public String getEstadoCivilPessoa() {
        return estadoCivilPessoa;
    }

    public void setEstadoCivilPessoa(String estadoCivilPessoa) {
        this.estadoCivilPessoa = estadoCivilPessoa;
    }

    public String getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(String enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }

    public String getBairroPessoa() {
        return bairroPessoa;
    }

    public void setBairroPessoa(String bairroPessoa) {
        this.bairroPessoa = bairroPessoa;
    }

    public String getEnderecoNumeroPessoa() {
        return enderecoNumeroPessoa;
    }

    public void setEnderecoNumeroPessoa(String enderecoNumeroPessoa) {
        this.enderecoNumeroPessoa = enderecoNumeroPessoa;
    }

    public String getComplementoPessoa() {
        return complementoPessoa;
    }

    public void setComplementoPessoa(String complementoPessoa) {
        this.complementoPessoa = complementoPessoa;
    }

    public String getNaturalidadePessoa() {
        return naturalidadePessoa;
    }

    public void setNaturalidadePessoa(String naturalidadePessoa) {
        this.naturalidadePessoa = naturalidadePessoa;
    }

    public String getOcupacaoPessoa() {
        return ocupacaoPessoa;
    }

    public void setOcupacaoPessoa(String ocupacaoPessoa) {
        this.ocupacaoPessoa = ocupacaoPessoa;
    }

    public String getProfissaoPessoa() {
        return profissaoPessoa;
    }

    public void setProfissaoPessoa(String profissaoPessoa) {
        this.profissaoPessoa = profissaoPessoa;
    }
    
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

}
