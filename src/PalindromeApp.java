import java.util.Stack;

class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean checkPalindrome() {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return text.equals(reversed);
    }
}

public class Main {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("madam");
        if (checker.checkPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
