
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> deckOfCards;

    public void shuffleDeck(){
        Collections.shuffle(deckOfCards);
    }

    public void newDeck() {
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card("HEARTS", Rank.ranks.get(i));
            deckOfCards.add(card);
        }
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card("DIAMONDS", Rank.ranks.get(i));
            deckOfCards.add(card);
        }
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card("SPADES", Rank.ranks.get(i));
            deckOfCards.add(card);
        }
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card("CLUBS", Rank.ranks.get(i));
            deckOfCards.add(card);
        }
    }

}
