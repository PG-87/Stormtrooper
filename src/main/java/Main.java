public class Main {
    public static void main(String[] args) throws InterruptedException {
        Model model = new Model();
        Deck deck = new Deck();
        Controller controller = new Controller(model, deck);
        controller.start();
    }
}
