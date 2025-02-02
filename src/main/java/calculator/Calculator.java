package calculator;

import java.util.Queue;

public interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
    int divide(int a, int b);
    int calculate(Queue<Integer> numbers, Queue<Character> operators);
}
