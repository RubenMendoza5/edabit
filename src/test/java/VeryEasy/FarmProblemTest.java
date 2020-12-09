package VeryEasy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FarmProblemTest {
    @Test
    public void test1() {
        assertThat(FarmProblem.animals(5, 2, 8), is(50));
    }

    @Test
    public void test2() {
        assertThat(FarmProblem.animals(3, 4, 7), is(50));
    }

    @Test
    public void test3() {
        assertThat(FarmProblem.animals(1, 2, 3), is(22));
    }

    @Test
    public void test4() {
        assertThat(FarmProblem.animals(3, 5, 2), is(34));
    }

}