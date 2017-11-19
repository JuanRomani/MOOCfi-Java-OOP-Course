
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {

        //Asking for the radius of a circle, then calculating the circumference

        Scanner reader = new Scanner(System.in);

        System.out.println("Type the radius:");
        int radius = Integer.parseInt(reader.nextLine());

        double circumference = 2 * Math.PI * radius;

        System.out.println("Circumference of the circle:" + circumference);
    }
}
