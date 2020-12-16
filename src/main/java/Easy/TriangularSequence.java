package Easy;

/**
 * Triangular Number Sequence
 *
 * This Triangular Number Sequence is generated from a pattern of dots that form a triangle.
 * The first 5 numbers of
 * the sequence, or dots, are:
 *
 * 1, 3, 6, 10, 15
 *
 * This means that the first triangle has just one dot, the second one has three dots,
 * the third one has 6 dots and so on.
 *
 * Write a function that gives the number of dots with its corresponding triangle number of the sequence.
 * Examples *
 * triangle(1) ➞ 1 *
 * triangle(6) ➞ 21 *
 * triangle(215) ➞ 23220
 */

public class TriangularSequence {
    public static int triangle(int n) {
        int dots= 0;
        for(int i = n; i > 0; i--) {
            dots += i;
        }
        return dots;
    }
}

/*
return (n*(1+n))/2;
 */