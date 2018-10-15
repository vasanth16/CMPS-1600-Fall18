import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Project 1: Calculator for longs
 * @Author: Vasanth Rajasekaran
 */
public class Calculator extends JFrame implements ActionListener{
    private String sum = "";
    private JButton plus = new JButton("+");
    private JButton minus =  new JButton("-");
    private JButton multiply = new JButton("x");
    private JButton equals = new JButton("=");
    private JButton openPar = new JButton("(");
    private JButton closePar = new JButton(")");

    private JButton one = new JButton("1");
    private JButton two = new JButton("2");
    private JButton three = new JButton("3");
    private JButton four = new JButton("4");
    private JButton five = new JButton("5");
    private JButton six = new JButton("6");
    private JButton seven = new JButton("7");
    private JButton eight = new JButton("8");
    private JButton nine = new JButton("9");
    private JButton zero = new JButton("0");

    private JButton clear = new JButton("Clear");

    private JTextField display = new JTextField(8);


    /**
     * Constructor that calls setUpUI() and adds all the action listeners
     */

    public Calculator(){
        this.setUpUI();
        display.setEditable(true);

        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        equals.addActionListener(this);
        openPar.addActionListener(this);
        closePar.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        clear.addActionListener(this);

    }

    /**
     * This method sets up the UI for the calculator
     */

    public void setUpUI(){

        GridBagConstraints gbc = new GridBagConstraints();
        this.setLayout(new GridBagLayout());
        this.setSize(600, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(display, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        this.add(nine,gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(eight,gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(seven,gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        this.add(plus,gbc);




        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(four,gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        this.add(five,gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        this.add(six,gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        this.add(minus,gbc);





        gbc.gridx = 2;
        gbc.gridy = 3;
        this.add(three,gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        this.add(two,gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        this.add(one,gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        this.add(multiply,gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        this.add(zero, gbc);

        gbc.gridx = 1;
        this.add(openPar, gbc);

        gbc.gridx = 2;
        this.add(closePar, gbc);

        gbc.gridx = 3;
        this.add(equals, gbc);

        gbc.gridx = 2;
        gbc.gridy = 5;
        this.add(clear,gbc);


        this.setVisible(true);

    }

    /**
     * This method checks the actions performed by the buttons and changes the text in the textfield
     * @param e is used to get the button that is being pressed
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() != equals) {
            while (e.getSource() != equals) {
                if (e.getSource() == one) {
                    sum += "1";
                    display.setText(sum);
                    // System.out.println("y");
                } else if (e.getSource() == two) {
                    sum += "2";
                    display.setText(sum);
                } else if (e.getSource() == three) {
                    sum += "3";
                    display.setText(sum);
                } else if (e.getSource() == four) {
                    sum += "4";
                    display.setText(sum);
                } else if (e.getSource() == five) {
                    sum += "5";
                    display.setText(sum);
                } else if (e.getSource() == six) {
                    sum += "6";
                    display.setText(sum);
                } else if (e.getSource() == seven) {
                    sum += "7";
                    display.setText(sum);
                } else if (e.getSource() == seven) {
                    sum += "7";
                    display.setText(sum);
                } else if (e.getSource() == eight) {
                    sum += "8";
                    display.setText(sum);
                } else if (e.getSource() == nine) {
                    sum += "9";
                    display.setText(sum);
                } else if (e.getSource() == zero) {
                    sum += "0";
                    display.setText(sum);
                } else if (e.getSource() == plus) {
                    sum += "+";
                    display.setText(sum);
                } else if (e.getSource() == minus) {
                    sum += "-";
                    display.setText(sum);
                } else if (e.getSource() == multiply) {
                    sum += "*";
                    display.setText(sum);
                } else if (e.getSource() == openPar) {
                    sum += "(";
                    display.setText(sum);
                } else if (e.getSource() == closePar) {
                    sum += ")";
                    display.setText(sum);
                }else if (e.getSource() == clear){
                    sum = "";
                    display.setText(sum);
                }
                break;
            }
        } else {
            this.isValidInput(sum);
            System.out.println(sum + "#");
        }
    }

    /**
     * this method checks if the set of operations is valid
     * @param s this is the String that is passed in and in this case is sum
     * @return returns true or false . not utilized much in this program but easily could be in the future
     */
    public boolean isValidInput(String s){
        Stack check = new Stack();

        try {
            for (int i = 0; i < s.length(); i++) {
                System.out.println("y");
                if (s.charAt(i) == '(') {
                    check.push('(');
                } else if (s.charAt(i) == ')') {
                    check.pop();
                }
            }

            if (check.isEmpty()) {
                display.setText("Input is Valid");
            } else {
                display.setText("Input is invalid");
            }
        } catch(Exception stackEmpty){
            display.setText("Input is invalid");
            return false;
        }

        try{
            for (int j = 0; j < s.length(); j++){
                if ((s.charAt(j) == '+'||s.charAt(j) == '-' || s.charAt(j) =='*')) {
                    if (s.charAt(j + 1) == '+' || s.charAt(j + 1) == '-' || s.charAt(j + 1) == '*') {
                        display.setText("Input is invalid");
                        return false;
                    }else if ((j+1)>s.length()){
                        display.setText("Input is invalid");
                    }
                }
            }
        }catch (Exception nextToEachOther){
            display.setText("Input is invalid");
            return false;
        }


        return true;

    }


}


/**
 * this is the main class with the main method that just calls the calculator and its SetUpUI method
 */

class Main {
    public static void main (String[] args){
        Calculator cal = new Calculator();
        cal.setUpUI();
    }
}
