package baseball;

import java.util.Scanner;

public class InputView {
    private static final String inputNumberPrompt = "숫자를 입력해 주세요 : ";
    private static final String inputRestartPrompt = "게임을 새로 시작하려면 " + GameStatus.IN_GAME.getCommand() + ", 종료하려면 " + GameStatus.GAME_OVER.getCommand() + "를 입력해주세요 : ";
    private static final Scanner scanner = new Scanner(System.in);

    public String readLine() {
        System.out.print(inputNumberPrompt);
        return scanner.nextLine();
    }

    public GameStatus readRestart() {
        System.out.print(inputRestartPrompt);
        String restart = scanner.nextLine();
        return GameStatus.findByCommand(restart);
    }
}
