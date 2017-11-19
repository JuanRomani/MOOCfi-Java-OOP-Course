package containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory(){
        this.history = new ArrayList<>();
    }

    public void add(double situation){
        history.add(situation);
    }

    public void reset(){
        history.clear();
    }

    public double maxValue(){
        double kek = 0;

        for(double val : history){
            kek = Math.max(kek, val);
        }

        return kek;
    }

    public double minValue(){
        double kek = maxValue();

        for(double val : history){
            kek = Math.min(kek, val);
        }

        return kek;
    }

    public double average(){
        double avg = 0;

        for (double val : history){
            avg += val;
        }

        avg = avg / history.size();

        return avg;
    }

    public double greatestFluctuation(){
        if(history.isEmpty() || history.size() == 1){
            return 0;
        }

        double flag1 = 0;
        double flag2 = 0;
        double ref = 0;
        double fluctuation = 0;

        for(int i = 0; i < history.size() - 1; i++) {
            flag1 = history.get(i);
            flag2 = history.get(i + 1);

            ref = flag1 - flag2;
            ref = Math.abs(ref);

            if(ref >= fluctuation){
                fluctuation = ref;
            }
        }

        return fluctuation;
    }

    public double variance(){
        double flag = 0;

        for (double val : history){
            flag += Math.pow(val-average(), 2);
            System.out.println(flag);
        }

        return flag / (history.size() - 1);

    }

    public String toString(){
        return "" + this.history;
    }
}
