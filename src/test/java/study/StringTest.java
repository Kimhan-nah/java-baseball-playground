package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @Test
    @DisplayName("\"(1,2)\".substring()으로 \"1,2\"를 반환하도록 한다.")
    void test3() {
        String given = "(1,2)";
        String substring = given.substring(1, given.length() - 1);
        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    @DisplayName("\"abc\".charAt(2)는 'c'를 반환한다.")
    void test4() {
        String given = "abc";
        char actual = given.charAt(2);
        assertThat(actual).isEqualTo('c');
    }

    @Test
    @DisplayName("\"abc\".chatAt(3)은 StringIndexOutOfBoundsException이 발생한다.")
    void test5() {
        assertThatThrownBy(() -> {
            "abc".charAt(3);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
