// Question 48

 	public class SumOfMultiples{

	public static void main(String [] args){

	 int total = 0;

        for (int index = 1; index <= 50; index++) {
            if (index % 3 == 0 || index % 5 == 0) { 
                total += index;
            }
        }

        System.out.println("Total sum of multiples of 3 or 5 from 1 to 50: " + total);



		}

	}

