package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreaTriangleTest {
    @Test
    public void test1() {
        assertEquals(3, AreaTriangle.triArea(3, 2));
    }

    @Test
    public void test2() {
        assertEquals(10, AreaTriangle.triArea(5, 4));
    }

    @Test
    public void test3() {
        assertEquals(50, AreaTriangle.triArea(10, 10));
    }

    @Test
    public void test4() {
        assertEquals(0, AreaTriangle.triArea(0, 60));
    }

    @Test
    public void test5() {
        assertEquals(66, AreaTriangle.triArea(12, 11));
    }
}
