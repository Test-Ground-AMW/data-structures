public class Demo {
    public static void main(String[] args) {
        MyList list = new MyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(50);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.contains(50));
        System.out.println(list.indexOf(40));
        System.out.println(list.lastIndexOf(40));
        System.out.println(list.get(5));
        list.add(5, 39);
        System.out.println(list);
        list.add(0, 25);
        System.out.println(list);
        list.add(2, 56);
        System.out.println(list);
        // System.out.println(list.remove(0));
        // System.out.println(list);
        // System.out.println(list.remove(list.size() - 1));
        // System.out.println(list);
        // System.out.println(list.remove(1));
        // System.out.println(list);

        // list.clear();
        // System.out.println(list);
    }
}

interface MyList {
    public void add(int value);

    public void add(int index, int value) throws ArrayIndexOutOfBoundsException;

    public int remove(int index) throws ArrayIndexOutOfBoundsException;

    public void clear();

    public int size();

    public int set(int index, int value) throws ArrayIndexOutOfBoundsException;

    public boolean contains(int value);

    public int indexOf(int value);

    public int lastIndexOf(int value);

    public int get(int index);
}

class MyLinkedList implements MyList {
    private int size;
    private MyNode head;
    private MyNode tail;

    public MyLinkedList() {
    }

    public MyLinkedList(int... values) {
    }

    public MyLinkedList of(int... values) {
        return null;
    }

    @Override
    public void add(int value) {
        if (size == 0) {
            head = new MyNode(value, null);
            tail = head;
        } else {
            tail.next = new MyNode(value, tail);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public void add(int index, int value) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        MyNode temp;
        if (index == 0) {
            temp = new MyNode(value, null);
            temp.next = head;
            head.previous=temp;
            head = temp;
            // temp = head;
        } else if (index == size - 1) {
            temp = new MyNode(value, null);
            tail.next = temp;
            temp.previous = tail;
            temp = tail;
        } else {
            MyNode temp1 = head;
            temp = new MyNode(value, null, null);
            for (int i = 0; i < index-1; i++) {
                temp1 = temp1.next;
            }
            MyNode temp2 = temp1.next;
            temp1.next = new MyNode(value, temp1, temp2);
            temp2 = temp1.next;
        }
    }

    @Override
    public int remove(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        int value;
        if (index == 0) {
            value = head.value;
            head = head.next;
            if (head != null) {
                head.previous = null;
            } else {
                tail = head;
            }
        } else if (index == size - 1) {
            value = tail.value;
            tail = tail.previous;
            tail.next = null;
        } else {
            MyNode temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            value = temp.next.value;
            temp.next.next.previous = temp;
            temp.next = temp.next.next;
        }
        size--;

        return value;
    }

    @Override
    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }

    @Override
    public int size() {
        return this.size;
    }

    public int get(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        MyNode temp = head;
        for (int i = 0; i < size; i++) {
            if (i == index)
                return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    @Override
    public int set(int index, int value) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        MyNode temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        int tempValue = temp.value;
        temp.value = value;
        return tempValue;
    }

    @Override
    public boolean contains(int value) {
        boolean contain = false;
        MyNode temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == value)
                contain = true;
            temp = temp.next;
        }
        return contain;
    }

    @Override
    public int indexOf(int value) {
        int index = -1;
        MyNode temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == value) {
                index = i;
                return index;
            }
            temp = temp.next;
        }
        return index;
    }

    @Override
    public int lastIndexOf(int value) {
        int index = -1;
        MyNode temp = tail;
        for (int i = size - 1; 0 <= i; i--) {
            if (temp.value == value) {
                index = i;
                return index;
            }
            temp = temp.previous;
        }
        return index;
    }

    @Override
    public String toString() {
        String str = "[";
        MyNode temp = head;
        while (temp != null) {
            str += temp.value + (temp.next != null ? ", " : "");
            temp = temp.next;
        }
        str += "]";
        return str;
    }
}

class MyNode {
    MyNode previous;
    MyNode next;
    int value;

    public MyNode(int value, MyNode previous) {
        this.value = value;
        this.previous = previous;
    }

    public MyNode(int value, MyNode previous, MyNode next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }
}