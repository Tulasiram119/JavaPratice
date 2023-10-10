import java.util.Deque;
import java.util.LinkedList;

public class StackDeque {
    /**
     * InnerStackDeque
     */
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        // isemty
        public boolean isEmpty() {
            return deque.isEmpty();
        }

        // add
        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return-1;
            }
            return deque.removeLast();
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return deque.getLast();
        }

    }
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        // isemty
        public boolean isEmpty() {
            return deque.isEmpty();
        }

        // add
        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return-1;
            }
            return deque.removeFirst();
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return deque.getFirst();
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }
    }
}
