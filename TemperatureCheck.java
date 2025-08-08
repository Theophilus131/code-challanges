// Question 17

	
	 import java.util.Scanner;

	public class TemperatureCheck{

	public static void main(String [] arg){

	Scanner input = new Scanner(System.in);

	
	System.out.println("Enter Temperature (like 25): ");
 	int userChoice = input.nextInt();

	
	if(userChoice > 30){
	System.out.println("Hot! :");
	}	
	
	else if(userChoice >= 15  && userChoice <= 30){
	System.out.println("nice:");
	}
	
	else if(userChoice < 15){
	System.out.println("cold :");
	}
}
	}
