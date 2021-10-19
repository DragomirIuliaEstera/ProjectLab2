package application.gui;

import application.classes.OperationSummary;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Proj2{
    private JFrame frame;
    private JPanel panel;
    private JLabel labelMenu;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel labelForInput;
    private JButton okButton;
    private JTextField textField1;

    public Proj2(){
        frame = new JFrame("Benzinarie");

        panel = new JPanel();
        panel.setBounds(0,0,400,400);
//        panel.setBackground(Color.gray);
        panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));

        labelMenu = new JLabel("Combustibili:");
        labelMenu.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 20));
        labelMenu.setBounds(50,100,80,30);
        labelMenu.setBackground(Color.green);

        label1 =new JLabel("1. Benzina Standard 95 ( 5.94 lei/ L)");
        label1.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 20));
        label1.setBounds(50,100,80,30);
        label1.setBackground(Color.green);

        label2 = new JLabel("2. Benzina Extra 99 ( 6.33 lei/ L)");
        label2.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 20));
        label2.setBounds(50,100,80,30);
        label2.setBackground(Color.green);

        label3 =new JLabel("3. Motorina Standard ( 5.43 lei/ L)");
        label3.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 20));
        label3.setBounds(50,100,80,30);
        label3.setBackground(Color.green);

        label4 = new JLabel("4. Motorina Euro Diesel 5 ( 5.71 lei/ L)");
        label4.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 20));
        label4.setBounds(50,100,80,30);
        label4.setBackground(Color.green);

        label5 = new JLabel("5. GPL( 3.21 lei/ L)");
        label5.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 20));
        label5.setBounds(50,100,80,30);
        label5.setBackground(Color.green);

        labelForInput=new JLabel("Introduceti optiunea dorita:");
        labelForInput.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 20));
        labelForInput.setBounds(50,100,80,30);
        labelForInput.setBackground(Color.green);

        textField1=new JTextField();
        textField1.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 20));
        textField1.setPreferredSize(new Dimension(50,30));
//        textField1.setBackground(Color.yellow);

        okButton = new JButton("OK");
        okButton.setFont(new Font("Georgia", Font.ROMAN_BASELINE, 20));
        okButton.setBounds(50,100,80,30);
        okButton.setBackground(Color.green);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new quantity();
            }
        });

        panel.add(labelMenu);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(labelForInput);
        panel.add(textField1);
        panel.add(okButton);
        frame.add(panel);
        frame.setSize(500,500);
        frame.setBackground(Color.gray);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new Proj2();
    }
}
