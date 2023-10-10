public class CircularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        public Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        //to check weather the circular queue is full or not
        public boolean isFull(){
            return (rear+1)%size == front;
        }
        // add
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            //add first element 
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        //remove
        public int remove(){
            if(isEmpty()){
                System.out.println("queue is full");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear = front = -1;
            } else{
                front = (front+1) % size;
            }
            return result;
        }
        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
       Queue queue = new Queue(5);
       queue.add(1);
       queue.add(2);
       queue.add(3);
       while (!queue.isEmpty()) {
        System.out.println(queue.peek());
        queue.remove();
       }

    }
}

