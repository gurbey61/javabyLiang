package ch_01;

public class Q_06 {
    public static void main(String[] args){
        // Basic Solution
        System.out.println(1+2+3+4+5+6+7+8+9);

        // A little bit Algebra
        int n=9;
        System.out.println((n * (n+1)) / 2);

        // Using for Loop
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
