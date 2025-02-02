package baseball;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private String answer;
    private Map<Integer, Integer> answerUsed;

    public Game(String answer, Map<Integer, Integer> answerUsed) {
        this.answer = answer;
        this.answerUsed = answerUsed;
    }

    public void start() {
        InputValidator inputValidator = new InputValidator();
        InputView inputView = new InputView();
        String input = null;

        while (!isAnswer(input)) {
            input = inputView.readLine();
            if (!inputValidator.checkInput(input, 3)) {
                System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
                continue;
            }
            hint(input);
        }
    }

    private  boolean isAnswer(String compare) {
        return answer.equals(compare);
    }

    private void hint(String compare) {
        // 사용한 숫자, 숫자의 자리
        Map<Integer, Integer> compareUsed = new HashMap<>();
        Utils.update(compareUsed, compare);

        // compare
        int strike = 0;
        int ball = 0;

        for (Map.Entry<Integer, Integer> entry : answerUsed.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (compareUsed.containsKey(key)) {
                if (compareUsed.get(key) == value) {
                    ++strike;
                }  else {
                    ++ball;
                }
            }
        }
        ResultView.printHint(strike, ball);
    }
}
