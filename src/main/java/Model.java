import java.util.Arrays;
import java.util.List;

public class Model {
    Deck deck;
    List<Card> deckOfCards;
    List<Card> playerCards;
    List<Card> dealerCards;

    public Model() {
        deck = new Deck();
        deck.newDeck();
    }

    public Deck getDeck() {
        return deck;
    }

    public List<Card> getPlayerCards() {
        return playerCards;
    }
    public void setPlayerCards(List<Card> playerCards) {
        this.playerCards = playerCards;
    }
    public List<Card> getDealerCards() {
        return dealerCards;
    }
    public void setDealerCards(List<Card> dealerCards) {
        this.dealerCards = dealerCards;
    }
}
