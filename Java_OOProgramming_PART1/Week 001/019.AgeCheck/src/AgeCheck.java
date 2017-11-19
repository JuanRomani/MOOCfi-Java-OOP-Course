
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {

        //Ask for user's age and then check if it is inside a realistic age-span

        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.parseInt(reader.nextLine());

        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
