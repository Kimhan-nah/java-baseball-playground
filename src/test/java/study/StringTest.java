package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("\"1,2\".split(\",\")는 [\"1\", \"2\"]를 반환한다.")
    void test1() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1");
        assertThat(actual).contains("2");
        assertThat(actual).containsExactly("1", "2");
    }

    @Test
    @DisplayName("\"1\".split(\",\")는 [\"1\"]을 반환한다.")
    void test2() {
        String[] actual = "1".split(",");
        assertThat(actual).containsExactly("1");
    }
}
