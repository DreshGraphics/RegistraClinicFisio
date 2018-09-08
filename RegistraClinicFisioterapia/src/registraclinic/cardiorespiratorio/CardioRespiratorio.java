package registraclinic.cardiorespiratorio;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import registraclinic.anamnesecardio.AnamneseCardio;
import registraclinic.examefisico.ExameFisico;
import registraclinic.paciente.Paciente;
import registraclinic.provapulmonar.ProvaPulmonar;

/**
 *
 * @author root
 */
@Entity
public class CardioRespiratorio {

    @Id
    @GeneratedValue
    private int idCardioRespiratorio;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idPaciente")
    private Paciente paciente;
    
    @OneToOne
    private AnamneseCardio anamnesecardio;
    
    @OneToOne
    private ExameFisico examefisico;
    
    @OneToOne
    private ProvaPulmonar provapulmonar;

    
     public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public int getIdCardioRespiratorio() {
        return idCardioRespiratorio;
    }

    public void setIdCardioRespiratorio(int idCardioRespiratorio) {
        this.idCardioRespiratorio = idCardioRespiratorio;
    }

    public AnamneseCardio getAnamnesecardio() {
        return anamnesecardio;
    }

    public void setAnamnesecardio(AnamneseCardio anamnesecardio) {
        this.anamnesecardio = anamnesecardio;
    }

    public ExameFisico getExamefisico() {
        return examefisico;
    }

    public void setExamefisico(ExameFisico examefisico) {
        this.examefisico = examefisico;
    }

    public ProvaPulmonar getProvapulmonar() {
        return provapulmonar;
    }

    public void setProvapulmonar(ProvaPulmonar provapulmonar) {
        this.provapulmonar = provapulmonar;
    }
    
    
    
}
