package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCalculatorTest {
    @Test
    public void test01() {
        assertEquals(PowerCalculator.power(230, 10), 2300);
    }

    @Test
    public void test02() {
        assertEquals(PowerCalculator.power(110, 3), 330);
    }

    @Test
    public void test03() {
        assertEquals(PowerCalculator.power(480, 20), 9600);
    }

}