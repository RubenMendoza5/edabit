package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReturnTheSumOfTwoNumbersTest {

    @Test
    public void test1(){
        int expected = 5;
        int actual = ReturnTheSumOfTwoNumbers.sum(3, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        int expected = -9;
        int actual = ReturnTheSumOfTwoNumbers.sum(-3, -6);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        int expected = 10;
        int actual = ReturnTheSumOfTwoNumbers.sum(7, 3);
        assertEquals(expected, actual);
    }

}