/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.provapulmonar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Paulo
 */
@Entity
public class ProvaPulmonar {
    
    @Id
    @GeneratedValue
    private int IdProvaPulmonar;
    
    @Column( nullable = false)
    private String PregaAxilar;
    private String MelhorFluxoPessoal;
    private String ProcessoXifoide;
    private String LinhaUmbilical;
    private String Conclusao;
    private String PImax;
    private String PEmax;
    private String PIParecer;
    private String PEParecer;
    private String TipoRespiratorio;
    private String OBJTratamento;
    private String Condultas;

    /**
     * @return the IdProvaPulmonar
     */
    public int getIdProvaPulmonar() {
        return IdProvaPulmonar;
    }

    /**
     * @param IdProvaPulmonar the IdProvaPulmonar to set
     */
    public void setIdProvaPulmonar(int IdProvaPulmonar) {
        this.IdProvaPulmonar = IdProvaPulmonar;
    }

    /**
     * @return the PregaAxilar
     */
    public String getPregaAxilar() {
        return PregaAxilar;
    }

    /**
     * @param PregaAxilar the PregaAxilar to set
     */
    public void setPregaAxilar(String PregaAxilar) {
        this.PregaAxilar = PregaAxilar;
    }

    /**
     * @return the ProcessoXifoide
     */
    public String getProcessoXifoide() {
        return ProcessoXifoide;
    }

    /**
     * @param ProcessoXifoide the ProcessoXifoide to set
     */
    public void setProcessoXifoide(String ProcessoXifoide) {
        this.ProcessoXifoide = ProcessoXifoide;
    }

    /**
     * @return the LinhaUmbilical
     */
    public String getLinhaUmbilical() {
        return LinhaUmbilical;
    }

    /**
     * @param LinhaUmbilical the LinhaUmbilical to set
     */
    public void setLinhaUmbilical(String LinhaUmbilical) {
        this.LinhaUmbilical = LinhaUmbilical;
    }

    /**
     * @return the Conclusao
     */
    public String getConclusao() {
        return Conclusao;
    }

    /**
     * @param Conclusao the Conclusao to set
     */
    public void setConclusao(String Conclusao) {
        this.Conclusao = Conclusao;
    }

    /**
     * @return the PImax
     */
    public String getPImax() {
        return PImax;
    }

    /**
     * @param PImax the PImax to set
     */
    public void setPImax(String PImax) {
        this.PImax = PImax;
    }

    /**
     * @return the PEmax
     */
    public String getPEmax() {
        return PEmax;
    }

    /**
     * @param PEmax the PEmax to set
     */
    public void setPEmax(String PEmax) {
        this.PEmax = PEmax;
    }

    /**
     * @return the TipoRespiratorio
     */
    public String getTipoRespiratorio() {
        return TipoRespiratorio;
    }

    /**
     * @param TipoRespiratorio the TipoRespiratorio to set
     */
    public void setTipoRespiratorio(String TipoRespiratorio) {
        this.TipoRespiratorio = TipoRespiratorio;
    }

    /**
     * @return the OBJTratamento
     */
    public String getOBJTratamento() {
        return OBJTratamento;
    }

    /**
     * @param OBJTratamento the OBJTratamento to set
     */
    public void setOBJTratamento(String OBJTratamento) {
        this.OBJTratamento = OBJTratamento;
    }

    /**
     * @return the Condultas
     */
    public String getCondultas() {
        return Condultas;
    }

    /**
     * @param Condultas the Condultas to set
     */
    public void setCondultas(String Condultas) {
        this.Condultas = Condultas;
    }

    /**
     * @return the MelhorFluxoPessoal
     */
    public String getMelhorFluxoPessoal() {
        return MelhorFluxoPessoal;
    }

    /**
     * @param MelhorFluxoPessoal the MelhorFluxoPessoal to set
     */
    public void setMelhorFluxoPessoal(String MelhorFluxoPessoal) {
        this.MelhorFluxoPessoal = MelhorFluxoPessoal;
    }

    /**
     * @return the PIParecer
     */
    public String getPIParecer() {
        return PIParecer;
    }

    /**
     * @param PIParecer the PIParecer to set
     */
    public void setPIParecer(String PIParecer) {
        this.PIParecer = PIParecer;
    }

    /**
     * @return the PEParecer
     */
    public String getPEParecer() {
        return PEParecer;
    }

    /**
     * @param PEParecer the PEParecer to set
     */
    public void setPEParecer(String PEParecer) {
        this.PEParecer = PEParecer;
    }
}
