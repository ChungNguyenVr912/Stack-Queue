package reverse_using_stack;

import java.util.Stack;

public class Reverser {
    public static String ReverseString(String words){
        Stack<String> stack = new Stack();
        String[] temp = words.split("");
        for (String ele :
                temp) {
            stack.push(ele);
        }
        String result = "";
        while (!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
    public static int[] ReverseIntArray(int[] array){
        Stack<Integer> stack = new Stack();
        for (int ele :
                array) {
            stack.push(ele);
        }
        int[] result = new int[array.length];
        int i = 0;
        while (!stack.isEmpty()){
            result[i] = stack.pop();
            i++;
        }
        return result;
    }
}
