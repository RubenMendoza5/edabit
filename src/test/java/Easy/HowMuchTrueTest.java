package Easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class HowMuchTrueTest {
    @Test
    public void test1() {
        assertThat(HowMuchTrue.countTrue(new boolean[] { true, false, false, true, false }), is(2));
    }

    @Test
    public void test2() {
        assertThat(HowMuchTrue.countTrue(new boolean[] { false, false, false, false }), is(0));
    }

    @Test
    public void test3() {
        assertThat(HowMuchTrue.countTrue(new boolean[] {}), is(0));
    }

    @Test
    public void test4() {
        assertThat(HowMuchTrue.countTrue(new boolean[] { false, false, true, true, false, false, false, true, true, true,
                true, false, true, true, false }), is(8));
    }

    @Test
    public void test5() {
        assertThat(HowMuchTrue.countTrue(new boolean[] { true, false, true, true, false, false, false, false, false }),
                is(3));
    }

    @Test
    public void test6() {
        assertThat(HowMuchTrue.countTrue(new boolean[] { false, true, true, false, true, true, false, true, false, true,
                false, true, false, true, false }), is(8));
    }

    @Test
    public void test7() {
        assertThat(
                HowMuchTrue.countTrue(new boolean[] { true, false, true, true, true, false, true, true, false, false }),
                is(6));
    }

    @Test
    public void test8() {
        assertThat(
                HowMuchTrue.countTrue(
                        new boolean[] { false, false, false, false, true, false, true, false, true, false, false }),
                is(3));
    }

    @Test
    public void test9() {
        assertThat(
                HowMuchTrue.countTrue(
                        new boolean[] { true, false, false, false, true, false, false, true, false, false, false }),
                is(3));
    }

    @Test
    public void test10() {
        assertThat(
                HowMuchTrue.countTrue(new boolean[] { true, true, false, true, false, false, false, false, true, false }),
                is(4));
    }

    @Test
    public void test11() {
        assertThat(HowMuchTrue.countTrue(new boolean[] { true, false, true, true, false, true, true, true, true, false,
                true, false, true, false }), is(9));
    }

    @Test
    public void test12() {
        assertThat(HowMuchTrue.countTrue(new boolean[] { true, false, true, true, true, true, false, true, true, false,
                true, false, false, false, false }), is(8));
    }

    @Test
    public void test13() {
        assertThat(
                HowMuchTrue.countTrue(
                        new boolean[] { true, true, false, false, false, false, true, false, true, true, false, true }),
                is(6));
    }
}
