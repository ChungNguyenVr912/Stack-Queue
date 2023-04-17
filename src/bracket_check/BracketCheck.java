package bracket_check;

import java.util.Scanner;
import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input Formula");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            if (CheckBracket(input)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } while (true);
    }

    private static boolean CheckBracket(String input) {
        String[] strings = input.split("");
        Stack<String> bStack = new Stack<>();
        for (String c : strings){
            if (c.equals("(")){
            bStack.push(c);
            }
            if (c.equals(")")){
                if (bStack.isEmpty()){
                    return false;
                }else {
                    if (bStack.peek().equals("(")){
                        bStack.pop();
                    }
                }
            }
        }
        if (bStack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
