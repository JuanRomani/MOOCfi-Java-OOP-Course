public class Bird {

    private String name;
    private String latinName;
    private int timesWatched;

    public Bird(String name, String latinName, int timesWatched){
        this.name = name;
        this.latinName = latinName;
        this.timesWatched = timesWatched;
    }

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.timesWatched = 0;
    }

    public String getName(){
        return name;
    }

    public String getLatinName(){
        return latinName;
    }

    public int getTimesWatched(){
        return timesWatched;
    }

    public void setTimesWatched(){
        this.timesWatched++;
    }
}
