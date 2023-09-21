public class CircularLinkedList {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }              
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }
    public void print(){
        if(head == null){
            System.out.println("CLL is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data+"->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("null");
    }
    public int removeFirst(){
        if(head == null){
            System.out.println("Cll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            head = tail = null;
        }
        Node temp = head.next;
        int val = head.data;
        head.next = null;
        head = temp;
        tail.next = temp;
        return val;
    }
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addFirst(3);
        cll.addFirst(2);
        cll.addFirst(1);
        System.out.println(cll.size);
        cll.print();
        System.out.println(cll.removeFirst());
        cll.print();
    }
}
