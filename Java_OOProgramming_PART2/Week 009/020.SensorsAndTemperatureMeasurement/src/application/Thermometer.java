package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private ConstantSensor constantSensor;
    private boolean state = false;

    public Thermometer(){
        this.constantSensor = new ConstantSensor(0);
    }

    public boolean isOn(){
        return state;
    }

    public void on(){
        state = true;
    }

    public void off(){
        state = false;
    }

    public int measure(){
        Random number = new Random();
        int measure;

        if (isOn()){
            measure = (number.nextInt(60) - 30);
        } else {
            throw new IllegalStateException("Error");
        }

        return measure;
    }
}
