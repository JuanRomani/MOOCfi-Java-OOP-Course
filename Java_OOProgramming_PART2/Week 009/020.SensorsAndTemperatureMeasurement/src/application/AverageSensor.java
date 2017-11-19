package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> averageSensor;
    private List<Integer> readings;

    public AverageSensor(){
        this.averageSensor = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor additional){
        averageSensor.add(additional);
    }

    public List<Integer> readings(){
        return readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : averageSensor){
            if (!sensor.isOn()){
                return false;
            }
        }

        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : this.averageSensor){
            if(!isOn()){
                sensor.on();
            }
        }
    }

    @Override
    public void off() {
        averageSensor.get(0).off();
    }

    @Override
    public int measure() {
        if (!averageSensor.isEmpty()){
            for (Sensor sensor : averageSensor){
                if (!sensor.isOn()){
                    throw new IllegalStateException("Failed");
                }
            }
        }

        int average = 0;
        int measure = 0;

        for (Sensor sensor : averageSensor){
            measure = sensor.measure();
            average += measure;
        }

        average = average / averageSensor.size();

        readings.add(average);

        return average;
    }
}
