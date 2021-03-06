/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.anamnese;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 *
 * @author Karlos Oliveira
 */
@Entity
public class Anamnese {
    
    @Id
    @GeneratedValue
    private int idAnamnese;
    private String hda;
    private String hpp;
    private String historiaFamiliar;
    private String historiaSocial;
    private String pa;
    private String fr;
    private String fc;
    private String temperatura;
    private String queixaPrincipal;
    private String examesComplementares;
    
    public int getIdAnamnese() {
        return idAnamnese;
    }

    public void setIdAnamnese(int idAnamnese) {
        this.idAnamnese = idAnamnese;
    }

    public String getHda() {
        return hda;
    }

    public void setHda(String hda) {
        this.hda = hda;
    }

    public String getHpp() {
        return hpp;
    }

    public void setHpp(String hpp) {
        this.hpp = hpp;
    }

    public String getHistoriaFamiliar() {
        return historiaFamiliar;
    }

    public void setHistoriaFamiliar(String historiaFamiliar) {
        this.historiaFamiliar = historiaFamiliar;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public String getHistoriaSocial() {
        return historiaSocial;
    }

    public void setHistoriaSocial(String historiaSocial) {
        this.historiaSocial = historiaSocial;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    public String getExamesComplementares() {
        return examesComplementares;
    }

    public void setExamesComplementares(String examesComplementares) {
        this.examesComplementares = examesComplementares;
    }
    
}
