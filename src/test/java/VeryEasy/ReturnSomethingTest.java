package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReturnSomethingTest {
    @Test
    public void test1() {
        assertEquals("something a", ReturnSomething.giveMeSomething("a"));
    }
    @Test
    public void test2() {
        assertEquals("something is cooking", ReturnSomething.giveMeSomething("is cooking"));
    }
    @Test
    public void test3() {
        assertEquals("something  is cooking", ReturnSomething.giveMeSomething(" is cooking"));
    }
}
