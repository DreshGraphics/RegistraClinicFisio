package registraclinic.cardiorespiratorio;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import registraclinic.paciente.Paciente;


/**
 *
 * @author root
 */
@Entity
public class CardioRespiratorio {

    @Id
    @GeneratedValue
    private int idCardioRespiratorio;
    
    
    @OneToOne(fetch = FetchType.LAZY ,mappedBy="pessoa", optional = false)
    @JoinColumn(name="idPaciente")
    private Paciente paciente;
        
    @Column(nullable = false)
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

    public int getIdCardioRespiratorio() {
        return idCardioRespiratorio;
    }

    public void setIdCardioRespiratorio(int idCardioRespiratorio) {
        this.idCardioRespiratorio = idCardioRespiratorio;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getDiagnosticoClinico() {
        return DiagnosticoClinico;
    }

    public void setDiagnosticoClinico(String DiagnosticoClinico) {
        this.DiagnosticoClinico = DiagnosticoClinico;
    }

    public String getQueixaPrincipal() {
        return QueixaPrincipal;
    }

    public void setQueixaPrincipal(String QueixaPrincipal) {
        this.QueixaPrincipal = QueixaPrincipal;
    }

    public String getHistoricoFamiliar() {
        return HistoricoFamiliar;
    }

    public void setHistoricoFamiliar(String HistoricoFamiliar) {
        this.HistoricoFamiliar = HistoricoFamiliar;
    }

    public String getAtividadeFisica() {
        return AtividadeFisica;
    }

    public void setAtividadeFisica(String AtividadeFisica) {
        this.AtividadeFisica = AtividadeFisica;
    }

    public String getCigarrosDias() {
        return CigarrosDias;
    }

    public void setCigarrosDias(String CigarrosDias) {
        this.CigarrosDias = CigarrosDias;
    }

    public String getAnosTabag() {
        return AnosTabag;
    }

    public void setAnosTabag(String AnosTabag) {
        this.AnosTabag = AnosTabag;
    }

    public String getTempoParado() {
        return TempoParado;
    }

    public void setTempoParado(String TempoParado) {
        this.TempoParado = TempoParado;
    }

    public String getMedicacaoDeUso() {
        return MedicacaoDeUso;
    }

    public void setMedicacaoDeUso(String MedicacaoDeUso) {
        this.MedicacaoDeUso = MedicacaoDeUso;
    }

    public String getExamesComplementares() {
        return ExamesComplementares;
    }

    public void setExamesComplementares(String ExamesComplementares) {
        this.ExamesComplementares = ExamesComplementares;
    }

    public String getHDA() {
        return HDA;
    }

    public void setHDA(String HDA) {
        this.HDA = HDA;
    }

    public boolean isTabagismo() {
        return Tabagismo;
    }

    public void setTabagismo(boolean Tabagismo) {
        this.Tabagismo = Tabagismo;
    }

    public boolean isEtilismo() {
        return Etilismo;
    }

    public void setEtilismo(boolean Etilismo) {
        this.Etilismo = Etilismo;
    }

    public boolean isDiabetes() {
        return Diabetes;
    }

    public void setDiabetes(boolean Diabetes) {
        this.Diabetes = Diabetes;
    }

    public boolean isObesidade() {
        return Obesidade;
    }

    public void setObesidade(boolean Obesidade) {
        this.Obesidade = Obesidade;
    }

    public boolean isEstresse() {
        return Estresse;
    }

    public void setEstresse(boolean Estresse) {
        this.Estresse = Estresse;
    }

    public boolean isHAS() {
        return HAS;
    }

    public void setHAS(boolean HAS) {
        this.HAS = HAS;
    }

    public boolean isControleAlimentar() {
        return ControleAlimentar;
    }

    public void setControleAlimentar(boolean ControleAlimentar) {
        this.ControleAlimentar = ControleAlimentar;
    }

    public String getPA() {
        return PA;
    }

    public void setPA(String PA) {
        this.PA = PA;
    }

    public String getFC() {
        return FC;
    }

    public void setFC(String FC) {
        this.FC = FC;
    }

    public String getFR() {
        return FR;
    }

    public void setFR(String FR) {
        this.FR = FR;
    }

    public String getSaO2() {
        return SaO2;
    }

    public void setSaO2(String SaO2) {
        this.SaO2 = SaO2;
    }

    public String getAuscutaPulmonar() {
        return AuscutaPulmonar;
    }

    public void setAuscutaPulmonar(String AuscutaPulmonar) {
        this.AuscutaPulmonar = AuscutaPulmonar;
    }

    public String getAuscutaCardiaca() {
        return AuscutaCardiaca;
    }

    public void setAuscutaCardiaca(String AuscutaCardiaca) {
        this.AuscutaCardiaca = AuscutaCardiaca;
    }

    public String getFormaDoTorax() {
        return FormaDoTorax;
    }

    public void setFormaDoTorax(String FormaDoTorax) {
        this.FormaDoTorax = FormaDoTorax;
    }

    public String getSimetriaDoTorax() {
        return SimetriaDoTorax;
    }

    public void setSimetriaDoTorax(String SimetriaDoTorax) {
        this.SimetriaDoTorax = SimetriaDoTorax;
    }

    public String getExpansibilidade() {
        return Expansibilidade;
    }

    public void setExpansibilidade(String Expansibilidade) {
        this.Expansibilidade = Expansibilidade;
    }

    public String getMobilidadeToracica() {
        return MobilidadeToracica;
    }

    public void setMobilidadeToracica(String MobilidadeToracica) {
        this.MobilidadeToracica = MobilidadeToracica;
    }

    public boolean isDispneia() {
        return Dispneia;
    }

    public void setDispneia(boolean Dispneia) {
        this.Dispneia = Dispneia;
    }

    public boolean isRespiracaoParadoxal() {
        return RespiracaoParadoxal;
    }

    public void setRespiracaoParadoxal(boolean RespiracaoParadoxal) {
        this.RespiracaoParadoxal = RespiracaoParadoxal;
    }

    public String getUsoDeMusculaturaAcessoria() {
        return UsoDeMusculaturaAcessoria;
    }

    public void setUsoDeMusculaturaAcessoria(String UsoDeMusculaturaAcessoria) {
        this.UsoDeMusculaturaAcessoria = UsoDeMusculaturaAcessoria;
    }

    public String getRitmoRespiratorio() {
        return RitmoRespiratorio;
    }

    public void setRitmoRespiratorio(String RitmoRespiratorio) {
        this.RitmoRespiratorio = RitmoRespiratorio;
    }

    public String getTosse() {
        return Tosse;
    }

    public void setTosse(String Tosse) {
        this.Tosse = Tosse;
    }

    public String getExpectoracao() {
        return Expectoracao;
    }

    public void setExpectoracao(String Expectoracao) {
        this.Expectoracao = Expectoracao;
    }

    public String getPalpacao() {
        return Palpacao;
    }

    public void setPalpacao(String Palpacao) {
        this.Palpacao = Palpacao;
    }

    public String getPercucao() {
        return Percucao;
    }

    public void setPercucao(String Percucao) {
        this.Percucao = Percucao;
    }

    public String getPregaAxilar() {
        return PregaAxilar;
    }

    public void setPregaAxilar(String PregaAxilar) {
        this.PregaAxilar = PregaAxilar;
    }

    public String getMelhorFluxoPessoal() {
        return MelhorFluxoPessoal;
    }

    public void setMelhorFluxoPessoal(String MelhorFluxoPessoal) {
        this.MelhorFluxoPessoal = MelhorFluxoPessoal;
    }

    public String getProcessoXifoide() {
        return ProcessoXifoide;
    }

    public void setProcessoXifoide(String ProcessoXifoide) {
        this.ProcessoXifoide = ProcessoXifoide;
    }

    public String getLinhaUmbilical() {
        return LinhaUmbilical;
    }

    public void setLinhaUmbilical(String LinhaUmbilical) {
        this.LinhaUmbilical = LinhaUmbilical;
    }

    public String getConclusao() {
        return Conclusao;
    }

    public void setConclusao(String Conclusao) {
        this.Conclusao = Conclusao;
    }

    public String getPImax() {
        return PImax;
    }

    public void setPImax(String PImax) {
        this.PImax = PImax;
    }

    public String getPEmax() {
        return PEmax;
    }

    public void setPEmax(String PEmax) {
        this.PEmax = PEmax;
    }

    public String getPIParecer() {
        return PIParecer;
    }

    public void setPIParecer(String PIParecer) {
        this.PIParecer = PIParecer;
    }

    public String getPEParecer() {
        return PEParecer;
    }

    public void setPEParecer(String PEParecer) {
        this.PEParecer = PEParecer;
    }

    public String getTipoRespiratorio() {
        return TipoRespiratorio;
    }

    public void setTipoRespiratorio(String TipoRespiratorio) {
        this.TipoRespiratorio = TipoRespiratorio;
    }

    public String getOBJTratamento() {
        return OBJTratamento;
    }

    public void setOBJTratamento(String OBJTratamento) {
        this.OBJTratamento = OBJTratamento;
    }

    public String getCondultas() {
        return Condultas;
    }

    public void setCondultas(String Condultas) {
        this.Condultas = Condultas;
    }

    
    
    
    
}
