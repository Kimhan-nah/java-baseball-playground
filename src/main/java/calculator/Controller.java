package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Controller {
    private final String[] tokens;
    private final Calculator calculator;
    private final Queue<Character> operators;
    private final Queue<Integer> numbers;

    public Controller(String[] tokens, Calculator calculator) {
        this.tokens = tokens;
        this.calculator = calculator;
        this.operators = new LinkedList<>();
        this.numbers = new LinkedList<>();
    }

    public void run() {
        // todo validation
        parse(tokens);
        int result = calculator.calculate(numbers, operators);
        System.out.println("result : " + result);
    }

    private void parse(String[] tokens) {
        for (int i = 0; i < tokens.length; ++i) {
            if (i % 2 == 0) {
                int number = Integer.parseInt(tokens[i]);
                numbers.offer(number);
                continue;
            }
            char operator = tokens[i].charAt(0);
            operators.offer(operator);
        }
    }

}
