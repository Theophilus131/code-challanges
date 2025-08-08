// Question 19


import java.util.Scanner;
 public class MagicNumber{

 public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
	int magicNumber = 42;

	System.out.println("Enter number ");
 	int userChoice = input.nextInt();

       if(userChoice == magicNumber){
	System.out.println("you found the magic number ");

	}
	
	else{System.out.println("Keep looking ");}

	


	}




	}