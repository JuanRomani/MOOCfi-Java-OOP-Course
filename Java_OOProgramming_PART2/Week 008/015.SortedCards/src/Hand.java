import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand(){
        this.hand = new ArrayList<>();
    }

    public void add(Card card){
        hand.add(card);
    }

    public void print(){
        for (Card card : hand){
            System.out.println(card.toString());
        }
    }

    public int getSum(){
        int sum = 0;

        for (Card card : hand){
            sum += card.getValue();
        }

        return sum;
    }

    public void sort(){
        Collections.sort(hand);
    }

    public int compareTo(Hand hand){
        return this.getSum() - hand.getSum();
    }

    public void sortAgainstSuit(){
        Collections.sort(hand, new SortAgainstSuitAndValue());
        //this.hand.sort(new SortAgainstSuitAndValue());
    }

}
