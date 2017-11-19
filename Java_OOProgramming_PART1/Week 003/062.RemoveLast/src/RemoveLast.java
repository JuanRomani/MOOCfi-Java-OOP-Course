import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {

    /*
        Create the method removeLast to remove the last item of the ArrayList object given as a parameter
     */

    public static void main(String[] args) {
        ArrayList<String> persons = new ArrayList<>();
        persons.add("Pekka");
        persons.add("James");
        persons.add("Liz");
        persons.add("Brian");

        System.out.println("Persons:");
        System.out.println(persons);

        // Sort the persons
        Collections.sort(persons);

        // Remove the last
        removeLast(persons);

        System.out.println(persons);
    }

    public static void removeLast(ArrayList<String> list) {
        int index = list.size() - 1; // Last item index
        list.remove(index);
    }
}