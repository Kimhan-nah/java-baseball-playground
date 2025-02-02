package baseball;

import java.util.Scanner;

public class InputView {
    private static final String inputNumberPrompt = "숫자를 입력해 주세요 : ";

    public String readLine() {
        System.out.print(inputNumberPrompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
