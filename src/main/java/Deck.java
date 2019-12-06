
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> deckOfCards;

    public void shuffleDeck(){
        Collections.shuffle(deckOfCards);
    }
    public void newDeck(){
        for (int i = 1; i <= 10; i++) {
            Card card = new Card(HEARTS,i,i);
            deckOfCards.add(card);
        }
        deckOfCards.add(new Card(HEARTS,JACK, 10));
        deckOfCards.add(new Card(HEARTS,QUEEN, 10));
        deckOfCards.add(new Card(HEARTS,KING, 10));
        deckOfCards.add(new Card(HEARTS,ACE, 11));

    }
    public void returnCard(Card card){
        return card;
    }

}
