
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> deckOfCards;

    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }

    public Card drawCard(){
        Card card = deckOfCards.get(0);
        deckOfCards.remove(0);
        return card;
    }

    public void newDeck() {
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card(Suits.suits.HEARTS, Rank.ranks.get(i));
            deckOfCards.add(card);
        }
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card(Suits.suits.DIAMONDS, Rank.ranks.get(i));
            deckOfCards.add(card);
        }
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card(Suits.suits.SPADES, Rank.ranks.get(i));
            deckOfCards.add(card);
        }
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card(Suits.suits.CLUBS, Rank.ranks.get(i));
            deckOfCards.add(card);
        }
        shuffleDeck();
    }
}
