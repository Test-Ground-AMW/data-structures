import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Demo2 {
    public static void main(String[] args) {
        Deque<Integer> myDeque = new LinkedBlockingDeque<>();
        myDeque.offerLast(10);
        myDeque.offerLast(20);
        myDeque.offerLast(30);
        myDeque.offerLast(40);
        myDeque.offerLast(50); // -> [50, 40, 30, 20, 10]
        System.out.println(myDeque);  // print reverce [10, 20, 30, 40, 50]
        System.out.println(myDeque.peek()); // 10 - peek = peekFirst
        System.out.println(myDeque.peekLast()); // 50 - peekLast = peekLast
    }
}
