package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] values = value.split(" ");

        Queue<String> operators = new LinkedList<>();
        Queue<Integer> numbers = new LinkedList<>();
        Calculator calculator = new CalculatorImpl();
        Controller controller = new Controller(operators, numbers, calculator);

        controller.parse(values);
        controller.run();
    }
}
