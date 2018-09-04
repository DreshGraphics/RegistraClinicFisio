/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.examefisico;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import registraclinic.paciente.Paciente;

/**
 *
 * @author Paulo
 */
@Entity
public class ExameFisico implements Serializable {
    
    @Id
    @GeneratedValue
    private int IdExameFisico;
    
    @Column( nullable = false)
    private String PA;
    private String FC;
    private String FR;
    private String SaO2;
    private String AuscutaPulmonar;
    private String AuscutaCardiaca;
    private String FormaDoTorax;
    private String SimetriaDoTorax; 
    private String Expansibilidade;
    private String MobilidadeToracica;
    private boolean Dispneia;
    private boolean RespiracaoParadoxal;
    private String UsoDeMusculaturaAcessoria;
    private String RitmoRespiratorio;
    private String Tosse;
    private String Expectoracao;
    private String Palpacao;
    private String Percucao;
    
    @OneToOne
    private Paciente paciente;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the PA
     */
    public String getPA() {
        return PA;
    }

    /**
     * @param PA the PA to set
     */
    public void setPA(String PA) {
        this.PA = PA;
    }

    /**
     * @return the FC
     */
    public String getFC() {
        return FC;
    }

    /**
     * @param FC the FC to set
     */
    public void setFC(String FC) {
        this.FC = FC;
    }

    /**
     * @return the FR
     */
    public String getFR() {
        return FR;
    }

    /**
     * @param FR the FR to set
     */
    public void setFR(String FR) {
        this.FR = FR;
    }

    /**
     * @return the SaO2
     */
    public String getSaO2() {
        return SaO2;
    }

    /**
     * @param SaO2 the SaO2 to set
     */
    public void setSaO2(String SaO2) {
        this.SaO2 = SaO2;
    }

    /**
     * @return the AuscutaPulmonar
     */
    public String getAuscutaPulmonar() {
        return AuscutaPulmonar;
    }

    /**
     * @param AuscutaPulmonar the AuscutaPulmonar to set
     */
    public void setAuscutaPulmonar(String AuscutaPulmonar) {
        this.AuscutaPulmonar = AuscutaPulmonar;
    }

    /**
     * @return the AuscutaCardiaca
     */
    public String getAuscutaCardiaca() {
        return AuscutaCardiaca;
    }

    /**
     * @param AuscutaCardiaca the AuscutaCardiaca to set
     */
    public void setAuscutaCardiaca(String AuscutaCardiaca) {
        this.AuscutaCardiaca = AuscutaCardiaca;
    }

    /**
     * @return the FormaDoTorax
     */
    public String getFormaDoTorax() {
        return FormaDoTorax;
    }

    /**
     * @param FormaDoTorax the FormaDoTorax to set
     */
    public void setFormaDoTorax(String FormaDoTorax) {
        this.FormaDoTorax = FormaDoTorax;
    }

    /**
     * @return the SimetriaDoTorax
     */
    public String getSimetriaDoTorax() {
        return SimetriaDoTorax;
    }

    /**
     * @param SimetriaDoTorax the SimetriaDoTorax to set
     */
    public void setSimetriaDoTorax(String SimetriaDoTorax) {
        this.SimetriaDoTorax = SimetriaDoTorax;
    }

    /**
     * @return the Expansibilidade
     */
    public String getExpansibilidade() {
        return Expansibilidade;
    }

    /**
     * @param Expansibilidade the Expansibilidade to set
     */
    public void setExpansibilidade(String Expansibilidade) {
        this.Expansibilidade = Expansibilidade;
    }

    /**
     * @return the MobilidadeToracica
     */
    public String getMobilidadeToracica() {
        return MobilidadeToracica;
    }

    /**
     * @param MobilidadeToracica the MobilidadeToracica to set
     */
    public void setMobilidadeToracica(String MobilidadeToracica) {
        this.MobilidadeToracica = MobilidadeToracica;
    }

    /**
     * @return the Dispneia
     */
    public boolean isDispneia() {
        return Dispneia;
    }

    /**
     * @param Dispneia the Dispneia to set
     */
    public void setDispneia(boolean Dispneia) {
        this.Dispneia = Dispneia;
    }

    /**
     * @return the RespiracaoParadoxal
     */
    public boolean isRespiracaoParadoxal() {
        return RespiracaoParadoxal;
    }

    /**
     * @param RespiracaoParadoxal the RespiracaoParadoxal to set
     */
    public void setRespiracaoParadoxal(boolean RespiracaoParadoxal) {
        this.RespiracaoParadoxal = RespiracaoParadoxal;
    }

    /**
     * @return the UsoDeMusculaturaAcessoria
     */
    public String getUsoDeMusculaturaAcessoria() {
        return UsoDeMusculaturaAcessoria;
    }

    /**
     * @param UsoDeMusculaturaAcessoria the UsoDeMusculaturaAcessoria to set
     */
    public void setUsoDeMusculaturaAcessoria(String UsoDeMusculaturaAcessoria) {
        this.UsoDeMusculaturaAcessoria = UsoDeMusculaturaAcessoria;
    }

    /**
     * @return the RitmoRespiratorio
     */
    public String getRitmoRespiratorio() {
        return RitmoRespiratorio;
    }

    /**
     * @param RitmoRespiratorio the RitmoRespiratorio to set
     */
    public void setRitmoRespiratorio(String RitmoRespiratorio) {
        this.RitmoRespiratorio = RitmoRespiratorio;
    }

    /**
     * @return the Tosse
     */
    public String getTosse() {
        return Tosse;
    }

    /**
     * @param Tosse the Tosse to set
     */
    public void setTosse(String Tosse) {
        this.Tosse = Tosse;
    }

    /**
     * @return the Expectoracao
     */
    public String getExpectoracao() {
        return Expectoracao;
    }

    /**
     * @param Expectoracao the Expectoracao to set
     */
    public void setExpectoracao(String Expectoracao) {
        this.Expectoracao = Expectoracao;
    }

    /**
     * @return the Palpacao
     */
    public String getPalpacao() {
        return Palpacao;
    }

    /**
     * @param Palpacao the Palpacao to set
     */
    public void setPalpacao(String Palpacao) {
        this.Palpacao = Palpacao;
    }

    /**
     * @return the Percucao
     */
    public String getPercucao() {
        return Percucao;
    }

    /**
     * @param Percucao the Percucao to set
     */
    public void setPercucao(String Percucao) {
        this.Percucao = Percucao;
    }

    /**
     * @return the IdExameFisico
     */
    public int getIdExameFisico() {
        return IdExameFisico;
    }

    /**
     * @param IdExameFisico the IdExameFisico to set
     */
    public void setIdExameFisico(int IdExameFisico) {
        this.IdExameFisico = IdExameFisico;
    }
    
}
