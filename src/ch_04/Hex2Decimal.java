package ch_04;

import java.util.Scanner;

public class Hex2Decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();
//        // Check if the hex string has exactly one character
//        if (hexString.length() != 1) {
//        System.out.println("You must enter exactly one character");
//        System.exit(1);
//        }
        // Getting Characters from a String
        for(int i = 0; i < hexString.length(); i++){
         char chi = hexString.charAt(i);
            if (chi <= 'F' && chi >= 'A') {
                int value = chi - 'A' + 10;
                System.out.println("The decimal value for hex digit "
                        + chi + " is " + value);
            }
            else if (Character.isDigit(chi)) {
                System.out.println("The decimal value for hex digit "
                        + chi + " is " + chi);
            }
            else {
                System.out.println(chi + " is an invalid input");
            }
        }
    }
}
