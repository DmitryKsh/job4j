package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas6Then1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {8, 22, 13};
        int value = 21;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas8Then1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {18, 0, 3};
        int value = 8;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas2Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {2, 3, 4,5,6};
        int value = 2;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
}
