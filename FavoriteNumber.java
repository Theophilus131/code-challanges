
//Question 3

import java.util.Scanner;

	public class FavoriteNumber{

	public static void main(String [] arg){

	int favoriteNumber = 7;

	Scanner input = new Scanner(System.in);

	System.out.println("Guess a number: ");
 	int userChoice = input.nextInt();

	
	if(userChoice == favoriteNumber){
	System.out.println("Thats my favorite number!: ");
	
	}
	
	else{System.out.println("Nice try, guess again: ");}
	


}
	}