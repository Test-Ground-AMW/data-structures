import java.util.LinkedList;

public class Demo1{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(30));
        System.out.println(list.contains(100));
        System.out.println(list.indexOf(40));
        System.out.println(list.lastIndexOf(30));
        System.out.println(list.remove(2));
        System.out.println(list);
        list.add(1, 20);
        System.out.println(list);

        
    }
}