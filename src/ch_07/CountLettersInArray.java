package ch_07;

import ch_06.RandomCharacter;

public class CountLettersInArray {
    public static void main(String[] args) {
        // Declare and create an array with createdArray method
        char[] chars = createArray();

        // Display the array with displayArray method
        System.out.println("The lowercase letters are:");
        displayArray(chars);

        // Count the occurrences of each letter with countLetters method
        int[] counts = countLetters(chars);

        // Display counts with displayCounts method
        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);
    }

    /** Create an array of characters with the RandomCharacter class from Ch 6*/
    public static char[] createArray() {
        // Declare an array of characters and create it
        char[] chars = new char[100];

        // Create lowercase letters randomly and assign them to the array
        for (int i = 0; i < chars.length; i++)
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        // Return the array
        return chars;
    }
    /** Display the array of characters */
    public static void displayArray(char[] chars) {
        // Display 20 characters in the array per line
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0) // There are 20 items from 0 to 19
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    }

    /** Count the occurrences of each letter with the countLetters method*/
    public static int[] countLetters(char[] chars) {
        // Declare and create an array of 26 int
        int[] counts = new int[26];

        // For each lowercase letter in the array, count it
        for (int i = 0; i < chars.length; i++)
            counts[chars[i] - 'a']++;

        return counts;
    }

    /** Display counts */
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0 )
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");

        }
    }
}
