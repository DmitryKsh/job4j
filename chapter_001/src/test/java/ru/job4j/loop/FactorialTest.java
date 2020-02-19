package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FactorialTest {
    @Test
    public void  factorial5(){
        int result = Factorial.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void  factorial8(){
        int result = Factorial.calc(6);
        assertThat(result, is(720));
    }

    @Test
    public void  factorial1(){
        int result = Factorial.calc(0);
        assertThat(result, is(1));
    }
}
