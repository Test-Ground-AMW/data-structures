import java.util.Stack;

public class StackDemo2 {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();

        myStack.push("Hello!");
        myStack.push("World");
        myStack.push("WE");
        myStack.push("Are");
        myStack.push("Born");
        myStack.push("To");
        myStack.push("Code");

        System.out.println(myStack);
        System.out.println("removed " + myStack.pop());
        System.out.println(myStack);

        System.out.println(myStack);
        System.out.println(myStack.peek());

    }
}
