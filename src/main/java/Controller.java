import java.util.Scanner;
public class Controller {
    Hand hand;
    Model model;
    View view;
    GameLogic gameLogic;
    private double money;  //player insats (pengar)

    public Controller(Hand hand, Model model, View view, GameLogic gameLogic) {
        this.hand = hand;
        this.model = model;
        this.view = view;
        this.gameLogic = gameLogic;
    }

    public void start(){
        view.printMenu();
        gameLogic.runGame();
//        gameLogic.createStartHandPlayer();
//        gameLogic.createStartHandComputer();
//        view.printPlayerChoise();
//        gameLogic.playComputer();
//        view.printComputerResult();
//        gameLogic.playPlayer();
//        view.printResult();


        double money;  //player insats (pengar)
        Scanner scanner = new Scanner(System.in);
        deck = new Deck();
        deck.newDeck(); // skapa full deck för att börja ny Game
        deck.shuffleDeck();         // blanda kortet
        Deck player = new Deck(); //player kort
        Deck computer = new Deck(); //computer kort
//-------------------------------
        System.out.println("Welcome to Blackjack!");
        System.out.println("How much would you like to bet?");
        money = scanner.nextDouble();
        System.out.println("You have " + money + " Kr to bet");
//  System.out.println("Press ENTER to Start...");
        player.draw(deck); // player ta 2 kort
        player.draw(deck);
        computer.draw(deck); // computer ta 2 kort
        computer.draw(deck);
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
