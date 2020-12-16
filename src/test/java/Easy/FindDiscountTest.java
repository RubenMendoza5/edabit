package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindDiscountTest {
    @Test
    public void test01() {
        assertEquals(25, FindDiscount.discount(100, 75), 5);
    }

    @Test
    public void test02() {
        assertEquals(105.5, FindDiscount.discount(211, 50), 5);
    }

    @Test
    public void test03() {
        assertEquals(231.27, FindDiscount.discount(593, 61), 5);
    }

    @Test
    public void test04() {
        assertEquals(338.6, FindDiscount.discount(1693, 80), 5);
    }

    @Test
    public void test05() {
        assertEquals(630, FindDiscount.discount(700, 10), 5);
    }

}