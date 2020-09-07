package ch_05;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
//        int sum1= 0;
//        for (int i = 0; i < 10; ++i) {
//            sum1 += i;
//        }
//        System.out.println(sum1);
//        int sum2 = 0;
//        for (int i = 0; i < 10; i++) {
//            sum2 += i;
//        }
//        System.out.println(sum2);

//        for (int i = 0; i < 10000; i++)
//            for (int j = 0; j < 10000; j++)
//                for (int k = 0; k < 10000; k++){
//                    System.out.println(i+j+k);
//                }

//        // Practicing Break
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter an integer up to 100");
//        int n = input.nextInt();
//        int factor = 2;
//        while (factor <= n) {
//            if (n % factor == 0)
//                break;
//            factor++;
//        }
//        System.out.println("The smallest factor other than 1 for "
//                + n + " is " + factor);
//
//        // Same code without Break
//        boolean found = false;
//        int factor2 = 2;
//        while (factor2 <= n && !found) {
//            if (n % factor2 == 0)
//                found = true;
//            else
//                factor2++;
//        }
//        System.out.println("The smallest factor other than 1 for "
//                + n + " is " + factor2);
//        // More creative version
//        int factor3 = 2;
//        while (factor3 <= n && n % factor3 != 0)
//            factor3++;

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (i % 3 == 0) continue;
            sum += i;
        }
        System.out.println(sum);

        // Wrong conversion
//        int i = 0, sum = 0;
//        while (i < 4) {
//            if (i % 3 == 0) continue;
//            sum += i;
//            i++;
//        }
//        System.out.println(sum);
    }
}
