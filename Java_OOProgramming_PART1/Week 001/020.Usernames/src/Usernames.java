
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {

        //Hardcoded user / password check

        Scanner reader = new Scanner(System.in);

        System.out.println("Type your username:");
        String user = reader.nextLine();

        System.out.println("Type your password:");
        String pass = reader.nextLine();

        String user1 = "alex";
        String pass1 = "mightyducks";

        String user2 = "emily";
        String pass2 = "cat";

        if ((user.equals(user1) && pass.equals(pass1)) || (user.equals(user2) && pass.equals(pass2))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
