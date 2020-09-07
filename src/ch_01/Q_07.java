package ch_01;

import javax.swing.*;
import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args){

        // Basic Solution
//        System.out.println(4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11));
//        System.out.println(4 * (1.0 - 1.0 / 3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13));
//        System.out.println(4 * (1.0 - 1.0 / 3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13 - 1.0/15));
//        System.out.println(4 * (1.0 - 1.0 / 3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13 - 1.0/15 + 1.0/17));

        // Using a variable for the common terms
        double v = 1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11;
        System.out.println(4 * v);
        System.out.println(4 * (v + 1.0 / 13));
        System.out.println(4 * (v + 1.0 / 13 - 1.0 / 15));
        System.out.println(4 * (v + 1.0 / 13 - 1.0 / 15 + 1.0 / 17));

        // Using more variables and some Math
        int aprx; // The bigger this is the better the approximation
        Scanner console = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Enter an integer up to 999999999");
        aprx = Integer.parseInt(console.nextLine());
        double n = 0.0;   // To hold number to subtract
        double m = 0.0;   // To hold numbers to add
        double sum = 0.0; // Summation
        for(int i = 1; i < aprx; i++){
            n += 1.0 / (4 * i - 1) ;
            m += 1.0 / (4 * i + 1);
        }
        sum += 1 - n + m;
        System.out.println("The pi is approximately "+ 4 * sum);
    }
}
