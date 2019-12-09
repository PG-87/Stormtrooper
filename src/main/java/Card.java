public class Card implements Suits {

    private suits suitValue;
    private Rank cardRank;

    public Card (suits suits, Rank rank){
        suitValue = suits;
        cardRank = rank;
    }

    public Rank getRank() {
        return cardRank;
    }

    public int getValue() {
        String rank = cardRank.getValue();
        try{
           return Integer.parseInt(rank);
        } catch (Exception ex){
            if(rank.equals("e")){
                return 11;
            } else {
                return 10;
            }
        }
    }

    @Override
    public String toString() {
        return cardRank.toString() + " of " + suitValue;
    }
}

