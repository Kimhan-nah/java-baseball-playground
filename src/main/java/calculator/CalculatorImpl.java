package calculator;

import java.util.Queue;

public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    @Override
    public int calculate(Queue<Integer> numbers, Queue<Character> operators) {
        if (numbers.isEmpty()) return 0;

        int result = numbers.poll();

        while (!numbers.isEmpty() && !operators.isEmpty()) {
            char operator = operators.poll();
            int number = numbers.poll();

            switch (operator) {
                case '+':
                    result = add(result, number);
                    break;
                case '-':
                    result = subtract(result, number);
                    break;
                case '*':
                    result = multiply(result, number);
                    break;
                case '/':
                    result = divide(result, number);
                    break;
            }
        }

        return result;
    }
}
