import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Input object, i.e., it is allowed to call
        // new Input only once. If you need scanner in multiple places, you can pass it as parameter

        Grades grades = new Grades();
        System.out.println("Type exam scores, -1 completes: ");

        while(true){
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1){
                break;
            }

            grades.addScore(input);
        }

        grades.results();
    }
}


