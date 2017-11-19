import java.util.Comparator;

public class TournamentStandings implements Comparator<Competitor> {

    public int compare(Competitor competitor1, Competitor competitor2){
        return competitor2.getTotalScore() - competitor1.getTotalScore();
    }
}
