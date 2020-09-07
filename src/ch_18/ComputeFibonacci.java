package ch_18;

import javax.swing.*;
import java.util.Scanner;

public class ComputeFibonacci {
    // Main Method
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter an index for a Fibonacci number: ");
//        int index = input.nextInt();
        int index = Integer.parseInt(JOptionPane.showInputDialog("Enter an index for a Fibonacci number:"));

        // Data Validation
        while(index < 0) {

            index = Integer.parseInt(JOptionPane.showInputDialog("Enter an index for a Fibonacci number: "));
        }


        // Find and display the Fibonacci number
        // System.out.println("The Fibonacci number at index " + index + " is " + fib(index));

        JOptionPane.showMessageDialog(null,"The Fibonacci number at index " + index + " is " + fib(index));

    }
    public static long fib(long index) {
        if (index == 0)  // Base case
            return 0;
     else if (index == 1) // Base case
            return 1;
         else             // Reduction and recursive calls
            return fib(index -1) + fib(index - 2);
    }
}
