public class View {

    public void startMenu() {
        System.out.println("Welcome to Blackjack!");
    }

    public void bet(double saldo) {
        System.out.println("You have " + saldo + " in your pocket" + "\n" + "How much would you like to bet?");
    }

    public void setSaldo(double saldo) {
        System.out.println("You have " + saldo + " Kr to bet");
    }

    public void betPlaced(double money, double saldo) {
        System.out.println("\n" + "Bet placed for: " + money + "     You have: " + saldo + " left to play for." + "\n");
    }

    public void dealerDraw(Card card) {
        System.out.println("Dealer drew: " + card);
    }

    public void playerDraw(Card card, Card card2) {
        System.out.println("You drew: " + card + " & " + card2);
    }

    public void playerDraw(Card card) {
        System.out.println("You drew: " + card);
    }

    public void checkDealerScore(int i) {
        System.out.println("Dealer: " + i);
    }

    public void checkPlayerScore(int i) {
        System.out.println("Player: " + i);
    }

    public void hitOrStay() {
        System.out.println("Hit or stay");
    }

    public void playerChoice(String s) {
        System.out.println("You choose: " + s);
    }

    public void playerWin() {
        System.out.println("You won!" + "\n");
    }

    public void playerWin(double totalMoney, double priceMoney) {
        System.out.println("You won " + priceMoney + " Bananas! You have " + totalMoney + " on your accout" + "\n");
    }

    public void playerLose() {
        System.out.println("You lost!" + "\n");
    }
    public void playerBust() {
        System.out.println("You bust!");
    }
    public void playerEnterToLargeBet() {
        System.out.println("\n" + "You need to place a realistic bet!");
    }
    public void showSaldo(double saldo) {
        System.out.println("You have " + saldo + " in your pocket.");
    }
    public void gameOver() {
        System.out.println("Goddamn your out of bananas, go to your'e trailer, punk");
    }
    public void playerDraw() {
        System.out.println("Draw, you get your money back!");
    }
    public void playerBlackjack(){
        System.out.println("You got Blackjack!");
    }
}
