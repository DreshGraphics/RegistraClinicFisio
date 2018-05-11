/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.triagem;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Karlos
 */
public class TriagemCellRenderer extends DefaultTableCellRenderer {

    public TriagemCellRenderer() {
        super();
    }

    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
                row, column);
        if (isSelected) {
            label.setForeground(Color.BLACK);
            label.setBackground(Color.WHITE);
        } else {
            label.setForeground(Color.BLACK);
            label.setBackground(Color.WHITE);
            //aqui vc pode fazer o seu if tipo if(value.toString.equals("seila")) label.setbackgrund...
            if(value.toString().equals("Verde")){
                label.setBackground(Color.GREEN);
            }
            if(value.toString().equals("Azul")){
                label.setBackground(Color.BLUE);
            }
            if(value.toString().equals("Laranja")){
                label.setBackground(Color.ORANGE);
            }
            if(value.toString().equals("Amarelo")){
                label.setBackground(Color.YELLOW);
            }
        }
        //lembrando que vc pode obter o objeto da linhas correspondente assim
        //Triagem triagem = ((TriagemTableModel) table.getModel()).getValoresTriagem(row);
        //e fazer os if's direto nos valores do objeto, nesse caso para colorir a linha inteira!!
        return label;
    }

}
