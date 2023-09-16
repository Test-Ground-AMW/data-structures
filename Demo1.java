import java.util.ArrayDeque;
import java.util.Deque;

public class Demo1 {
    public static void main(String[] args) {
        Deque<Integer> myDeque = new ArrayDeque<>();
        myDeque.push(10);           // push = offerFirst
        myDeque.offer(20);          // offer = offerLast
        myDeque.offer(30);  
        myDeque.push(40);
        myDeque.offerFirst(50);
        myDeque.offerLast(60);
        System.out.println(myDeque);  // [60, 30, 20, 10, 40, 50] // prints reverce [50, 40, 10, 20, 30, 60] 
        myDeque.pop();                // pop = popFirst
        myDeque.poll();               // poll = pollFirst
        System.out.println(myDeque);  // [60, 30, 20, 10] // prints reverse [10, 20, 30, 60]
    }
}
