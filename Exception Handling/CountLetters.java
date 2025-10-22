// **
// CountLetters.java
//
// Reads a word from the standard input and prints the number of
// occurrences of each letter in that word.
//
// ***
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        //get word from user
        System.out.print("Enter a string (letters, numbers, etc.): ");
        String word = scan.nextLine();

        //convert to all upper case
        word = word.toUpperCase();

        //count frequency of each letter in string
        for (int i=0; i < word.length(); i++) {
            try {
                // This line might throw an exception
                counts[word.charAt(i)-'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // If an exception occurs, this block is executed.
                // It prints the character that caused the issue.
                System.out.println("'" + word.charAt(i) + "' is not a letter.");
            }
        }

        //print frequencies
        System.out.println();
        System.out.println("Letter Frequencies:");
        for (int i=0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char)(i +'A') + ": " + counts[i]);
            }
        }
    }
}