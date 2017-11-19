import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {

    /*
        The program adds the items from one ArrayList into another, but only if the later does not
         contain the same item already
     */

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        smartCombine(list1, list2);

        System.out.println(list1);
        System.out.println(list2);
    }

    public static void smartCombine (ArrayList<Integer> list1, ArrayList<Integer> list2){
        for (int item : list2) {
            if (!(list1.contains(item))){ // Check if List does not contain the item
                list1.add(item);
            }
        }
    }

}
