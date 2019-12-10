import java.util.List;
import java.util.Scanner;
public class Controller {
    Model model;
    View view;
    GameLogic gameLogic;
    int dealerHandValue;
    int playerHandValue;
    private double money;  //player insats (pengar)
    Scanner scanner = new Scanner(System.in);

    public Controller(Model model, View view, GameLogic gameLogic) {
        this.model = model;
        this.view = view;
        this.gameLogic = gameLogic;
    }

    public void start() throws InterruptedException {
//        view.printMenu();
//        gameLogic.createStartHandPlayer();
//        gameLogic.createStartHandComputer();
//        view.printPlayerChoise();
//        gameLogic.playComputer();
//        view.printComputerResult();
//        gameLogic.playPlayer();
//        view.printResult();
        model.getDeck();

        System.out.println("Welcome to Blackjack!");
        System.out.println("How much would you like to bet?");
        System.out.print("Place bet: ");
        money = scanner.nextDouble();
        System.out.println("You have " + money + " Kr to bet");
//  System.out.println("Press ENTER to Start...");
        //START RUNDA*******
        model.dealerCards.add(model.deck.drawCard());
        model.playerCards.add(model.deck.drawCard());
        model.playerCards.add(model.deck.drawCard());

        System.out.println("Dealer drog: " + model.dealerCards.get(0));
        System.out.println("Du drog: " + model.playerCards.get(0) + " & " + model.playerCards.get(1));

        dealerHandValue = calculateTotal(model.getDealerCards(), model.getDealerCards().get(model.getDealerCards().size() - 1));
        System.out.println("Dealer: " + dealerHandValue);
        playerHandValue = calculateTotal(model.getPlayerCards(), model.getPlayerCards().get(model.getPlayerCards().size() - 1));
        System.out.println("Player: " + playerHandValue);

        if (playerHandValue == 21)
            System.out.println("PLAYER WINS!!!");
        while (playerHandValue < 21)
            System.out.println("Hit or Stay?");
        String playerChoice = scanner.nextLine();
        playerChoice.toLowerCase();
        if (playerChoice.equals("hit")) {
            model.playerCards.add(model.deck.drawCard());
            System.out.println("Du drog " + model.playerCards.get(model.playerCards.size() - 1));
            System.out.println("Player: " + playerHandValue);
        } else if (playerChoice.equals("stay")) {
            while (dealerHandValue < 17)
                model.dealerCards.add(model.deck.drawCard());
            System.out.println("Dealer drog: " + model.dealerCards.get(model.playerCards.size() - 1));
            System.out.println("Dealer: " + dealerHandValue);
            Thread.sleep(100);
        }
    }
    public int calculateTotal(List<Card> cardList, Card card) {
        int summa = 0;
        for (Card card1: cardList) {
            summa = summa + card1.getValue();
        }
        return checkAce(summa, card);
    }

    public int checkAce(int total, Card card) {
        if (card.getRank() == Rank.ESS)
            if(total >= 21){
                total = total - 10;
            }
        return total;
    }
}
