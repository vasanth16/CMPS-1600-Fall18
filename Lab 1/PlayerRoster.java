import java.util.*;

class PlayerRoster{
	public static void main (String[] args){
		int jNumber;
		int rating;

		boolean exit = false;
		char choice;

		Scanner sc = new Scanner(System.in);

		int[] jerseys = new int[5];

		int[] ratings = new int[5];


		for (int i =1; i<6;	i++){
			System.out.println("Enter player "+ i + "'s jersey number:");
			jNumber = sc.nextInt();
			jerseys[i-1] = jNumber;
			System.out.println("Enter player "+ i + "'s rating:\n");
			rating = sc.nextInt();
			ratings[i-1]= rating;

		}
		System.out.println("ROSTER");
		for (int j =1; j < jerseys.length+1; j++){
					System.out.println("Player "+j+" -- Jersey number: "+ jerseys[j-1]+", Rating: "+ ratings[j-1]);
		} 
		System.out.print("\n");

		while (exit == false){
			System.out.println("MENU");
			System.out.println("u - Update player rating");
			System.out.println("a - Output players above a rating");
			System.out.println("r - Replace player");
			System.out.println("o - Output roster");
			System.out.println("q - Quit\n");
			System.out.println("Choose an option:");

			choice = sc.next().charAt(0);
			if (choice == 'u'){
				System.out.println("Enter a jersey number:");
				int u = sc.nextInt();
				for (int j =1; j < jerseys.length+1; j++){
						if (jerseys[j-1] == u){
							System.out.println("Enter a new rating for player:");
							int newRating = sc.nextInt();
							ratings[j-1] = newRating;
						}
					}


			} else if (choice == 'a'){
				System.out.print("Enter a rating:\n");
				int bar = sc.nextInt();
				System.out.println("ABOVE "+ bar);
				for (int j =1; j < jerseys.length+1; j++){
					if (ratings[j-1] > bar ){
						System.out.println("Player "+j+" -- Jersey number: "+ jerseys[j-1]+", Rating: "+ ratings[j-1]);
					}
					
				} 
				System.out.print("\n");
			} else if (choice == 'r'){
					System.out.println("Enter a jersey number:");
					int replaceNumber = sc.nextInt();

					for (int j =1; j < jerseys.length+1; j++){
						if (jerseys[j-1] == replaceNumber){
							
							System.out.println("Enter a new jersey number:");
							int newNumber = sc.nextInt();
							jerseys[j-1] = newNumber;
							
							System.out.println("Enter a rating for the new player:");
							int newRating = sc.nextInt();
							ratings[j-1] = newRating;
						}
					}
			} else if(choice == 'o'){
				System.out.println("ROSTER");
				for (int j =1; j < jerseys.length+1; j++){
					System.out.println("Player "+j+" -- Jersey number: "+ jerseys[j-1]+", Rating: "+ ratings[j-1]);
				} 
				System.out.print("\n");
			} else if (choice == 'q'){
					exit = true;
			}
		}
	}
}