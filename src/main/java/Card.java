public class Card {

    private String suitValue;
    private Rank cardRank;

    public Card (String suit, Rank rank){
        suitValue = suit;
        cardRank = rank;
    }
 //testetsts
    public Rank getRank() {
        return cardRank;
    }

    public int getValue() {
        String rank = cardRank.getValue();
        try{
           return Integer.parseInt(rank);
        } catch (Exception ex){
            if(rank.equals("a")){
                return 11;
            } else {
                return 10;
            }
        }
    }
}

