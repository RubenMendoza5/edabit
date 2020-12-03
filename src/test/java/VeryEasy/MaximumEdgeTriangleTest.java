package VeryEasy;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MaximumEdgeTriangleTest {
    @Test
    public void test1() {
        assertThat(MaximumEdgeTriangle.nextEdge(5, 4), is(8));
    }

    @Test
    public void test2() {
        assertThat(MaximumEdgeTriangle.nextEdge(8, 3), is(10));
    }

    @Test
    public void test3() {
        assertThat(MaximumEdgeTriangle.nextEdge(7, 9), is(15));
    }

    @Test
    public void test4() {
        assertThat(MaximumEdgeTriangle.nextEdge(10, 4), is(13));
    }

    @Test
    public void test5() {
        assertThat(MaximumEdgeTriangle.nextEdge(7, 2), is(8));
    }

}