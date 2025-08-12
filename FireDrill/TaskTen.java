import java.util.Scanner;

public class TaskTen{

public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        double sum = 0;
	
	double average = 0;
	
        for(int index = 1; index <= 10; index++ ){
        System.out.print("Enter your numbers: ");
        int number = input.nextInt();
	
	if(number < 0){
		System.out.println("invalid number, enter valid numbers: ");
	}
	
		sum += number;

	        }
	
	average = sum / 10;
	
   	System.out.println("The sum of numbers is: " + average);

        }
    }
