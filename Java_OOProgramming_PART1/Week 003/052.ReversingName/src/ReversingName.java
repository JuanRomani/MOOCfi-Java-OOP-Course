import java.util.Scanner;

public class ReversingName {

    // The program asks for a string and then prints it in reverse

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = reader.nextLine();

        System.out.print("In reverse order: ");

        int e = name.length() - 1; // Saves position of last character
        while (e >= 0) {
            System.out.print(name.charAt(e)); //Prints last character, position "e"
            e--; // Goes back to print each character
        }
    }
}
