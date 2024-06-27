import java.util.Stack;

public class ReverseStack {
    // TODO: Add public static `reverse` method here

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        System.out.println("Original stack: " + stack1); // Output: [1, 2, 3, 4]
        // TODO: Uncomment the following line to test your implementation
//        reverse(stack1);
        System.out.println("Reversed stack: " + stack1); // Output: [4, 3, 2, 1]
    }
}