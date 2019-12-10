
import java.util.Collections;
import java.util.List;

public class Deck {

    Model model;

    public void shuffleDeck() {
        Collections.shuffle(model.deckOfCards);
    }

    public Card drawCard(){
        Card card = model.deckOfCards.get(0);
        return card;
    }

    public void newDeck() {

        Rank rank = new Rank();
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card(Suits.suits.HEARTS, rank.getRanks().get(i));
            model.deckOfCards.add(card);
        }
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card(Suits.suits.DIAMONDS, rank.getRanks().get(i));
            model.deckOfCards.add(card);
        }
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card(Suits.suits.SPADES, rank.getRanks().get(i));
            model.deckOfCards.add(card);
        }
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card(Suits.suits.CLUBS, rank.getRanks().get(i));
            model.deckOfCards.add(card);
        }
        shuffleDeck();
    }
}
