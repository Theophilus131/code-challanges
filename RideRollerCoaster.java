//Question 31 
 
	import java.util.Scanner;

	public class RideRollerCoaster{

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter your age : ");
	int age = input.nextInt();

	System.out.println("Enter your height in centimeters: ");
        int height = input.nextInt();

        if (age >= 12) {
            if (height >= 140) {
                System.out.println("Ride allowed!");
            } else {
                System.out.println("Too short!");
            }
        } else {
            System.out.println("Too young!");
        }

        
    }
}


