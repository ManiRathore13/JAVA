import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String brackets) {
        Stack<Character> stack = new Stack<>();

        for (char ch : brackets.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Check for matching closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }

        // If stack is empty, all brackets are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[()]}";

        if (isBalanced(input)) {
            System.out.println("The sequence is balanced.");
        } else {
            System.out.println("The sequence is not balanced.");
        }
    }
}
