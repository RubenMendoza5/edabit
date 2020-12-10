package Easy;

/**
 * How Much is True?
 *
 * Create a function which returns the number of true values there are in an array.
 * Examples *
 * countTrue([true, false, false, true, false]) ➞ 2 *
 * countTrue([false, false, false, false]) ➞ 0 *
 * countTrue([]) ➞ 0
 *
 * Notes *
 *     Return 0 if given an empty array.
 */
public class HowMuchTrue {
    public static int countTrue(boolean[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == true) {
                count += 1;
            }
        }
        return count;
    }
}
