/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.anamnesecardio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Paulo
 */
@Entity
public class AnamneseCardio {
    
    @Id
    @GeneratedValue
    private int IdAnamneseCardio;
    
    @Column( nullable = false)
    private String DiagnosticoClinico;
    private String QueixaPrincipal;
    private String HistoricoFamiliar;
    private String AtividadeFisica;
    private String CigarrosDias;
    private String AnosTabag;
    private String TempoParado;
    private String MedicacaoDeUso;
    private String ExamesComplementares;
    private String HDA;
    private boolean Tabagismo;
    private boolean Etilismo;
    private boolean Diabetes;
    private boolean Obesidade;
    private boolean Estresse;
    private boolean HAS;
    private boolean ControleAlimentar;

    /**
     * @return the DiagnosticoClinico
     */
    public String getDiagnosticoClinico() {
        return DiagnosticoClinico;
    }

    /**
     * @param DiagnosticoClinico the DiagnosticoClinico to set
     */
    public void setDiagnosticoClinico(String DiagnosticoClinico) {
        this.DiagnosticoClinico = DiagnosticoClinico;
    }

    /**
     * @return the QueixaPrincipal
     */
    public String getQueixaPrincipal() {
        return QueixaPrincipal;
    }

    /**
     * @param QueixaPrincipal the QueixaPrincipal to set
     */
    public void setQueixaPrincipal(String QueixaPrincipal) {
        this.QueixaPrincipal = QueixaPrincipal;
    }

    /**
     * @return the HistoricoFamiliar
     */
    public String getHistoricoFamiliar() {
        return HistoricoFamiliar;
    }

    /**
     * @param HistoricoFamiliar the HistoricoFamiliar to set
     */
    public void setHistoricoFamiliar(String HistoricoFamiliar) {
        this.HistoricoFamiliar = HistoricoFamiliar;
    }

    /**
     * @return the AtividadeFisica
     */
    public String getAtividadeFisica() {
        return AtividadeFisica;
    }

    /**
     * @param AtividadeFisica the AtividadeFisica to set
     */
    public void setAtividadeFisica(String AtividadeFisica) {
        this.AtividadeFisica = AtividadeFisica;
    }

    /**
     * @return the CigarrosDias
     */
    public String getCigarrosDias() {
        return CigarrosDias;
    }

    /**
     * @param CigarrosDias the CigarrosDias to set
     */
    public void setCigarrosDias(String CigarrosDias) {
        this.CigarrosDias = CigarrosDias;
    }

    /**
     * @return the AnosTabag
     */
    public String getAnosTabag() {
        return AnosTabag;
    }

    /**
     * @param AnosTabag the AnosTabag to set
     */
    public void setAnosTabag(String AnosTabag) {
        this.AnosTabag = AnosTabag;
    }

    /**
     * @return the TempoParado
     */
    public String getTempoParado() {
        return TempoParado;
    }

    /**
     * @param TempoParado the TempoParado to set
     */
    public void setTempoParado(String TempoParado) {
        this.TempoParado = TempoParado;
    }

    /**
     * @return the MedicacaoDeUso
     */
    public String getMedicacaoDeUso() {
        return MedicacaoDeUso;
    }

    /**
     * @param MedicacaoDeUso the MedicacaoDeUso to set
     */
    public void setMedicacaoDeUso(String MedicacaoDeUso) {
        this.MedicacaoDeUso = MedicacaoDeUso;
    }

    /**
     * @return the ExamesComplementares
     */
    public String getExamesComplementares() {
        return ExamesComplementares;
    }

    /**
     * @param ExamesComplementares the ExamesComplementares to set
     */
    public void setExamesComplementares(String ExamesComplementares) {
        this.ExamesComplementares = ExamesComplementares;
    }

    /**
     * @return the Tabagismo
     */
    public boolean isTabagismo() {
        return Tabagismo;
    }

    /**
     * @param Tabagismo the Tabagismo to set
     */
    public void setTabagismo(boolean Tabagismo) {
        this.Tabagismo = Tabagismo;
    }

    /**
     * @return the Etilismo
     */
    public boolean isEtilismo() {
        return Etilismo;
    }

    /**
     * @param Etilismo the Etilismo to set
     */
    public void setEtilismo(boolean Etilismo) {
        this.Etilismo = Etilismo;
    }

    /**
     * @return the Diabetes
     */
    public boolean isDiabetes() {
        return Diabetes;
    }

    /**
     * @param Diabetes the Diabetes to set
     */
    public void setDiabetes(boolean Diabetes) {
        this.Diabetes = Diabetes;
    }

    /**
     * @return the Obesidade
     */
    public boolean isObesidade() {
        return Obesidade;
    }

    /**
     * @param Obesidade the Obesidade to set
     */
    public void setObesidade(boolean Obesidade) {
        this.Obesidade = Obesidade;
    }

    /**
     * @return the Estresse
     */
    public boolean isEstresse() {
        return Estresse;
    }

    /**
     * @param Estresse the Estresse to set
     */
    public void setEstresse(boolean Estresse) {
        this.Estresse = Estresse;
    }

    /**
     * @return the HAS
     */
    public boolean isHAS() {
        return HAS;
    }

    /**
     * @param HAS the HAS to set
     */
    public void setHAS(boolean HAS) {
        this.HAS = HAS;
    }

    /**
     * @return the ControleAlimentar
     */
    public boolean isControleAlimentar() {
        return ControleAlimentar;
    }

    /**
     * @param ControleAlimentar the ControleAlimentar to set
     */
    public void setControleAlimentar(boolean ControleAlimentar) {
        this.ControleAlimentar = ControleAlimentar;
    }

    /**
     * @return the IdAnamnese
     */
    public int getIdAnamneseCardio() {
        return IdAnamneseCardio;
    }

    /**
     * @param IdAnamnese the IdAnamnese to set
     */
    public void setIdAnamneseCardio(int IdAnamneseCardio) {
        this.IdAnamneseCardio = IdAnamneseCardio;
    }

    /**
     * @return the HDA
     */
    public String getHDA() {
        return HDA;
    }

    /**
     * @param HDA the HDA to set
     */
    public void setHDA(String HDA) {
        this.HDA = HDA;
    }
    
      
}
