
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {

        //Asking for an age, then checking if has reached the age of majority

        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?");

        int ageM = 18;
        int age = Integer.parseInt(reader.nextLine());

        if (age < ageM) {
            System.out.println("You have not reached the age of majority yet!");
        } else {
            System.out.println("You have reached the age of majority!");
        }
    }
}
