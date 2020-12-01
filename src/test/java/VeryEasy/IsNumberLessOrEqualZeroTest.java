package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsNumberLessOrEqualZeroTest {
    @Test
    public void test1(){
        assertEquals(false, IsNumberLessOrEqualZero.lessThanOrEqualToZero(5));
    }

    @Test
    public void test2(){
        assertEquals(true, IsNumberLessOrEqualZero.lessThanOrEqualToZero(0));
    }

    @Test
    public void test3(){
        assertEquals(true, IsNumberLessOrEqualZero.lessThanOrEqualToZero(-5));
    }

    @Test
    public void test4(){
        assertEquals(false, IsNumberLessOrEqualZero.lessThanOrEqualToZero(1));
    }

    @Test
    public void test5(){
        assertEquals(false, IsNumberLessOrEqualZero.lessThanOrEqualToZero(2));
    }

    @Test
    public void test6(){
        assertEquals(false, IsNumberLessOrEqualZero.lessThanOrEqualToZero(10000));
    }
}