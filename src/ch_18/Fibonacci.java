package ch_18;

public class Fibonacci {

        public static void main(String[] args)
        {
            p(5);
        }

        public static int p(int count)
        {
            if (count == 0)  // base case
            {
                return 0;
            }
            else
            {
                System.out.println("Hello World " +  p(count - 1));  // recurse
                return count;
            }
        }
    }

