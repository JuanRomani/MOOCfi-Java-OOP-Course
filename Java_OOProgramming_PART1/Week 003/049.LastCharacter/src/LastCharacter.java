import java.util.Scanner;


public class LastCharacter {

    // The program ask for a string, then prints the last character using the lastCharacter() method

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String text = reader.nextLine();

        System.out.println("Last character: " + lastCharacter(text));
    }

    public static char lastCharacter (String text) {
        return text.charAt(text.length() - 1);
        // "-1" because length starts at 1 but character positioning starts at 0
    }
}
