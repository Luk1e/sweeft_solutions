package org.example.solutions;
/**
 * Task1: Evaluate Expression
 * <p>
 * This class provides a method to evaluate an arithmetic expression containing integers, addition, and subtraction operators.
 * It supports single-digit or multi-digit integers, positive or negative.
 * <p>
 * Time Complexity: O(n), where n is the length of the expression
 * Space Complexity: O(1)
 */
public class Task1 {
    /**
     * Evaluate an arithmetic expression containing integers, addition, and subtraction operators.
     *
     * @param expression The arithmetic expression to evaluate.
     * @return The result of evaluating the expression.
     * @throws IllegalArgumentException If the expression contains an invalid character.
     */
    public static int evaluateExpression(String expression) {

        // if string is null or empty return 0
        if (expression == null || expression.isEmpty()) {
            return 0;
        }

        int sign = 1;  // the sign of current number
        int result = 0;    // output variable

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                // if the current character is a digit, parse the entire number starting from the current position until an operation is encountered.
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0'); // faster character to integer conversion
                    i++;
                }
                // the while loop stops when it encounters an operation, and then the for loop moves to the next character. The operation character is left unnoticed, so we need to move back one position.
                i--;
                result += sign * num;
            } else if (c == '+') {
                sign = 1;
            } else if (c == '-') {
                sign = -1;
            } else if (Character.isSpaceChar(c) || c == '(' || c == ')') {
                continue;
            } else {
                throw new IllegalArgumentException("Invalid character in expression: " + c);
            }
        }

        return result;
    }
}