package baseball;

import java.util.Random;

public class RandomNumberGenerator {
    /**
     *
     * @param length 생성하려는 랜덤 숫자의 길이
     * @return 서로 다른 1~9 사이의 숫자로 구성된 랜덤 숫자
     */
    public static int generateWithLength(int length) {
        boolean[] used = new boolean[10];
        int randomNumber = 0;

        while (!checkLength(used, length)) {
            int number = generate();
            if (used[number]) continue;

            used[number] = true;
            randomNumber = randomNumber * 10 + number;
        }

        return randomNumber;
    }

    /**
     * @return 1~9 사이의 숫자를 생성
     */
    public static int generate() {
        long seed = System.currentTimeMillis();
        Random random = new Random(seed);
        return random.nextInt(9) + 1;
    }

    /**
     * 사용중인 숫자의 갯수를 확인한다.
     * @param used 사용중인 숫자에 대한 배열
     * @param length 사용중인 숫자의 목표 갯수
     * @return length 개의 숫자를 사용중일 경우, true를 반환한다.
     */
    private static boolean checkLength(boolean[] used, int length) {
        int count = 0;

        for (boolean isUsed : used) {
            if (isUsed) ++count;
        }
        return count == length;
    }

}
