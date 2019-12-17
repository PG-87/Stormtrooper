import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    Model model;

    public Deck() {
        newDeck();
    }

    public void shuffleDeck(List<Card> lista) {
        Collections.shuffle(lista);
    }

    public Card drawCard(){
        Card card = model.deckOfCards.get(0);
        model.deckOfCards.remove(0);
        return card;
    }

    public void newDeck() {
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card(Suits.suits.HEARTS, Rank.ranks.get(i));
            model.deckOfCards.add(card);
        }
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card(Suits.suits.DIAMONDS, Rank.ranks.get(i));
            model.deckOfCards.add(card);
        }
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card(Suits.suits.SPADES, Rank.ranks.get(i));
            model.deckOfCards.add(card);
        }
        for (int i = 0; i < Rank.ranks.size(); i++) {
            Card card = new Card(Suits.suits.CLUBS, Rank.ranks.get(i));
            model.deckOfCards.add(card);
        }
        shuffleDeck(model.deckOfCards);
    }
}
