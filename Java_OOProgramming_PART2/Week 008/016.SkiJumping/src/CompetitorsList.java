import java.util.ArrayList;
import java.util.List;

public class CompetitorsList {

    private List<Competitor> competitorList;
    private Jump jump;

    public CompetitorsList(){
        this.competitorList = new ArrayList<>();
    }

    public void addCompetitor(Competitor competitor){
        competitorList.add(competitor);
    }

    public void sortCompetitorsReverse(){
        SortCompetitors pointsSorter = new SortCompetitors();

        competitorList.sort(pointsSorter);
    }

    public void sortByScore(){
        TournamentStandings standings = new TournamentStandings();

        competitorList.sort(standings);
    }

    public List<Competitor> getCompetitorList(){
        return competitorList;
    }

    public void makeJumps(){
        for (Competitor competitor : competitorList){
            jump = new Jump(competitor);
            jump.distance();
            jump.judgeScores();
            jump.jumpScore();
        }
    }

}
