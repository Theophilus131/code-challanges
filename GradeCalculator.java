// Question 23



import java.util.Scanner;
 public class GradeCalculator{

 public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	

	System.out.println("Enter score 0 to 100 ");
 	int userChoice = input.nextInt();
	
	if(userChoice < 0 && userChoice > 100){
	System.out.println("invalid input, enter number from 0 to 100");

	}
      	
	if(userChoice >= 90){
	System.out.println("A");
	}
	
	if(userChoice >= 80 && userChoice <= 89){
	System.out.println("B");
	}
	
	if(userChoice >= 70 && userChoice <= 79){
	System.out.println("C");
	}
	
	else if(userChoice < 70){
	System.out.println("f");
	}

	
	




		}

	}

