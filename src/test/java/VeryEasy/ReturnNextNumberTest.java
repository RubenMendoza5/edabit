package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReturnNextNumberTest {
    @Test
    public void test1() {
        System.out.println("2 plus 1 equals 3.");
        assertEquals(3, ReturnNextNumber.addition(2));
    }

    @Test
    public void test2() {
        System.out.println("-8 plus 1 equals 9.");
        assertEquals(-8, ReturnNextNumber.addition(-9));
    }

    @Test
    public void test3() {
        System.out.println("0 plus 1 equals 1.");
        assertEquals(1, ReturnNextNumber.addition(0));
    }

    @Test
    public void test4() {
        System.out.println("999 plus 1 equals 1000.");
        assertEquals(1000, ReturnNextNumber.addition(999));
    }

    @Test
    public void test5() {
        System.out.println("73 plus 1 equals 74.");
        assertEquals(74, ReturnNextNumber.addition(73));
    }

}