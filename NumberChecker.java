//Question 5

import java.util.Scanner;

	public class NumberChecker{

	public static void main(String [] arg){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter any number: ");
 	int number = input.nextInt();

	if(number % 2 == 0){
	System.out.print("Even!");

}

else{System.out.print("Odd!");}



}
	}