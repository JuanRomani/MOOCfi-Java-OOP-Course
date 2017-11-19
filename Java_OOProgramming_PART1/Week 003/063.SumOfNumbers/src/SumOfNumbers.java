import java.util.ArrayList;

public class SumOfNumbers {

    /*
        Create the method sum() to sum the items of the ArrayList given as a parameter
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The sum: " + sum(list));

        list.add(10);
        
        System.out.println("The sum: " + sum(list));
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

}