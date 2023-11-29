package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when31to31then0() {
        double expected = 2;
        Point a = new Point(2, 2);
        Point b = new Point(4, 2);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when51to21then3() {
        double expected = 3;
        Point a = new Point(5, 1);
        Point b = new Point(2, 1);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void when002to032then3() {
        double expected = 3;
        Point a = new Point(0, 0, 2);
        Point b = new Point(0, 3, 2);
        double dist = a.distance3d(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void when002to0010then3() {
        double expected = 8;
        Point a = new Point(0, 0, 2);
        Point b = new Point(0, 0, 10);
        double dist = a.distance3d(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }
}