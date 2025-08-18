import java.util.Arrays;
import java.util.Scanner;

public class FireDrillThree {
    public static void taskOne() {

        int[] scores = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score:");
            scores[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(scores));
    }

    public static void taskTwo() {

        int[] scores = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score:");
            scores[i] = scanner.nextInt();
            System.out.println(scores[i]);
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }

    public static void taskThree() {

        int[] scores = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score:");
            scores[i] = scanner.nextInt();
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
        }

    }

    public static int [] taskFour(int[] scores) {
        scores = new int[10];

        for (int index = 0; index < scores.length; index++) {

        }
            if(index % 2== 0){
        }

        return index;
    }






}
    


        

