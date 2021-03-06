public class DecreasingCounter {
    private int value;
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + value);
    }

    public void decrease() {
        if (!(value <= 0)) {
            value--;
        }
    }

    public void reset(){
        value = 0;
    }

    public void setInitial(){
        value = initialValue;
    }
}
