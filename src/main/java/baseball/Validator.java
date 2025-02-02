package baseball;

public class Validator {
    /**
     * 사용중인 숫자의 갯수를 확인한다.
     * @param used 사용중인 숫자에 대한 배열
     * @param length 사용중인 숫자의 목표 갯수
     * @return length 개의 숫자를 사용중일 경우, true를 반환한다.
     */
    public static boolean checkLength(boolean[] used, int length) {
        int count = 0;

        for (boolean isUsed : used) {
            if (isUsed) ++count;
        }
        return count == length;
    }
}
