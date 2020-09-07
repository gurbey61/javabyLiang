package ch_01;

public class Q_13 {
    public static void main(String [] args){
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = .55;
        double e = 44.5;
        double f = 5.9;
        double x = 0.0;
        double y = 0.0;


        x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        System.out.println("The solution is " + x + " and " + y);
    }
}
