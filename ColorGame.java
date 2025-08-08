// Question 37

 	import java.util.Scanner;

	public class ColorGame{
	public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter a color:");
        String color = input.next();
        if (color.equalsIgnoreCase("red")) {
            for (int index = 0; index < 3; index++) {
                System.out.println("Red is awesome!");}
           
        } else {
            System.out.println("I like red better!");
        }

       
    }
}


	

	
	




}



	}