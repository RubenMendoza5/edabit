package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertHrsToSecTest {

    @Test
    public void test1() {
        assertEquals(7200, ConvertHrsToSec.howManySeconds(2));
    }

    @Test
    public void test2() {
        assertEquals(36000, ConvertHrsToSec.howManySeconds(10));
    }

    @Test
    public void test3() {
        assertEquals(86400, ConvertHrsToSec.howManySeconds(24));
    }

    @Test
    public void test4() {
        assertEquals(129600, ConvertHrsToSec.howManySeconds(36));
    }

}