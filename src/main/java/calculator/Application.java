package calculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 1. 사용자 입력
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. 초기화
        String[] tokens = input.split(" ");
        Calculator calculator = new CalculatorImpl();
        Controller controller = new Controller(tokens, calculator);

        // 3. run
        try {
            controller.run();
        } catch (Exception e) {
            System.err.println("Exception occurred: " + e);
            System.err.println("Exception message: " + e.getMessage());
        }
    }
}
