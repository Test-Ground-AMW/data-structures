import java.util.LinkedList;
import java.util.Queue;

public class Demo2 {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        System.out.println(myQueue);
        myQueue.poll();
        System.out.println(myQueue);
        System.out.println(myQueue.peek());
    }
}
