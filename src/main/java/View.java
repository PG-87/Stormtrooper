public class View {

    public void startMenu(){
        System.out.println("Welcome to Blackjack!");
    }
    public void bet(){
        System.out.println("How much would you like to bet?");
        System.out.print("Place bet: ");
    }
    public void setSaldo(int Saldo){
        System.out.println("You have " + Saldo + " Kr to bet");
    }
    public void betPlaced(int money, int Saldo){
        System.out.println( "\n" + "Bet placed for: " + money + "     You have: " + Saldo + " left to play for." + "\n");
    }

    public void dealerDraw(Card card){
        System.out.println("Dealer drog: " + card);
    }
    public void playerDraw(Card card, Card card2){
        System.out.println("Du drog: " + card + " & " + card2);
    }
    public void playerDraw(Card card){
        System.out.println("Du drog: " + card);
    }
    public void checkDealerScore(int i){
        System.out.println("Dealer: " + i);
    }
    public void checkPlayerScore(int i){
        System.out.println("Player: " + i);
    }
    public void hitOrStay() {
        System.out.println("Hit or stay");
    }
    public void playerChoice(String s){
        System.out.println("You choosed: " + s);
    }
    public void playerWin(){
        System.out.println("You won!" + "\n");
    }
    public void playerLose(){
        System.out.println("You lost!" + "\n");
    }
    public void playerBust(){
        System.out.println("You bust!");
    }
}
