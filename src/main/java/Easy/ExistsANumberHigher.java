package Easy;

/**
 * Exists a Number Higher?
 *
 * Write a function that returns true if there exists at least one number that is larger than or equal to n.
 * Examples *
 * existsHigher([5, 3, 15, 22, 4], 10) ➞ true *
 * existsHigher([1, 2, 3, 4, 5], 8) ➞ false *
 * existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true *
 * existsHigher([], 5) ➞ false
 *
 * Notes *
 * Return false for an empty array [].
 */

public class ExistsANumberHigher {
    public static boolean existsHigher(int[] arr, int n) {
        int max = 0;
        if(arr.length >0) {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= max) {
                    max = arr[i];
                }
            }
            return max >= n;
        } else {
            return false;
        }
    }
}

/*
    if (arr.length == 0) return false;
    for (int i : arr) {
      if (i >= n) return true;
    }
    return false;
 */