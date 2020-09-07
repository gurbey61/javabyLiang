package ch_02;

public class Practice {
    public static void main(String[] args){
        float x;
        long y = 2147483648L;
        // long y = 2147483648; Compile Error
        x = 56 % 6;
        System.out.println(x);
        x = 78 % -4;
        System.out.println(x);
        x = -34 % 5;
        System.out.println(x);
        x = -34 % -5;
        System.out.println(x);
        x = 5 % 1;
        System.out.println(x);
        x = 1 % 5;
        System.out.println(x);
        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);
        System.out.println("25 / 4 is " + 25 / 4);
        System.out.println("25 / 4.0 is " + 25 / 4.0);
        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
        System.out.println(0B1111); // Displays 15
        System.out.println(07777); // Displays 4095
        System.out.println(0XFFFF); // Displays 65535
        long ssn = 232_45_4519;
        long creditCardNumber = 2324_4545_4519_3415L;
        float z = 39F;
        double a = 6.5;
        a += a + 1;
        System.out.println(a);
        int i = 5;
        int k = ++i + i; // Do not do this
        System.out.println(k);
        System.out.println(i);
        System.out.println((int)1.7);
        System.out.println((double)1 / 2);
        System.out.println(1 / 2);
        int sum = 0;
        sum += 4.5; // sum becomes 4 after this statement
        System.out.println("Sum is " + sum);
        // sum += 4.5 is equivalent to sum = (int)(sum + 4.5).

        // Integer Overflow
        int value = 2147483647 + 1; // value will actually be -2147483648
        // Be careful with unintended integer Division
        int number1 = 1;
        int number2 = 2;
        double average1 = (number1 + number2) / 2;
        System.out.println(average1);
        double average2 = (number1 + number2) / 2.0;
        System.out.println(average2);


    }
}
