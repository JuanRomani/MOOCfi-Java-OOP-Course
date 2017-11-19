
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        //Hardcoded password check using while loop

        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here

        while (true) {
            System.out.println("Type the password:");

            String userPass = reader.nextLine();

            if (password.equals(userPass)) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("The secret is: I don't know");
    }
}
