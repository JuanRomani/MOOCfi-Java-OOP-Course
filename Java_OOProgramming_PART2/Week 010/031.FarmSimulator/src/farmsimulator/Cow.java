package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive{

    private String name;
    private double uddersCapacity;
    private double milkAmount;
    private Random random = new Random();
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow(){
        this.name = NAMES[this.random.nextInt(NAMES.length)];
        uddersCapacity = 15 + ( 40 - 15 ) * random.nextDouble();
    }

    public Cow(String name){
        this.name = name;
        uddersCapacity = 15 + ( 40 - 15 ) * random.nextDouble();
    }

    public String getName(){
        return name;
    }

    public double getCapacity(){
        return uddersCapacity;
    }

    public double getAmount(){
        return milkAmount;
    }

    public double milk(){
        if (milkAmount > 0){
            double milk = getAmount();
            milkAmount = 0;

            return milk;
        }

        return 0;
    }

    public void liveHour(){
        double generatedMilk = 0.7 + ( 2 - 0.7) * random.nextDouble();

        if(generatedMilk + getAmount() < getCapacity()){
            milkAmount += generatedMilk;
        } else {
            milkAmount = getCapacity();
        }


    }

    public String toString(){
        return getName() + " " + Math.ceil(getAmount()) + "/" + Math.ceil(getCapacity());
    }
}
