package ch_06;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a String
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for the hex number " + " '"
        + hex + "' " + " is " + hexToDecimal(hex.toUpperCase()));
    }
    // Method Definition
    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i); // Separates the hex digits
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    // Method Definition
    public static int hexCharToDecimal(char hexChar) {
        if (hexChar >= 'A' && hexChar <= 'F')
            return 10 + hexChar - 'A';
        else // hexChar is '0', '1', ... , or '9'
            return hexChar - '0';
    }
}
