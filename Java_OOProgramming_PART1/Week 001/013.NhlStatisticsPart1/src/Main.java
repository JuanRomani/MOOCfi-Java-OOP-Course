
import nhlstats.NHLStatistics;

import static nhlstats.NHLStatistics.sortByPoints;

public class Main {

    public static void main(String[] args) {

        //Printing statistics by the given parameters, using a ready made component

        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        NHLStatistics.searchByPlayer("Sydney Crosby");

        NHLStatistics.teamStatistics("PHI");

        sortByPoints();
        NHLStatistics.teamStatistics("ANA");

    }
}
