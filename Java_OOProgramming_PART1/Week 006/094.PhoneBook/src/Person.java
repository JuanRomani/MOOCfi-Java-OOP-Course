public class Person {

    private String name;
    private String phone;

    public Person(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public Person(String personName){
        this.name = name;
        this.phone = "";
    }

    public String getName(){
        return name;
    }

    public String getNumber(){
        return phone;
    }

    public void changeNumber(String newNumber){
        phone = newNumber;
    }

    public String toString(){
        return name + " number: " + phone;
    }
}
