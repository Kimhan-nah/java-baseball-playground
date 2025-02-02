package baseball;

public class ResultView {
    public static void printHint(int strike, int ball) {
        if (strike == 0 && ball == 0) {
            System.out.println("nothing!!!");
        } else {
            System.out.println("strike : " + strike + ", ball : " + ball);
        }
    }
}
