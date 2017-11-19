package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Farm implements Alive{

    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn){
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<>();
    }

    public String getOwner(){
        return owner;
    }

    public void installMilkingRobot(MilkingRobot robot){
        barn.installMilkingRobot(robot);
    }

    public void addCow(Cow cow){
        cows.add(cow);

    }

    public void manageCows(){
        for (Cow c : cows){
            barn.takeCareOf(c);
        }
    }

    public void liveHour(){
        for (Cow c : cows){
            c.liveHour();
        }
    }

    public String toString(){
        String result = "Farm owner: " + getOwner() + "\nBarn bulk tank: "
                + Math.ceil(barn.getBulkTank().getVolume()) + "/" + barn.getBulkTank().getCapacity();

        if(!this.cows.isEmpty()){
            result += "\nAnimals:";
            for (Cow c : cows){
                result += "\n        " + c.toString();
            }
        } else {
            result += "\nNo cows.";
        }

        return result;
    }
}
