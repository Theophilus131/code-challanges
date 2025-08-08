//Question 35


	import java.util.Scanner;

	public class PriceOfTicketBooth{

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	int adultPrice = 10;
	
	int childPrice = 5;

	System.out.println("Enter your age:  ");
	int userAge = input.nextInt();

	if(userAge >= 18){
	System.out.println("Adult price :" + adultPrice);
	}

	else if(userAge < 18){
	System.out.println("Child price :" + childPrice);
	}

      	

	
		}

	}

	

