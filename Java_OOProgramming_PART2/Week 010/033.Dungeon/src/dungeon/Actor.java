package dungeon;

public class Actor extends Point{

    private String actor;

    public Actor(int x, int y, String type){
        super(x, y);
        this.actor = type;
    }

    public String getPoint(){
        return this.actor;
    }

    public String toString(){
        return this.actor + " " + super.toString();
    }


}
