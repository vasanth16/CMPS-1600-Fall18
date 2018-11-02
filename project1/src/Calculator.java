import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Project 1: Calculator for mylongs
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

    private Queue <ArrayList<String>> nums = new LinkedList<>();
    private Queue<String> ops = new LinkedList<String>();


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
            System.out.println(sum );
        }
    }

    /*public void inputting1 (String s){
        //Stack numbers = new Stack();
        //Stack operations = new Stack();
        //myLongTwo finalcal = new myLongTwo();
        String op = "";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                //System.out.println("yent");
                for (int j = i; j<s.length(); j++){
                    if (s.charAt(j) == ')'){
                        op = s.substring(i+1, j);
                    }
                }

                if (op.length() > 3) {
                    if (op.contains("*")){
                        for (int k = 0; k < op.length(); k++) {
                            if (op.charAt(k) == '*'){
                                String num = op.substring(0,k-1) + op.substring(k+1);
                                StringBuilder yent = new StringBuilder(op);
                                nums.add(num);
                                ops.add("*");
                                yent.delete(k-1,k+1);
                                op = yent.toString();
                            }
                        }
                    }
                    if (op.contains("+") || op.contains("-")){
                        for (int l = 0; l < op.length(); l++){
                            //System.out.println(l);
                            //System.out.println(op);
                            if (op.charAt(l) == '+'){
                                System.out.println("I hate this project so much");
                                try{
                                    System.out.println("I hate this project so much 2");
                                    String num = op.charAt(l-1) +""+ op.charAt(l+1);
                                    StringBuilder yent = new StringBuilder(op);
                                    nums.add(num);
                                    ops.add("+");
                                    String numOne = op.substring(0,l);
                                    String numTwo = op.substring(l+1, op.length()-1);
                                    yent.deleteCharAt(l-1);
                                    yent.deleteCharAt(l+1);
                                    yent.deleteCharAt(l);
                                    //System.out.println(num);
                                    //System.out.println(yent.toString());
                                    op = yent.toString();
                                    System.out.println(op);
                                } catch (Exception e){
                                    try {
                                        System.out.println("I hate this project so much3");
                                        String num = op.charAt(l-1)+"";
                                        StringBuilder yent = new StringBuilder();
                                        nums.add(num);
                                        ops.add("+");
                                        //yent.delete(l-1,l);
                                        yent.deleteCharAt(l-1);
                                        yent.deleteCharAt(l);
                                        op = yent.toString();
                                    }catch (Exception f){
                                        try{
                                            String num = op.charAt(l+1)+"";
                                            StringBuilder yent = new StringBuilder();
                                            nums.add(num);
                                            ops.add("+");
                                            yent.deleteCharAt(l+1);
                                            yent.deleteCharAt(l);
                                            op = yent.toString();
                                        }catch (Exception g){
                                            System.out.println("Cant find");
                                        }
                                    }
                                }
                                l = 0;

                            } else if (op.charAt(l) == '-'){
                                try{
                                    String numOne = op.substring(0,l);
                                    String numTwo = op.substring(l+1, op.length()-1);
                                    String num = numOne+numTwo;
                                    StringBuilder yent = new StringBuilder(op);
                                    nums.add(num);
                                    ops.add("-");
                                    yent.deleteCharAt(l-1);
                                    yent.deleteCharAt(l+1);
                                    yent.deleteCharAt(l);
                                    op = yent.toString();
                                } catch (Exception e){
                                    try {
                                        String num = op.charAt(l-1)+"";
                                        StringBuilder yent = new StringBuilder();
                                        nums.add(num);
                                        ops.add("-");
                                        yent.deleteCharAt(l-1);
                                        yent.deleteCharAt(l);
                                        op = yent.toString();
                                    }catch (Exception f){
                                        try{
                                            String num = op.charAt(l+1)+"";
                                            StringBuilder yent = new StringBuilder();
                                            nums.add(num);
                                            ops.add("-");
                                            yent.deleteCharAt(l+1);
                                            yent.deleteCharAt(l);
                                            op = yent.toString();
                                        }catch (Exception g){
                                            System.out.println("Cant find");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }else{
                    for (i = 0; i<op.length(); i++ ){
                        System.out.println("I hate this project so much 5");
                        if (op.charAt(i) == '+' || op.charAt(i) == '-' ||op.charAt(i) == '*'){
                            String numOne = op.charAt(0)+"";
                            String numTwo = op.charAt(2)+"";
                            String numbers = numOne+ "" + numTwo;
                            System.out.println("Num 1: "+ numOne);
                            System.out.println("Num 2:"+numTwo);
                            nums.add(numbers);
                            ops.add(op.charAt(i)+"");
                        }
                    }
                }
            }
        }
    }*/

    public void inserting (String s){
        StringBuilder builder = new StringBuilder(s);
        while (!s.isEmpty()) {
            if (s.contains("(")) {
                int open = builder.indexOf("(");
                int close = builder.indexOf(")");
                String eq = builder.substring(open + 1, close);
                builder.delete(open, close);
                s = builder.toString();
                System.out.println(eq);
                if (eq.contains("*")){
                    eq = parseMulti(eq);
                }
                if (eq.contains("+") && eq.contains("-")){
                    int a = eq.indexOf("+");
                    int m = eq.indexOf("-");

                    if ( a > m){
                        eq = parseAdd(eq);
                    }else{
                        eq = parseSub(eq);
                    }
                } else if (eq.contains("+")){
                    eq = parseAdd(eq);
                } else if (eq.contains("-")){
                    eq = parseSub(eq);
                }

            } else{
                if (s.contains("*")){
                    s = parseMulti(s);
                }
                if (s.contains("+") && s.contains("-")){
                    int a = s.indexOf("+");
                    int m = s.indexOf("-");

                    if ( a > m){
                        s = parseAdd(s);
                    }else{
                        s = parseSub(s);
                    }
                } else if (s.contains("+")){
                    s = parseAdd(s);
                } else if (s.contains("-")){
                    s = parseSub(s);
                }
            }

        }

        //parse(s);
    }

    public String parseMulti (String s){
        if (s.contains("*")){
            int operator = s.indexOf("*");
            ArrayList<String> temp = new ArrayList<String>();
            ops.add("*");
            if (s.contains("+") && s.contains("-")) {
                int pluss = s.indexOf("+");
                int minus = s.indexOf("-");

                if (pluss > operator && minus > operator) {
                    if (pluss > minus) {
                        String numOne = s.substring(minus, operator);
                        String numTwo = s.substring(operator, s.length());
                        temp.add(numOne);
                        temp.add(numTwo);
                        StringBuilder ss = new StringBuilder(s);
                        ss = ss.delete(minus,s.length()-1);
                        s = ss.toString();
                    } else {
                        String numOne = s.substring(pluss, operator);
                        String numTwo = s.substring(operator, s.length());
                        temp.add(numOne);
                        temp.add(numTwo);
                        StringBuilder ss = new StringBuilder(s);
                        ss = ss.delete(pluss,s.length()-1);
                        s = ss.toString();
                    }
                    nums.add(temp);
                }else if (pluss > operator){
                    String numOne = s.substring(pluss+1, operator);
                    String numTwo = s.substring(operator+1, minus);
                    temp.add(numOne);
                    temp.add(numTwo);
                    nums.add(temp);
                    StringBuilder ss = new StringBuilder(s);
                    ss = ss.delete(pluss+1,minus);
                    s = ss.toString();
                }
                else{
                    String numOne = s.substring(minus+1, operator);
                    String numTwo = s.substring(operator+1, pluss);
                    temp.add(numOne);
                    temp.add(numTwo);
                    nums.add(temp);
                    StringBuilder ss = new StringBuilder(s);
                    ss = ss.delete(minus+1,pluss);
                    s = ss.toString();
                }
            

            } else if (s.contains("+")){
                int pluss = s.indexOf("+");
                if (pluss > operator){
                    String numOne = s.substring(pluss+1, operator);
                    String numTwo = s.substring(operator+1, s.length()-1);
                    temp.add(numOne);
                    temp.add(numTwo);
                    nums.add(temp);
                    StringBuilder ss = new StringBuilder(s);
                    ss = ss.delete(pluss+1,s.length()-1);
                    s = ss.toString();
                } else{
                    String numOne = s.substring(0, operator);
                    String numTwo = s.substring(operator+1, pluss);
                    boolean add = temp.add(numOne);
                    temp.add(numTwo);
                    nums.add(temp);
                    StringBuilder ss = new StringBuilder(s);
                    ss = ss.delete(0,pluss);
                    s = ss.toString();
                }
            } else if (s.contains("-")){
                int minus = s.indexOf("-");
                if (minus > operator){
                    String numOne = s.substring(minus+1, operator);
                    String numTwo = s.substring(operator+1, s.length()-1);
                    temp.add(numOne);
                    temp.add(numTwo);
                    nums.add(temp);
                    StringBuilder ss = new StringBuilder(s);
                    ss = ss.delete(minus+1,s.length()-1);
                    s = ss.toString();
                } else{
                    String numOne = s.substring(0, operator);
                    String numTwo = s.substring(operator+1, minus);
                    temp.add(numOne);
                    temp.add(numTwo);
                    nums.add(temp);
                    StringBuilder ss = new StringBuilder(s);
                    ss = ss.delete(0,minus);
                    s = ss.toString();
                }
            } else {
                System.out.println("Yent");
                String num1 = s.substring(0,operator);
                String num2 = s.substring(operator+1, s.length());
                temp.add(num1);
                temp.add(num2);
                nums.add(temp);
                s = "";
                //StringBuilder ss = new StringBuilder(s);
                //ss = ss.delete(0,s.length()-1);
               // s = ss.toString();

            }
        }
        return s;
    }

    public String parseAdd (String s){
        ArrayList <String> temp = new ArrayList<>();
        int pluss = s.indexOf("+");
        int x = pluss;
        int y = pluss;
        if (s.length() > 2) {
            for (int i = pluss + 1; i < s.length() - 1; i++) {
                if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                    break;
                }
                x += 1;
            }
            for (int j = pluss - 1; j >= 0; j--) {
                if (s.charAt(j) == '+' || s.charAt(j) == '-') {
                    break;
                }
                y -= 1;
            }

            String num1 = s.substring(y, pluss);
            String num2 = s.substring(pluss +1, x+1);

            System.out.println("1: "+num1);
            System.out.println("2: "+num2);

            ops.add("+");

            temp.add(num1);
            temp.add(num2);

            nums.add(temp);

            StringBuilder ss = new StringBuilder(s);
            ss = ss.delete(y, x + 1);
            s = ss.toString();

            return s;
        } else{
            if (pluss == 0){
                String num1 = s.charAt(1)+"";
                temp.add(num1);
                ops.add("+");
                nums.add(temp);
                s = "";
            }else{
                String num1 = s.charAt(0)+"";
                temp.add(num1);
                ops.add("+");
                nums.add(temp);
                s = "";
            }
            return s;
        }
    }

    public String parseSub (String s){
        ArrayList <String> temp = new ArrayList<>();
        int minus = s.indexOf("-");
        int x = minus;
        int y = minus;
        if (s.length()>2){
            for (int i = minus + 1; i < s.length() - 1; i++) {
                if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                    break;
                }
                x += 1;
            }
            for (int j = minus - 1; j >= 0; j--) {
                if (s.charAt(j) == '+' || s.charAt(j) == '-') {
                    break;
                }
                y -= 1;
            }

            String num1 = s.substring(y, minus);
            String num2 = s.substring(minus + 1, x);

            ops.add("-");

            temp.add(num1);
            temp.add(num2);

            nums.add(temp);

            StringBuilder ss = new StringBuilder(s);
            ss = ss.delete(y, x + 1);
            s = ss.toString();

            return s;
        }else{
            if (minus == 0){
                String num1 = s.charAt(1)+"";
                temp.add(num1);
                ops.add("-");
                nums.add(temp);
                s = "";
            }else{
                String num1 = s.charAt(0)+"";
                temp.add(num1);
                ops.add("-");
                nums.add(temp);
                s = "";
            }
            return s;
        }
    }

    public myLongTwo calculating (){
        myLongTwo finalsum = new myLongTwo("0");
        while(!nums.isEmpty() && !ops.isEmpty()){
            ArrayList<String> currNums = nums.poll();
            String currOp = ops.poll();
           // System.out.println(currNums);

            if (currOp.equals("*")){
                if (currNums.size() > 1){
                    String a = currNums.get(0);
                    String b = currNums.get(1);

                    myLongTwo aa = new myLongTwo(a);
                    myLongTwo bb = new myLongTwo(b);

                    finalsum = finalsum.add(aa.multiply(bb));
                }else {
                    myLongTwo aa = new myLongTwo(currNums.get(0));
                    finalsum = finalsum.multiply(aa);
                }
            } /*else if (currOp.equals("+")){
                if (currNums.length() > 1){
                    String a = currNums.charAt(0)+"";
                    String b = currNums.charAt(1)+"";

                    myLongTwo aa = new myLongTwo(a);
                    myLongTwo bb = new myLongTwo(b);

                    finalsum = finalsum.add(aa.add(bb));
                    //System.out.println(aa.add(bb).toString());
                }else {
                    System.out.println("allai");
                    myLongTwo aa = new myLongTwo(currNums);

                    finalsum = finalsum.add(aa);
                }

            } else if (currOp.equals("-")){
                if (currNums.length() > 1){
                    String a = currNums.charAt(0)+"";
                    String b = currNums.charAt(1)+"";

                    myLongTwo aa = new myLongTwo(a);
                    myLongTwo bb = new myLongTwo(b);

                    finalsum = finalsum.add(aa.subtract(bb));
                }else {
                    myLongTwo aa = new myLongTwo(currNums);
                    finalsum = finalsum.subtract(aa);
                }

            }*/
        }
        return finalsum;
    }

    public myLongTwo calcs (String s){
        Stack <String> order = new Stack ();
        String others = "";
        myLongTwo finalCal = new myLongTwo();

        for (int i =0; i < s.length() ; i++){
            if (s.charAt(i) == '('){
                for (int j = i+1; j < s.length(); j++){
                    if (s.charAt(j) == ')'){
                        String op = s.substring(i+1, j);
                        order.push(op);
                        break;
                        //System.out.println(op);
                    }
                }
            }
            else{
                others += s.charAt(i);
                try {
                    if (s.charAt(i + 1) == '(') {
                        order.push(others);
                        others = "";
                    }
                } catch (Exception string){
                    System.out.println(others + ":OThers");
                    order.push(others);
                    others = "";
                }
            }
        }

        while (!order.isEmpty()){
            String curr = order.pop();
            System.out.println("This is curr:" + curr);
            if (curr.contains("+")){
                for (int i = 0; i < curr.length(); i++){
                    if (curr.charAt(i) == '+'){
                        //System.out.println(curr);
                        //Character numOne = curr.charAt(i-1);
                        //String numA = numOne.toString();
                        String numA = curr.substring(0,i);
                        System.out.println("Num A:" +numA);

                        Character numTwo = curr.charAt(i-1);
                        //String numB = numTwo.toString();
                        String numB = curr.substring(i+1, curr.length()-1);
                        System.out.println("Num B: "+numB);

                        myLongTwo A = new myLongTwo(numA);
                        myLongTwo B = new myLongTwo(numB);

                        finalCal = finalCal.add(A.add(B));
                        break;

                    }
                }
            }
        }

        return finalCal;
    }

    /**
     * this method checks if the set of operations is valid
     * @param s this is the String that is passed in and in this case is sum
     * @return returns true or false . not utilized much in this program but easily could be in the future
     */
    public boolean isValidInput(String s){
        Stack check = new Stack();
        inserting(sum);

        try {
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '(') {
                    //System.out.println("y");
                    check.push('(');
                }
                if (s.charAt(i) == ')') {
                    //System.out.println("y");
                    check.pop();
                }
            }


            if (check.isEmpty()) {
                System.out.println(nums.peek());
                System.out.println(ops.peek());
                //System.out.println(calcs(sum).toString());
                display.setText(calculating().toString());
            } else {
                display.setText("Input is invalid");
            }
        } catch(Exception stackEmpty){
            display.setText("yuhh");
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
