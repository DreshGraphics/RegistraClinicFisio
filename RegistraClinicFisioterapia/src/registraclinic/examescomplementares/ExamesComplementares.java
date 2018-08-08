package registraclinic.examescomplementares;

import registraclinic.avaliacaopostural.*;
import registraclinic.atendimento.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author root
 */
@Entity
public class ExamesComplementares implements Serializable {

    @Id
    @GeneratedValue
    private int idExamesComplementares;
    
    private String examesComplementares;
    private Date data;
    private String laudo;

    public int getIdExamesComplementares() {
        return idExamesComplementares;
    }

    public void setIdExamesComplementares(int idExamesComplementares) {
        this.idExamesComplementares = idExamesComplementares;
    }

    public String getExamesComplementares() {
        return examesComplementares;
    }

    public void setExamesComplementares(String examesComplementares) {
        this.examesComplementares = examesComplementares;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }
    
}
