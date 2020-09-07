package ch_18;

public class RecursivePalindrome {
    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    // Recursive helper method
    private static boolean isPalindrome(String s, int low, int high) {
        if (high <= low) // base case
            return true;
        else if (s.charAt(low) != s.charAt(high)) // Base case
            return false;
        else
            return isPalindrome(s, low + 1, high - 1);
    }
    public static void main(String[] args) {
        System.out.println("Is moon a palindrome? "
                + isPalindrome("moon"));
        System.out.println("Is noon a palindrome? "
                + isPalindrome("noon"));
        System.out.println("Is a a palindrome? "
                + isPalindrome("a"));
        System.out.println("Is aba a palindrome? "
                + isPalindrome("aba"));
        System.out.println("Is ab a palindrome? "
                + isPalindrome("ab"));
        System.out.println("Is 'ey edip adanada pide ye' a palindrome? " + isPalindrome("ey edip adanada pide ye"));
    }
}
