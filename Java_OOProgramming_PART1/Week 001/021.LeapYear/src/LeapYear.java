
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        //Asks for a year and then check if it is leap or not
        // Leap = Divisible by 4 or by 400

        Scanner reader = new Scanner(System.in);

        System.out.println("Type a year:");
        int year = Integer.parseInt(reader.nextLine());

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0 ))) {
            System.out.println("The year is a leap year");
        }
        else {
            System.out.println("The year is not a leap year");
        }
    }
}
