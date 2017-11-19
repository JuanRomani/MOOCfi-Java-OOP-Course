import java.util.ArrayList;

public class TheGreatest {

    /*
        Create the greatest(ArrayList<Integrer>) method, who returns the greatest
         item on the ArrayList given as a parameter
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }

    public static int greatest(ArrayList<Integer> list) {
        int max = list.get(0);

        for (int item : list) {
            if (item >= max) {
                max = item;
            }
        }

        return max;
    }
}