package ch_08;

import java.util.Scanner;

public class Pass2DArray {
    public static void main(String[] args) {
        int [][] m = getArray(); // Fill the array with a method

        // Display the elements in the array

        display(m);

        // Display Sum of all elements

        System.out.println("Sum of all elements is " + sum(m));
    }
    public static int [][] getArray() {
        int[][] x = new int [3][4];

        // Fill with random values
        for (int row = 0; row < x.length; row++)
            for (int column = 0; column < x[row].length; column++)
                x[row][column] = (int) (Math.random() * 100);

        return x;
    }

    public static void display(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static int sum(int [][] array) {

        int total = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                total += array[row][column];
            }
        }
        return total;
    }
}
