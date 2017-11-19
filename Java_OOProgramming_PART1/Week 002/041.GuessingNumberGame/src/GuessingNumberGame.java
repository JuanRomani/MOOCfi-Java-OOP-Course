
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    /*
       1. Make the program generates a random number (drawNumber()) and then ask for a number
            print if the given number is greater, lesser or equal to the random number
       2. Make the program ask for a number until the user number is equal to the random number
       3. Make the program count the amount of guesses made by the user
    */


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numberDrawn = drawNumber();

        int sum = 1;

        while (true) {
            System.out.println("Guess a number:");
            int usr = Integer.parseInt(reader.nextLine());
            if (numberDrawn > usr) {
                System.out.println("The number is greater, guesses made: " + sum);
                sum++;
            } else if (numberDrawn < usr){
                System.out.println("The number is lesser, guesses made: " + sum);
                sum++;
            } else {
                break;
            }
        }

        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
