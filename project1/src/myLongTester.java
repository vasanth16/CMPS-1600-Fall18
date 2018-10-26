import java.util.*;
public class myLongTester {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome to the MyLong Maker");
        System.out.println("Please enter your very long number");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println("Please enter another very long number");
        String yet = sc.nextLine();
        myLongTwo numy = new myLongTwo(num);
        myLongTwo yent = new myLongTwo(yet);

        //System.out.println(numy.add(yent));
        numy.multiply(yent);
        //numy.subtract(yent);
        //System.out.println(yent.getLong());
    }

}