
import java.util.Scanner;

public class ManyPrints {

    // Thr program asks the user how many times the text should be printed

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("How many?");
        int num = Integer.parseInt(reader.nextLine());

        int flg = 0;

        while (num > flg) {
            printText();
            flg++;
        }

    }
}