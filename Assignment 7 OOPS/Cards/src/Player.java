import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Player {
    private String name;
    private Queue<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new LinkedList<>();
    }

    public void receiveCards(List<Card> cards) {
        hand.addAll(cards);
    }

    public void sortHandByRank() {
        List<Card> sortedHand = new LinkedList<>(hand);
        for (int i = 0; i < sortedHand.size() - 1; i++) {
            for (int j = 0; j < sortedHand.size() - i - 1; j++) {
                if (getCardRankValue(sortedHand.get(j)) > getCardRankValue(sortedHand.get(j + 1))) {
                    // Swap cards
                    Card temp = sortedHand.get(j);
                    sortedHand.set(j, sortedHand.get(j + 1));
                    sortedHand.set(j + 1, temp);
                }
            }
        }
        hand = new LinkedList<>(sortedHand);
    }

    private int getCardRankValue(Card card) {
        String rank = card.getRank();
        switch (rank) {
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "Jack":
                return 11;
            case "Queen":
                return 12;
            case "King":
                return 13;
            case "Ace":
                return 14;
            default:
                return 0;
        }
    }

    public Queue<Card> getHand() {
        return hand;
    }

    @Override
    public String toString() {
        return name;
    }
}
