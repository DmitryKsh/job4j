package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        double expected = 2.82;
        double out = Point.distance(4,4,2,2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
