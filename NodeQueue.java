import java.util.ArrayList;
import java.util.Collections;

public class NodeQueue {
    public static void main(String[] args) {

        // FIFO, LILO
        Queue2 myQueue = new Queue2();
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.print(); // [40,30,20,10]
        myQueue.dequeue();
        myQueue.print(); // [40,30]
    }
}

class Queue2 {
    Node head;
    Node tail;

    void enqueue(int number) {
        if (head == null) {
            head = new Node(number);
            tail = head;
        } else {
            tail.next = new Node(number);
            tail = tail.next;
        }
    }

    int dequeue() {
        if (head == null)
            throw new RuntimeException("Queue is empty");
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp.value;
    }

    int front() {
        if (head == null)
            throw new RuntimeException("Queue is empty");
        return head.value;
    }

    void print() {
        if (head == null) {
            System.out.println("[]");
        } else {
            ArrayList<Integer> valueList = new ArrayList<>();
            Node temp = head;
            while (temp != null) {
                valueList.add(temp.value);
                temp = temp.next;
            }
            Collections.reverse(valueList);
            System.out.println(valueList);
        }
    }
}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}