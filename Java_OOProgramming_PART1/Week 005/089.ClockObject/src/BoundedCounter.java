
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78
    private int limit;
    private int value = 0;

    public BoundedCounter(int upperLimit){
        this.limit = upperLimit;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int valueMain){
        if(valueMain >= 0 && valueMain <= limit){
            value = valueMain;
        } else {
            value = 0;
        }
    }

    public void next(){
        value++;
        if (value > limit){
            value = 0;
        }
    }


    public String toString(){
        if(value < 10){
            return "0" + value;
        } else {
            return "" + value;
        }
    }


}
