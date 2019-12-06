public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand = new Hand();
        Model model = new Model();
        View view = new View();


        Controller controller = new Controller(deck, hand, model, view);

        controller.start();






    }
}
