import java.util.Scanner;

public class FirstCharacters {

    // The program asks for a string and then prints the first 3 letters

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name:");
        String name = reader.nextLine();

        if (name.length() > 3) {
            System.out.println(firstThreeChars(name));
        }
    }

    public static String firstThreeChars(String string) {
        int e = 0;
        String result = "";

        while (e < 3) {
            result += e+1 + ". character: " + string.charAt(e) + "\n";
            e++;
        }

        return result;
    }
}
