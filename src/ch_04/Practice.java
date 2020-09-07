package ch_04;

public class Practice {
    public static void main(String[] args) {
//        System.out.println(Math.ceil(2.1));
//        System.out.println(Math.floor(-2.1));
//        System.out.println(Math.round(-2.6));
//        System.out.println(Math.max(2.5, 3));
//        System.out.println('\u03b1');
//        System.out.println('\u03b2');
//        System.out.println('\u03b3');
//        System.out.println('\u03b4');
//
//        char ch = 'a';
//        for(int i = 0; i < 150; i++){
//            System.out.print(++ch);
//        }
//        System.out.println("");
//        System.out.println("He said \"Java is fun\" \t \b \n \f \r \\ \" ");
//
//        char ch2 = (char)0XAB0041; // The lower 16 bits hex code 0041 is assigned to ch
//        System.out.println(ch2); // ch2 is character A
//
//        char ch3 = (char)65.25; // Decimal 65 is assigned to ch
//        System.out.println(ch3); // ch is character A
//
//        int i = (int)'A'; // The Unicode of character A is assigned to i
//        System.out.println(i); // i is 65
//
//        byte b = 'a';
//        int x = 'a';
//        // byte c = '\uFFF4'; // casting is incorrect, because the Unicode \uFFF4 cannot fit into a byte:
//        byte d = (byte)'\uFFF4';
//        System.out.println(d);
//
//        int i2 = '2' + '3'; // (int)'2' is 50 and (int)'3' is 51
//        System.out.println("i2 is " + i2); // i2 is 101
//        int j = 2 + 'a'; // (int)'a' is 97
//        System.out.println("j is " + j); // j is 99
//        System.out.println(j + " is the Unicode for character "
//                + (char)j); // 99 is the Unicode for character c
//        System.out.println("Chapter " + '2');
//
//        String string = "Ahmet";
//        System.out.println(string.length());
//        System.out.println(string.toUpperCase());
//        System.out.println("Welcome to Java".length());
//        System.out.println("".length());
//
//        for(i = 0; i < string.length(); i++){
//            System.out.println(string.charAt(i));
//        }
//        for(i = 0; i < string.length(); i++){
//            System.out.print(string.charAt(i));
//            System.out.print("    ");
//        }
//
//        System.out.println("\n");
//
//        int k = 1;
//        int l = 2;
//        System.out.println("k + l is " + k + l);
//        System.out.println("k + l is " + (k + l));
//
//        // String Comparison
//        String s1 = "A";
//        String s2 = "a";
//        System.out.println(s1.compareToIgnoreCase(s2));
//
//        System.out.println("Welcome to Java".indexOf('o', 5));
//        System.out.println("Welcome to Java".indexOf('J'));
//
//        // Conversion between String & Numbers
//        int intValue = Integer.parseInt("123");
//        double doubleValue = Double.parseDouble("123.45");
//        int number =123;
//        System.out.println(number);
//        String s = number + "";
//        System.out.println(s + "  " + s.length());

        double amount = 12618.98;
        int d = 123456;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        System.out.printf("Interest is $%4.2f and d is %6d",
                interest,d);
        System.out.println("");
        System.out.printf("Interest is $%-4.2f and d is %-6d",
                interest,d);
    }
}

