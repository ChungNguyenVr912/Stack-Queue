package decimal_to_binary_usingStack;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("\nInput number: ");
            int number = scanner.nextInt();
            if (number < 0){
                break;
            }
            Stack<Integer> binaryStack = convertToBinary(number);
            System.out.print("To binary: ");
            while (!binaryStack.isEmpty()){
                System.out.print((int)binaryStack.pop() + "\t");
            }
        } while (true);
    }

    private static Stack<Integer> convertToBinary(int number) {
        Stack<Integer> result = new Stack<>();
        if (number == 0){
            result.push(0);
            return result;
        }
        while (number != 0){
            result.push(number%2);
            number = number/2;
        }
        return result;
    }
}
