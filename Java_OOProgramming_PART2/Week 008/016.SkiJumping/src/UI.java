public class UI {

    private Competitor competitor;
    private CompetitorsList competitorsList;
    private Reader input;
    private int round = 1;

    public UI(Reader input){
        this.input = input;
        this.competitorsList = new CompetitorsList();
    }


    public void start(){
        System.out.println("Kumpula ski jumping week\n" +
                "\n" +
                "Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true){
            System.out.print("  Participant name: ");
            String userInput = input.readString();

            if (!(userInput.equals(""))){
                competitor = new Competitor(userInput);
                competitorsList.addCompetitor(competitor);
            } else {
                competitionPhase();
                break;
            }
        }
    }

    public void competitionPhase(){
        System.out.println("\nThe tournament begins!");

        while (true){
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            String userInput = input.readString();

            if(userInput.equals("jump")){

                System.out.println("\nRound " + round);

                System.out.println("\nJumping order:");
                jumpingOrder();

                competitorsList.makeJumps();

                System.out.println("\nResults of round " + round);
                showScoring();

            } else if (userInput.equals("quit")){
                System.out.println("\nThanks!\n\nTournament results:");
                showStandings();
                break;
            }
        }
    }

    public void jumpingOrder(){
        this.competitorsList.sortCompetitorsReverse();

        int i = 1;
        for (Competitor competitor : competitorsList.getCompetitorList()){
            System.out.println("  " + i + ". " + competitor);
            i++;
        }
    }

    public void showScoring(){
        for (Competitor competitor : competitorsList.getCompetitorList()){
            System.out.println("  " + competitor.getName() + "\n    length: " + competitor.getLastDistance() +
                    "\n    judge votes: " + competitor.getJudgeScores());
        }

        round++;
    }

    public void showStandings(){
        int i = 1;
        competitorsList.sortByScore();

        System.out.println("Position    Name");

        for (Competitor competitor : competitorsList.getCompetitorList()){
            String distances = "";

            System.out.println(i + "           " + competitor.getName() + " (" + competitor.getTotalScore() + " points)");
            System.out.print("            jump lengths: ");

            for (Integer distance : competitor.getDistances()){
                distances += distance + " m, ";
            }
            distances = distances.substring(0, distances.length() - 2);

            System.out.println(distances);
            i++;
        }
    }

}
