import java.util.Comparator;

public class SortCompetitors implements Comparator<Competitor> {

    public int compare(Competitor competitor1, Competitor competitor2){
        return competitor1.getTotalScore() - competitor2.getTotalScore();
    }
}
