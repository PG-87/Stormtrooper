import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Hand hand = new Hand();
        Model model = new Model();
        View view = new View();
        GameLogic gameLogic = new GameLogic();
        Controller controller = new Controller(hand, model, view, gameLogic);
        controller.start();

        JFrame frame = new JFrame("JFrame Example W3ADDA");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
