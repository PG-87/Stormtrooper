public class Main {
    public static void main(String[] args) throws InterruptedException {
        Model model = new Model();
        View view = new View();
        GameLogic gameLogic = new GameLogic();
        Controller controller = new Controller(model, view, gameLogic);
        controller.start();
    }
}
