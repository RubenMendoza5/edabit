package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckDivisibleBy5Test {

    @Test
    public void test1() {
        System.out.println("5 is divisible by 5.");
        assertEquals(true, CheckDivisibleBy5.divisibleByFive(5));
    }

    @Test
    public void test2() {
        System.out.println("15 is divisible by 5.");
        assertEquals(true, CheckDivisibleBy5.divisibleByFive(15));
    }

    @Test
    public void test3() {
        System.out.println("7 is NOT divisible by 5.");
        assertEquals(false, CheckDivisibleBy5.divisibleByFive(7));
    }

    @Test
    public void test4() {
        System.out.println("33 is NOT divisible by 5.");
        assertEquals(false, CheckDivisibleBy5.divisibleByFive(33));
    }

    @Test
    public void test5() {
        System.out.println("-18 is NOT divisible by 5.");
        assertEquals(false, CheckDivisibleBy5.divisibleByFive(-18));
    }

    @Test
    public void test6() {
        System.out.println("999 is NOT divisible by 5.");
        assertEquals(false, CheckDivisibleBy5.divisibleByFive(999));
    }

    @Test
    public void test7() {
        System.out.println("2 is NOT divisible by 5.");
        assertEquals(false, CheckDivisibleBy5.divisibleByFive(2));
    }

}