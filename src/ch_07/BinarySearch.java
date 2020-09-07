package ch_07;

import java.util.Arrays;

/* Linear search is useful for finding an element in a small array or an unsorted array, but
it is inefficient for large arrays. Binary search is more efficient, but it requires that the
array be presorted.*/
public class BinarySearch {

    public static void main(String[] args) {
        // Declare and create the array list. The list must be PreSorted
        int[] list = new int[]{5, 7, 4, 10, 14, 45, 50, 60, 11, 69, 66, 79, 70};
        System.out.println("List before the sorting");

        // Display the whole list before sorting
        System.out.println(Arrays.toString(list));

        // Next line
        System.out.println();

        // Use the selectionSort method to sort the list array
        SelectionSort.selectionSort(list);

        // Display the whole list after sorting
        System.out.println("List after sorting");
        System.out.println(Arrays.toString(list));

        // Next line
        System.out.println();

        // Call the binarySearch method and display the index number
        System.out.println("The index number of the key in the list is "
                + binarySearch(list, 11));
    }
    /** Use Binary search to find the key in the list */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high > low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid -1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1; // Now high < low, key not found
    }
}
