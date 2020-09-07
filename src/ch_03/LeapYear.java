package ch_03;

import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args){
        // Create Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Display the result
        if(isLeapYear == true)
        System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }

}
