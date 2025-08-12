import java.util.Scanner;

public class TaskFour{

public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int sumEvenIndex=0;
	
        for(int index = 1; index <= 10; index++ ){
        System.out.print("Enter your numbers: ");
        int number = input.nextInt();
	
	if(index % 2 == 0){
            sumEvenIndex += number;}
	
        }
	
	System.out.println("Sum of even index :" + sumEvenIndex);


        }
    }
