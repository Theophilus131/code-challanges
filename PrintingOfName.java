// Question 18

	import java.util.Scanner;

	public class PrintingOfName{

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter your name : ");
	String userName = input.next();

        for (int index = 1; index <= 9; index++) {
            System.out.print(userName + "! ");

            if (index % 3 == 0) {
                System.out.println();
            }
        }




}



	}