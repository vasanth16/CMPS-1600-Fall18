import java.util.*;
public class myLongTwo {

    //private int storage[];
    private ArrayList<Integer> storage = new ArrayList<Integer>();
    //private String tempStorage = "";
    private String printing;
    private int counter = 0;
    private Long converted;
    private boolean isNeg;

    public void setLong (String num){
        //storage = new int[num.length()+1];
        for (int i = 0; i < num.length(); i++){
            String number = Character.toString(num.charAt(i));
            if (number.equals("-")) {
                isNeg = true;
            } else if (this.isNeg){
                int converted = Integer.parseInt(number);
                //storage[i] = converted;
                storage.add(i-1, converted);
            }
            else {
                int converted = Integer.parseInt(number);
                //storage[i] = converted;
                storage.add(i, converted);
            }
        }
    }

    public String getLong (){
        printing = "";
        for (int i = 0; i < storage.size(); i++ ){
            String tempy = String.valueOf(storage.get(i));
            printing += tempy;
        }
        //System.out.println(printing);
        return printing;
    }
    public myLongTwo add (myLongTwo other){
        ArrayList<Integer> output = new ArrayList<>();
        String finalAnswer = "";

        if (this.isNeg){
            int temp = this.storage.get(0);
            temp *= -1;
            return this.subtract(other);
        } else if (other.isNeg){
            int temp = other.storage.get(0);
            return other.subtract(this);
        }

        // If this array is a longer number then the number passed in
        if (this.storage.size() >= other.storage.size()) {
            int tensAway = this.storage.size() - other.storage.size();
            for (int i = 0; i < tensAway; i++) {
                other.storage.add(0, 0);
            }
            for (int j = this.storage.size() - 1; j >= 0; j--) {
                int numOne = this.storage.get(j);
                int numTwo = other.storage.get(j);
                int answer = numOne + numTwo;
                output.add(0, answer);
                //System.out.println(output);
            }

            for (int k = output.size() - 1; k >= 0; k--) {
                int check = output.get(k);
                if (check > 9) {
                    check -= 10;
                    output.set(k, check);
                    try {
                        int setNew = output.get(k - 1);
                        setNew += 1;
                        output.set(k - 1, setNew);
                    } catch (Exception e) {
                        output.add(0, 1);
                    }
                }
            }

        }else{
            int tensAway = other.storage.size() - this.storage.size();
            for (int i = 0; i < tensAway; i++){

                this.storage.add(0,0);
            }


            for (int j = other.storage.size()-1; j >= 0; j--){
                int numOne = this.storage.get(j);
                int numTwo = other.storage.get(j);
                int answer = numOne + numTwo;
                output.add(0, answer);
            }
            for (int k = output.size() - 1; k >= 0; k--) {
                int check = output.get(k);
                if (check > 9) {
                    check -= 10;
                    output.set(k, check);
                    try {
                        int setNew = output.get(k - 1);
                        setNew += 1;
                        output.set(k - 1, setNew);
                    } catch (Exception e) {
                        output.add(0, 1);
                    }
                }
            }
        }


        myLongTwo addOutput = new myLongTwo(output);
        //System.out.println(addOutput);
        return addOutput;




    }

