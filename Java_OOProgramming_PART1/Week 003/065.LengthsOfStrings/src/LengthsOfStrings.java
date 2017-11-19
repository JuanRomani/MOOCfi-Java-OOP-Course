import java.util.ArrayList;

public class LengthsOfStrings {

    /*
        Create the method lengths() to add to an ArrayList the lengths of the strings on another
         ArrayList given as a parameter. Then print the contents of the former.
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Ciao");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");

        ArrayList<Integer> lengths = lengths(list);
        
        System.out.println("The lengths of the Strings: " + lengths);
    }

    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengthList = new ArrayList<>();

        int i = 0;
        while ((list.size() - 1 >= i)) {
            String item = list.get(i);
            lengthList.add(item.length());
            i++;
        }

        return lengthList;
    }
}