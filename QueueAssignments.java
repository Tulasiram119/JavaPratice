import java.util.*;
import java.util.LinkedList;
public class QueueAssignments {
    public static void listOfBinary(int n){
        Queue <String> binary = new LinkedList();
        binary.add("1");
        while(n-->0){
            String s1 = binary.peek();
            binary.remove();
            System.out.println(s1);
            String s2 = s1;
            binary.add(s1+"0");
            binary.add(s2+"1");
        }
    }
    public static int minCost(int [] arr,int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int res = 0;
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            res += (first+second);
            pq.add(first+second);
        }
        return res;
    }
    public static void main(String[] args) {
        //listOfBinary(5);
        int [] arr = {4,3,2,6};
        System.out.println(minCost(arr, arr.length));
    }
}
