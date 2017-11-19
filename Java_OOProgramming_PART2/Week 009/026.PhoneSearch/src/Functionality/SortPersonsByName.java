package Functionality;

import java.util.Comparator;

public class SortPersonsByName implements Comparator<PersonData> {

    public int compare(PersonData person1, PersonData person2){
        return person1.getPersonName().compareTo(person2.getPersonName());
    }
}
