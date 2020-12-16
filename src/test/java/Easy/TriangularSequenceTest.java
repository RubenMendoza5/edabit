package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangularSequenceTest {
    @Test
    public void test1() {
        assertEquals(1, TriangularSequence.triangle(1));
    }

    @Test
    public void test2() {
        assertEquals(3, TriangularSequence.triangle(2));
    }

    @Test
    public void test3() {
        assertEquals(6, TriangularSequence.triangle(3));
    }

    @Test
    public void test4() {
        assertEquals(36, TriangularSequence.triangle(8));
    }

    @Test
    public void test5() {
        assertEquals(2318781, TriangularSequence.triangle(2153));
    }

}