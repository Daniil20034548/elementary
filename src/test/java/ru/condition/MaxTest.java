package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To5Then5() {
        int left = 3;
        int right = 5;
        int result = Max.max(right, left);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(right, left);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5And10Then10() {
        int expected = 10;
        int result = Max.max(5, 5, 10);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5And10And30Then30() {
        int expected = 30;
        int result = Max.max(5, 5, 10, 30);
        assertThat(result).isEqualTo(expected);
    }
}
