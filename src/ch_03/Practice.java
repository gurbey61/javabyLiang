package ch_03;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
            int number1 = (int)(System.currentTimeMillis() % 10);
            int number2 = (int)(System.currentTimeMillis() / 7 % 10);
            // Create a Scanner
            Scanner input = new Scanner(System.in);
            System.out.print("What is " + number1 + " + " + number2 + " =? ");
            int answer = input.nextInt();
            System.out.println(number1 + " + " + number2 + " = " + answer + " is " +
                            (number1 + number2 == answer));

//        boolean b = true;
//        int i = (int)b;
//        i = 1;
//        boolean b = (boolean)i;


        int number = 45;
        boolean even = number % 2 == 0;
        System.out.println(even);

        // Conditional Expressions and ternary Operator
        int x = 0;
        int y = (x > 0) ? 1 : -1;

        int max =0;
        System.out.println("Enter two integers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        max = (num1 > num2) ? num1 : num2;

        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        System.out.println((num % 2 == 0) ? "num is even" : "num is odd");
    }
}
