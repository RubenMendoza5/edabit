package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConMinToSecTest {
    @Test
    public void test1() {
        assertEquals(360, ConMinToSec.convert(6));
    }

    @Test
    public void test2() {
        assertEquals(240, ConMinToSec.convert(4));
    }

    @Test
    public void test3() {
        assertEquals(480, ConMinToSec.convert(8));
    }

    @Test
    public void test4() {
        assertEquals(3600, ConMinToSec.convert(60));
    }

}