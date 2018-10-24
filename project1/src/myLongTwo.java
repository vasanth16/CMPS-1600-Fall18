import java.util.*;
public class myLongTwo {

    //private int storage[];
    private ArrayList<Integer> storage = new ArrayList<Integer>();
    //private String tempStorage = "";
    private String printing;
    private int counter = 0;
    private Long converted;

    public void setLong (String num){
        //storage = new int[num.length()+1];
        for (int i = 0; i < num.length(); i++){
            String number = Character.toString(num.charAt(i));
            int converted = Integer.parseInt(number);
            //storage[i] = converted;
            storage.add(i, converted);
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
    public ArrayList<Integer> add (myLongTwo other){
        ArrayList<Integer> output = new ArrayList<>();

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

        return output;


    }

    public void multiply(myLongTwo other){

        for (int i = this.storage.size()-1; i >=0; i--){
            for (int j = other.storage.size(); j >= 0; j--){
                int times = (int)((this.storage.get(i) * other.storage.get(j) * Math.pow(10, -(i+j))));
                String TTwo = String.valueOf(times);
            }
        }
    }


    public myLongTwo multi (myLongTwo other){
        myLongTwo finala = new myLongTwo();

        ArrayList<myLongTwo> answer = new ArrayList<myLongTwo>();
        for (int i = this.storage.size()-1; i >= 0; i--){
            for (int j = other.storage.size()-1; j >=0 ; j--){
                myLongTwo temp = new myLongTwo();
                int p =(int)((this.storage.get(i) * other.storage.get(j)) * (Math.pow(10,((i+j)))));
                System.out.println(p);
                String tempy = String.valueOf(p);
                temp.setLong(tempy);
                answer.add(temp);
                System.out.println(answer);
            }
        }
        finala = answer.get(0);
        //System.out.println(finala);

        for (int x = 0; x < answer.size(); x++){
            answer.get(x).getLong();

            finala.storage = finala.add(answer.get(x));
           // System.out.println(finala.getLong());
        }

        Collections.reverse(finala.storage);
        return finala;

    }
    @Override
    public String toString(){
        return this.getLong();
    }

    public myLongTwo(){}

    public myLongTwo(String num){
        this.setLong(num);
    }


}
