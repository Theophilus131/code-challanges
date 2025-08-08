//Question 7


import java.util.Scanner;

public class PasswordChecker{
public static void main(String [] args){


	Scanner input = new Scanner(System.in);

	String password = "secret123";

	System.out.println("Enter your password:");
	String userChoice = input.next();

	
	if(userChoice == password){
	System.out.println("Access granted! ");}

	else{System.out.println("Access Denied! ");}
	
	
}



	}