import java.util.Scanner;

public class TaskNine{

public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int sum = 0;
	
        for(int index = 1; index <= 10; index++ ){
        System.out.print("Enter your numbers: ");
        int number = input.nextInt();
	
	if(number >= 0){
		sum += number;
			}
	        }
	
   	System.out.println("The sum of numbers is: " + sum);
			
	

        }
    }
