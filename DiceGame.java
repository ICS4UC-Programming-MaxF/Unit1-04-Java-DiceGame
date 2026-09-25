/* 
* The game will generate a random number between 1 and 6. 
* It will then ask the user to guess the number and 
* will keep track of the number of guesses until the user gets the right answer. 
* If the guess is wrong, the program will tell the user if the guess was too high or too low.
* It will then tell the user how many guesses it took to get the right answer.
* @author  MF-ROB
* @version 1.0
* @since   2026-24-09
*/

import java.util.Scanner;
import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        // Generates a random number from 1 to 6
        int secret = random.nextInt(6) + 1; 
        int guess = 0;
        int guessCount = 0; // Tracks the number of guesses

        System.out.println("Hello User! Welcome to the Dice Game.");
        System.out.println("The program will repeat until you guess correctly.");

        do {
            System.out.print("\nPlease enter a number between 1 and 6: ");

            // Validate if user input is an integer before reading
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Clear the invalid input from the buffer
                continue;  // Restart the loop prompt
            }

            guess = sc.nextInt(); // Read the user's guess INSIDE the loop
            guessCount++;     // Increment the guess counter

            // Gusssing calculations
            if (guess < secret) {
                System.out.println("You guessed too low!");
            } else if (guess > secret) {
                System.out.println("You guessed too high!");
            } else {
                System.out.println("You guessed right! YAY!");
                System.out.println("It took you " + guessCount + " guesses.");
            }
            
        } while (guess != secret);

        sc.close(); // Closed properly outside the loop
    }
}