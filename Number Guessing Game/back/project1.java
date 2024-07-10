package codecasa;
import java.util.*;
import java.util.Random;
public class project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random num = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int noOfRounds = 3;
        int level = 1;
        int totalAttempts = 1;
        int totalScore = 0;
        boolean roundCompleted = false;
        
        System.out.println("Welcome to the Number Guessing Game:D");
        System.out.println("How to play? => Enter a number within ranges 1 to 100. \nKeep Guessing until your number matches with the number chosen by the computer. \nYou will be given points according to the number of attempts you take to guess the right number. ");
        System.out.println("You have " + noOfRounds + " rounds. Let's begin!\n-------------------------------GOOD LUCK ;)------------------------------");

        while (noOfRounds > 0) {
            int generatedNumber = num.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int userGuess = 0;
            int attempts = 0; 
            System.out.println("\nLevel " + level + ": I've picked a number between " + lowerBound + " and " + upperBound + ".");

            while (userGuess != generatedNumber) {
                System.out.print("Enter your guess: ");
                userGuess = sc.nextInt();
                attempts++;
                totalAttempts++;

                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                    int score;
                    if (attempts == 10) {
                        score = 10;
                    } else if (attempts <= 9) {
                        score = 100 - ((attempts - 1) * 10);
                    } else {
                        score = 0; 
                    }
                    totalScore += score;
                    System.out.println("Your score for  level"+level+": " + score);
                } else if (userGuess < generatedNumber) {
                    System.out.println("Guess higher number.");
                } else {
                    System.out.println("Guess lower number.");
                }
            }

            noOfRounds--;
            level++;
            if (attempts == 10) { 
                roundCompleted = true;
            }
        }

        if (totalScore == 0 && !roundCompleted) {
            System.out.println("\nGame Over! You couldn't complete any round :(");
        } else {
            System.out.println("\nYAy U DiD iT");
            System.out.println("Total Score: " + totalScore + "\n||Average Attempts per round: " + (totalAttempts / 3.0)+"||");
        }
 

    }
    
}
