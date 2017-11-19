package farmsimulator;

public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank(){
        this.capacity = 2000;
        this.volume = 0;
    }

    public BulkTank(double capacity){
        this.capacity = capacity;
        this.volume = 0;
    }

    public double getCapacity(){
        return capacity;
    }

    public double getVolume(){
        return volume;
    }

    public double howMuchFreeSpace(){
        if (capacity < 0){
            return 0;
        }

        return capacity - volume;
    }

    public void addToTank(double amount){
        if (amount < 0){
            return;
        }

        if (volume + amount < getCapacity()){
            volume += amount;
        } else {
            volume += howMuchFreeSpace();
        }
    }

    public double getFromTank(double amount){
        if(volume > amount){
            volume -= amount;
        } else {
            volume = 0;
        }
        return amount;
    }

    public String toString(){
        return Math.ceil(getVolume()) + "/" + Math.ceil(getCapacity());
    }
}
