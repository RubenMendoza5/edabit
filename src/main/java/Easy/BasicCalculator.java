package Easy;

/**
 * Basic Calculator
 *
 * Create a function that takes two numbers and a mathematical operator + - / *
 * and will perform a calculation with
 * the given numbers.
 * Examples *
 * calculator(2, '+', 2) ➞ 4 *
 * calculator(2, '*', 2) ➞ 4 *
 * calculator(4, '/', 2) ➞ 2
 *
 * Notes *
 * If the input tries to divide by 0, return 0.
 */

public class BasicCalculator {

    public static int calculator(int num1, char operator, int num2) {
        int result = 0;
        if(operator =='/' && num2 ==0) {
            return 0;
        } else {
            switch(operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '*':
                    result = num1 * num2;
            }
            return result;
        }
    }
}

/*
public static int calculator(int num1, char operator, int num2) {
		switch(operator) {
			case '+': return num1 + num2;
			case '-': return num1 - num2;
			case '*': return num1 * num2;
			case '/': return (num2 == 0) ? 0 : num1/num2;
		}
		return 0;
  }
 */