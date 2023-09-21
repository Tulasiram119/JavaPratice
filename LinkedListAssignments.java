public class LinkedListAssignments {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node getIntersectionNode(Node head1,Node head2){
        while(head1 != null){
            Node temp = head2;
            while(temp != null){
                if(temp == head1){
                    return head1;
                }
                temp = temp.next;
            }
            head1 = head1.next;
        }
        return null;
    }
    public static Node push(Node head_ref,int data){
        Node newNode = new Node(data);
        newNode.next = head_ref;
        head_ref = newNode;
        return head_ref;
    }
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void skipMdeleteN(Node head,int M,int N){
        Node curr = head;
        Node t = null;
        int count;
        while(curr != null){
            for(count =1; count<M && curr != null ;count++){
                curr = curr.next;
            }
            if(curr == null){
                return;
            }
            t = curr.next;
            for(count = 1;count < N && t != null;count++){
                t = t.next;
            }
            curr.next = t;
            t = curr;
        }
    }
    public static Node getPrevPosition(Node head,int k1){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            
            if(temp.data == k1){
                return prev;
            }
            prev = temp;
            temp = temp.next;
        }
        return null;
    }
    public static Node getCurrPosition(Node head,int k1){
        Node temp = head;        
        while(temp != null){            
            if(temp.data == k1){
                return temp;
            }            
            temp = temp.next;
        }
        return null;
    }
    public static void swap(Node head, int k1,int k2){        
        Node curr1 = getCurrPosition(head, k1);
        Node curr2 = getCurrPosition(head, k2);
        Node prev1 = getPrevPosition(head, k1);
        Node prev2 = getPrevPosition(head, k2);
        prev1.next = curr2;
        prev2.next = curr1;
        Node temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;
    }
    public static Node evenOdd(Node head){
        Node evenHead = null;
        Node oddHead = null;
        Node temp = head;
        Node temp1 = head;
        while(temp != null){
            if(temp.data % 2 == 0){
                evenHead = push(evenHead, temp.data);
            } else{
                oddHead = push(oddHead, temp.data);
            }
            temp = temp.next;
        }
        Node temp2 = evenHead;
        while (temp2.next != null) {
            temp2 = temp2.next;
        } 
        temp2.next = oddHead;       
        return evenHead;
    }
    public static void main(String[] args) {
        LinkedListAssignments list = new LinkedListAssignments();
        // Node head1 = new Node(10);
        // Node head2 = new Node(6);
        // Node newNode = new Node(6);
        // head2.next = newNode;
        // newNode = new Node(9);
        // head2.next.next = newNode;
        // newNode = new Node(15);
        // head1.next = newNode;
        // head2.next.next.next = newNode;
        // newNode = new Node(30);
        // head1.next.next = newNode;
        // head1.next.next.next = null;
        // Node intersectionPoint= list.getIntersectionNode(head1, head2); 
        // if(intersectionPoint == null){
        //     System.out.println("There no intersection");
        // }else{
        //     System.out.println("Intersection point is "+intersectionPoint.data);
        // } 
        Node head = null;
        int M=2, N=3;
        head = push(head, 10);
        head=push(head, 9);
        head=push(head, 8);
        head=push(head, 7);
        head=push(head, 6);
        head=push(head, 5);
        head=push(head, 4);
        head=push(head, 3);
        head=push(head, 2);
        head=push(head, 1);
        print(head);
        //skipMdeleteN(head, M, N);
        //print(head);
        //swap(head, 2, 3);
        //swap(head, M, N);
        head = evenOdd(head);
        print(head);
    }
}
