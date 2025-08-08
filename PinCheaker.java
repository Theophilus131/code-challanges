// Question 42

	42. Pin Entry System 
Guard a secret code! Create a locked box called “pin” set to “1234.” Give the 
user 3 tries to type a pin and save it in a box. If it matches, say, “Access 
granted!” and stop. If not, say, “Try again!” After 3 wrong tries, say, “Locked!” 

	import java.util.Scanner;

	public class PinCheaker{

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter pin ");
	int userChoice = input.nextInt();

	int pin = 1234;

      	
	for(int i = 1; i < userChoice; i++){
	if(userChoice == pin){
	
	System.out.println("Access granted ");
	}
	
	else{System.out.println("try again");
		System.out.println("Enter number ");
		userChoice = input.nextInt();
	}
	
		}

	}

	


	








}





	}