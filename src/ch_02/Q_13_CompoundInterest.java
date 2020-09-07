package ch_02;

import java.util.Scanner;

public class Q_13_CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter monthly saving amount ");
        double saving = input.nextDouble();
        final double INTEREST_RATE = 0.00417;
        double accountValue = 0.0;


        // Account value after 1st month
        accountValue = saving *(1 + INTEREST_RATE);
        System.out.println("Account value after 1st month " + accountValue);

        // Account value after 2nd month
        accountValue = (accountValue + saving) *(1 + INTEREST_RATE);
        System.out.println("Account value after 2nd month " + accountValue);

        // Account value after 3rd month
        accountValue = (accountValue + saving) *(1+ INTEREST_RATE);
        System.out.println("Account value after 3rd month " + accountValue);

        // Account value after 4th month
        accountValue = (accountValue + saving) *(1+ INTEREST_RATE);
        System.out.println("Account value after 4th month " + accountValue);

        // Account value after 5th month
        accountValue = (accountValue + saving) *(1+ INTEREST_RATE);
        System.out.println("Account value after 5th month " + accountValue);

        // Account value after 6th month
        accountValue = (accountValue + saving) *(1+ INTEREST_RATE);
        System.out.println("Account value after 6th month " + accountValue);
    }
}
