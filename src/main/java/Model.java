import java.util.ArrayList;
import java.util.List;

public class Model {
    List<Card> playerCards = new ArrayList<>();
    List<Card> dealerCards = new ArrayList<>();

    public Model() {
    }

    public void clearList(){
        playerCards.removeAll(playerCards);
        dealerCards.removeAll(dealerCards);
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



