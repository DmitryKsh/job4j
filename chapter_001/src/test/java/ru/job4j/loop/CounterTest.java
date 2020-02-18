package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class CounterTest {
    @Test
    public void counterTest () {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void counterTest2() {
        int rsl = Counter.sumByEven(20,40);
        assertThat(rsl, is(330));
    }
}
