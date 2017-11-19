package containers;

public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory containerHistory;

    public ProductContainerRecorder(String name, double capacity, double initialVolume){
        super(name, capacity);
        super.addToTheContainer(initialVolume);
        this.containerHistory = new ContainerHistory();
        this.containerHistory.add(initialVolume);
    }

    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        this.containerHistory.add(this.getVolume());
    }

    public double takeFromTheContainer(double amount){
        double vol = this.getVolume();
        super.takeFromTheContainer(amount);
        this.containerHistory.add(this.getVolume());
        return vol - this.getVolume();
    }

    public void printAnalysis(){
        System.out.println("Product: " + super.getName() + "\n" +
            "History: " + history() + "\n" +
            "Greatest product amount: " + containerHistory.maxValue() + "\n" +
            "Smallest product amount: " + containerHistory.minValue() + "\n" +
            "Average: " + containerHistory.average() + "\n" +
            "Greatest change: " + containerHistory.greatestFluctuation() + "\n" +
            "Variance: " + containerHistory.variance());
    }

    public String history(){
        return "" + containerHistory;
    }

}
