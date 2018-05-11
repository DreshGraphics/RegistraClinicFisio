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

//    //Fundo colorido
//    @Override
//    public Component getTableCellRendererComponent(JTable table,
//            Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
//                row, column);
//        if (isSelected) {
////            label.setForeground(Color.BLACK);
////            label.setBackground(Color.WHITE);
//            if (value.toString().equals("Verde")) {
//                label.setBackground(Color.GREEN);
//            }
//            if (value.toString().equals("Azul")) {
//                label.setBackground(new Color(30,144,255));;
//            }
//            if (value.toString().equals("Laranja")) {
//                label.setBackground(Color.ORANGE);
//            }
//            if (value.toString().equals("Amarelo")) {
//                label.setBackground(Color.YELLOW);
//            }
//        } else {
////            label.setForeground(Color.BLACK);
////            label.setBackground(Color.WHITE);
//            if (value.toString().equals("Verde")) {
//                label.setBackground(Color.GREEN);
//            }
//            if (value.toString().equals("Azul")) {
//                label.setBackground(new Color(30,144,255));
//            }
//            if (value.toString().equals("Laranja")) {
//                label.setBackground(Color.ORANGE);
//            }
//            if (value.toString().equals("Amarelo")) {
//                label.setBackground(Color.YELLOW);
//            }
//        }
//        //obter o objeto da linhas correspondente
//        //Triagem triagem = ((TriagemTableModel) table.getModel()).getValoresTriagem(row);
//        //e fazer os if's direto nos valores do objeto, nesse caso para colorir a linha inteira - Só que não sei kkkk
//        return label;
//    }
    //Letras coloridas
    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
                row, column);
        if (isSelected) {
            label.setForeground(Color.WHITE);
            label.setBackground(Color.GRAY);
            switch (value.toString()) {
                case "Verde":
                    label.setForeground(Color.GREEN);
                    break;
                case "Azul":
                    label.setForeground(new Color(30, 144, 255));
                    break;
                case "Laranja":
                    label.setForeground(Color.ORANGE);
                    break;
                case "Amarelo":
                    label.setForeground(Color.YELLOW);
                    break;
                default:
                    break;
            }
        } else {
            label.setForeground(Color.BLACK);
            label.setBackground(new Color(245,245,245));
            switch (value.toString()) {
                case "Verde":
                    label.setForeground(Color.GREEN);
                    break;
                case "Azul":
                    label.setForeground(new Color(30, 144, 255));
                    break;
                case "Laranja":
                    label.setForeground(Color.ORANGE);
                    break;
                case "Amarelo":
                    label.setForeground(Color.YELLOW);
                    break;
                default:
                    break;
            }
        }
        //obter o objeto da linhas correspondente
        //Triagem triagem = ((TriagemTableModel)table.getModel()).getValoresTriagem(row);
        //e fazer os if's direto nos valores do objeto, nesse caso para colorir a linha inteira - Só que não sei kkkk
        return label;
    }

}
