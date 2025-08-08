import java.util.Scanner;

	public class TrafficLightController {

    	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a traffic light color (red, yellow, or green):");
        String color = input.nextLine().toLowerCase();
  
        if (color.equals("green")) {
            System.out.println("Go!");}

         else if (color.equals("red")) {
            System.out.println("Stop!");}

         else if (color.equals("yellow")) {
            System.out.println("Wait!");}
       
            else {System.out.println("Invalid color!");}
       

       
    }
}
