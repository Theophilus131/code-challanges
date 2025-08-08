// Question 25


	import java.util.Scanner;

	public class SecretVault {

    	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String correctPassword = "python";

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.println("Enter the password:");
            String userGuess = input.next();

            if (userGuess.equals(correctPassword)) {
                System.out.println("Success!");}
                
            else {
                if (attempt < 3) {
                    System.out.println("Try again!");}
                
		else {
                    System.out.println("Locked out!");}
                
          		  }
     				   }

      
    }
}
