// Vasanth Rajasekaran 
// CMPS 1600 
// Lab 2

import java.util.*;




class MyLong{
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
	 	System.out.println(printing);
		return printing;
	 }

	 public ArrayList add (MyLong other){
	 	int temp;
	 	if (this.storage.size() >= other.storage.size()){
	 		int difference = this.storage.size() - other.storage.size();
	 		for (int i = 0; i < difference; i++){
	 			other.storage.add(0,0);
	 		}
	 		ArrayList<Integer> answer = new ArrayList<Integer>();
	 		for (int i = 0; i < this.storage.size() ; i++){
	 			answer.add(0);
	 		}

	 		for (int j = this.storage.size()-1; j>=0; j--){

	 			temp = this.storage.get(j) + other.storage.get(j);
	 			if (temp > 9){
	 				int t = this.storage.get(j-1);
	 				this.storage.set(j-1, t+1 );
	 				temp -= 10;
	 				answer.set(j,temp);
	 			}else{
	 				answer.set(j,temp);
	 			}
 			}
 			
 			//System.out.println(Arrays.toString(answer.toArray()));
 			return answer;
	 	}
	 	else{//if (this.storage.size() < other.storage.size()){
	 		int difference = other.storage.size() - this.storage.size();
	 		for (int i = 0; i < difference; i++){
	 			this.storage.add(0,0);
	 		}
	 		ArrayList<Integer> answer = new ArrayList<Integer>();
	 		for (int i = 0; i < other.storage.size() ; i++){
	 			answer.add(0);
	 		}

	 		for (int j = other.storage.size()-1; j>=0; j--){

	 			temp = this.storage.get(j) + other.storage.get(j);
	 			if (temp > 9){
	 				int t = other.storage.get(j-1);
	 				other.storage.set(j-1, t+1 );
	 				temp -= 10;
	 				answer.set(j,temp);
	 			}else{
	 				answer.set(j,temp);
	 			}
 			}
 			
 			//System.out.println(Arrays.toString(answer.toArray()));
 			return answer;
	 	
 		
	 }
	}

	 public void multi (MyLong other){
	 	MyLong finala = new MyLong();
	 	
	 	ArrayList<MyLong> answer = new ArrayList<>();
	 	for (int i = this.storage.size()-1; i >= 0; i--){
	 		for (int j = other.storage.size()-1; j >=0 ; j--){
	 			MyLong temp = new MyLong();
	 			int p =(int)((this.storage.get(i) * other.storage.get(j)) * (Math.pow(10,(i+j))));
	 			String tempy = String.valueOf(p);
	 			temp.setLong(tempy);
	 			answer.add(temp);
	 		}
	 	}
	 	finala = answer.get(0);

	 	for (int x = 1; x < answer.size(); x++){
	 		//System.out.println(answer.get(x));

	 		finala.storage = finala.add(answer.get(x));
	 		//System.out.println(finala.getLong());
	 	}

	 	Collections.reverse(finala.storage);

	 	finala.getLong();

	 }


	 MyLong (){

	 }
	 MyLong (String num){
	 	this.setLong(num);
	 }
} 

class MyLongTester {
	public static void main (String[] args){
		System.out.println("Hello and Welcome to the MyLong Maker");
		System.out.println("Please enter your very long number");
		Scanner sc = new Scanner(System.in);
	 	String num = sc.nextLine();
	 	System.out.println("Please enter another very long number");
	 	String yet = sc.nextLine();
	 	MyLong numy = new MyLong(num);
	 	MyLong yent = new MyLong(yet);

	 	numy.multi(yent);
	 	//numy.getLong();


	}
}