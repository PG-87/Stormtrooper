
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> deckOfCards;

    public void shuffleDeck(){
        Collections.shuffle(deckOfCards);
    }
    public void addCard( Card card){
        deckOfCards.add(card);
    }


}
