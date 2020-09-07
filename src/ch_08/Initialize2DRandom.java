package ch_08;

public class Initialize2DRandom {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        /* Initializing arrays with random values. The following loop initializes the array with
random values between 0 and 99:*/
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random() * 100);
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
        System.out.println(total);

        /* Summing elements by column. For each column, use a variable named total2 to store
its sum. Add each element in the column to total using a loop like this:*/
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
        its sum. Add each element in the row to total using a loop like this: */
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