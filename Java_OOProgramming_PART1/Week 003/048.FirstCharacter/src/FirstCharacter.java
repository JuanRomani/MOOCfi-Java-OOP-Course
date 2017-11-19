import java.util.Scanner;

public class FirstCharacter {

    // The program asks for a string, then prints the first character using the firstCharacter() method

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name:");
        String text = reader.nextLine();

        System.out.println("First character: " + firstCharacter(text));
    }

    public static char firstCharacter(String text) {
        return text.charAt(0);
    }
}
