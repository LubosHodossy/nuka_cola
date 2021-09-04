package Kalkulacka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kalkulacka implements ActionListener {

    JFrame frame;
    JTextField textfield;
    JButton[] cislaTlacidla = new JButton[10];
    JButton[] funkcieTlacidla = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    JPanel panel;

    Font mojFont = new Font("Ink Free", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;


    Kalkulacka() {

        frame = new JFrame("Kalkulačka");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(mojFont);
        textfield.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");
        negButton = new JButton("(-)");

        funkcieTlacidla[0] = addButton;
        funkcieTlacidla[1] = subButton;
        funkcieTlacidla[2] = mulButton;
        funkcieTlacidla[3] = divButton;
        funkcieTlacidla[4] = decButton;
        funkcieTlacidla[5] = equButton;
        funkcieTlacidla[6] = delButton;
        funkcieTlacidla[7] = clrButton;
        funkcieTlacidla[8] = negButton;

        for (int i = 0; i<9; i++) {
            funkcieTlacidla[i].addActionListener(this);
            funkcieTlacidla[i].setFont(mojFont);
            funkcieTlacidla[i].setFocusable(false);
        }

        for (int i = 0; i<10; i++) {
            cislaTlacidla[i] = new JButton(String.valueOf(i));
            cislaTlacidla[i].addActionListener(this);
            cislaTlacidla[i].setFont(mojFont);
            cislaTlacidla[i].setFocusable(false);
        }

        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(50, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        // panel.setBackground(Color.MAGENTA);

        panel.add(cislaTlacidla[1]);
        panel.add(cislaTlacidla[2]);
        panel.add(cislaTlacidla[3]);
        panel.add(addButton);
        panel.add(cislaTlacidla[4]);
        panel.add(cislaTlacidla[5]);
        panel.add(cislaTlacidla[6]);
        panel.add(subButton);
        panel.add(cislaTlacidla[7]);
        panel.add(cislaTlacidla[8]);
        panel.add(cislaTlacidla[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(cislaTlacidla[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        Kalkulacka kalk = new Kalkulacka();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i=0; i<10; i++) {
            if (e.getSource() == cislaTlacidla[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == decButton) {
            textfield.setText(textfield.getText().concat("."));
        }

        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }

        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }

        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }

        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }

        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textfield.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1 = result;
        }

        if (e.getSource() == clrButton) {
            textfield.setText("");
        }

        if (e.getSource() == delButton) {
            String string = textfield.getText();
            textfield.setText("");
            for (int i=0; i<string.length()-1; i++) {
                textfield.setText(textfield.getText() + string.charAt(i));
            }
        }

        if (e.getSource() == negButton) {
           double temp = Double.parseDouble(textfield.getText());
           temp*=-1;
           textfield.setText(String.valueOf(temp));
        }
    }
}
