/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.cardiorespiratorio;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author root
 */
public class CardioRespiratorioTableModel extends AbstractTableModel {

    private List<CardioRespiratorio> CardioRespiratorios = new ArrayList<>();
    private String[] colunas = {"idCardio","DiagnosticoClinico","QueixaPrincipal","HistoricoFamilia","AtividadeFisica",
        "CigarroDias","AnosTabag","TempoParado","MedicacaoUso","ExamesCoplementares","HDA","Tabagismo","Etilismo",
        "Diabetes","Obesidade","Estress","HAS","ControleAlimentar","PA","FC","FR","SaO2","AuscutaPulmonar",
        "AuscultaCardiaca","FormaTorax","SimetriaTorax","Expansibilade","MobilidadeToraxica","dispineia",
        "RespiracaoParadoxal","UsoMusculacaoAcessoria","RitmoRespiratorio","Tosse","Expectoracao","Palpacao","Percucao",
        "Pregaxilar","MelhorFluxoPessoal","ProcessoXifoide","LinhaUmbilical","Conclusao","PImax","PEmax","PIparecer",
        "PEparecer","TipoRespiratorio","OBJTtratamento","Condultas"};

    public CardioRespiratorioTableModel(List<CardioRespiratorio> CardioRespiratorios) {
        this.CardioRespiratorios = CardioRespiratorios;
    }

    @Override
    public int getRowCount() {
        return CardioRespiratorios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CardioRespiratorio cardioRespiratorio = CardioRespiratorios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cardioRespiratorio.getIdCardioRespiratorio();
            case 1:
                return cardioRespiratorio.getDiagnosticoClinico();
            case 2:
                return cardioRespiratorio.getQueixaPrincipal();
            case 3:
                return cardioRespiratorio.getHistoricoFamiliar();
            case 4:
                return cardioRespiratorio.getAtividadeFisica();
            case 5:
                return cardioRespiratorio.getCigarrosDias();
            case 6:
                return cardioRespiratorio.getAnosTabag();
            case 7:
                return cardioRespiratorio.getTempoParado();
            case 8:
                return cardioRespiratorio.getMedicacaoDeUso();
            case 9:
                return cardioRespiratorio.getExamesComplementares();
            case 10:
                return cardioRespiratorio.getHDA();
            case 11:
                return cardioRespiratorio.isTabagismo();
            case 12:
                return cardioRespiratorio.isEtilismo();
            case 13:
                return cardioRespiratorio.isDiabetes();
            case 14:
                return cardioRespiratorio.isEstresse();
            case 15:
                return cardioRespiratorio.getHDA();
            case 16:
                return cardioRespiratorio.isControleAlimentar();
            case 17:
                return cardioRespiratorio.getPA();
            case 18:
                return cardioRespiratorio.getFC();
            case 19:
                return cardioRespiratorio.getFR();
            case 20:
                return cardioRespiratorio.getSaO2();
            case 21:
                return cardioRespiratorio.getAuscutaPulmonar();
            case 22:
                return cardioRespiratorio.getAuscutaCardiaca();
            case 23:
                return cardioRespiratorio.getFormaDoTorax();
            case 24:
                return cardioRespiratorio.getSimetriaDoTorax();
            case 25:
                return cardioRespiratorio.getMobilidadeToracica();
            case 26:
                return cardioRespiratorio.isDispneia();
            case 27:
                return cardioRespiratorio.isRespiracaoParadoxal();
            case 28:
                return cardioRespiratorio.getUsoDeMusculaturaAcessoria();
            case 29:
                return cardioRespiratorio.getRitmoRespiratorio();
            case 30:
                return cardioRespiratorio.getTosse();
            case 31:
                return cardioRespiratorio.getExpectoracao();
            case 32:
                return cardioRespiratorio.getPalpacao();
            case 33:
                return cardioRespiratorio.getPercucao();
            case 34:
                return cardioRespiratorio.getPregaAxilar();
            case 35:
                return cardioRespiratorio.getMelhorFluxoPessoal();
            case 36:
                return cardioRespiratorio.getProcessoXifoide();
            case 37:
                return cardioRespiratorio.getLinhaUmbilical();
            case 38:
                return cardioRespiratorio.getConclusao();
            case 39:
                return cardioRespiratorio.getPImax();
            case 40:
                return cardioRespiratorio.getPEmax();
            case 41:
                return cardioRespiratorio.getPIParecer();
            case 42:
                return cardioRespiratorio.getPEParecer();
            case 43:
                return cardioRespiratorio.getTipoRespiratorio();
            case 44:
                return cardioRespiratorio.getOBJTratamento();
            case 45:
                return cardioRespiratorio.getCondultas();
        }
        return null;
    }

    @Override
    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];
            case 4:
                return colunas[4];
            case 5:
                return colunas[5];
            case 6:
                return colunas[6];
            case 7:
                return colunas[7];
            case 8:
                return colunas[8];
            case 9:
                return colunas[9];
            case 10:
                return colunas[10];
            case 11:
                return colunas[11];
            case 12:
                return colunas[12];
            case 13:
                return colunas[13];
            case 14:
                return colunas[14];
            case 15:
                return colunas[15];
            case 16:
                return colunas[16];
            case 17:
                return colunas[17];
            case 18:
                return colunas[18];
            case 19:
                return colunas[19];
            case 20:
                return colunas[20];
            case 21:
                return colunas[21];
            case 22:
                return colunas[22];
            case 23:
                return colunas[23];
            case 24:
                return colunas[24];
            case 25:
                return colunas[25];
            case 26:
                return colunas[26];
            case 27:
                return colunas[27];
            case 28:
                return colunas[28];
            case 29:
                return colunas[29];
            case 30:
                return colunas[30];
            case 31:
                return colunas[31];
            case 32:
                return colunas[32];
            case 33:
                return colunas[33];
            case 34:
                return colunas[34];
            case 35:
                return colunas[35];
             case 36:
                return colunas[36];
            case 37:
                return colunas[37];
            case 38:
                return colunas[38];
            case 39:
                return colunas[39];
            case 40:
                return colunas[40];
            case 41:
                return colunas[41];
            case 42:
                return colunas[42];
            case 43:
                return colunas[43];
            case 44:
                return colunas[44];
            case 45:
                return colunas[45];
            
        }
        return null;
    }

}
