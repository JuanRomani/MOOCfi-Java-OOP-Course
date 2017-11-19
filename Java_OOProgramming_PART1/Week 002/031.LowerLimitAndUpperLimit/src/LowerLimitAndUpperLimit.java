
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {

        // The program asks for two numbers and then prints every number between them
        // If the starting num is greater than the ending num, the program does nothing

        Scanner reader = new Scanner(System.in);

        System.out.println("First:");
        int fromNum = Integer.parseInt(reader.nextLine());

        System.out.println("Second:");
        int toNum = Integer.parseInt(reader.nextLine());

        while (fromNum <= toNum) {
            System.out.println(fromNum);
            fromNum++;
        }

    }
}
