package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckStringMatchesTest {
    @Test
    public void test1() {
        assertEquals("Nope!", true, CheckStringMatches.checkEnding("abc", "bc"));
    }

    @Test
    public void test2() {
        assertEquals("Nope!", false, CheckStringMatches.checkEnding("abc", "d"));
    }

    @Test
    public void test3() {
        assertEquals("Nope!", false, CheckStringMatches.checkEnding("samurai", "zi"));
    }

    @Test
    public void test4() {
        assertEquals("Nope!", true, CheckStringMatches.checkEnding("feminine", "nine"));
    }

    @Test
    public void test5() {
        assertEquals("Nope!", false, CheckStringMatches.checkEnding("convention", "tio"));
    }

    @Test
    public void test6() {
        assertEquals("Nope!", false, CheckStringMatches.checkEnding("cooperative", "ooper"));
    }

    @Test
    public void test7() {
        assertEquals("Nope!", true, CheckStringMatches.checkEnding("extraterrestrial", "xtraterrestrial"));
    }

    @Test
    public void test8() {
        assertEquals("Nope!", true, CheckStringMatches.checkEnding("access", "ss"));
    }

    @Test
    public void test9() {
        assertEquals("Nope!", false, CheckStringMatches.checkEnding("motorist", "is"));
    }
}