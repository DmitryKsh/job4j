package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void when2MaxThen1() {
        int left = 3;
        int right = 5;
        int result = (right>left) ? right : left;
        assertThat(result, is (right));
    }

    @Test
    public void when1MaxThen2() {
        int left = 5;
        int right = 3;
        int result = (right>left) ? right : left;
        assertThat(result, is (left));
    }


    @Test
    public void when1Equally2() {
        int left = 5;
        int right = 5;
        int result = (right>left) ? right : left;
        assertThat(result, is (left));
    }
}
