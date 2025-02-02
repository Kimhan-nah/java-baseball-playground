package baseball;

public class ResultView {
    public static void printHint(int strike, int ball) {
        if (strike == 0 && ball == 0) {
            System.out.println("nothing!!!");
        } else {
            System.out.println("strike : " + strike + ", ball : " + ball);
        }
    }

    public static void printSuccess() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
