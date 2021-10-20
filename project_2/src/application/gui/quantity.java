package application.gui;

import application.classes.OperationSummary;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class quantity {
    private JTextField textField;
    private JButton button;
    private JLabel label;
    private JPanel panel;

    public quantity(){
        JFrame frame = new JFrame("Benzinarie");
        textField = new JTextField(40);
        textField.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 20));
        textField..setMaximumSize(new Dimension(600,30));
        button = new JButton("OK");
        button.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null,"Finalizati comanda?","Confirmare comanda", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if (reply == JOptionPane.YES_OPTION) {
                    OperationSummary opSummary = new OperationSummary();
                    System.out.println(opSummary.toString());
                } else {
                    return;
                }
                return;
            }
        });
        label = new JLabel("Introduceti cantitatea dorita( L):");
        label.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 20));

        panel = new JPanel();
        panel.setBounds(50,50,400,400);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(label);
        panel.add(textField,BorderLayout.WEST);
        panel.add(button);
        frame.add(panel);
        frame.setSize(500,500);
        frame.setBackground(Color.gray);
        frame.setLayout(null);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new quantity();
    }
}
