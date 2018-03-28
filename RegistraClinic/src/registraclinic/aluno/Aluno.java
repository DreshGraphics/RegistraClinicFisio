package registraclinic.aluno;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Vinnicius - 
 */
@Entity
public class Aluno{

    @Id
    @GeneratedValue
    private int idAluno;

    @Column(length = 500, nullable = false)
    private String nomeAluno;
    
    @Column(length = 500, nullable = false)
    private String matriculaAluno;

    @Column(length = 20)
    private String cpfAluno;

    @Column(length = 50)
    private String rgAluno;

    @Column(length = 20)
    private String telefoneAluno;

    @Column(length = 15)
    private String dataNascimentoAluno;

    @Column(length = 12)
    private String sexoAluno;

    @Column(length = 550)
    private String enderecoAluno;

    @Column(length = 550)
    private String bairroAluno;

    @Column(length = 16)
    private String enderecoNumeroAluno;

    @Column(length = 500)
    private String cidadeAluno;

    @Column(length = 20)
    private String estadoAluno;

    @Column(length = 50)
    private String emailAluno;

    @Column(length = 300)
    private String complementoAluno;

    @Column(length = 40)
    private String turmaAluno;

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }
    
    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public String getRgAluno() {
        return rgAluno;
    }

    public void setRgAluno(String rgAluno) {
        this.rgAluno = rgAluno;
    }

    public String getTelefoneAluno() {
        return telefoneAluno;
    }

    public void setTelefoneAluno(String telefoneAluno) {
        this.telefoneAluno = telefoneAluno;
    }

    public String getDataNascimentoAluno() {
        return dataNascimentoAluno;
    }

    public void setDataNascimentoAluno(String dataNascimentoAluno) {
        this.dataNascimentoAluno = dataNascimentoAluno;
    }
    
    public String getSexoAluno() {
        return sexoAluno;
    }

    public void setSexoAluno(String sexoAluno) {
        this.sexoAluno = sexoAluno;
    }

    public String getEnderecoAluno() {
        return enderecoAluno;
    }

    public void setEnderecoAluno(String enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }

    public String getBairroAluno() {
        return bairroAluno;
    }

    public void setBairroAluno(String bairroAluno) {
        this.bairroAluno = bairroAluno;
    }

    public String getEnderecoNumeroAluno() {
        return enderecoNumeroAluno;
    }

    public void setEnderecoNumeroAluno(String enderecoNumeroAluno) {
        this.enderecoNumeroAluno = enderecoNumeroAluno;
    }

    public String getCidadeAluno() {
        return cidadeAluno;
    }

    public void setCidadeAluno(String cidadeAluno) {
        this.cidadeAluno = cidadeAluno;
    }

    public String getEstadoAluno() {
        return estadoAluno;
    }

    public void setEstadoAluno(String estadoAluno) {
        this.estadoAluno = estadoAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public String getComplementoAluno() {
        return complementoAluno;
    }

    public void setComplementoAluno(String complementoAluno) {
        this.complementoAluno = complementoAluno;
    }

    public String getTurmaAluno() {
        return turmaAluno;
    }

    public void setTurmaAluno(String turmaAluno) {
        this.turmaAluno = turmaAluno;
    }

    
}
