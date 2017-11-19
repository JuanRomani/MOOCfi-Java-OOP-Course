import java.util.ArrayList;

public class NumberOfItems {

    /*
        The program uses the method countItems to print the amount of items in the parameter ArrayList
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Moi");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items on the list:");

        System.out.println(countItems(list));
    }

    public static int countItems (ArrayList<String> list) {
        return list.size();
    }

}