package ch_02;

import java.util.Scanner;

public class Q_6_SumTheDigits {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        // Basic solution
        System.out.println("Enter an integer between 0 and 1000");
        int number1 = input.nextInt();
        // Extract the digits
        int digit1 = number1 % 10;
        // Remove the extracted digit
        number1 /= 10;
        int digit2 = number1 % 10;
        number1 /= 10;
        int sum1 = 0;
        System.out.println(sum1 = digit1 + digit2 + number1);

        // Using for loop
        System.out.println("Enter an integer ");
        int number2 = input.nextInt();
        int sum2 = 0;
        for(int i = 0; i < 100; i++){     // The Limit can be adjusted now
            // Extract the digits
            int digit = number2 % 10;
            // Remove the extracted digit
            number2 /= 10;
            // Add the digits to Sum
            sum2 += digit;
        }
        System.out.println(sum2);
    }
}
