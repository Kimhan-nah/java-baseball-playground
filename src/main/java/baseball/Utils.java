package baseball;

import java.util.Map;

public class Utils {
    public static void update(Map<Integer, Integer> used, String number) {
        int count = 0;

        for (char ch : number.toCharArray()) {
            used.put(ch - '0', ++count);
        }
    }
}
