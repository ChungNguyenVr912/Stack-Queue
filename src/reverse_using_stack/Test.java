package reverse_using_stack;

public class Test {
    public static void main(String[] args) {
        String string1 = Reverser.ReverseString("The Stack class represents a last-in-first-out");
        System.out.println(string1);
        int[] array = {1, 25, 5, 6, 4, 5, 9};
        int[] newArray = Reverser.ReverseIntArray(array);
        for (int number :
                newArray) {
            System.out.printf("%d  ",number);
        }
    }
}
