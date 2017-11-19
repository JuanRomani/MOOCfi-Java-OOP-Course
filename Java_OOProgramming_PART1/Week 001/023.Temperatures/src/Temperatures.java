
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        //Ask for temperatures, draw a graphic with the given values

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Insert an temperature:");
            double number = Double.parseDouble(reader.nextLine());

            if ((number < -30 || number > 40)){

            } else {
                Graph.addNumber(number);
            }

        }

        // Graph is used as follows:
        // Graph.addNumber(7);
        // double value = 13.5;
        // Graph.addNumber(value);
        // value = 3;
        // Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}