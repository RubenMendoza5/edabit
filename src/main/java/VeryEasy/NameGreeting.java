package VeryEasy;

/**
 * Name Greeting!
 *
 * Create a function that takes a name and returns a greeting in the form of a string.
 * Examples *
 * helloName("Gerald") ➞ "Hello Gerald!" *
 * helloName("Tiffany") ➞ "Hello Tiffany!" *
 * helloName("Ed") ➞ "Hello Ed!"
 */

public class NameGreeting {
    public static String helloName(String name) {
        return ("Hello " + name + "!");
    }
}

/*
return String.format("Hello %s!", name);
 */