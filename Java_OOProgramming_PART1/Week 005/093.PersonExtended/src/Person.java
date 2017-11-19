import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    // you get the current day as follows:
    private int todayDay = Calendar.getInstance().get(Calendar.DATE);
    private int todayMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
    private int todayYear = Calendar.getInstance().get(Calendar.YEAR);
    
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new MyDate(day, month, year);
    }

    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name){
        this.name = name;
        this.birthday = new MyDate(todayDay, todayMonth, todayYear);
    }

    public String getName() {
        return name;
    }
    
    public int age() {
        MyDate today = new MyDate(todayDay, todayMonth, todayYear);

        return today.differenceInYears(birthday);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        if(birthday.earlier(compared.birthday)){
            return true;
        }

        return false;
    }
    
    public String toString() {
        return name + ", born " + birthday;
    }
}
