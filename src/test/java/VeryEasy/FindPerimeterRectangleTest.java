package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindPerimeterRectangleTest {
    @Test
    public void test1() {
        assertEquals(26, FindPerimeterRectangle.findPerimeter(6, 7));
    }

    @Test
    public void test2() {
        assertEquals(60, FindPerimeterRectangle.findPerimeter(20, 10));
    }

    @Test
    public void test3() {
        assertEquals(22, FindPerimeterRectangle.findPerimeter(2, 9));
    }

}