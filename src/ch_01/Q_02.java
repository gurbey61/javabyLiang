package ch_01;

public class Q_02 {
    public static void main(String[] args){

        // Basic Solution
        System.out.println("Basic Solution");
        System.out.println("1 Welcome to Java");
        System.out.println("2 Welcome to Java");
        System.out.println("3 Welcome to Java");
        System.out.println("4 Welcome to Java");
        System.out.println("5 Welcome to Java\n");

        // Using for loop
        System.out.println("Using for loop");
        for(int i = 1; i < 6; i++){
            System.out.println(i + " Welcome to Java");
        }
        // Calling Recursive method
        System.out.println("\n");
        System.out.println("Using recursive method");
        welcome(1);

    }
    // Using Recursive method
    public static void welcome(int n){
        if(n < 6){
            System.out.println(n + " Welcome to Java");
            welcome(n + 1);
        }


    }
}
