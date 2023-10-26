import java.util.*;
public class LinkedList implements Queue<BinaryTrees.Node> {
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
    public static int size;
    public void addFirst(int data){
        //step 1 create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 link newnode to head
        newNode.next = head;
        //step 3 make newNode head
        head = newNode;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void printLinkedList(){        
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next; 
        }
        System.out.println("null");
    }
    public void addMiddle(int id,int data){
        if(head == null){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int i =0;
        Node temp = head;
        while(i<id-1){
            temp= temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public int removeFirst(){ 
        if(size ==0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } 
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;     
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size ==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;            
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int search(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int searchRecursive(int key){
        return helper(head,key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteNthFromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
        }
        int i =1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++; 
        }
        prev.next = prev.next.next;
        return;
    }
    public boolean palindromeCheck(LinkedList list){
        Node temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp != null){
            arr.add(temp.data);
            temp = temp.next;
        }
        int n = 0;
        int m = arr.size()-1;
        while(n<m){
            if(arr.get(n) != arr.get(m)){
                return false;
            }
            n++;
            m--;
        }
        return true;
    }
    public Node middleNode(Node head){//slow fast approach
        Node slow = head;
        Node fast = head;
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrone(){
        if(head == null || head.next == null){
            return true;
        }
        //finding mid
        Node midNode = middleNode(head);
        //reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right half head
        Node left = head;
        //first half and second half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle){
            slow = head;
            Node prev = null;
            while(slow != fast){
                slow = slow.next;
                prev = fast;
                fast = fast.next;
            }
            prev.next = null;
        }
        
    } 
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    } 
    private Node merge(Node leftHead,Node rightHead){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(leftHead != null && rightHead != null){
            if(leftHead.data < rightHead.data){
                temp.next = leftHead;
                leftHead = leftHead.next;
                temp = temp.next;
            } else{
                temp.next = rightHead;
                rightHead = rightHead.next;
                temp = temp.next;
            }
        }
        while(leftHead != null){
            temp.next = leftHead;
            leftHead = leftHead.next;
            temp = temp.next;
        }
        while (rightHead != null) {
            temp.next = rightHead;
            rightHead = rightHead.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        //base case
        if(head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left && right ms
        Node rightHead = mid.next;
        mid.next = null;
        //recursion
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        //merge
        return merge(newLeft,newRight);
    }  
    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        //alt merge zigzag method
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addlast(1);
        ll.addlast(8);
        ll.addlast(6);
        ll.addlast(9);
        ll.addlast(7);
        ll.addlast(2);
        //ll.printLinkedList();
        // System.out.println(ll.size);
        // ll.addMiddle(1, 11);
        // ll.printLinkedList();
        // System.out.println(ll.size);
        // System.out.println(ll.removeFirst());
        // ll.printLinkedList();
        // System.out.println(ll.removeLast());
        // ll.printLinkedList();
        // System.out.println(ll.search(33));
        // System.out.println(ll.searchRecursive(4));
        // ll.reverse();
        // ll.printLinkedList();
        //ll.deleteNthFromEnd(3);
        //ll.printLinkedList();
        //ll.printLinkedList();
        //System.out.println(ll.palindromeCheck(ll));\
        //System.out.println(ll.checkPalindrone());
        ll.printLinkedList();
        // ll.head = ll.mergeSort(ll.head);
        // ll.printLinkedList();
        ll.zigZag();
        ll.printLinkedList();
    }
}
