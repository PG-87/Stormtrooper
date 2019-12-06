import java.util.Arrays;
import java.util.List;

public class Rank {

    private String name;
    private String value;

    public final static Rank ESS = new Rank("ESS", "e");
    public final static Rank TWO = new Rank("TWO", "2");
    public final static Rank THREE = new Rank("THREE", "3");
    public final static Rank FOUR = new Rank("FOUR", "4");
    public final static Rank FIVE = new Rank("FIVE", "5");
    public final static Rank SIX = new Rank("SIX", "6");
    public final static Rank SEVEN = new Rank("SEVEN", "7");
    public final static Rank EIGHT = new Rank("EIGHT", "8");
    public final static Rank NINE = new Rank("NINE", "9");
    public final static Rank TEN = new Rank("TEN", "10");
    public final static Rank JACK = new Rank("JACK", "j");
    public final static Rank QUEEN = new Rank("QUEEN", "q");
    public final static Rank KING = new Rank("KING", "k");

    public final static List<Rank> ranks = Arrays.asList(ESS, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING);

    private Rank (String nameValue, String cardValue){
        name = nameValue;
        value = cardValue;
    }

    public String getValue() {
        return value;
    }
}
