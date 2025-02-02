package baseball;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        int generate = RandomNumberGenerator.generateWithLength(3);
        System.out.println("generate number : " + generate);        // todo delete
        String answer = Integer.toString(generate);
        Map<Integer, Integer> answerUsed = new HashMap<>();
        Utils.update(answerUsed, answer);
        Game game = new Game(answer, answerUsed);
        InputView inputView = new InputView();

        GameStatus gameStatus = GameStatus.IN_GAME;

        while (gameStatus.isProgress()) {
            game.start();
            ResultView.printSuccess();
            gameStatus = inputView.readRestart();
        }
    }

}
