import java.util.Scanner;
public class Controller {
    Hand hand;
    Model model;
    View view;
    GameLogic gameLogic;
    private double money;  //player insats (pengar)
    Scanner scanner = new Scanner(System.in);

    public Controller(Hand hand, Model model, View view, GameLogic gameLogic) {
        this.hand = hand;
        this.model = model;
        this.view = view;
        this.gameLogic = gameLogic;
    }

    public void start(){
        view.printMenu();
        gameLogic.createStartHandPlayer();
        gameLogic.createStartHandComputer();
        view.printPlayerChoise();
        gameLogic.playComputer();
        view.printComputerResult();
        gameLogic.playPlayer();
        view.printResult();
        model.getDeck();

        double money;  //player insats (pengar)

//-------------------------------
        System.out.println("Welcome to Blackjack!");
        System.out.println("How much would you like to bet?");
        money = scanner.nextDouble();
        System.out.println("You have " + money + " Kr to bet");
//  System.out.println("Press ENTER to Start...");
        //START RUNDA*******
        model.dealerCards.add(model.deck.drawCard());
        model.playerCards.add(model.deck.drawCard());
        model.playerCards.add(model.deck.drawCard());

        public int sumOfDealerCards(){
            model.dealerCards.
                    //TODO SUMMERA DEALER OCH PLAYERS KORT!!!
        }

        //SKRIV UT DEALERS KORT OCH PLAYER KORT
        System.out.println("Dealer drog: " + model.dealerCards.get(0));
        System.out.println("Du drog: "+ model.playerCards.get(0) +  " & " + model.playerCards.get(1));
        System.out.println("Hit or Stay?");
        while (model.playerCards.)
        String playerChoice = scanner.nextLine();
        playerChoice.toLowerCase();
        int playerCards = 2;
        if(playerChoice.equals("hit"))
            model.playerCards.add(model.deck.drawCard());
            System.out.println("Du drog " + model.playerCards.get(playerCards));
            playerCards = + 1;
        else

//---------------------------------------
        while(true) {
            System.out.println("Your Hand:" + player.toString()); //visa  player kort
            System.out.println("You have " + player.cardsValue() + " in your hand."); //visa summan of 2 kort
            System.out.println("Computer Hand: " + computer.getCard(0).toString() + " and [hidden card]");  //visa  computer kort
            System.out.println(" To Hit enter (1) or Stand enter (2)");  //välja att stoppa ELLER TA NYTT KORT
            int val = scanner.nextInt();
            if (val == 1) {
                player.draw(deck);
                System.out.println("You draw a:" + player.getCard(player.deckSize() - 1).toString());
                if (player.cardsValue() > 21) {
                    System.out.println("you Currently valued at: " + player.cardsValue());
                    break;
                }
            }
            //Stanna
            if (val == 2) {
                break;
            }
        }
        System.out.println("Computer Cards:" + computer.toString());//visa computers hidden kort
//---------------------------------------
        if ((computer.cardsValue() > player.cardsValue()) ) {
            System.out.println("Computer beats you " + computer.cardsValue() + " to " + player.cardsValue());
        }
//Computer stanna at 17
        while ((computer.cardsValue() < 17) ) {
            computer.draw(deck);
            System.out.println("Computer draws: " + computer.getCard(computer.deckSize() - 1).toString());
        }
        System.out.println("Dealers hand value: " + computer.cardsValue());
//computer lost
        if ((computer.cardsValue() > 21)) {
            System.out.println("Computer is a loser. You win!");
        }
        if ((computer.cardsValue() == player.cardsValue()) ) {
            System.out.println("Ingen vann");
        }
        if ((player.cardsValue() > computer.cardsValue()) ) {
            System.out.println("You win the hand.");
        } else
        {
            System.out.println("Computer wins.");
        }
        player.moveAllToDeck(deck);
        computer.moveAllToDeck(deck);
        System.out.println("End of Hand.");
        System.out.println("Game over! You lost your money..");
        System.out.println("Game over! You lost your money..");
    }

    //---------------------------------------

}
