package palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input string: ");
            input = scanner.next();
            if (palindromeCheck(input)) {
                System.out.println("It's a palindrome");
            } else {
                System.out.println("It's not a palindrome");
            }
        } while (!input.equals("exit"));
    }

    private static boolean palindromeCheck(String input) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        String[] arr = input.split("");
        for (String character : arr) {
            stack.push(character);
            queue.add(character);
        }
        while (!stack.isEmpty()){
            if (!stack.pop().equals(queue.remove())){
                return false;
            }
        }
        return true;
    }
}
