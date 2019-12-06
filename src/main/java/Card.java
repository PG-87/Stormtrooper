public class Card implements Suits, Rank  {

    private Suits suitValue;
    private Rank cardRank;
    private int cardValue;

    public Card (Suits suit, Rank rank, int value){
        suitValue = suit;
        cardRank = rank;
        cardValue = value;

        }
    }

