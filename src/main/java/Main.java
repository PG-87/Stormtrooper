public class Main {
    public static void main(String[] args) throws InterruptedException {
        Model model = new Model();
        View view = new View();
        Deck deck = new Deck();
        Controller controller = new Controller(model, view, deck);
        controller.start();
    }
}
