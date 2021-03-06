package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void test () {
        int result = SqMax.max(1,2,3,4);
        assertThat(result,is(4));
    }

    @Test
    public void max7 () {
        int result = SqMax.max(6,4,7,5);
        assertThat(result, is(7));
    }

    @Test
    public void max6 () {
        int result = SqMax.max(6,4,7,5);
        assertThat(result, is(6));
    }

    @Test
    public void max4 () {
        int result = SqMax.max(6,4,7,5);
        assertThat(result, is(4));
    }

    @Test
    public void max5 () {
        int result = SqMax.max(6,4,7,5);
        assertThat(result, is (5));
    }

    @Test
    public void max84 () {
        int result = SqMax.max(5,68,84,59);
        assertThat(result, is (84));
    }
}
