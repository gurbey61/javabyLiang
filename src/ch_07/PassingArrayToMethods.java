package ch_07;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        printArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        // Returning an Array from a Method
        int[] list1 = {1, 2, 3, 4, 5, 6};
        int[] list2 = reverse(list1);
        for (int i: list2) {
            System.out.print(i);
        }
    }
    // Displaying an array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        for (int i = 1; i < array.length; i++) {
            System.out.println(array[i]);
        }

        /* For an argument of an array type, the value of the argument is a reference to an array;
this reference value is passed to the method. Semantically, it can be best described as
pass-by-sharing, that is, the array in the method is the same as the array being passed.
Thus, if you change the array in the method, you will see the change outside the method*/
        /* Arrays are objects in Java. The JVM stores the objects in an area of memory called the heap,
which is used for dynamic memory allocation. */

        int x = 1;
        int[] y = new int[10];
        System.out.println("Before invoking the method ");
        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);

        m(x, y);
        System.out.println("After invoking the method");
        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);
    }

    public static void m(int number, int[] numbers) {
        number = 1001;
        numbers[0] = 6666;
    }

    // Returning an Array from a Method

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length-1; i < list.length; i++, j--) { // Be careful with the setup here
            result[j] = list[i];
        }
        return result;
    }
}
