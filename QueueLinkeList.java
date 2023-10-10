public class QueueLinkeList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
        public boolean isEmpty(){
            return head == null && tail == null;
        }
        //add
        public void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = head.data;
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return-1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
