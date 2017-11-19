import java.util.ArrayList;
import java.util.List;

public class Competitor implements Comparable<Competitor> {

    private String name;
    private int totalScore = 0;
    private List<Integer> distances;
    private List<Integer> judgeScores;

    public Competitor(String name){
        this.name = name;
        this.distances = new ArrayList<>();
        this.judgeScores = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getTotalScore(){
        return totalScore;
    }

    public List<Integer> getDistances(){
        return distances;
    }

    public int getLastDistance(){
        return distances.get(distances.size() - 1);
    }


    public void addDistanceToList(Integer distance){
        distances.add(distance);
    }


    public void addJudgeScoreToList(Integer score){
        judgeScores.add(score);
    }

    public List<Integer> getJudgeScores(){
        return judgeScores;
    }

    public void clearJudgeScores(){
        judgeScores.clear();
    }

    public void sumTotalScore(Integer score){
        totalScore += score;
    }

    public String toString(){
        return name + " (" + getTotalScore() + " points)";
    }

    public int compareTo(Competitor competitor){
        return this.totalScore - competitor.totalScore;
    }

}
