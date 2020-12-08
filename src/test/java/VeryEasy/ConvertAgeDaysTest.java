package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertAgeDaysTest {
    @Test
    public void test01() {
        assertEquals(ConvertAgeDays.calcAge(10), 3650);
    }

    @Test
    public void test02() {
        assertEquals(ConvertAgeDays.calcAge(0), 0);
    }

    @Test
    public void test03() {
        assertEquals(ConvertAgeDays.calcAge(73), 26645);
    }

    @Test
    public void test04() {
        assertEquals(ConvertAgeDays.calcAge(20), 7300);
    }

    @Test
    public void test05() {
        assertEquals(ConvertAgeDays.calcAge(40), 14600);
    }

    @Test
    public void test06() {
        assertEquals(ConvertAgeDays.calcAge(66), 24090);
    }
}