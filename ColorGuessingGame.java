//Question 48


	import java.util.Scanner;

	public class ColorGuessingGame {

   	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String favoriteColor = "blue";
        String userChoice;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Guess the favorite color: ");
            userChoice = input.next();

            if (userChoice.equalsIgnoreCase(favoriteColor)) {
                System.out.println("Correct!");}
               
             else if(userChoice.equalsIgnoreCase("green")) {
                    System.out.println("Close!");}
                 else {  System.out.println("Wrong!");}
            }
 
          
       
    }
}
