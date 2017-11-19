
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {

        //NHL statistics printer, using UI and loops for asking commands

        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                NHLStatistics.sortByPoints(); // Print the top ten players sorted by points.
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                NHLStatistics.sortByGoals(); // Print the top ten players sorted by goals.
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                NHLStatistics.sortByAssists(); //  Print the top ten players sorted by assists.
                NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                NHLStatistics.sortByPenalties(); //  Print the top ten players sorted by penalties.
                NHLStatistics.top(10);
            } else if (command.equals("player")) {
                System.out.println("Insert player name:");
                String plyr = reader.nextLine();
                NHLStatistics.searchByPlayer(plyr);// Ask the user first which player's statistics are needed and then print them.
            } else if (command.equals("club")) {
                System.out.println("Insert club name:");
                NHLStatistics.sortByPoints();
                String club = reader.nextLine();
                NHLStatistics.teamStatistics(club);
                // Ask the user first which club's statistics are needed and then print them.
                // Note: When printing statistics they should be ordered by points (so the players with the most points come first).
            }

        }
    }
}
