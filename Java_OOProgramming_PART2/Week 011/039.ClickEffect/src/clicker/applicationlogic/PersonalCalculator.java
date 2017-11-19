package clicker.applicationlogic;

public class PersonalCalculator implements Calculator {

    private int value;

    public PersonalCalculator(){
        value = 0;
    }

    @Override
    public int giveValue() {
        if (value <= 0){
            return 0;
        }

        return value;
    }

    @Override
    public void increase() {
        value++;
    }
}
