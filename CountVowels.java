// Question 29

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine().toLowerCase(); 
        int vowelCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);

        
    }
}
