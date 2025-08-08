//traffic light, collect input for traffic light color and print the command respectively red print stop, y get ready and green go...

import java.util.Scanner;

public class TrafficLight{
public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("enter the traffic light color's: ");
	String userInput = input.nextLine();

	if(userInput == "red"){

	System.out.println("Stop");
	}

	if(userInput == "yellow"){
	System.out.println("Ready");
	}

	if(userInput == "green"){
	System.out.println("Go");
	}

		


	}

		}
