package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShuffleNameTest {
    @Test
    public void test1() {
        assertEquals("Trump Donald", ShuffleName.nameShuffle("Donald Trump"));
    }

    @Test
    public void test2() {
        assertEquals("O'Donnel Rosie", ShuffleName.nameShuffle("Rosie O'Donnel"));
    }

    @Test
    public void test3() {
        assertEquals("Butts Seymour", ShuffleName.nameShuffle("Seymour Butts"));
    }

    @Test
    public void test4() {
        assertEquals("Greene Ebony", ShuffleName.nameShuffle("Ebony Greene"));
    }

    @Test
    public void test5() {
        assertEquals("Kennedy Ken", ShuffleName.nameShuffle("Ken Kennedy"));
    }

    @Test
    public void test6() {
        assertEquals("Gonzalez Allison", ShuffleName.nameShuffle("Allison Gonzalez"));
    }

    @Test
    public void test7() {
        assertEquals("Frazier Albert", ShuffleName.nameShuffle("Albert Frazier"));
    }

    @Test
    public void test8() {
        assertEquals("Hopkins Eloise", ShuffleName.nameShuffle("Eloise Hopkins"));
    }

    @Test
    public void test9() {
        assertEquals("Welch Donnie", ShuffleName.nameShuffle("Donnie Welch"));
    }

    @Test
    public void test10() {
        assertEquals("Thomas Vernon", ShuffleName.nameShuffle("Vernon Thomas"));
    }
}