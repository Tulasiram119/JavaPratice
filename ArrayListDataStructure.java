import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListDataStructure {

    public static int max(ArrayList <Integer> list){
        int max=0;
        for(int i =0;i<list.size();i++){
            max = Math.max(max,list.get(i));
        }
        return max;
    }
    public static void swap(ArrayList <Integer> list,int i,int j){
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j, temp);
    }
    public static void sort(ArrayList <Integer> list){
        for(int i =0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)<list.get(j)){
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
    
        
    
    public static int maxStore(ArrayList <Integer> list){
        int maxWater =0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int width = j-i;
                int height = Math.min(list.get(i),list.get(j));
                int water = width*height;
                maxWater = Math.max(maxWater, water);
            }
        }
        return maxWater;
    }
    public static int maxWaterTwoPointer(ArrayList <Integer> list){
        int maxWater = 0;
        int start = 0;
        int end = list.size()-1;
        while(start<end){
            int width = end-start;
            int height = Math.min(list.get(start),list.get(end));
            int water = width*height;
            maxWater = Math.max(maxWater, water);
            if(list.get(start)<list.get(end)){
                start++;
            }
            else{
                end--;
            }
        }
        return maxWater;
    }
    public static boolean pairSum(ArrayList <Integer> list, int k){       
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j) == k){
                    return true;
                }           
            }
        }
        return false;
    }
    public static boolean pairSumTwoPoint(ArrayList <Integer> list, int k){
        int start = 0;
        int end = list.size()-1;
        while(start<end){
            int sum = list.get(start)+list.get(end);
            if(sum==k){
                return true;
            }
            else if(sum<k){
                start++;
            }
            else{
                end--;
            }
        }
        return false;
    }
    public static boolean pairSum2(ArrayList <Integer> list,int k){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j) == k){
                    return true;
                }           
            }
        }
        return false;
    }
    public static boolean pairSum2TwoPointer(ArrayList <Integer> list,int k){
        int bp =-1;
        int n = list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i) > list.get(i+1)){
                bp =i;
                break;
            }
        }
        int lp =bp+1;
        int rp =bp;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp) == k){
                return true;
            }
            else if(list.get(lp)+list.get(rp) < k){
                lp = (lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {        
       ArrayList <Integer> list = new ArrayList<>();      
       //System.out.println(list);
    // System.out.println(max(list));
    // swap(list, 0, 8);
    // System.out.println(list);
    // sort(list);
    // System.out.println(list);
    // Collections.sort(list);
    // System.out.println(list);
    // Collections.sort(list,Collections.reverseOrder());
    // System.out.println(list);
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // mainList.add(list);
        // mainList.add(list);
        // System.out.println(mainList);
        // for(int i=0;i<mainList.size();i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0;j<currList.size();j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        //System.out.println(maxStore(list));
        //System.out.println(maxWaterTwoPointer(list));
        ArrayList <Integer> sort = new ArrayList<>();    
        for(int i=0;i<7;i++){
            sort.add(i);
        }
        //System.out.println(pairSum(sort, 5));
        //System.out.println(pairSumTwoPoint(sort, 5));
        ArrayList <Integer> rotate = new ArrayList<>();
        rotate.add(11);
        rotate.add(15);
        rotate.add(6);
        rotate.add(8);
        rotate.add(9);
        rotate.add(10);
        System.out.println(pairSum2(rotate, 16));
        System.out.println(pairSum2TwoPointer(rotate, 16));
    }
}
