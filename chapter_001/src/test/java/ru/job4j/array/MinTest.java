package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MinTest {
    @Test
    public void whenFirstMin(){
        assertThat(Min.findMin(new int[]{7,0, 5, 10}), is(0));
    }

    @Test
    public void WhenLastMin(){
        assertThat(Min.findMin(new int[] {7,10, 5, 3}), is (3));
    }

    @Test
    public void WhenMiddleMin() {
        assertThat(Min.findMin(new int[] {7,10, 2, 5}), is(2));
    }
}
