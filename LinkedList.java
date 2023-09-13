public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }        
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        //step 1 create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 link newnode to head
        newNode.next = head;
        //step 3 make newNode head
        head = newNode;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        System.out.println(ll);
    }
}
