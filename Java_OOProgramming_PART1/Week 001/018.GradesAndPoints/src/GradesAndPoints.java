
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {

        //Ask for "points" and then check and prints the correspondent grade

        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]:");
        int num = Integer.parseInt(reader.nextLine());

        System.out.print("Grade: ");
        if (num < 30) {
            System.out.println("failed");
        } else if (num < 35) {
            System.out.println(1);
        } else if (num < 40) {
            System.out.println(2);
        } else if (num < 45) {
            System.out.println(3);
        } else if (num < 50) {
            System.out.println(4);
        } else {
            System.out.println(5);
        }
    }
}