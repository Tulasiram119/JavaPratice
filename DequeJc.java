import java.util.Deque;
import java.util.LinkedList;

public class DequeJc {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<Integer>();
        d.addFirst(10);
        d.addFirst(12);
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);
    }
}
