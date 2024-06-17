package Q9;

import java.util.Stack;

public class StackPostPreFix {

    public static int calculate(int op1, String opr, int op2) {
        switch (opr) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
            case "%":
                return op1 % op2;
            case "$":
                return (int) Math.pow(op1, op2);
        }
        return 0;
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?"); // Match integers and decimals
    }

    public static int Postfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");
        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(calculate(operand1, token, operand2));
            }
        }
        if (!stack.isEmpty())
            return stack.pop();
        return 0;
    }

    public static int Prefix(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");
        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                stack.push(calculate(operand1, token, operand2));
            }
        }
        if (!stack.isEmpty())
            return stack.pop();
        return 0;
    }

    public static void main(String[] args) {
        String postfix = "10 10 10 * 10 / + 10 + 10 -";
        System.out.println("Postfix = " + postfix);
        int result = Postfix(postfix);
        System.out.println("Result = " + result);

        String prefix = "- + + 10 / * 10 10 10 10 10";
        System.out.println("Prefix : " + prefix);
        result = Prefix(prefix);
        System.out.println("Result : " + result);
    }
}
