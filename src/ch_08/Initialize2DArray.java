package ch_08;

import java.util.Scanner;

public class Initialize2DArray {
    public static void main(String[] args) {
        // Ragged Array and its length
        int [][] raggedArray = {
                {1,2,3,4,5},
                {1,2,3,4},
                {1,2,3,},
                {1,2},
                {1}
        };
        System.out.println(raggedArray.length + " rows");
        for (int i = 0; i < raggedArray.length; i++) {
            System.out.println("Row " + (i + 1) + " has " + raggedArray[i].length + " column");
        }

        int [][] matrix = new int[3][3];
        /* Initializing arrays with input values. The following loop initializes the array with user
        input values */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        
        /* Printing arrays. To print a two-dimensional array, you have to print each element in the
        array using a loop like the following:*/
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();

        }

        /* Summing all elements. Use a variable named total to store the sum. Initially total is
        0. Add each element in the array to total using a loop like this:*/
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
        System.out.println("The total of all elements is " + total);

        /* Summing elements by column. For each column, use a variable named total to store
        its sum. Add each element in the column to total using a loop like this:
        Then compare the total in each row and determine the max*/
        int total2 = 0;
        int maxColumn = 0;
        int indexOfMaxColumn = 0;
        for (int column = 0; column < matrix[0].length; column++) {
            for (int row = 0; row < matrix.length; row++) {
                total2 += matrix[row][column];
            }
            System.out.println("Sum for column " + column + " is " + total2);
            if (total2 > maxColumn) {
                maxColumn = total2;
                indexOfMaxColumn = column;
            }
        }
        System.out.println("Column " + indexOfMaxColumn + " has the max total");

        /* Summing elements by row. For each row, use a variable named total3 to store
        its sum. Add each element in the row to total3 using a loop like this:
        Then compare the total in each row and determine the max */
        int total3 = 0;
        int maxRow = 0;
        int indexOfMaxRow = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                total3 += matrix[row][column];
            }
            System.out.println("Sum for row " + row + " is " + total3);
            if (total3 > maxRow) {
                maxRow = total3;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the max total");
    }
}
