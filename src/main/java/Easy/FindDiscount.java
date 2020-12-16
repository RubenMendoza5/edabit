package Easy;

/**
 * Find the Discount
 *
 * Create a function that takes two arguments: the original
 * price and the discount percentage as integers and returns
 * the final price after the discount.
 *
 * Alternative Text
 * Examples *
 * discount(1500, 50) ➞ 750 *
 * discount(89, 20) ➞ 71.2 *
 * discount(100, 75) ➞ 25
 *
 * Notes *
 * Your answer should be rounded to two decimal places.
 */

public class FindDiscount {
    public static double discount(int price, int percentage) {
        return Math.round(price * (100-percentage)/100);
    }
}
