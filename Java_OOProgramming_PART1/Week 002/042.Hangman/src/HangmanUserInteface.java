
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    /*
        Using the following methods:
            hangman.gameOn()
            Shows if the game is on

            hangman.printStatus()
            Prints the game status. Shows how many guesses have been made and the letters that have not been used yet.

            hangman.printWord()
            Prints the word the user tries to guess. The letters that have not been guessed yet are hidden as question
            marks, like "v?ri?ble".

            hangman.printMan()
            Prints the Hangman.

            hangman.guess(String letter)
            Guesses the letter that is given as a parameter.

        1. The program ask for the command to execute. Commands are listed by the method printMenu()
        2. Using "status" command, the program prints how many guesses the user have made and the yet unused letters
        3. If the user gives a single letter, a guess is made. The program tells if the letter is in the word to guess
        4. If the user does not give any input. the menu is printed
        5. If the user does not type the "quit" command, the method printMan() and printWord() are called
    */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");

        // Program your solution below

        while (hangman.gameOn()) {
            System.out.println("Type a command:");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;

            } else if (command.equals("status")) {
                hangman.printStatus();

            } else if (command.length() == 1) {
                hangman.guess(command);

            } else if (command.isEmpty()) {
                printMenu();

            }
            if (!(command.equals("quit"))){
                hangman.printMan();

            }

            hangman.printWord();
        }

        System.out.println("Thank you for playing!");
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
