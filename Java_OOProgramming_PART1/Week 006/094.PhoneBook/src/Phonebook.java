import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> list;

    public Phonebook(){
        list = new ArrayList<Person>();
    }

    public void add(String name, String number){
        Person newPerson = new Person(name, number);
        list.add(newPerson);
    }

    public void printAll(){
        for (Person item : this.list){
            System.out.println(item);
        }
    }

    public String searchNumber(String name){
        for (Person item : list){
            if (item.getName().contains(name)){
               return item.getNumber();
            }
        }

        return "number not known";
    }

}
