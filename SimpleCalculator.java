//Question 28

	import java.util.Scanner;

	public class SimpleCalculator {
    	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       
        System.out.println("Enter the first number:");
        int firstNumber = input.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = input.nextInt();

        System.out.println("Enter '+' to add or '-' to subtract:");
        String operation = input.next();

        
        if (operation.equals("+")) {
            int result = firstNumber + secondNumber;
            System.out.println(" Two numbers added " + result);}

         else if (operation.equals("-")) {
            int result = firstNumber - secondNumber;
            System.out.println("subtraction " + result);}

        else { System.out.println("Invalid operation!");}
           
        

        
    }
}
