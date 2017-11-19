public class Reformatory {

    private int counter = 0;

    public int weight(Person person) {
        counter++;
        return person.getWeight();
    }

    public void feed(Person person){
        int weight = person.getWeight() + 1;
        person.setWeight(weight);
    }

    public int totalWeightsMeasured(){
        return counter;
    }
}
