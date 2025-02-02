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

        while (!Validator.checkLength(used, length)) {
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

}
