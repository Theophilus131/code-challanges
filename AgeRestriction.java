// Question 13


 import java.util.Scanner;

	public class AgeRestriction{

	public static void main(String [] arg){

	Scanner input = new Scanner(System.in);

	int mimimum = 10;


	System.out.println("Enter your age: ");
 	int userChoice = input.nextInt();

	
	if(userChoice >= 10){
	System.out.println("Welcome to the show! :");
	}	
	
	else{System.out.println("Sorry, you're too young! ");}
	

}
	}
	