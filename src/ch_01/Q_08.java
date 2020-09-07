package ch_01;

import javax.swing.*;
import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args){

        double radius = 0.0; // hold the radius
        Scanner console = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"enter the radius"); // Asks for the radius
        radius = Double.parseDouble(console.nextLine());
        System.out.println("The perimeter of the circle is " + perimeter(radius)); // Calls the perimeter function and displays the result
        System.out.println("The area of the circle is "      + area(radius));      // Calls the area function and displays the result

    }
    public static double perimeter(double radius){
        return 2 * radius * Math.PI;
    }
    public static double area(double radius){
        return Math.pow(radius,2) * Math.PI;
    }
}
