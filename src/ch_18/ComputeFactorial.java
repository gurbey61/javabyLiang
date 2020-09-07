package ch_18;

import javax.swing.*;
import java.util.Scanner;

public class ComputeFactorial {
    public static void main(String[] args) {

        // int n = 0;
        // System.out.println("Enter a non-negative integer: ");
        // n = input.nextInt();

        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a non-negative integer: "));

        // Data Validation
        while(n < 0) {

            n = Integer.parseInt(JOptionPane.showInputDialog("Enter a non-negative integer: "));

           // System.out.println("Enter a nonnegative integer: ");
           // n = input.nextInt();
        }

        // Display Factorial
        JOptionPane.showMessageDialog(null,"Factorial of " + n + " is " + factorial(n));
        //System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    // Return the factorial for the specified number
    public static long factorial(int n) {
        if (n == 0) { // Base case
            return 1;
        }else {
            return n * factorial(n - 1); // Recursive call
        }
    }
}
