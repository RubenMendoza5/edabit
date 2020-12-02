package VeryEasy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NameGreetingTest {
    @Test
    public void test1() {
        assertThat(NameGreeting.helloName("Gerald"), is("Hello Gerald!"));
    }

    @Test
    public void test2() {
        assertThat(NameGreeting.helloName("Fatima"), is("Hello Fatima!"));
    }

    @Test
    public void test3() {
        assertThat(NameGreeting.helloName("Ed"), is("Hello Ed!"));
    }

    @Test
    public void test4() {
        assertThat(NameGreeting.helloName("Tiffany"), is("Hello Tiffany!"));
    }

}