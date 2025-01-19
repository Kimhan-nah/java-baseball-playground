package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] values = value.split(" ");

        Controller controller = new Controller();
        controller.parse(values);
        controller.run();
    }
}
