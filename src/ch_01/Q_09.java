package ch_01;

import javax.swing.*;

import java.awt.HeadlessException;
import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args){

        double width = 0.0; // hold the width
        double length = 0.0; // hold the length
        try (Scanner console = new Scanner(System.in)) {
            JOptionPane.showMessageDialog(null,"enter the width"); // Asks for the width
            width = Double.parseDouble(console.nextLine());
            JOptionPane.showMessageDialog(null,"enter the length"); // Asks for the length
            length = Double.parseDouble(console.nextLine());
        } catch (HeadlessException | NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("The perimeter of the rectangle is " + perimeter(width,length)); // Calls the perimeter function and displays the result
        System.out.println("The area of the rectangle is " + area(width,length));      // Calls the area function and displays the result

    }
    public static double perimeter(double width, double length){
        return 2 * (width + length);
    }
    public static double area(double width, double length){
        return width * length;
    }
}
