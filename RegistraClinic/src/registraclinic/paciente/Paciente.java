/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.paciente;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Paulo
 */
@Entity
public class Paciente {
    
    @Id
    @GeneratedValue
    private int idPaciente;
    private String numeroProntuarioPaciente;
    private String nomePaciente;
    private String rgPaciente;
    private String cpfPaciente;
    private String idadePaciente;
    private String dataNascimentoPaciente;
    private String sexoPaciente;
    private String enderecoPaciente;
    private String enderecoNumeroPaciente;
    private String enderecoBairroPaciente;
    private String enderecoComplementoPaciente;
    private String CidadePaciente;
    private String EstadoPaciente;
    private String telefonePaciente;
    private String nomeResponsavelPaciente;
    private String telefoneResponsavelPaciente;
    private Date dataCadastroPaciente;
    private String situacaoPaciente;
    private String tipoPaciente;

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNumeroProntuarioPaciente() {
        return numeroProntuarioPaciente;
    }

    public void setNumeroProntuarioPaciente(String numeroProntuarioPaciente) {
        this.numeroProntuarioPaciente = numeroProntuarioPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getRgPaciente() {
        return rgPaciente;
    }

    public void setRgPaciente(String rgPaciente) {
        this.rgPaciente = rgPaciente;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getIdadePaciente() {
        return idadePaciente;
    }

    public void setIdadePaciente(String idadePaciente) {
        this.idadePaciente = idadePaciente;
    }

    public String getDataNascimentoPaciente() {
        return dataNascimentoPaciente;
    }

    public void setDataNascimentoPaciente(String dataNascimentoPaciente) {
        this.dataNascimentoPaciente = dataNascimentoPaciente;
    }
    
    public String getSexoPaciente() {
        return sexoPaciente;
    }

    public void setSexoPaciente(String sexoPaciente) {
        this.sexoPaciente = sexoPaciente;
    }

    public String getEnderecoPaciente() {
        return enderecoPaciente;
    }

    public void setEnderecoPaciente(String enderecoPaciente) {
        this.enderecoPaciente = enderecoPaciente;
    }

    public String getTelefonePaciente() {
        return telefonePaciente;
    }

    public void setTelefonePaciente(String telefonePaciente) {
        this.telefonePaciente = telefonePaciente;
    }

    public String getNomeResponsavelPaciente() {
        return nomeResponsavelPaciente;
    }

    public void setNomeResponsavelPaciente(String nomeResponsavelPaciente) {
        this.nomeResponsavelPaciente = nomeResponsavelPaciente;
    }

    public String getTelefoneResponsavelPaciente() {
        return telefoneResponsavelPaciente;
    }

    public void setTelefoneResponsavelPaciente(String telefoneResponsavelPaciente) {
        this.telefoneResponsavelPaciente = telefoneResponsavelPaciente;
    }

    public Date getDataCadastroPaciente() {
        return dataCadastroPaciente;
    }

    public void setDataCadastroPaciente(Date dataCadastroPaciente) {
        this.dataCadastroPaciente = dataCadastroPaciente;
    }

    public String getSituacaoPaciente() {
        return situacaoPaciente;
    }

    public void setSituacaoPaciente(String situacaoPaciente) {
        this.situacaoPaciente = situacaoPaciente;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    public String getEnderecoNumeroPaciente() {
        return enderecoNumeroPaciente;
    }

    public void setEnderecoNumeroPaciente(String enderecoNumeroPaciente) {
        this.enderecoNumeroPaciente = enderecoNumeroPaciente;
    }

    public String getEnderecoBairroPaciente() {
        return enderecoBairroPaciente;
    }

    public void setEnderecoBairroPaciente(String enderecoBairroPaciente) {
        this.enderecoBairroPaciente = enderecoBairroPaciente;
    }

    public String getEnderecoComplementoPaciente() {
        return enderecoComplementoPaciente;
    }

    public void setEnderecoComplementoPaciente(String enderecoComplementoPaciente) {
        this.enderecoComplementoPaciente = enderecoComplementoPaciente;
    }

    public String getCidadePaciente() {
        return CidadePaciente;
    }

    public void setCidadePaciente(String CidadePaciente) {
        this.CidadePaciente = CidadePaciente;
    }

    public String getEstadoPaciente() {
        return EstadoPaciente;
    }

    public void setEstadoPaciente(String EstadoPaciente) {
        this.EstadoPaciente = EstadoPaciente;
    }
        
    
}
