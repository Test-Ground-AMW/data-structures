import java.util.Arrays;

public class ArrayStack {
    public static void main(String[] args) {
       Stack s1 = new Stack();
       s1.print();
       s1.push(10);
       s1.push(20);
       s1.push(30);
       s1.pop();
       s1.print(); 
    }
}

class Stack{
    int[] numbers = new int[0];

    void push(int number){
        int[] temp = new int[numbers.length+1];
        for (int i = 0; i < numbers.length; i++) {
            temp[i] = numbers[i];
        }
        temp[temp.length-1] = number;
        numbers = temp;
    }

    void pop(){
        int[] temp = new int[numbers.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];
        }
        numbers = temp;
    }

    int peek(){

        return numbers[numbers.length-1];
    }

    void print(){
        System.out.println(Arrays.toString(numbers));
    }
}
