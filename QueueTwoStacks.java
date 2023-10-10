import java.util.Stack;
public class QueueTwoStacks {
    static class Queue{
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();
        public boolean isEmpty(){
            return stack1.isEmpty();
        }
        public void add(int data){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(data);
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("queue is emoty");
                return -1;
            }
            return stack1.pop();
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("queue is emoty");
                return -1;
            }
            return stack1.peek();
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
