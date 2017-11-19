package farmsimulator;

import java.util.Collection;

public class Barn {

    private BulkTank tank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank tank){
        this.tank = tank;
    }

    public BulkTank getBulkTank(){
        return tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = new MilkingRobot();
        milkingRobot.setBulkTank(tank);
    }

    public void takeCareOf(Cow cow){
        if(milkingRobot == null){
            throw new IllegalStateException("The milking robot hasn't been installed");
        }

        milkingRobot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cow){
        if(milkingRobot == null){
            throw new IllegalStateException("The milking robot hasn't been installed");
        }

        for (Cow c : cow){
            milkingRobot.milk(c);
        }
    }

    public String toString(){
        return "Barn: " + Math.ceil(tank.getVolume()) + "/" + Math.ceil(tank.getCapacity());
    }
}
