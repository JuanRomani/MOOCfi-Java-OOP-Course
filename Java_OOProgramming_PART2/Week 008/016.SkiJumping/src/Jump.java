import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Jump {

    private Competitor competitor;

    public Jump(Competitor competitor){
        this.competitor = competitor;
    }

    public void distance(){
        Random num = new Random();
        int distance = num.nextInt(60) + 60;

        competitor.addDistanceToList(distance);
    }

    public void judgeScores(){
        competitor.clearJudgeScores();

        while(competitor.getJudgeScores().size() < 5){
            Random num = new Random();

            int score = num.nextInt(10) + 10;

            competitor.addJudgeScoreToList(score);
        }

        Collections.sort(competitor.getJudgeScores());
    }


    public void jumpScore(){
        List<Integer> scores = new ArrayList<>();

        for (Integer score : competitor.getJudgeScores()){
            scores.add(score);
        }

        scores.remove(0);
        scores.remove(scores.size() - 1);

        int totalScoreSum = competitor.getLastDistance();

        for (Integer score : scores){
            totalScoreSum += score;
        }

        competitor.sumTotalScore(totalScoreSum);
    }

}
