
import java.util.ArrayList;

public class AverageOfNumbers {

    /*
        Create the method average() to calculate the average of the items (ints) of the ArrayList
         given as a parameter. Use the sum() method from the previous exercise
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }

    public static int sum(ArrayList<Integer> list) {
        int i = 0;
        int sum = 0;

        while ((list.size() -1) >= i ) {
            sum += list.get(i);
            i++;
        }

        return sum;
    }


    public static double average(ArrayList<Integer> list) {
        double items = list.size();

        return sum(list) / items;
    }
}