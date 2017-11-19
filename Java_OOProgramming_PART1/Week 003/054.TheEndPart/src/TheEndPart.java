import java.util.Scanner;

public class TheEndPart {

    /*
        Like the previous exercise, the program asks for a string and the amount of characters to print,
         this time starting by the character in (length - amount)
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word:");
        String word = reader.nextLine();

        System.out.println("Length of the end part:");
        int lastPartLength = Integer.parseInt(reader.nextLine());

        int index = word.length() - lastPartLength;

        System.out.println("Result: " + word.substring(index));
    }
}
