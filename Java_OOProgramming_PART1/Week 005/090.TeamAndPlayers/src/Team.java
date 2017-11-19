import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players;
    private int sizeLimit = 16;

    public Team(String name){
        this.name = name;
        players = = new ArrayList<Player>();
    }

    public String getName(){
        return name;
    }

    public void addPlayer(Player player){
        if(players.size() < sizeLimit){
            players.add(player);
        }
    }

    public void printPlayers(){
        String playersString = "";

        for (Player player : players){
            playersString += " " + player.toString() + "\n";
        }

        System.out.println(playersString);
    }

    public void setMaxSize(int maxSize){
        sizeLimit = maxSize;
    }

    public int size(){
        return players.size();
    }

    public int goals(){
        int goals = 0;

        for (Player player : players){
            goals += player.goals();
        }

        return goals;
    }
}
