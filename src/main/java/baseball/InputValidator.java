package baseball;

public class InputValidator extends Validator {
    public boolean checkInput(String input, int length) {
        boolean[] used = new boolean[10];

        // 문자열 길이 확인
        if (input.length() != length) {
            return false;
        }

        for (char ch : input.toCharArray()) {
            if (!Character.isDigit(ch)) return false;
            used[ch - '0'] = true;
        }

        // 사용중인 숫자 갯수 확인
        return checkLength(used, length);
    }
}
