import java.util.Stack;

/**
 * A class for parsing arithmetic expressions
 */
public class Parser {

    /**
     * An exception that is thrown if the to-be-parsed expression is not
     * well-formed.
     */
    public static class ExpressionNotWellFormedException extends Exception {
        public ExpressionNotWellFormedException() {
        }
    }

    /**
     * Parses a given String, determines whether it is a well-formed expression,
     * and computes the expression.
     *
     * @param expression
     *          the expression that is to be evaluated
     * @return the result of the evaluation / computation
     * @throws ExpressionNotWellFormedException
     *           if the expression is not well-formed, an exception is thrown
     */
    public static int parse(String expression)
            throws ExpressionNotWellFormedException {

        Stack<String> operations  = new Stack<>();
        Stack<Integer> numbers = new Stack<>();

        /*
        Iterates through the characters of the given expression and performs
        the following operations depending on the character
        + " " - the expression is not valid
        + "(" - go to the next character
        + "+", "-", "/", "*" - push the operation character to the operations stack
        + ")" - compute the expression
         */
        for (int i = 0; i < expression.length(); i++) {
            String character = Character.toString(expression.charAt(i));
            if      (character.equals(" "))    throw new ExpressionNotWellFormedException();
            else if (character.equals("("))               ;
            else if (character.equals("+"))    operations.push(character);
            else if (character.equals("-"))    operations.push(character);
            else if (character.equals("*"))    operations.push(character);
            else if (character.equals("/"))    operations.push(character);
            else if (character.equals(")")) {

                // when the parenthesis closes we can compute the given expression
                // for this we need 2 numbers and one operation
                // if those aren't given the expression is not well formed
                if (operations.empty()) throw new ExpressionNotWellFormedException();
                String operator = operations.pop();
                int number = numbers.pop();

                // compute the result of the expression with the given numbers
                // depending on the operator, if only one operator exists
                // throw an exception
                if (numbers.empty()) throw new ExpressionNotWellFormedException();
                switch (operator) {
                    case "+":
                        number = numbers.pop() + number;
                        break;
                    case "-":
                        number = numbers.pop() - number;
                        break;
                    case "*":
                        number = numbers.pop() * number;
                        break;
                    case "/":
                        number = numbers.pop() + number;
                        break;
                }

                // push the result of the expression to the number stack
                // since it may be used for more expressions
                numbers.push(number);
            }
            // if the character is not a special character, it must be an integer
            else numbers.push(Integer.parseInt(character));
        }

        // There should only be one number (the result) on the numbers stack.
        // Hence throw an expression if there isn't
        if (numbers.size() > 1 || operations.size() != 0) throw new ExpressionNotWellFormedException();
        return numbers.pop();
    }


    /**
     * test cases
     */
    public static void main(String[] args) {
        {
            wellFormedCheck("((8+7)*2)", 30);
            wellFormedCheck("(4-(7-1))", -2);
            wellFormedCheck("8", 8);
            wellFormedCheck("((1+1)*(2*2))", 8);

            notWellFormedCheck(")8+)1(())");
            notWellFormedCheck("(8+())");
            notWellFormedCheck("-1");
            notWellFormedCheck("(   5    -7)");
            notWellFormedCheck("108");
            notWellFormedCheck("(8)");
        }
    }

    private static void checkAndPrint(String message, boolean correct) {
        System.out.println((correct ? "PASS:" : "FAIL:") + " " + message);
        assert (correct);
    }

    private static void notWellFormedCheck(String expression) {
        try {
            int returned = parse(expression);
            checkAndPrint("nicht wohlgeformter Ausdruck " + expression
                    + " ausgewertet zu " + returned, false);
        } catch (ExpressionNotWellFormedException e) {
            checkAndPrint("Ausdruck " + expression
                    + " als nicht wohlgeformt erkannt.", true);
        }
    }

    private static void wellFormedCheck(String expression, int expected) {
        try {
            int returned = parse(expression);
            checkAndPrint("Ausdruck " + expression + " ausgewertet zu " + returned
                    + " (erwartet: " + expected + ")", returned == expected);
        } catch (ExpressionNotWellFormedException e) {
            checkAndPrint("Ausdruck " + expression
                    + " fälschlicherweise als nicht wohlgeformt eingeschätzt.", false);
        }
    }
}