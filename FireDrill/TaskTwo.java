import java.util.Scanner;

public class TaskTwo{

public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        double sum=0;
	
	double average = 0;

        for(int i = 1; i <= 10; i++ ){
        System.out.print("Enter your numbers: ");
        int number = input.nextInt();

            sum += number;

        }

	 average = sum / 10;
        System.out.println("average of numbers is :"+average);

        }
    }
