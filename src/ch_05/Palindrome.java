package ch_05;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a String
        System.out.println("Enter a String to see if it is a Palindrome: ");
        String str = input.nextLine();

        // The index of the first character in the string
        int low = 0;

        // The index of the last character in the string
        int high = str.length() -1;

        boolean isPalindrome = true;
        while(low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome)
            System.out.println(str + " is a Palindrome ");
        else
            System.out.println(str + " is Not a Palindrome");
    }
}
