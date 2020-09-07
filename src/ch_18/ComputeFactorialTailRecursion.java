package ch_18;

public class ComputeFactorialTailRecursion {
    // Return the factorial for a specified number
    public static long factorial(int n) { // Original method
        return factorial(n, 1); // Call auxiliary method
    }

    // Auxiliary tail-recursive method for factorial
    private static long factorial(int n, int result) {
        if (n == 0)
            return result;
        else
            return factorial(n - 1, n * result); // Recursive call
    }
}
