import java.util.Scanner;

public class TaskFive{

public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int sumEvenNumber=0;
	
        for(int index = 1; index <= 10; index++ ){
        System.out.print("Enter your numbers: ");
        int number = input.nextInt();
	
	if(number % 2 == 0){
             sumEvenNumber += number;}
	
        }
	
	System.out.println("Sum of even number :" + sumEvenNumber);


        }
    }
