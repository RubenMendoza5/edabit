package Easy;

/**
 * Shuffle the Name
 *
 * Create a method that accepts a string (of a person's first and last name)
 * and returns a string with the first and
 * last name swapped.
 * Examples *
 * nameShuffle("Donald Trump") ➞ "Trump Donald" *
 * nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie" *
 * nameShuffle("Seymour Butts") ➞ "Butts Seymour"
 *
 * Notes *
 *     There will be exactly one space between the first and last name.
 */

public class ShuffleName {
    public static String nameShuffle(String s) {
        String[] splitString = s.split(" ");
        String newString = splitString[1] + " " + splitString[0];
        return newString;
    }
}
