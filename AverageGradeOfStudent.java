// Question 44

	
import java.util.Scanner;

 public class AverageGradeOfStudent{

 public static void main(String [] args){

	Scanner input = new Scanner(System.in);

        int total = 0;
        int score;
        int count = 0;

        for (int i = 1; i <= 5; ) {
            System.out.print("Enter student test score : ");
            score = input.nextInt();

            if (score >= 0 && score <= 100) {
                total += score;
                i++; 

            } else {
                System.out.println("Invalid input. Please enter a score between 0 and 100.");
            }
        }

        double average = total / 5.0;
        System.out.println("Average: " + average);



		}

	}

