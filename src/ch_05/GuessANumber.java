package ch_05;

import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args){
        // Generate a random number to be guessed
        int magicNumber = (int) (Math.random() * 101);

        // Crete a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the magic number between 0 and 100");

        int guess = -1;
        int numberOfGuess = 0; // To count the number of guess
        while (guess != magicNumber) {
            // Prompt the user to guess the magic number
            System.out.println("\nEnter your guess: ");
            guess = input.nextInt();
            numberOfGuess++;
            if(guess == magicNumber)
                System.out.println("Yes, the number is " + magicNumber + ". It took " + numberOfGuess + " steps");
            else if (guess > magicNumber)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        }
    }
}
