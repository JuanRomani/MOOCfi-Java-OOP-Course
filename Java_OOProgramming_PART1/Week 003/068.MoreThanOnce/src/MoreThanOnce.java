import java.util.ArrayList;
import java.util.Scanner;

public class MoreThanOnce {

    /*
        Create the method moreThanOnce(ArrayList<Integer> list, int num) who checks if the given
         number appears more than once in the given ArrayList
     */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once. ");
        }
    }

    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        int e = 0;

        for (int num : list) {
            if (num == number) {
                e++;
            }
            if (e >= 2) {
                return true;
            }
        }

        return false;
    }
}