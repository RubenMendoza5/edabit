package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReturnRemainderTest {
    @Test
    public void test1() {
        assertEquals(1, ReturnRemainder.remainder(7, 2));
    }

    @Test
    public void test2() {
        assertEquals(3, ReturnRemainder.remainder(3, 4));
    }

    @Test
    public void test3() {
        assertEquals(-9, ReturnRemainder.remainder(-9, 45));
    }

    @Test
    public void test4() {
        assertEquals(0, ReturnRemainder.remainder(5, 5));
    }
}