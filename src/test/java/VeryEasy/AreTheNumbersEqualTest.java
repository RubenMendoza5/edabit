package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreTheNumbersEqualTest {
    @Test
    public void test1(){
        assertEquals(true, AreTheNumbersEqual.isSameNum(2,2));
    }
    @Test
    public void test2(){
        assertEquals(false, AreTheNumbersEqual.isSameNum(0, 6));
    }
    @Test
    public void test3(){
        assertEquals(false, AreTheNumbersEqual.isSameNum(43, 32));
    }
}