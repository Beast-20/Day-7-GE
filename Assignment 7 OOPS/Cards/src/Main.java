import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Player player3 = new Player("Player 3");
        Player player4 = new Player("Player 4");

        for (int i = 0; i < 9; i++) {
            player1.receiveCards(deck.dealCards(1));
            player2.receiveCards(deck.dealCards(1));
            player3.receiveCards(deck.dealCards(1));
            player4.receiveCards(deck.dealCards(1));
        }

        player1.sortHandByRank();
        player2.sortHandByRank();
        player3.sortHandByRank();
        player4.sortHandByRank();

        printPlayerAndCards(player1);
        printPlayerAndCards(player2);
        printPlayerAndCards(player3);
        printPlayerAndCards(player4);
    }

    private static void printPlayerAndCards(Player player) {
        System.out.println(player + "'s cards:");
        Queue<Card> hand = player.getHand();
        for (Card card : hand) {
            System.out.println("\t" + card);
        }
        System.out.println();
    }
}
