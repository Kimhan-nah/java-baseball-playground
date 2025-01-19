package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Controller {
    private Queue<String> operators = new LinkedList<>();
    private Queue<Integer> numbers = new LinkedList<>();
    private Calculator calculator = new CalculatorImpl();

    void parse(String[] values) {
        for (int i = 0; i < values.length; ++i) {
            if (i % 2 == 0) {
                numbers.add(Integer.parseInt(values[i]));
            } else {
                operators.add(values[i]);
            }
        }
    }

    void run() {
        int result = numbers.poll();

        while (!numbers.isEmpty() && !operators.isEmpty()) {
            String operator = operators.poll();
            int number = numbers.poll();
            result = calculate(result, number, operator);
        }

        System.out.println(result);
    }

    int calculate(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return calculator.add(a, b);
            case "-":
                return calculator.subtract(a, b);
            case "*":
                return calculator.multiply(a, b);
            case "/":
                return calculator.divide(a, b);
        }
        return 0;
    }
}
