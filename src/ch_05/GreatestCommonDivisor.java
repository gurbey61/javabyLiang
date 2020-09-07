package ch_05;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter 2 integers
        System.out.println("Enter the first integer: ");
        int number1 = input.nextInt();
        System.out.println("Enter the second integer: ");
        int number2 = input.nextInt();

        int greatestCommonDivisor = 1; // Initial gcd
        int k = 2; // Possible gcd
        while(k <= number1 && k <= number2){
            if(number1 % k == 0 && number2 % k == 0)
                greatestCommonDivisor = k; // Update the gcd
            k++; // next possible gcd
        }
//        // Another solution
//        for (int k = 2; k <= number1 && k <= number2; k++) {
//            if (number1 % k == 0 && number2 % k == 0)
//                greatestCommonDivisor = k;
//        }

        System.out.println("The greatest common divisor of "
                + number1 + " and " + number2 + " is " + greatestCommonDivisor );
    }
}
