
//Question 36

	import java.util.Scanner;

	public class FactorCounter {

   	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number:");
        int number = input.nextInt();

        int factorCount = 0; 

        for (int index = 1; index <= number; index++) {
            if (number % index == 0) {
                factorCount++; 
            }
        }

        System.out.println("Factors: " + factorCount);


    }
}
