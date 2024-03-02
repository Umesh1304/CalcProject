package Calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {

    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton threeButton;
    JButton twoButton;
    JButton oneButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton mulButton;
    JButton addButton;
    JButton minusButton;
    JButton clearButton;

    boolean isOperatorClicked = false;
    String oldValue;
    char operator;

    public Calculator() {

        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 250);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayLabel = new JLabel(" ");
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);

        jf.add(displayLabel);

        sevenButton = new JButton("7");
        sevenButton.addActionListener(this);
        sevenButton.setBounds(30, 130, 80, 80);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.addActionListener(this);
        eightButton.setBounds(130, 130, 80, 80);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.addActionListener(this);
        nineButton.setBounds(230, 130, 80, 80);
        jf.add(nineButton);

        fourButton = new JButton("4");
        fourButton.addActionListener(this);
        fourButton.setBounds(30, 230, 80, 80);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.addActionListener(this);
        fiveButton.setBounds(130, 230, 80, 80);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.addActionListener(this);
        sixButton.setBounds(230, 230, 80, 80);
        jf.add(sixButton);

        oneButton = new JButton("1");
        oneButton.addActionListener(this);
        oneButton.setBounds(30, 330, 80, 80);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.addActionListener(this);
        twoButton.setBounds(130, 330, 80, 80);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.addActionListener(this);
        threeButton.setBounds(230, 330, 80, 80);
        jf.add(threeButton);

        dotButton = new JButton(".");
        dotButton.addActionListener(this);
        dotButton.setBounds(30, 430, 80, 80);
        jf.add(dotButton);

        zeroButton = new JButton("0");
        zeroButton.addActionListener(this);
        zeroButton.setBounds(130, 430, 80, 80);
        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.addActionListener(this);
        equalButton.setBounds(230, 430, 80, 80);
        jf.add(equalButton);

        divButton = new JButton("/");
        divButton.addActionListener(this);
        divButton.setBounds(330, 130, 80, 80);
        jf.add(divButton);

        mulButton = new JButton("x");
        mulButton.addActionListener(this);
        mulButton.setBounds(330, 230, 80, 80);
        jf.add(mulButton);

        minusButton = new JButton("-");
        minusButton.addActionListener(this);
        minusButton.setBounds(330, 330, 80, 80);
        jf.add(minusButton);

        addButton = new JButton("+");
        addButton.addActionListener(this);
        addButton.setBounds(330, 430, 80, 80);
        jf.add(addButton);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        clearButton.setBounds(430, 430, 80, 80);
        jf.add(clearButton);
    }

    public static void main(String[] args) {
        new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenButton) {
            displayLabel.setText(displayLabel.getText() + "7");
        } else if (e.getSource() == eightButton) {
            displayLabel.setText(displayLabel.getText() + "8");
        } else if (e.getSource() == nineButton) {
            displayLabel.setText(displayLabel.getText() + "9");
        } else if (e.getSource() == fourButton) {
            displayLabel.setText(displayLabel.getText() + "4");
        } else if (e.getSource() == fiveButton) {
            displayLabel.setText(displayLabel.getText() + "5");
        } else if (e.getSource() == sixButton) {
            displayLabel.setText(displayLabel.getText() + "6");
        } else if (e.getSource() == oneButton) {
            displayLabel.setText(displayLabel.getText() + "1");
        } else if (e.getSource() == twoButton) {
            displayLabel.setText(displayLabel.getText() + "2");
        } else if (e.getSource() == threeButton) {
            displayLabel.setText(displayLabel.getText() + "3");
        } else if (e.getSource() == zeroButton) {
            displayLabel.setText(displayLabel.getText() + "0");
        } else if (e.getSource() == dotButton) {
            displayLabel.setText(displayLabel.getText() + ".");
        } else if (e.getSource() == clearButton) {
            displayLabel.setText("");
        } else if (e.getSource() == addButton) {
            oldValue = displayLabel.getText();
            operator = '+';
            displayLabel.setText("");
        } else if (e.getSource() == minusButton) {
            oldValue = displayLabel.getText();
            operator = '-';
            displayLabel.setText("");
        } else if (e.getSource() == mulButton) {
            oldValue = displayLabel.getText();
            operator = '*';
            displayLabel.setText("");
        } else if (e.getSource() == divButton) {
            oldValue = displayLabel.getText();
            operator = '/';
            displayLabel.setText("");
        } else if (e.getSource() == equalButton) {
            float newValue = Float.parseFloat(displayLabel.getText());
            float result = 0;
            float oldValueF = Float.parseFloat(oldValue);

            switch (operator) {
                case '+':
                    result = oldValueF + newValue;
                    break;
                case '-':
                    result = oldValueF - newValue;
                    break;
                case '*':
                    result = oldValueF * newValue;
                    break;
                case '/':
                    result = oldValueF / newValue;
                    break;
            }

            displayLabel.setText(Float.toString(result));
        }
    }
}
