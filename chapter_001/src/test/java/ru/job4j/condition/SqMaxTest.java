package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void max () {
        int result = SqMax.max(6,4,7,5);
        assertThat(result, is(5));
    }

    @Test
    public void testing() {
        int result = SqMax.max(1,9,3,8);
        assertThat(result, is(1));
    }
}
