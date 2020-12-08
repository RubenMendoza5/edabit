package VeryEasy;

/**
 * Check if an Integer is Divisible By Five
 *
 * Create a function that returns true if an integer is evenly divisible by 5, and false otherwise.
 * Examples
 *
 * divisibleByFive(5) ➞ true *
 * divisibleByFive(-55) ➞ true *
 * divisibleByFive(37) ➞ false
 */

public class CheckDivisibleBy5 {

    public static boolean divisibleByFive(int num) {
        return (num % 5 == 0);
    }
}
