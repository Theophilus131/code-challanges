// Question 11

  
 import java.util.Scanner;

	public class PositiveNegative{

	public static void main(String [] arg){

	Scanner input = new Scanner(System.in);


	System.out.println("Enter a number: ");
 	int userChoice = input.nextInt();

	if(userChoice >= 0){
	System.out.println("positive");
	}	
	
	else if(userChoice <= 0){
	System.out.println("Negative");
	
	}
	

}
	}
