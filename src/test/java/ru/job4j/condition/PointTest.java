package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to50then4() {
        double expected = 4;
        Point a = new Point(1, 0);
        Point b = new Point(5, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to04then3() {
        double expected = 3;
        Point a = new Point(0, 1);
        Point b = new Point(0, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to62then5() {
        double expected = 5;
        Point a = new Point(1, 2);
        Point b = new Point(6, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}