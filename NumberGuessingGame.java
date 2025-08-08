// Question 21

 
import java.util.Scanner;
 public class NumberGuessingGame{

 public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
	int secret = 8;

	System.out.println("Enter number ");
 	int userChoice = input.nextInt();

      	
	for(int i = 1; i < userChoice; i++){
	if(userChoice == secret){
	
	System.out.println("Correct");
	}
	
	else{System.out.println("try again");
		System.out.println("Enter number ");
		userChoice = input.nextInt();
	}
	
		}

	}




	}