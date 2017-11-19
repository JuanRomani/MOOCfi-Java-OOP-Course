package application;

public class ConstantSensor implements Sensor {

    private int measure = 0;

    public ConstantSensor(int measure){
        this.measure = measure;
    }

    public boolean isOn(){
        return this.measure > 0;
    }

    public void on(){
        // this.state = 1;
    }

    public void off(){
        // this.state = 0;
    }

    public int measure(){
        return measure;
    }
}
