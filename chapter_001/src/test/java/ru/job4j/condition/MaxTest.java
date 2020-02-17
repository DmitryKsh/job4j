package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void when2MaxThen1() {
        int result = Max.max(1,2);
        assertThat(result, is (2));
    }

    @Test
    public void when1MaxThen2() {
        int result = Max.max(2,1);
        assertThat(result, is (2));
    }


    @Test
    public void when1Equally2() {
        int result = Max.max(3,3);
        assertThat(result, is (3));
    }
}
