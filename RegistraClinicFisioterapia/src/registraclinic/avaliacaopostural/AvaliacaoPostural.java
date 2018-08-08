package registraclinic.avaliacaopostural;

import registraclinic.atendimento.*;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author root
 */
@Entity
public class AvaliacaoPostural implements Serializable {

    @Id
    @GeneratedValue
    private int idAvaliacaoPostural;
    
    private String cabecaVistaAnterior;
    private String alturaDosOmbrosVistaAnterior;
    private String claviculaVistaAnterior;
    private String trianguloDeTallesVistaAnterior;
    private String alturaDasMaosVistaAnterior;
    private String cristaIliacasVistaAnterior;
    private String eiasVistaAnterior;
    private String joelhosVistaAnterior;
    private String pesVistaAnterior;
    
    private String cabecaVistaLateral;
    private String cervicalVistaLateral;
    private String ombroVistaLateral;
    private String dorsoVistaLateral;
    private String abdomenVistaLateral;
    private String lombarVistaLateral;
    private String pelveVistaLateral;
    private String troncoVistaLateral;
    private String joelhosVistaLateral;
    
    private String cabecaVistaPosterior;
    private String alturaDosOmbrosPosterior;
    private String escapulaPosterior;
    private String eipisPosterior;
    private String calcaneoPosterior;

    public int getIdAvaliacaoPostural() {
        return idAvaliacaoPostural;
    }

    public void setIdAvaliacaoPostural(int idAvaliacaoPostural) {
        this.idAvaliacaoPostural = idAvaliacaoPostural;
    }

    public String getCabecaVistaAnterior() {
        return cabecaVistaAnterior;
    }

    public void setCabecaVistaAnterior(String cabecaVistaAnterior) {
        this.cabecaVistaAnterior = cabecaVistaAnterior;
    }

    public String getAlturaDosOmbrosVistaAnterior() {
        return alturaDosOmbrosVistaAnterior;
    }

    public void setAlturaDosOmbrosVistaAnterior(String alturaDosOmbrosVistaAnterior) {
        this.alturaDosOmbrosVistaAnterior = alturaDosOmbrosVistaAnterior;
    }

    public String getClaviculaVistaAnterior() {
        return claviculaVistaAnterior;
    }

    public void setClaviculaVistaAnterior(String claviculaVistaAnterior) {
        this.claviculaVistaAnterior = claviculaVistaAnterior;
    }

    public String getTrianguloDeTallesVistaAnterior() {
        return trianguloDeTallesVistaAnterior;
    }

    public void setTrianguloDeTallesVistaAnterior(String trianguloDeTallesVistaAnterior) {
        this.trianguloDeTallesVistaAnterior = trianguloDeTallesVistaAnterior;
    }

    public String getAlturaDasMaosVistaAnterior() {
        return alturaDasMaosVistaAnterior;
    }

    public void setAlturaDasMaosVistaAnterior(String alturaDasMaosVistaAnterior) {
        this.alturaDasMaosVistaAnterior = alturaDasMaosVistaAnterior;
    }

    public String getCristaIliacasVistaAnterior() {
        return cristaIliacasVistaAnterior;
    }

    public void setCristaIliacasVistaAnterior(String cristaIliacasVistaAnterior) {
        this.cristaIliacasVistaAnterior = cristaIliacasVistaAnterior;
    }

    public String getEiasVistaAnterior() {
        return eiasVistaAnterior;
    }

    public void setEiasVistaAnterior(String eiasVistaAnterior) {
        this.eiasVistaAnterior = eiasVistaAnterior;
    }

    public String getJoelhosVistaAnterior() {
        return joelhosVistaAnterior;
    }

    public void setJoelhosVistaAnterior(String joelhosVistaAnterior) {
        this.joelhosVistaAnterior = joelhosVistaAnterior;
    }

    public String getPesVistaAnterior() {
        return pesVistaAnterior;
    }

    public void setPesVistaAnterior(String pesVistaAnterior) {
        this.pesVistaAnterior = pesVistaAnterior;
    }

    public String getCabecaVistaLateral() {
        return cabecaVistaLateral;
    }

    public void setCabecaVistaLateral(String cabecaVistaLateral) {
        this.cabecaVistaLateral = cabecaVistaLateral;
    }

    public String getCervicalVistaLateral() {
        return cervicalVistaLateral;
    }

    public void setCervicalVistaLateral(String cervicalVistaLateral) {
        this.cervicalVistaLateral = cervicalVistaLateral;
    }

    public String getOmbroVistaLateral() {
        return ombroVistaLateral;
    }

    public void setOmbroVistaLateral(String ombroVistaLateral) {
        this.ombroVistaLateral = ombroVistaLateral;
    }

    public String getDorsoVistaLateral() {
        return dorsoVistaLateral;
    }

    public void setDorsoVistaLateral(String dorsoVistaLateral) {
        this.dorsoVistaLateral = dorsoVistaLateral;
    }

    public String getAbdomenVistaLateral() {
        return abdomenVistaLateral;
    }

    public void setAbdomenVistaLateral(String abdomenVistaLateral) {
        this.abdomenVistaLateral = abdomenVistaLateral;
    }

    public String getLombarVistaLateral() {
        return lombarVistaLateral;
    }

    public void setLombarVistaLateral(String lombarVistaLateral) {
        this.lombarVistaLateral = lombarVistaLateral;
    }

    public String getPelveVistaLateral() {
        return pelveVistaLateral;
    }

    public void setPelveVistaLateral(String pelveVistaLateral) {
        this.pelveVistaLateral = pelveVistaLateral;
    }

    public String getTroncoVistaLateral() {
        return troncoVistaLateral;
    }

    public void setTroncoVistaLateral(String troncoVistaLateral) {
        this.troncoVistaLateral = troncoVistaLateral;
    }

    public String getJoelhosVistaLateral() {
        return joelhosVistaLateral;
    }

    public void setJoelhosVistaLateral(String joelhosVistaLateral) {
        this.joelhosVistaLateral = joelhosVistaLateral;
    }

    public String getCabecaVistaPosterior() {
        return cabecaVistaPosterior;
    }

    public void setCabecaVistaPosterior(String cabecaVistaPosterior) {
        this.cabecaVistaPosterior = cabecaVistaPosterior;
    }

    public String getAlturaDosOmbrosPosterior() {
        return alturaDosOmbrosPosterior;
    }

    public void setAlturaDosOmbrosPosterior(String alturaDosOmbrosPosterior) {
        this.alturaDosOmbrosPosterior = alturaDosOmbrosPosterior;
    }

    public String getEscapulaPosterior() {
        return escapulaPosterior;
    }

    public void setEscapulaPosterior(String escapulaPosterior) {
        this.escapulaPosterior = escapulaPosterior;
    }

    public String getEipisPosterior() {
        return eipisPosterior;
    }

    public void setEipisPosterior(String eipisPosterior) {
        this.eipisPosterior = eipisPosterior;
    }

    public String getCalcaneoPosterior() {
        return calcaneoPosterior;
    }

    public void setCalcaneoPosterior(String calcaneoPosterior) {
        this.calcaneoPosterior = calcaneoPosterior;
    }
    
    
    
}
