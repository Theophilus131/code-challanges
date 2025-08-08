// Question 46


	import java.util.Scanner;

	public class PrimeNumberCheck {

    	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = input.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;} 

	else {
            
            for (int index = 2; index < number; index++) {
                if (number % index == 0) {
                    isPrime = false;}}

        if (isPrime) {
            System.out.println("Prime!");
        } else {System.out.println("Not prime!");}

       
    	}
	}
		}
