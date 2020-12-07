package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FootballPointsTest {
    @Test
    public void test1() {
        assertEquals(3, FootballPoints.footballPoints(1, 0, 0));
    }
    @Test
    public void test2() {
        assertEquals(20, FootballPoints.footballPoints(5, 5, 5));
    }
    @Test
    public void test3() {
        assertEquals(5, FootballPoints.footballPoints(1, 2, 3));
    }
    @Test
    public void test4() {
        assertEquals(7, FootballPoints.footballPoints(0, 7, 0));
    }
    @Test
    public void test5() {
        assertEquals(0, FootballPoints.footballPoints(0, 0, 15));
    }
}
