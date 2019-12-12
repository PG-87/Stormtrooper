import java.util.List;
import java.util.Scanner;
public class Controller {
    Model model;
    Deck deck;
    View view = new View();
    int dealerHandValue;
    int playerHandValue;
    int money;
    int Saldo = 100;
    Scanner scanner = new Scanner(System.in);





    public Controller(Model model, Deck deck) {
        this.model = model;
        this.deck = deck;
    }

    public void start() throws InterruptedException {
        deck.newDeck();
        view.startMenu();

        while (Saldo > 0 ) {
            view.bet(Saldo);
            money = scanner.nextInt();
            scanner.nextLine();
            if(money <= Saldo && money >= 1) {
                Saldo = Saldo - money;
                view.betPlaced(money, Saldo);
                firstDraw();
                view.dealerDraw(model.dealerCards.get(0));
                view.playerDraw(model.playerCards.get(0), model.playerCards.get(1));
                calculateDealerScore();
                view.checkDealerScore(dealerHandValue);
                calculatePlayerScore();
                view.checkPlayerScore(playerHandValue);
                playTheGame();
            } else {
                view.playerEnterToLargeBet();
            }


        }
        System.out.println("Goddamn your out of bananas, go to your'e trailer, punk");

    }


    public void playTheGame()throws InterruptedException{

            if (playerHandValue == 21)
                view.playerWin();
            else {
                while (playerHandValue < 21) {
                    view.hitOrStay();
                    String playerChoice = scanner.nextLine();
                    playerChoice.toLowerCase();
                    if (playerChoice.equals("hit")) {
                        view.playerChoice(playerChoice);
                        model.playerCards.add(deck.drawCard());
                        calculatePlayerScore();
                        view.playerDraw(model.playerCards.get(model.playerCards.size() - 1));
                        view.checkPlayerScore(playerHandValue);
                    } else if (playerChoice.equals("stay")) {
                        view.playerChoice(playerChoice);
                        break;
                    }
                }

                if (playerHandValue > 21) {

                } else {
                    while (dealerHandValue < 17) {
                        model.dealerCards.add(deck.drawCard());
                        calculateDealerScore();
                        view.dealerDraw(model.dealerCards.get(model.dealerCards.size() - 1));
                        view.checkDealerScore(dealerHandValue);
                        Thread.sleep(1000);
                    }
                }
                if (playerHandValue > dealerHandValue && playerHandValue <= 21 || dealerHandValue > 21) {
                    Saldo = Saldo + (money * 2);
                    view.playerWin(Saldo, money * 2);
                } else {
                    view.playerLose();
                }
        }

       resetGame();

    }


    public void resetGame(){
        playerHandValue = 0;
        dealerHandValue = 0;
        model.getDealerCards().clear();
        model.getPlayerCards().clear();
        deck.newDeck();
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

    public void firstDraw() {
        model.dealerCards.add(deck.drawCard());
        model.playerCards.add(deck.drawCard());
        model.playerCards.add(deck.drawCard());
    }
    public void calculatePlayerScore(){
        playerHandValue = calculateTotal(model.getPlayerCards(), model.getPlayerCards().get(model.getPlayerCards().size() - 1));
    }
    public void calculateDealerScore(){
        dealerHandValue = calculateTotal(model.getDealerCards(), model.getDealerCards().get(model.getDealerCards().size() - 1));
    }

    public void setDealerHandValue(int dealerHandValue) {
        this.dealerHandValue = dealerHandValue;
    }

    public void setPlayerHandValue(int playerHandValue) {
        this.playerHandValue = playerHandValue;
    }

}
