package ch_05;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a decimal integer
        System.out.println("Enter a decimal number: ");
        int decimal = input.nextInt();

        // Convert decimal to hex
        String hex = "";

        while (decimal != 0) {
            int hexValue = decimal % 16;
            System.out.println("decimal is " + decimal);
            System.out.println("hexValue is " + hexValue);

            // Convert a decimal value to a hex digit
            char hexDigit = (hexValue >= 0 && hexValue <= 9) ?
                    (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');
            System.out.println("hexDigit is " + hexDigit);

            hex = hexDigit + hex;
            System.out.println("hex is " + hex);
            decimal = decimal / 16;
            System.out.println("decimal is " + decimal);
        }
        System.out.println("The hex number is " + hex);
    }
}
