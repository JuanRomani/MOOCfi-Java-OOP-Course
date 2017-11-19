package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person person) {
        employees.add(person);
    }

    public void add(List<Person> persons) {
        Iterator<Person> personIterator = persons.iterator();

        while (personIterator.hasNext()) {
            Person personToAdd = personIterator.next();
            employees.add(personToAdd);
        }
    }

    public void print() {
        Iterator<Person> employeesIterator = employees.iterator();

        while (employeesIterator.hasNext()) {
            Person employee = employeesIterator.next();
            System.out.println(employee);
        }
    }

    public void print(Education education) {
        Iterator<Person> employeesIterator = employees.iterator();

        while (employeesIterator.hasNext()) {
            Person employee = employeesIterator.next();

            if (employee.getEducation().equals(education)) {
                System.out.println(employee);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> employeesIterator = employees.iterator();

        while (employeesIterator.hasNext()) {
            if (employeesIterator.next().getEducation().equals(education)) {
                employeesIterator.remove();
            }
        }
    }
}
