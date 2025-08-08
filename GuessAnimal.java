	//question 15

	import java.util.Scanner;

	public class GuessAnimal{

	public static void main(String [] arg){

	String myAnimal = "dog";

	

	Scanner input = new Scanner(System.in);

	System.out.println("Guess a Animal: ");
 	String userChoice = input.next();

	
	if(userChoice == myAnimal){
	System.out.println("correct its a dog!: ");
	
	}
	
	else{System.out.println("Nope, its a dog: ");}
	


}
	}
	