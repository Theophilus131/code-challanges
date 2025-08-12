import java.util.Scanner;

public class TaskSix{

public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        double sumEvenNumber=0;

	double average = 0;
	

        for(int index = 1; index <= 10; index++ ){
        System.out.print("Enter your numbers: ");
        int number = input.nextInt();
	
	if(number % 2 == 0){
             sumEvenNumber += number;}
	
        }
	
		average = sumEvenNumber / 5;
	
	System.out.println("Average of number :" +average);


        }
    }
