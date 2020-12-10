package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetWordCountTest {
    @Test
    public void test1() {
        assertEquals(3, GetWordCount.countWords("It's high noon"));
    }

    @Test
    public void test2() {
        assertEquals(4, GetWordCount.countWords("Is this easy mode"));
    }

    @Test
    public void test3() {
        assertEquals(5, GetWordCount.countWords("What an easy task, right"));
    }

    @Test
    public void test4() {
        assertEquals(4, GetWordCount.countWords("This is a test"));
    }

    @Test
    public void test5() {
        assertEquals(6, GetWordCount.countWords("Just an example here move along"));
    }

    @Test
    public void test6() {
        assertEquals(4, GetWordCount.countWords("How are you today?"));
    }
}
