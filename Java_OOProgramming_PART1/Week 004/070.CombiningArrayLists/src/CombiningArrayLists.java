
import java.util.ArrayList;
import java.util.Collections;

public class CombiningArrayLists {

    /*
        The program combines two ArrayLists in one using the combine() method
     */

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();

        Collections.addAll(list1, 4, 3, 9);

        Collections.addAll(list2, 5, 10, 7);

        combine(list1, list2);

        System.out.println(list1);
        System.out.println(list2);
    }

    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        first.addAll(second); // Adds all items from the second ArrayList to the first one
    }

}