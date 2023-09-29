package pratice_problems.recurssion;

import java.util.HashSet;

public class BitWiseManupuliation {
    public static void oddEven(int n){
        if((n & 1) == 0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
    }
    public static void swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
    }
    public static int findiThBit(int n,int i){
        int bitMask = 1<<i;        
        return (n&bitMask)>0?1:0;
    }
    public static int setiThBit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int cleariThBit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static int countBits(int n,int m){
        int k = n^m;
        int count =0;
        while(k != 0){
            k = (k & k-1);
            count++;
        } 
        return count;
    }
    public static int findUniqurElement(int arr[]){
        int n = arr.length;
        // HashSet <Integer> set = new HashSet<>();
        // for(int i = 0;i < n;i++){
        //     if(set.contains(arr[i])){
        //         set.remove(arr[i]);
        //     }
        //     else{
        //         set.add(arr[i]);
        //     }
        // }
        // return set.toString();
        int res = 0;
        for(int i = 0;i < n;i++){
            res = res^arr[i];
        }
        return res;
    }
    public static void findTwoUniqurElement(int arr[]){
        int n = arr.length;        
        int res = 0;
        for(int i = 0;i < n;i++){
            res = res^arr[i];            
        }        
        int sum1 = 0;
        int sum2 = 0;
        res = (res & -res);
        for(int i = 0;i < n;i++){
            if((res ^ arr[i]) > 0){
                sum1 = sum1^arr[i];
            } else{
                sum2 = sum2^arr[i];
            }
        }
        System.out.println(sum1+" "+sum2);
    }
    public static void main(String[] args) {
        //oddEven(15);
        // System.out.println(findiThBit(9, 1));
        // System.out.println(setiThBit(9, 1));
        // System.out.println(cleariThBit(9, 3));
        // System.out.println(countBits(100, 99));
        int arr[] = {5,4,1,4,3,5,1,2};
        findTwoUniqurElement(arr);
    }
}
