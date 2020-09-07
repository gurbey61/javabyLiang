package ch_08;

import java.util.Random;

public class RandomShuffling {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        /* Initializing arrays with random values. The following loop initializes the array with
random values between 0 and 99:*/
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }

        // Printing the array.
        System.out.println("Before shuffling");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

    /* Random shuffling. To accomplish this, for each element matrix[i][j], randomly generate indices i1 and
    j1 and swap matrix[i][j] with matrix[i1][j1] */

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int x = (int) (Math.random() * matrix.length);
                int y = (int) (Math.random() * matrix[i].length);

        // Swap matrix[i][j] with matrix[i1][j1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[x][y];
                matrix[x][y] = temp;
            }
        }
        // Printing arrays.
        System.out.println("After the shuffling");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
