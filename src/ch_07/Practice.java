package ch_07;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        double[] myList = new double[3]; // Creating the array

        // Initializing arrays with input values
        Scanner input = new Scanner(System.in);

        // Initializing arrays with input values
//        System.out.println("Enter " + myList.length + " double values: ");
//        for (int i = 0; i < myList.length; i++) {
//            myList[i] = input.nextDouble();
//        }
        // Displaying the array
        System.out.println("Displaying default values: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " - ");
        }
        System.out.println();
        // Initializing arrays with random values
        System.out.println("Displaying random values: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }
        // Displaying array
        for (int i = 0; i < myList.length; i++) {
            System.out.printf("%4.2f - ", myList[i]);
        }
        System.out.println();
        // For an array of the char[] type, it can be printed using one print statement. For example,
        //the following code displays Dallas
        System.out.println("The char values");
        char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
        System.out.println(city);

        // Summing all elements
        System.out.print("The sum: ");
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.printf("%4.2f\n", total);

        // Find the largest element
        double max = myList[0];
        for (int i = 0; i < myList.length; i++){
            if (myList[i] > max) max = myList[i];
        }
        System.out.printf("The max is %4.2f\n", max);

        // Finding the smallest index of the largest element
        System.out.println("Finding the smallest index of the largest element");
        double[] myList2 = {1, 5, 3, 4, 5, 5};
        double max2 = myList2[0];
        int indexOfMax = 0;
        for (int i = 0; i < myList2.length; i++) {
            if (myList2[i] > max2) {
                max2 = myList2[i];
                indexOfMax = i;
            }
        }
        System.out.printf("The largest is %4.2f\nIndex of it is %d\n", max2, indexOfMax);

        // Random shuffling
        System.out.println("Before the shuffling");
        for (int i = 0; i < myList.length; i++) {
            System.out.printf(" %4.2f ", myList[i]);
        }
        System.out.println();
        for (int i = myList.length - 1; i > 0; i--) {
// Generate an index j randomly with 0 <= j <= i
            int j = (int)(Math.random()
                    * (i + 1));
// Swap myList[i] with myList[j]
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }
        System.out.println("After the shuffling");
        for (int i = 0; i < myList.length; i++) {
            System.out.printf(" %4.2f", myList[i]);
        }
        System.out.println();

        // Shifting elements
        double temp = myList[0]; // Retain the first element
// Shift elements left
        for (int i = 1; i < myList.length; i++) {
            myList[i - 1] = myList[i];
        }
// Move the first element to fill in the last position
        myList[myList.length - 1] = temp;

        System.out.println("Display after left shift");
        for (int i = 0; i < myList.length; i++) {
            System.out.printf(" %4.2f", myList[i]);
        }
        System.out.println();

        // Foreach Loops
        System.out.println("Using foreach loop to display last array ");
        for (double e: myList) {
            System.out.printf(" %4.2f", e);
        }
        System.out.println();

        // Simplifying code
        String[] months = {"January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December"};
        System.out.print("Enter a month number (1 to 12): ");
        int monthNumber = input.nextInt();
        System.out.println("The month is " + months[monthNumber - 1]);

        // Array class methods

        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        java.util.Arrays.sort(numbers); // Sort the whole array
        java.util.Arrays.parallelSort(numbers); // Sort the whole array

        /* Invoking sort(numbers) sorts the whole array numbers. Invoking sort(chars, 1, 3)
        sorts a partial array from chars[1] to chars[3-1]. parallelSort is more efficient if
        your computer has multiple processors.*/
        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        java.util.Arrays.sort(chars, 1, 3); // Sort part of the array
        java.util.Arrays.parallelSort(chars, 1, 3); // Sort part of the array

        /* You can use the binarySearch method to search for a key in an array. The array must be presorted
        in increasing order. If the key is not in the array, the method returns –(insertionIndex + 1).
        For example, the following code searches the keys in an array of integers and an array of characters.*/
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("1. Index is " +
                java.util.Arrays.binarySearch(list, 11));
        System.out.println("2. Index is " +
                java.util.Arrays.binarySearch(list, 12));
        char[] chars2 = {'a', 'c', 'g', 'x', 'y', 'z'};
        System.out.println("3. Index is " +
                java.util.Arrays.binarySearch(chars2, 'a'));
        System.out.println("4. Index is " +
                java.util.Arrays.binarySearch(chars2, 't'));


        /* You can use the equals method to check whether two arrays are strictly equal. Two arrays
        are strictly equal if their corresponding elements are the same. In the following code, list1
        and list2 are equal, but list2 and list3 are not.*/
        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 10};
        int[] list3 = {4, 2, 7, 10};
        System.out.println(java.util.Arrays.equals(list1, list2)); // true
        System.out.println(java.util.Arrays.equals(list2, list3)); // false
    }
}
