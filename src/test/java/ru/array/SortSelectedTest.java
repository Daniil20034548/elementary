package ru.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }
    @Test
    public void whenSort3() {
        int[] data = new int[] {7, 5, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 5, 7};
        assertThat(result).containsExactly(expected);
    }
    @Test
    public void whenSort5() {
        int[] data = new int[] {11, 3, 5, 8, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 5, 8, 11};
        assertThat(result).containsExactly(expected);
    }
}
