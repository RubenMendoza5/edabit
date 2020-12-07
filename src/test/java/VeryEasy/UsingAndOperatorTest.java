package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsingAndOperatorTest {
    @Test
    public void test1(){
        assertEquals(true, UsingAndOperator.and(true, true));
    }
    @Test
    public void test2(){
        assertEquals(false, UsingAndOperator.and(true, false));
    }
    @Test
    public void test3(){
        assertEquals(false, UsingAndOperator.and(false, true));
    }
    @Test
    public void test4(){
        assertEquals(false, UsingAndOperator.and(false, false));
    }
}
