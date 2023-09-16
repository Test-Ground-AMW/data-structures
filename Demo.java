import java.util.ArrayDeque;
import java.util.Deque;

public class Demo{
    public static void main(String[] args) {
        Deque<Integer> myDeque = new ArrayDeque<>();
        // myDeque.offer(10);
        // myDeque.offer(20);
        // myDeque.offer(30);
        // myDeque.offer(40);
        myDeque.offerFirst(10);
        myDeque.offerFirst(20);
        myDeque.offerFirst(30);
        myDeque.offerFirst(40);
        System.out.println(myDeque);         // [10,20,30,40]  but print reverse -> [40,30,20,10]
        System.out.println(myDeque.peek());  // remove 40
        myDeque.pollFirst();                 // print 30 
        System.out.println(myDeque.peek());  // remove 30

    }
}