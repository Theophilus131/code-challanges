// Question 39

	
	import java.util.Scanner;

	public class QuizGame{

    	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "Paris";  
        int numberOfTry = 3;

        for (int attempt = 1; attempt <= numberOfTry ; attempt++) {
            System.out.println("What’s the capital of France?");
            String userAnswer = input.next();

            if (userAnswer.equalsIgnoreCase(answer)) {
                System.out.println("Correct!");}
                
             else {
                if (attempt < numberOfTry) {
                    System.out.println("Try again!");}
    
            }
        }

        
        System.out.println("Out of tries!");    }
}
