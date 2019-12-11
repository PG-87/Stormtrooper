import java.util.List;
import java.util.Scanner;
public class Controller {
    Model model;
    Deck deck;
    int dealerHandValue;
    int playerHandValue;
    private double money;
    Scanner scanner = new Scanner(System.in);

    public Controller(Model model, Deck deck) {
        this.model = model;
        this.deck = deck;
    }

    public void start() throws InterruptedException {
        deck.newDeck();

        System.out.println("Welcome to Blackjack!");
        System.out.println("How much would you like to bet?");
        System.out.print("Place bet: ");
        money = scanner.nextDouble();
        System.out.println("You have " + money + " Kr to bet");

        model.dealerCards.add(deck.drawCard());
        model.playerCards.add(deck.drawCard());
        model.playerCards.add(deck.drawCard());

        System.out.println("Dealer drog: " + model.dealerCards.get(0));
        System.out.println("Du drog: " + model.playerCards.get(0) + " & " + model.playerCards.get(1));

        dealerHandValue = calculateTotal(model.getDealerCards(), model.getDealerCards().get(model.getDealerCards().size() - 1));
        System.out.println("Dealer: " + dealerHandValue);
        playerHandValue = calculateTotal(model.getPlayerCards(), model.getPlayerCards().get(model.getPlayerCards().size() - 1));

        System.out.println("Player: " + playerHandValue);

        if (playerHandValue == 21)
            System.out.println("PLAYER WINS!!!");
        else {
            while (playerHandValue < 21 ) {
                System.out.println("Hit or Stay?");
                String playerChoice = scanner.nextLine();
                playerChoice.toLowerCase();
                if (playerChoice.equals("hit")) {
                    model.playerCards.add(deck.drawCard());
                    playerHandValue = calculateTotal(model.getPlayerCards(), model.getPlayerCards().get(model.getPlayerCards().size() - 1));
                    System.out.println("Du drog " + model.playerCards.get(model.playerCards.size() - 1));
                    System.out.println("Player: " + playerHandValue);
                } else if (playerChoice.equals("stay")) {
                    System.out.println("You stayed!");
                    break;
                }
            }
            if (playerHandValue > 21)
                System.out.println("You busted!");
            else {
                while (dealerHandValue < 17) {
                    model.dealerCards.add(deck.drawCard());
                    dealerHandValue = calculateTotal(model.getDealerCards(), model.getDealerCards().get(model.getDealerCards().size() - 1));
                    System.out.println("Dealer drog: " + model.dealerCards.get(model.dealerCards.size() - 1));
                    System.out.println("Dealer: " + dealerHandValue);
                    Thread.sleep(500);
                }
            }
             if (playerHandValue > dealerHandValue && playerHandValue <= 21 || dealerHandValue >21)
                 System.out.println("YOU Won!");
             else
                 System.out.println("YOU Lost!");
            }
        }

    public int calculateTotal(List<Card> cardList, Card card) {
        int summa = 0;
        for (Card card1: cardList) {
            summa = summa + card1.getValue();
        }
        return checkAce(summa, cardList);
    }

    public int checkAce(int total, List<Card> cardList) {

        for (Card card: cardList             ) {
            if (card.getRank() == Rank.ESS)
                if(total >= 21){
                    total = total - 10;
                }
        }

        return total;
    }
}
