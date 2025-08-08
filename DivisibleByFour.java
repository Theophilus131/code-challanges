// Question 38


	import java.util.Scanner;

	public class DivisibleByFour {

    	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter the start number:");
        int start = input.nextInt();

        System.out.println("Enter the end number:");
        int end = input.nextInt();

     
        for (int number = start; number <= end; number++) {
            if (number % 4 == 0) {
                System.out.println(number);
            }
        }

        
    }
}
