
public class Player {

    private String name;
    private int goals = 0;

    public Player(String name){
        this.name = name;
    }

    public Player(String name, int goals){
        this.name = name;
        this.goals = goals;
    }

    public String getName(){
        return name;
    }

    public int goals(){
        return goals;
    }

    public String toString(){
        return "Player: " + getName() + ", goals: " + goals();
    }
}
