
import java.util.Scanner;

public class LengthOfName {

    /* The program asks for a string, then prints the number of characters,
        using the calculateCharacters() method */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name:");
        String text = reader.nextLine();

        System.out.println("Number of characters: " + calculateCharacters(text));

    }
    

    public static int calculateCharacters(String text) {
        return text.length();
    }
    
}
