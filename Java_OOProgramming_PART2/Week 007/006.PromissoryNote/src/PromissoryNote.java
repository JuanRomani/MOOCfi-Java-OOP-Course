import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> list;

    public PromissoryNote(){
        list = new HashMap<>();
    }

    public void setLoan(String toWhom, double value){
        list.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose){
        if (list.containsKey(whose)){
            return list.get(whose);
        }

        return 0;
    }
}
