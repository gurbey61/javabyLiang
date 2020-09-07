package ch_01;

public class Q_04 {
    public static void main(String[] args ){

        System.out.println("a        a^2         a^3");
        for(int i = 1; i < 5; i++){
            System.out.println(i + "        " + square(i) + "           " + cube(i));
        }
    }
    public static int square(int a){
        return a*a;
    }
    public static int cube(int a){
        return a*a*a;
    }
}
