/*
 *  DO TOT TOUCH THIS CLASS!
 */

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void becomeOlder() {
        age++;
    }

    public boolean adult() {
        if (age < 18) {
            return false;
        }

        return true;
    }

    public double weightIndex() {
        double heightInMeters = height / 100.0;

        return weight / (heightInMeters * heightInMeters);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " I am " + age + " years old, my weight index is " + weightIndex();
    }
}