    public myLongTwo subtract (myLongTwo other){
        ArrayList<Integer> output = new ArrayList<>();
            if (this.storage.size() > other.storage.size()){
                int tensAway = this.storage.size() - other.storage.size();
                for (int i = 0; i < tensAway; i++){

                    other.storage.add(0,0);
                }
                for (int i = this.storage.size()-1; i >= 0; i-- ){
                    int num1 = this.storage.get(i);
                    int num2 = other.storage.get(i);
                    if (num1 < num2){
                        num1 += 10;
                        this.storage.set(i-1,this.storage.get(i-1)-1);
                    }
                    int answer = num1 - num2;
                    output.add(0,answer);

                }
            }
            else if (this.storage.size() < other.storage.size()){
                int tensAway = other.storage.size() - this.storage.size();
                for (int i = 0; i < tensAway; i++){

                    this.storage.add(0,0);
                }
                System.out.println(this);
                for (int i = other.storage.size()-1; i >= 0; i-- ) {
                    int num1 = this.storage.get(i);
                    int num2 = other.storage.get(i);
                    //System.out.println(num2);
                    if (num2< num1){
                        num2 += 10;
                        other.storage.set(i-1,other.storage.get(i-1)-1);
                        //System.out.println(other);
                    }
                    int answer = num2 - num1;
                    output.add(0,answer);
                }
            }else{
                for (int i = 0; i < this.storage.size(); i++){
                    int num1 = this.storage.get(i);
                    int num2 = other.storage.get(i);
                    if (num1 < num2){
                        int tensAway = other.storage.size() - this.storage.size();
                        for (int x = 0; x < tensAway; x++){

                            this.storage.add(0,0);
                        }
                        System.out.println(this);
                        for (int y = other.storage.size()-1; y >= 0; y-- ) {
                            num1 = this.storage.get(y);
                            num2 = other.storage.get(y);
                            //System.out.println(num2);
                            if (num2< num1){
                                num2 += 10;
                                other.storage.set(y-1,other.storage.get(y-1)-1);
                               // System.out.println(other);
                            }
                            int answer = num2 - num1;
                            System.out.println(answer);
                            output.add(0,answer);
                        }
                        myLongTwo subOutput = new myLongTwo(output);
                        System.out.println(subOutput.toString());
                        return subOutput;

                    } else if (num1 > num2){
                        int tensAway = this.storage.size() - other.storage.size();
                        for (int k = 0; k < tensAway; k++){

                            other.storage.add(0,0);
                        }
                        for (int z = this.storage.size()-1; z >= 0; z-- ){
                             num1 = this.storage.get(z);
                             num2 = other.storage.get(z);
                            if (num1 < num2){
                                num1 += 10;
                                this.storage.set(z-1,this.storage.get(z-1)-1);
                            }
                            int answer = num1 - num2;
                            output.add(0,answer);

                        }
                        myLongTwo subOutput = new myLongTwo(output);
                        //System.out.println(subOutput.toString());
                        return subOutput;
                    } else if (this.storage.equals(other.storage)){
                        myLongTwo subOutput = new myLongTwo("0");
                        //System.out.println(subOutput.toString());
                        return subOutput;
                    }
                }
            }

            myLongTwo subOutput = new myLongTwo(output);
            //System.out.println(subOutput.toString());
            return subOutput;
    }

    public myLongTwo multiply(myLongTwo other){

        ArrayList<myLongTwo> pieces = new ArrayList<>();
        myLongTwo finalAnswer = new myLongTwo();

        for (int i = this.storage.size()-1; i >=0; i--){
            for (int j = other.storage.size()-1; j >= 0; j--){
                int times = (int)((this.storage.get(i) * other.storage.get(j)) * (Math.pow(10,((i+j)))));
                String TTwo = String.valueOf(times);
               // System.out.println(TTwo);
                myLongTwo temp = new myLongTwo(String.valueOf(TTwo));
                pieces.add(temp);
            }
        }



        for (int i = pieces.size()-1; i >= 0; i --){
            myLongTwo additive = pieces.get(i);
            //System.out.println(additive);
            finalAnswer = finalAnswer.add(additive);
        }

        //System.out.println(finalAnswer);
        if (finalAnswer.getLong().length() < this.getLong().length()){
            int diff = this.getLong().length() - finalAnswer.getLong().length();
            for (int i =0; i<=diff;i++){
                finalAnswer.storage.add(0);
            }
        }else if (finalAnswer.getLong().length() < other.getLong().length()){
            int diff = other.getLong().length() - finalAnswer.getLong().length();
            for (int i =0; i<=diff;i++){
                finalAnswer.storage.add(0);
            }
        }
        ArrayList pali = other.storage;
        Collections.reverse(pali);
        //System.out.println(pali);
        //System.out.println(this.storage);
        if (this.getLong().equals(pali.toString())){
            Collections.reverse(finalAnswer.storage);
        }
        System.out.println(finalAnswer);
        return finalAnswer;
    }

    @Override
    public String toString(){
        return this.getLong();
    }

    public myLongTwo(){}

    public myLongTwo(ArrayList<Integer> list){
        String finalAnswer = "";
        for (int i = 0; i<list.size(); i++){
            String temp = String.valueOf(list.get(i));
            //System.out.println(temp);
            finalAnswer = finalAnswer + temp;
        }
        this.setLong(finalAnswer);
    }

    public myLongTwo(String num){
        this.setLong(num);
    }


}
